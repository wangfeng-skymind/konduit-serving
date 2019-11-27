from konduit import *
from konduit.client import client_from_server
import pytest
import random


def test_client_from_server():
    port = random.randint(1000, 65535)
    serving_config = ServingConfig(http_port=port)

    python_config = PythonConfig(
        python_code='first += 2',
        python_inputs={'first': 'NDARRAY'},
        python_outputs={'first': 'NDARRAY'},
    )

    step = PythonStep().step(python_config)
    server = Server(steps=step, serving_config=serving_config)
    server.start()

    try:
        client_from_server(server)
    finally:
        server.stop()


def test_multipart_regex():

    client = Client(input_names=['partname'], output_names=['nobody_cares'])

    test_data = {
        'partname[0]': 'foo',
        "partname[1]": 'bar'
    }

    client._validate_multi_part(test_data)

    test_data['foo'] = 'baz'

    with pytest.raises(Exception):
        client._validate_multi_part(test_data)
