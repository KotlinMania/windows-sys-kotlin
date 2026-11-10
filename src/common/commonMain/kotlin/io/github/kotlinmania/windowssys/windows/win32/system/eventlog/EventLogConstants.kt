package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

public val EVENTLOG_AUDIT_FAILURE: ReportEventType = 16u.toUShort()

public val EVENTLOG_AUDIT_SUCCESS: ReportEventType = 8u.toUShort()

public val EVENTLOG_ERROR_TYPE: ReportEventType = 1u.toUShort()

public val EVENTLOG_INFORMATION_TYPE: ReportEventType = 4u.toUShort()

public val EVENTLOG_SEEK_READ: ReadEventLogReadFlags = 2u

public val EVENTLOG_SEQUENTIAL_READ: ReadEventLogReadFlags = 1u

public val EVENTLOG_SUCCESS: ReportEventType = 0u.toUShort()

public val EVENTLOG_WARNING_TYPE: ReportEventType = 2u.toUShort()

public val EVT_ALL_ACCESS: UInt = 7u

public val EVT_CLEAR_ACCESS: UInt = 4u

public val EVT_READ_ACCESS: UInt = 1u

public val EVT_VARIANT_TYPE_ARRAY: UInt = 128u

public val EVT_VARIANT_TYPE_MASK: UInt = 127u

public val EVT_WRITE_ACCESS: UInt = 2u

public val EVENT_METADATA_EVENT_CHANNEL: EvtEventMetadataPropertyId = 2

public val EVENT_METADATA_EVENT_ID: EvtEventMetadataPropertyId = 0

public val EVENT_METADATA_EVENT_KEYWORD: EvtEventMetadataPropertyId = 6

public val EVENT_METADATA_EVENT_LEVEL: EvtEventMetadataPropertyId = 3

public val EVENT_METADATA_EVENT_MESSAGE_ID: EvtEventMetadataPropertyId = 7

public val EVENT_METADATA_EVENT_OPCODE: EvtEventMetadataPropertyId = 4

public val EVENT_METADATA_EVENT_TASK: EvtEventMetadataPropertyId = 5

public val EVENT_METADATA_EVENT_TEMPLATE: EvtEventMetadataPropertyId = 8

public val EVENT_METADATA_EVENT_VERSION: EvtEventMetadataPropertyId = 1

public val EVT_CHANNEL_CLOCK_TYPE_QPC: EvtChannelClockType = 1

public val EVT_CHANNEL_CLOCK_TYPE_SYSTEM_TIME: EvtChannelClockType = 0

public val EVT_CHANNEL_CONFIG_ACCESS: EvtChannelConfigPropertyId = 5

public val EVT_CHANNEL_CONFIG_CLASSIC_EVENTLOG: EvtChannelConfigPropertyId = 4

public val EVT_CHANNEL_CONFIG_ENABLED: EvtChannelConfigPropertyId = 0

public val EVT_CHANNEL_CONFIG_ISOLATION: EvtChannelConfigPropertyId = 1

public val EVT_CHANNEL_CONFIG_OWNING_PUBLISHER: EvtChannelConfigPropertyId = 3

public val EVT_CHANNEL_CONFIG_PROPERTY_ID_END: EvtChannelConfigPropertyId = 21

public val EVT_CHANNEL_CONFIG_TYPE: EvtChannelConfigPropertyId = 2

public val EVT_CHANNEL_ISOLATION_TYPE_APPLICATION: EvtChannelIsolationType = 0

public val EVT_CHANNEL_ISOLATION_TYPE_CUSTOM: EvtChannelIsolationType = 2

public val EVT_CHANNEL_ISOLATION_TYPE_SYSTEM: EvtChannelIsolationType = 1

public val EVT_CHANNEL_LOGGING_CONFIG_AUTO_BACKUP: EvtChannelConfigPropertyId = 7

public val EVT_CHANNEL_LOGGING_CONFIG_LOG_FILE_PATH: EvtChannelConfigPropertyId = 9

public val EVT_CHANNEL_LOGGING_CONFIG_MAX_SIZE: EvtChannelConfigPropertyId = 8

public val EVT_CHANNEL_LOGGING_CONFIG_RETENTION: EvtChannelConfigPropertyId = 6

public val EVT_CHANNEL_PUBLISHER_LIST: EvtChannelConfigPropertyId = 19

public val EVT_CHANNEL_PUBLISHING_CONFIG_BUFFER_SIZE: EvtChannelConfigPropertyId = 13

public val EVT_CHANNEL_PUBLISHING_CONFIG_CLOCK_TYPE: EvtChannelConfigPropertyId = 17

public val EVT_CHANNEL_PUBLISHING_CONFIG_CONTROL_GUID: EvtChannelConfigPropertyId = 12

public val EVT_CHANNEL_PUBLISHING_CONFIG_FILE_MAX: EvtChannelConfigPropertyId = 20

public val EVT_CHANNEL_PUBLISHING_CONFIG_KEYWORDS: EvtChannelConfigPropertyId = 11

public val EVT_CHANNEL_PUBLISHING_CONFIG_LATENCY: EvtChannelConfigPropertyId = 16

public val EVT_CHANNEL_PUBLISHING_CONFIG_LEVEL: EvtChannelConfigPropertyId = 10

public val EVT_CHANNEL_PUBLISHING_CONFIG_MAX_BUFFERS: EvtChannelConfigPropertyId = 15

public val EVT_CHANNEL_PUBLISHING_CONFIG_MIN_BUFFERS: EvtChannelConfigPropertyId = 14

public val EVT_CHANNEL_PUBLISHING_CONFIG_SID_TYPE: EvtChannelConfigPropertyId = 18

public val EVT_CHANNEL_REFERENCE_IMPORTED: EvtChannelReferenceFlags = 1u

public val EVT_CHANNEL_SID_TYPE_NONE: EvtChannelSidType = 0

public val EVT_CHANNEL_SID_TYPE_PUBLISHING: EvtChannelSidType = 1

public val EVT_CHANNEL_TYPE_ADMIN: EvtChannelType = 0

public val EVT_CHANNEL_TYPE_ANALYTIC: EvtChannelType = 2

public val EVT_CHANNEL_TYPE_DEBUG: EvtChannelType = 3

public val EVT_CHANNEL_TYPE_OPERATIONAL: EvtChannelType = 1

public val EVT_EVENT_METADATA_PROPERTY_ID_END: EvtEventMetadataPropertyId = 9

public val EVT_EVENT_PATH: EvtEventPropertyId = 1

public val EVT_EVENT_PROPERTY_ID_END: EvtEventPropertyId = 2

public val EVT_EVENT_QUERY_I_DS: EvtEventPropertyId = 0

public val EVT_EXPORT_LOG_CHANNEL_PATH: EvtExportlogFlags = 1u

public val EVT_EXPORT_LOG_FILE_PATH: EvtExportlogFlags = 2u

public val EVT_EXPORT_LOG_OVERWRITE: EvtExportlogFlags = 8192u

public val EVT_EXPORT_LOG_TOLERATE_QUERY_ERRORS: EvtExportlogFlags = 4096u

public val EVT_FORMAT_MESSAGE_CHANNEL: EvtFormatMessageFlags = 6u

public val EVT_FORMAT_MESSAGE_EVENT: EvtFormatMessageFlags = 1u

public val EVT_FORMAT_MESSAGE_ID: EvtFormatMessageFlags = 8u

public val EVT_FORMAT_MESSAGE_KEYWORD: EvtFormatMessageFlags = 5u

public val EVT_FORMAT_MESSAGE_LEVEL: EvtFormatMessageFlags = 2u

public val EVT_FORMAT_MESSAGE_OPCODE: EvtFormatMessageFlags = 4u

public val EVT_FORMAT_MESSAGE_PROVIDER: EvtFormatMessageFlags = 7u

public val EVT_FORMAT_MESSAGE_TASK: EvtFormatMessageFlags = 3u

public val EVT_FORMAT_MESSAGE_XML: EvtFormatMessageFlags = 9u

public val EVT_LOG_ATTRIBUTES: EvtLogPropertyId = 4

public val EVT_LOG_CREATION_TIME: EvtLogPropertyId = 0

public val EVT_LOG_FILE_SIZE: EvtLogPropertyId = 3

public val EVT_LOG_FULL: EvtLogPropertyId = 7

public val EVT_LOG_LAST_ACCESS_TIME: EvtLogPropertyId = 1

public val EVT_LOG_LAST_WRITE_TIME: EvtLogPropertyId = 2

public val EVT_LOG_NUMBER_OF_LOG_RECORDS: EvtLogPropertyId = 5

public val EVT_LOG_OLDEST_RECORD_NUMBER: EvtLogPropertyId = 6

public val EVT_OPEN_CHANNEL_PATH: EvtOpenLogFlags = 1u

public val EVT_OPEN_FILE_PATH: EvtOpenLogFlags = 2u

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCE_FLAGS: EvtPublisherMetadataPropertyId = 10

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCE_ID: EvtPublisherMetadataPropertyId = 9

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCE_INDEX: EvtPublisherMetadataPropertyId = 8

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCE_MESSAGE_ID: EvtPublisherMetadataPropertyId = 11

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCE_PATH: EvtPublisherMetadataPropertyId = 7

public val EVT_PUBLISHER_METADATA_CHANNEL_REFERENCES: EvtPublisherMetadataPropertyId = 6

public val EVT_PUBLISHER_METADATA_HELP_LINK: EvtPublisherMetadataPropertyId = 4

public val EVT_PUBLISHER_METADATA_KEYWORD_MESSAGE_ID: EvtPublisherMetadataPropertyId = 28

public val EVT_PUBLISHER_METADATA_KEYWORD_NAME: EvtPublisherMetadataPropertyId = 26

public val EVT_PUBLISHER_METADATA_KEYWORD_VALUE: EvtPublisherMetadataPropertyId = 27

public val EVT_PUBLISHER_METADATA_KEYWORDS: EvtPublisherMetadataPropertyId = 25

public val EVT_PUBLISHER_METADATA_LEVEL_MESSAGE_ID: EvtPublisherMetadataPropertyId = 15

public val EVT_PUBLISHER_METADATA_LEVEL_NAME: EvtPublisherMetadataPropertyId = 13

public val EVT_PUBLISHER_METADATA_LEVEL_VALUE: EvtPublisherMetadataPropertyId = 14

public val EVT_PUBLISHER_METADATA_LEVELS: EvtPublisherMetadataPropertyId = 12

public val EVT_PUBLISHER_METADATA_MESSAGE_FILE_PATH: EvtPublisherMetadataPropertyId = 3

public val EVT_PUBLISHER_METADATA_OPCODE_MESSAGE_ID: EvtPublisherMetadataPropertyId = 24

public val EVT_PUBLISHER_METADATA_OPCODE_NAME: EvtPublisherMetadataPropertyId = 22

public val EVT_PUBLISHER_METADATA_OPCODE_VALUE: EvtPublisherMetadataPropertyId = 23

public val EVT_PUBLISHER_METADATA_OPCODES: EvtPublisherMetadataPropertyId = 21

public val EVT_PUBLISHER_METADATA_PARAMETER_FILE_PATH: EvtPublisherMetadataPropertyId = 2

public val EVT_PUBLISHER_METADATA_PROPERTY_ID_END: EvtPublisherMetadataPropertyId = 29

public val EVT_PUBLISHER_METADATA_PUBLISHER_GUID: EvtPublisherMetadataPropertyId = 0

public val EVT_PUBLISHER_METADATA_PUBLISHER_MESSAGE_ID: EvtPublisherMetadataPropertyId = 5

public val EVT_PUBLISHER_METADATA_RESOURCE_FILE_PATH: EvtPublisherMetadataPropertyId = 1

public val EVT_PUBLISHER_METADATA_TASK_EVENT_GUID: EvtPublisherMetadataPropertyId = 18

public val EVT_PUBLISHER_METADATA_TASK_MESSAGE_ID: EvtPublisherMetadataPropertyId = 20

public val EVT_PUBLISHER_METADATA_TASK_NAME: EvtPublisherMetadataPropertyId = 17

public val EVT_PUBLISHER_METADATA_TASK_VALUE: EvtPublisherMetadataPropertyId = 19

public val EVT_PUBLISHER_METADATA_TASKS: EvtPublisherMetadataPropertyId = 16

public val EVT_QUERY_CHANNEL_PATH: EvtQueryFlags = 1u

public val EVT_QUERY_FILE_PATH: EvtQueryFlags = 2u

public val EVT_QUERY_FORWARD_DIRECTION: EvtQueryFlags = 256u

public val EVT_QUERY_NAMES: EvtQueryPropertyId = 0

public val EVT_QUERY_PROPERTY_ID_END: EvtQueryPropertyId = 2

public val EVT_QUERY_REVERSE_DIRECTION: EvtQueryFlags = 512u

public val EVT_QUERY_STATUSES: EvtQueryPropertyId = 1

public val EVT_QUERY_TOLERATE_QUERY_ERRORS: EvtQueryFlags = 4096u

public val EVT_RENDER_BOOKMARK: EvtRenderFlags = 2u

public val EVT_RENDER_CONTEXT_SYSTEM: EvtRenderContextFlags = 1u

public val EVT_RENDER_CONTEXT_USER: EvtRenderContextFlags = 2u

public val EVT_RENDER_CONTEXT_VALUES: EvtRenderContextFlags = 0u

public val EVT_RENDER_EVENT_VALUES: EvtRenderFlags = 0u

public val EVT_RENDER_EVENT_XML: EvtRenderFlags = 1u

public val EVT_RPC_LOGIN: EvtLoginClass = 1

public val EVT_RPC_LOGIN_AUTH_DEFAULT: EvtRpcLoginFlags = 0u

public val EVT_RPC_LOGIN_AUTH_KERBEROS: EvtRpcLoginFlags = 2u

public val EVT_RPC_LOGIN_AUTH_NTLM: EvtRpcLoginFlags = 3u

public val EVT_RPC_LOGIN_AUTH_NEGOTIATE: EvtRpcLoginFlags = 1u

public val EVT_SEEK_ORIGIN_MASK: EvtSeekFlags = 7u

public val EVT_SEEK_RELATIVE_TO_BOOKMARK: EvtSeekFlags = 4u

public val EVT_SEEK_RELATIVE_TO_CURRENT: EvtSeekFlags = 3u

public val EVT_SEEK_RELATIVE_TO_FIRST: EvtSeekFlags = 1u

public val EVT_SEEK_RELATIVE_TO_LAST: EvtSeekFlags = 2u

public val EVT_SEEK_STRICT: EvtSeekFlags = 65536u

public val EVT_SUBSCRIBE_ACTION_DELIVER: EvtSubscribeNotifyAction = 1

public val EVT_SUBSCRIBE_ACTION_ERROR: EvtSubscribeNotifyAction = 0

public val EVT_SUBSCRIBE_ORIGIN_MASK: EvtSubscribeFlags = 3u

public val EVT_SUBSCRIBE_START_AFTER_BOOKMARK: EvtSubscribeFlags = 3u

public val EVT_SUBSCRIBE_START_AT_OLDEST_RECORD: EvtSubscribeFlags = 2u

public val EVT_SUBSCRIBE_STRICT: EvtSubscribeFlags = 65536u

public val EVT_SUBSCRIBE_TO_FUTURE_EVENTS: EvtSubscribeFlags = 1u

public val EVT_SUBSCRIBE_TOLERATE_QUERY_ERRORS: EvtSubscribeFlags = 4096u

public val EVT_SYSTEM_ACTIVITY_ID: EvtSystemPropertyId = 10

public val EVT_SYSTEM_CHANNEL: EvtSystemPropertyId = 14

public val EVT_SYSTEM_COMPUTER: EvtSystemPropertyId = 15

public val EVT_SYSTEM_EVENT_ID: EvtSystemPropertyId = 2

public val EVT_SYSTEM_EVENT_RECORD_ID: EvtSystemPropertyId = 9

public val EVT_SYSTEM_KEYWORDS: EvtSystemPropertyId = 7

public val EVT_SYSTEM_LEVEL: EvtSystemPropertyId = 4

public val EVT_SYSTEM_OPCODE: EvtSystemPropertyId = 6

public val EVT_SYSTEM_PROCESS_ID: EvtSystemPropertyId = 12

public val EVT_SYSTEM_PROPERTY_ID_END: EvtSystemPropertyId = 18

public val EVT_SYSTEM_PROVIDER_GUID: EvtSystemPropertyId = 1

public val EVT_SYSTEM_PROVIDER_NAME: EvtSystemPropertyId = 0

public val EVT_SYSTEM_QUALIFIERS: EvtSystemPropertyId = 3

public val EVT_SYSTEM_RELATED_ACTIVITY_ID: EvtSystemPropertyId = 11

public val EVT_SYSTEM_TASK: EvtSystemPropertyId = 5

public val EVT_SYSTEM_THREAD_ID: EvtSystemPropertyId = 13

public val EVT_SYSTEM_TIME_CREATED: EvtSystemPropertyId = 8

public val EVT_SYSTEM_USER_ID: EvtSystemPropertyId = 16

public val EVT_SYSTEM_VERSION: EvtSystemPropertyId = 17

public val EVT_VAR_TYPE_ANSI_STRING: EvtVariantType = 2

public val EVT_VAR_TYPE_BINARY: EvtVariantType = 14

public val EVT_VAR_TYPE_BOOLEAN: EvtVariantType = 13

public val EVT_VAR_TYPE_BYTE: EvtVariantType = 4

public val EVT_VAR_TYPE_DOUBLE: EvtVariantType = 12

public val EVT_VAR_TYPE_EVT_HANDLE: EvtVariantType = 32

public val EVT_VAR_TYPE_EVT_XML: EvtVariantType = 35

public val EVT_VAR_TYPE_FILE_TIME: EvtVariantType = 17

public val EVT_VAR_TYPE_GUID: EvtVariantType = 15

public val EVT_VAR_TYPE_HEX_INT32: EvtVariantType = 20

public val EVT_VAR_TYPE_HEX_INT64: EvtVariantType = 21

public val EVT_VAR_TYPE_INT16: EvtVariantType = 5

public val EVT_VAR_TYPE_INT32: EvtVariantType = 7

public val EVT_VAR_TYPE_INT64: EvtVariantType = 9

public val EVT_VAR_TYPE_NULL: EvtVariantType = 0

public val EVT_VAR_TYPE_S_BYTE: EvtVariantType = 3

public val EVT_VAR_TYPE_SID: EvtVariantType = 19

public val EVT_VAR_TYPE_SINGLE: EvtVariantType = 11

public val EVT_VAR_TYPE_SIZE_T: EvtVariantType = 16

public val EVT_VAR_TYPE_STRING: EvtVariantType = 1

public val EVT_VAR_TYPE_SYS_TIME: EvtVariantType = 18

public val EVT_VAR_TYPE_U_INT16: EvtVariantType = 6

public val EVT_VAR_TYPE_U_INT32: EvtVariantType = 8

public val EVT_VAR_TYPE_U_INT64: EvtVariantType = 10
