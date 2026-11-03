package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

public val EVENTLOG_AUDIT_FAILURE: REPORT_EVENT_TYPE = 16u

public val EVENTLOG_AUDIT_SUCCESS: REPORT_EVENT_TYPE = 8u

public val EVENTLOG_ERROR_TYPE: REPORT_EVENT_TYPE = 1u

public val EVENTLOG_INFORMATION_TYPE: REPORT_EVENT_TYPE = 4u

public val EVENTLOG_SEEK_READ: READ_EVENT_LOG_READ_FLAGS = 2u

public val EVENTLOG_SEQUENTIAL_READ: READ_EVENT_LOG_READ_FLAGS = 1u

public val EVENTLOG_SUCCESS: REPORT_EVENT_TYPE = 0u

public val EVENTLOG_WARNING_TYPE: REPORT_EVENT_TYPE = 2u

public val EVT_ALL_ACCESS: UInt = 7u

public val EVT_CLEAR_ACCESS: UInt = 4u

public val EVT_READ_ACCESS: UInt = 1u

public val EVT_VARIANT_TYPE_ARRAY: UInt = 128u

public val EVT_VARIANT_TYPE_MASK: UInt = 127u

public val EVT_WRITE_ACCESS: UInt = 2u

public val EventMetadataEventChannel: EVT_EVENT_METADATA_PROPERTY_ID = 2

public val EventMetadataEventID: EVT_EVENT_METADATA_PROPERTY_ID = 0

public val EventMetadataEventKeyword: EVT_EVENT_METADATA_PROPERTY_ID = 6

public val EventMetadataEventLevel: EVT_EVENT_METADATA_PROPERTY_ID = 3

public val EventMetadataEventMessageID: EVT_EVENT_METADATA_PROPERTY_ID = 7

public val EventMetadataEventOpcode: EVT_EVENT_METADATA_PROPERTY_ID = 4

public val EventMetadataEventTask: EVT_EVENT_METADATA_PROPERTY_ID = 5

public val EventMetadataEventTemplate: EVT_EVENT_METADATA_PROPERTY_ID = 8

public val EventMetadataEventVersion: EVT_EVENT_METADATA_PROPERTY_ID = 1

public val EvtChannelClockTypeQPC: EVT_CHANNEL_CLOCK_TYPE = 1

public val EvtChannelClockTypeSystemTime: EVT_CHANNEL_CLOCK_TYPE = 0

public val EvtChannelConfigAccess: EVT_CHANNEL_CONFIG_PROPERTY_ID = 5

public val EvtChannelConfigClassicEventlog: EVT_CHANNEL_CONFIG_PROPERTY_ID = 4

public val EvtChannelConfigEnabled: EVT_CHANNEL_CONFIG_PROPERTY_ID = 0

public val EvtChannelConfigIsolation: EVT_CHANNEL_CONFIG_PROPERTY_ID = 1

public val EvtChannelConfigOwningPublisher: EVT_CHANNEL_CONFIG_PROPERTY_ID = 3

public val EvtChannelConfigPropertyIdEND: EVT_CHANNEL_CONFIG_PROPERTY_ID = 21

public val EvtChannelConfigType: EVT_CHANNEL_CONFIG_PROPERTY_ID = 2

public val EvtChannelIsolationTypeApplication: EVT_CHANNEL_ISOLATION_TYPE = 0

public val EvtChannelIsolationTypeCustom: EVT_CHANNEL_ISOLATION_TYPE = 2

public val EvtChannelIsolationTypeSystem: EVT_CHANNEL_ISOLATION_TYPE = 1

public val EvtChannelLoggingConfigAutoBackup: EVT_CHANNEL_CONFIG_PROPERTY_ID = 7

public val EvtChannelLoggingConfigLogFilePath: EVT_CHANNEL_CONFIG_PROPERTY_ID = 9

public val EvtChannelLoggingConfigMaxSize: EVT_CHANNEL_CONFIG_PROPERTY_ID = 8

public val EvtChannelLoggingConfigRetention: EVT_CHANNEL_CONFIG_PROPERTY_ID = 6

public val EvtChannelPublisherList: EVT_CHANNEL_CONFIG_PROPERTY_ID = 19

public val EvtChannelPublishingConfigBufferSize: EVT_CHANNEL_CONFIG_PROPERTY_ID = 13

public val EvtChannelPublishingConfigClockType: EVT_CHANNEL_CONFIG_PROPERTY_ID = 17

public val EvtChannelPublishingConfigControlGuid: EVT_CHANNEL_CONFIG_PROPERTY_ID = 12

public val EvtChannelPublishingConfigFileMax: EVT_CHANNEL_CONFIG_PROPERTY_ID = 20

public val EvtChannelPublishingConfigKeywords: EVT_CHANNEL_CONFIG_PROPERTY_ID = 11

public val EvtChannelPublishingConfigLatency: EVT_CHANNEL_CONFIG_PROPERTY_ID = 16

public val EvtChannelPublishingConfigLevel: EVT_CHANNEL_CONFIG_PROPERTY_ID = 10

public val EvtChannelPublishingConfigMaxBuffers: EVT_CHANNEL_CONFIG_PROPERTY_ID = 15

public val EvtChannelPublishingConfigMinBuffers: EVT_CHANNEL_CONFIG_PROPERTY_ID = 14

public val EvtChannelPublishingConfigSidType: EVT_CHANNEL_CONFIG_PROPERTY_ID = 18

public val EvtChannelReferenceImported: EVT_CHANNEL_REFERENCE_FLAGS = 1u

public val EvtChannelSidTypeNone: EVT_CHANNEL_SID_TYPE = 0

public val EvtChannelSidTypePublishing: EVT_CHANNEL_SID_TYPE = 1

public val EvtChannelTypeAdmin: EVT_CHANNEL_TYPE = 0

public val EvtChannelTypeAnalytic: EVT_CHANNEL_TYPE = 2

public val EvtChannelTypeDebug: EVT_CHANNEL_TYPE = 3

public val EvtChannelTypeOperational: EVT_CHANNEL_TYPE = 1

public val EvtEventMetadataPropertyIdEND: EVT_EVENT_METADATA_PROPERTY_ID = 9

public val EvtEventPath: EVT_EVENT_PROPERTY_ID = 1

public val EvtEventPropertyIdEND: EVT_EVENT_PROPERTY_ID = 2

public val EvtEventQueryIDs: EVT_EVENT_PROPERTY_ID = 0

public val EvtExportLogChannelPath: EVT_EXPORTLOG_FLAGS = 1u

public val EvtExportLogFilePath: EVT_EXPORTLOG_FLAGS = 2u

public val EvtExportLogOverwrite: EVT_EXPORTLOG_FLAGS = 8192u

public val EvtExportLogTolerateQueryErrors: EVT_EXPORTLOG_FLAGS = 4096u

public val EvtFormatMessageChannel: EVT_FORMAT_MESSAGE_FLAGS = 6u

public val EvtFormatMessageEvent: EVT_FORMAT_MESSAGE_FLAGS = 1u

public val EvtFormatMessageId: EVT_FORMAT_MESSAGE_FLAGS = 8u

public val EvtFormatMessageKeyword: EVT_FORMAT_MESSAGE_FLAGS = 5u

public val EvtFormatMessageLevel: EVT_FORMAT_MESSAGE_FLAGS = 2u

public val EvtFormatMessageOpcode: EVT_FORMAT_MESSAGE_FLAGS = 4u

public val EvtFormatMessageProvider: EVT_FORMAT_MESSAGE_FLAGS = 7u

public val EvtFormatMessageTask: EVT_FORMAT_MESSAGE_FLAGS = 3u

public val EvtFormatMessageXml: EVT_FORMAT_MESSAGE_FLAGS = 9u

public val EvtLogAttributes: EVT_LOG_PROPERTY_ID = 4

public val EvtLogCreationTime: EVT_LOG_PROPERTY_ID = 0

public val EvtLogFileSize: EVT_LOG_PROPERTY_ID = 3

public val EvtLogFull: EVT_LOG_PROPERTY_ID = 7

public val EvtLogLastAccessTime: EVT_LOG_PROPERTY_ID = 1

public val EvtLogLastWriteTime: EVT_LOG_PROPERTY_ID = 2

public val EvtLogNumberOfLogRecords: EVT_LOG_PROPERTY_ID = 5

public val EvtLogOldestRecordNumber: EVT_LOG_PROPERTY_ID = 6

public val EvtOpenChannelPath: EVT_OPEN_LOG_FLAGS = 1u

public val EvtOpenFilePath: EVT_OPEN_LOG_FLAGS = 2u

public val EvtPublisherMetadataChannelReferenceFlags: EVT_PUBLISHER_METADATA_PROPERTY_ID = 10

public val EvtPublisherMetadataChannelReferenceID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 9

public val EvtPublisherMetadataChannelReferenceIndex: EVT_PUBLISHER_METADATA_PROPERTY_ID = 8

public val EvtPublisherMetadataChannelReferenceMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 11

public val EvtPublisherMetadataChannelReferencePath: EVT_PUBLISHER_METADATA_PROPERTY_ID = 7

public val EvtPublisherMetadataChannelReferences: EVT_PUBLISHER_METADATA_PROPERTY_ID = 6

public val EvtPublisherMetadataHelpLink: EVT_PUBLISHER_METADATA_PROPERTY_ID = 4

public val EvtPublisherMetadataKeywordMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 28

public val EvtPublisherMetadataKeywordName: EVT_PUBLISHER_METADATA_PROPERTY_ID = 26

public val EvtPublisherMetadataKeywordValue: EVT_PUBLISHER_METADATA_PROPERTY_ID = 27

public val EvtPublisherMetadataKeywords: EVT_PUBLISHER_METADATA_PROPERTY_ID = 25

public val EvtPublisherMetadataLevelMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 15

public val EvtPublisherMetadataLevelName: EVT_PUBLISHER_METADATA_PROPERTY_ID = 13

public val EvtPublisherMetadataLevelValue: EVT_PUBLISHER_METADATA_PROPERTY_ID = 14

public val EvtPublisherMetadataLevels: EVT_PUBLISHER_METADATA_PROPERTY_ID = 12

public val EvtPublisherMetadataMessageFilePath: EVT_PUBLISHER_METADATA_PROPERTY_ID = 3

public val EvtPublisherMetadataOpcodeMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 24

public val EvtPublisherMetadataOpcodeName: EVT_PUBLISHER_METADATA_PROPERTY_ID = 22

public val EvtPublisherMetadataOpcodeValue: EVT_PUBLISHER_METADATA_PROPERTY_ID = 23

public val EvtPublisherMetadataOpcodes: EVT_PUBLISHER_METADATA_PROPERTY_ID = 21

public val EvtPublisherMetadataParameterFilePath: EVT_PUBLISHER_METADATA_PROPERTY_ID = 2

public val EvtPublisherMetadataPropertyIdEND: EVT_PUBLISHER_METADATA_PROPERTY_ID = 29

public val EvtPublisherMetadataPublisherGuid: EVT_PUBLISHER_METADATA_PROPERTY_ID = 0

public val EvtPublisherMetadataPublisherMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 5

public val EvtPublisherMetadataResourceFilePath: EVT_PUBLISHER_METADATA_PROPERTY_ID = 1

public val EvtPublisherMetadataTaskEventGuid: EVT_PUBLISHER_METADATA_PROPERTY_ID = 18

public val EvtPublisherMetadataTaskMessageID: EVT_PUBLISHER_METADATA_PROPERTY_ID = 20

public val EvtPublisherMetadataTaskName: EVT_PUBLISHER_METADATA_PROPERTY_ID = 17

public val EvtPublisherMetadataTaskValue: EVT_PUBLISHER_METADATA_PROPERTY_ID = 19

public val EvtPublisherMetadataTasks: EVT_PUBLISHER_METADATA_PROPERTY_ID = 16

public val EvtQueryChannelPath: EVT_QUERY_FLAGS = 1u

public val EvtQueryFilePath: EVT_QUERY_FLAGS = 2u

public val EvtQueryForwardDirection: EVT_QUERY_FLAGS = 256u

public val EvtQueryNames: EVT_QUERY_PROPERTY_ID = 0

public val EvtQueryPropertyIdEND: EVT_QUERY_PROPERTY_ID = 2

public val EvtQueryReverseDirection: EVT_QUERY_FLAGS = 512u

public val EvtQueryStatuses: EVT_QUERY_PROPERTY_ID = 1

public val EvtQueryTolerateQueryErrors: EVT_QUERY_FLAGS = 4096u

public val EvtRenderBookmark: EVT_RENDER_FLAGS = 2u

public val EvtRenderContextSystem: EVT_RENDER_CONTEXT_FLAGS = 1u

public val EvtRenderContextUser: EVT_RENDER_CONTEXT_FLAGS = 2u

public val EvtRenderContextValues: EVT_RENDER_CONTEXT_FLAGS = 0u

public val EvtRenderEventValues: EVT_RENDER_FLAGS = 0u

public val EvtRenderEventXml: EVT_RENDER_FLAGS = 1u

public val EvtRpcLogin: EVT_LOGIN_CLASS = 1

public val EvtRpcLoginAuthDefault: EVT_RPC_LOGIN_FLAGS = 0u

public val EvtRpcLoginAuthKerberos: EVT_RPC_LOGIN_FLAGS = 2u

public val EvtRpcLoginAuthNTLM: EVT_RPC_LOGIN_FLAGS = 3u

public val EvtRpcLoginAuthNegotiate: EVT_RPC_LOGIN_FLAGS = 1u

public val EvtSeekOriginMask: EVT_SEEK_FLAGS = 7u

public val EvtSeekRelativeToBookmark: EVT_SEEK_FLAGS = 4u

public val EvtSeekRelativeToCurrent: EVT_SEEK_FLAGS = 3u

public val EvtSeekRelativeToFirst: EVT_SEEK_FLAGS = 1u

public val EvtSeekRelativeToLast: EVT_SEEK_FLAGS = 2u

public val EvtSeekStrict: EVT_SEEK_FLAGS = 65536u

public val EvtSubscribeActionDeliver: EVT_SUBSCRIBE_NOTIFY_ACTION = 1

public val EvtSubscribeActionError: EVT_SUBSCRIBE_NOTIFY_ACTION = 0

public val EvtSubscribeOriginMask: EVT_SUBSCRIBE_FLAGS = 3u

public val EvtSubscribeStartAfterBookmark: EVT_SUBSCRIBE_FLAGS = 3u

public val EvtSubscribeStartAtOldestRecord: EVT_SUBSCRIBE_FLAGS = 2u

public val EvtSubscribeStrict: EVT_SUBSCRIBE_FLAGS = 65536u

public val EvtSubscribeToFutureEvents: EVT_SUBSCRIBE_FLAGS = 1u

public val EvtSubscribeTolerateQueryErrors: EVT_SUBSCRIBE_FLAGS = 4096u

public val EvtSystemActivityID: EVT_SYSTEM_PROPERTY_ID = 10

public val EvtSystemChannel: EVT_SYSTEM_PROPERTY_ID = 14

public val EvtSystemComputer: EVT_SYSTEM_PROPERTY_ID = 15

public val EvtSystemEventID: EVT_SYSTEM_PROPERTY_ID = 2

public val EvtSystemEventRecordId: EVT_SYSTEM_PROPERTY_ID = 9

public val EvtSystemKeywords: EVT_SYSTEM_PROPERTY_ID = 7

public val EvtSystemLevel: EVT_SYSTEM_PROPERTY_ID = 4

public val EvtSystemOpcode: EVT_SYSTEM_PROPERTY_ID = 6

public val EvtSystemProcessID: EVT_SYSTEM_PROPERTY_ID = 12

public val EvtSystemPropertyIdEND: EVT_SYSTEM_PROPERTY_ID = 18

public val EvtSystemProviderGuid: EVT_SYSTEM_PROPERTY_ID = 1

public val EvtSystemProviderName: EVT_SYSTEM_PROPERTY_ID = 0

public val EvtSystemQualifiers: EVT_SYSTEM_PROPERTY_ID = 3

public val EvtSystemRelatedActivityID: EVT_SYSTEM_PROPERTY_ID = 11

public val EvtSystemTask: EVT_SYSTEM_PROPERTY_ID = 5

public val EvtSystemThreadID: EVT_SYSTEM_PROPERTY_ID = 13

public val EvtSystemTimeCreated: EVT_SYSTEM_PROPERTY_ID = 8

public val EvtSystemUserID: EVT_SYSTEM_PROPERTY_ID = 16

public val EvtSystemVersion: EVT_SYSTEM_PROPERTY_ID = 17

public val EvtVarTypeAnsiString: EVT_VARIANT_TYPE = 2

public val EvtVarTypeBinary: EVT_VARIANT_TYPE = 14

public val EvtVarTypeBoolean: EVT_VARIANT_TYPE = 13

public val EvtVarTypeByte: EVT_VARIANT_TYPE = 4

public val EvtVarTypeDouble: EVT_VARIANT_TYPE = 12

public val EvtVarTypeEvtHandle: EVT_VARIANT_TYPE = 32

public val EvtVarTypeEvtXml: EVT_VARIANT_TYPE = 35

public val EvtVarTypeFileTime: EVT_VARIANT_TYPE = 17

public val EvtVarTypeGuid: EVT_VARIANT_TYPE = 15

public val EvtVarTypeHexInt32: EVT_VARIANT_TYPE = 20

public val EvtVarTypeHexInt64: EVT_VARIANT_TYPE = 21

public val EvtVarTypeInt16: EVT_VARIANT_TYPE = 5

public val EvtVarTypeInt32: EVT_VARIANT_TYPE = 7

public val EvtVarTypeInt64: EVT_VARIANT_TYPE = 9

public val EvtVarTypeNull: EVT_VARIANT_TYPE = 0

public val EvtVarTypeSByte: EVT_VARIANT_TYPE = 3

public val EvtVarTypeSid: EVT_VARIANT_TYPE = 19

public val EvtVarTypeSingle: EVT_VARIANT_TYPE = 11

public val EvtVarTypeSizeT: EVT_VARIANT_TYPE = 16

public val EvtVarTypeString: EVT_VARIANT_TYPE = 1

public val EvtVarTypeSysTime: EVT_VARIANT_TYPE = 18

public val EvtVarTypeUInt16: EVT_VARIANT_TYPE = 6

public val EvtVarTypeUInt32: EVT_VARIANT_TYPE = 8

public val EvtVarTypeUInt64: EVT_VARIANT_TYPE = 10
