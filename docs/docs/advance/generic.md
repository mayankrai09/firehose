# Generic

All sinks in Firehose requires the following variables to be set

### `INPUT_SCHEMA_DATA_TYPE`

Defines the input message schema.

* Example value: `json`
* Type: `optional`
* Default value: `protobuf`

### `KAFKA_RECORD_PARSER_MODE`

Decides whether to parse key or message \(as per your input proto\) from incoming data.

- Example value: `message`
- Type: `required`
- Default value`: message`

### `SINK_TYPE`

Defines the Firehose sink type.

- Example value: `log`
- Type: `required`

### `INPUT_SCHEMA_PROTO_CLASS`

Defines the fully qualified name of the input proto class.

- Example value: `com.tests.TestMessage`
- Type: `required`

### `INPUT_SCHEMA_PROTO_TO_COLUMN_MAPPING`

Defines the mapping of the Proto fields to header/query fields in JSON format.

- Example value: `{"1":"order_number","2":"event_timestamp","3":"driver_id"}`
- Type: `optional`

### `METRIC_STATSD_HOST`

URL of the StatsD host \(Telegraf service\)

- Example value: `localhost`
- Type: `optional`
- Default value`: localhost`

###  `METRIC_STATSD_PORT`

Port of the StatsD host \(Telegraf service\)

- Example value: `8125`
- Type: `optional`
- Default value`: 8125`

### `METRIC_STATSD_TAGS`

Global tags for StatsD metrics. Tags must be comma-separated.

- Example value: `team=data-engineering,app=firehose`
- Type: `optional`

### `APPLICATION_THREAD_CLEANUP_DELAY`

Defines the time duration in milliseconds after which to cleanup the thread.

- Example value: `400`
- Type: `optional`
- Default value: `2000`

### `APPLICATION_THREAD_COUNT`

Number of parallel threads to run for Firehose.

- Example value: `2`
- Type: `optional`
- Default value: `1`

### `TRACE_JAEGAR_ENABLE`

Defines whether to enable Jaegar tracing or not

- Example value: `true`
- Type: `optional`
- Default value: `false`

### `LOG_LEVEL`

Defines the log level , i.e. debug/info/error.

- Example value: `debug`
- Type: `optional`
- Default value: `info`

### `INPUT_SCHEMA_PROTO_ALLOW_UNKNOWN_FIELDS_ENABLE`

Proto can have unknown fields as input

- Example value: `true`
- Type: `optional`
- Default value: `true`

## Kafka Consumer

### `SOURCE_KAFKA_BROKERS`

Defines the bootstrap server of Kafka brokers to consume from.

- Example value: `localhost:9092`
- Type: `required`

### `SOURCE_KAFKA_TOPIC`

Defines the list of Kafka topics to consume from.

- Example value: `test-topic`
- Type: `required`

### `SOURCE_KAFKA_CONSUMER_CONFIG_MAX_POLL_RECORDS`

Defines the batch size of Kafka messages

- Example value: `705`
- Type: `optional`
- Default value: `500`

### `SOURCE_KAFKA_ASYNC_COMMIT_ENABLE`

Defines whether to enable async commit for Kafka consumer

- Example value: `false`
- Type: `optional`
- Default value: `true`

### `SOURCE_KAFKA_CONSUMER_CONFIG_SESSION_TIMEOUT_MS`

Defines the duration of session timeout in milliseconds

- Example value: `700`
- Type: `optional`
- Default value: `10000`

### `SOURCE_KAFKA_COMMIT_ONLY_CURRENT_PARTITIONS_ENABLE`

Defines whether to commit only current partitions

- Example value: `false`
- Type: `optional`
- Default value: `true`

### `SOURCE_KAFKA_CONSUMER_CONFIG_AUTO_COMMIT_ENABLE`

Defines whether to enable auto commit for Kafka consumer

- Example value: `705`
- Type: `optional`
- Default value: `500`

### `SOURCE_KAFKA_CONSUMER_GROUP_ID`

Defines the Kafka consumer group ID for your Firehose deployment.

- Example value: `sample-group-id`
- Type: `required`

### `SOURCE_KAFKA_POLL_TIMEOUT_MS`

Defines the duration of poll timeout for Kafka messages in milliseconds

- Example value: `80000`
- Type: `required`
- Default: `9223372036854775807`

### `SOURCE_KAFKA_CONSUMER_CONFIG_METADATA_MAX_AGE_MS`

Defines the maximum age of config metadata in milliseconds

- Example value: `700`
- Type: `optional`
- Default value: `500`

### `SOURCE_KAFKA_CONSUMER_MODE`

Mode can ASYNC or SYNC

- Example value: `SYNC`
- Type: `optional`
- Default value: `SYNC`

## Stencil Client

Stencil, the Protobuf schema registry used by Firehose need the following variables to be set for the Stencil client.

### `SCHEMA_REGISTRY_STENCIL_ENABLE`

Defines whether to enable Stencil Schema registry

- Example value: `true`
- Type: `optional`
- Default value: `false`

### `SCHEMA_REGISTRY_STENCIL_URLS`

Defines the URL of the Proto Descriptor set file in the Stencil Server

- Example value: `http://localhost:8000/v1/namespaces/quickstart/descriptors/example/versions/latest`
- Type: `optional`

### `SCHEMA_REGISTRY_STENCIL_FETCH_TIMEOUT_MS`

Defines the timeout in milliseconds to fetch the Proto Descriptor set file from the Stencil Server.

- Example value: `4000`
- Type: `optional`
- Default value: `10000`

### `SCHEMA_REGISTRY_STENCIL_FETCH_RETRIES`

Defines the number of times to retry to fetch the Proto Descriptor set file from the Stencil Server.

- Example value: `4`
- Type: `optional`
- Default value: `3`

### `SCHEMA_REGISTRY_STENCIL_FETCH_BACKOFF_MIN_MS`

Defines the minimum time in milliseconds after which to back off from fetching the Proto Descriptor set file from the Stencil Server.

- Example value: `70000`
- Type: `optional`
- Default value: `60000`

### `SCHEMA_REGISTRY_STENCIL_FETCH_AUTH_BEARER_TOKEN`

Defines the token for authentication to connect to Stencil Server

- Example value: `tcDpw34J8d1`
- Type: `optional`

### `SCHEMA_REGISTRY_STENCIL_CACHE_AUTO_REFRESH`

Defines whether to enable auto-refresh of Stencil cache.

- Example value: `true`
- Type: `optional`
- Default value: `false`

### `SCHEMA_REGISTRY_STENCIL_CACHE_TTL_MS`

Defines the minimum time in milliseconds after which to refresh the Stencil cache.

- Example value: `900000`
- Type: `optional`
- Default value: `900000`
