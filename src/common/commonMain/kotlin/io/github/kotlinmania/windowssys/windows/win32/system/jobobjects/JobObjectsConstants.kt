package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

public val JOBOBJECT_IO_ATTRIBUTION_CONTROL_DISABLE: JobobjectIoAttributionControlFlags = 2

public val JOBOBJECT_IO_ATTRIBUTION_CONTROL_ENABLE: JobobjectIoAttributionControlFlags = 1

public val JOBOBJECT_IO_ATTRIBUTION_CONTROL_VALID_FLAGS: JobobjectIoAttributionControlFlags = 3

public val JOB_OBJECT_BASIC_LIMIT_VALID_FLAGS: JobObjectLimit = 255u

public val JOB_OBJECT_CPU_RATE_CONTROL_ENABLE: JobObjectCpuRateControl = 1u

public val JOB_OBJECT_CPU_RATE_CONTROL_HARD_CAP: JobObjectCpuRateControl = 4u

public val JOB_OBJECT_CPU_RATE_CONTROL_MIN_MAX_RATE: JobObjectCpuRateControl = 16u

public val JOB_OBJECT_CPU_RATE_CONTROL_NOTIFY: JobObjectCpuRateControl = 8u

public val JOB_OBJECT_CPU_RATE_CONTROL_VALID_FLAGS: JobObjectCpuRateControl = 31u

public val JOB_OBJECT_CPU_RATE_CONTROL_WEIGHT_BASED: JobObjectCpuRateControl = 2u

public val JOB_OBJECT_EXTENDED_LIMIT_VALID_FLAGS: JobObjectLimit = 32767u

public val JOB_OBJECT_IO_RATE_CONTROL_ENABLE: JobObjectIoRateControlFlags = 1

public val JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ALL: JobObjectIoRateControlFlags = 4

public val JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ON_SOFT_CAP: JobObjectIoRateControlFlags = 8

public val JOB_OBJECT_IO_RATE_CONTROL_STANDALONE_VOLUME: JobObjectIoRateControlFlags = 2

public val JOB_OBJECT_IO_RATE_CONTROL_VALID_FLAGS: JobObjectIoRateControlFlags = 15

public val JOB_OBJECT_LIMIT_ACTIVE_PROCESS: JobObjectLimit = 8u

public val JOB_OBJECT_LIMIT_AFFINITY: JobObjectLimit = 16u

public val JOB_OBJECT_LIMIT_BREAKAWAY_OK: JobObjectLimit = 2048u

public val JOB_OBJECT_LIMIT_CPU_RATE_CONTROL: JobObjectLimit = 262144u

public val JOB_OBJECT_LIMIT_DIE_ON_UNHANDLED_EXCEPTION: JobObjectLimit = 1024u

public val JOB_OBJECT_LIMIT_IO_RATE_CONTROL: JobObjectLimit = 524288u

public val JOB_OBJECT_LIMIT_JOB_MEMORY: JobObjectLimit = 512u

public val JOB_OBJECT_LIMIT_JOB_MEMORY_HIGH: JobObjectLimit = 512u

public val JOB_OBJECT_LIMIT_JOB_MEMORY_LOW: JobObjectLimit = 32768u

public val JOB_OBJECT_LIMIT_JOB_READ_BYTES: JobObjectLimit = 65536u

public val JOB_OBJECT_LIMIT_JOB_TIME: JobObjectLimit = 4u

public val JOB_OBJECT_LIMIT_JOB_WRITE_BYTES: JobObjectLimit = 131072u

public val JOB_OBJECT_LIMIT_KILL_ON_JOB_CLOSE: JobObjectLimit = 8192u

public val JOB_OBJECT_LIMIT_NET_RATE_CONTROL: JobObjectLimit = 1048576u

public val JOB_OBJECT_LIMIT_PRESERVE_JOB_TIME: JobObjectLimit = 64u

public val JOB_OBJECT_LIMIT_PRIORITY_CLASS: JobObjectLimit = 32u

public val JOB_OBJECT_LIMIT_PROCESS_MEMORY: JobObjectLimit = 256u

public val JOB_OBJECT_LIMIT_PROCESS_TIME: JobObjectLimit = 2u

public val JOB_OBJECT_LIMIT_RATE_CONTROL: JobObjectLimit = 262144u

public val JOB_OBJECT_LIMIT_SCHEDULING_CLASS: JobObjectLimit = 128u

public val JOB_OBJECT_LIMIT_SILENT_BREAKAWAY_OK: JobObjectLimit = 4096u

public val JOB_OBJECT_LIMIT_SUBSET_AFFINITY: JobObjectLimit = 16384u

public val JOB_OBJECT_LIMIT_VALID_FLAGS: JobObjectLimit = 524287u

public val JOB_OBJECT_LIMIT_WORKINGSET: JobObjectLimit = 1u

public val JOB_OBJECT_NET_RATE_CONTROL_DSCP_TAG: JobObjectNetRateControlFlags = 4

public val JOB_OBJECT_NET_RATE_CONTROL_ENABLE: JobObjectNetRateControlFlags = 1

public val JOB_OBJECT_NET_RATE_CONTROL_MAX_BANDWIDTH: JobObjectNetRateControlFlags = 2

public val JOB_OBJECT_NET_RATE_CONTROL_VALID_FLAGS: JobObjectNetRateControlFlags = 7

public val JOB_OBJECT_NOTIFICATION_LIMIT_VALID_FLAGS: JobObjectLimit = 2064900u

public val JOB_OBJECT_POST_AT_END_OF_JOB: JobObjectTerminateAtEndAction = 1u

public val JOB_OBJECT_SECURITY_FILTER_TOKENS: JobObjectSecurity = 8u

public val JOB_OBJECT_SECURITY_NO_ADMIN: JobObjectSecurity = 1u

public val JOB_OBJECT_SECURITY_ONLY_TOKEN: JobObjectSecurity = 4u

public val JOB_OBJECT_SECURITY_RESTRICTED_TOKEN: JobObjectSecurity = 2u

public val JOB_OBJECT_SECURITY_VALID_FLAGS: JobObjectSecurity = 15u

public val JOB_OBJECT_TERMINATE_AT_END_OF_JOB: JobObjectTerminateAtEndAction = 0u

public val JOB_OBJECT_UILIMIT_DESKTOP: JobObjectUilimit = 64u

public val JOB_OBJECT_UILIMIT_DISPLAYSETTINGS: JobObjectUilimit = 16u

public val JOB_OBJECT_UILIMIT_EXITWINDOWS: JobObjectUilimit = 128u

public val JOB_OBJECT_UILIMIT_GLOBALATOMS: JobObjectUilimit = 32u

public val JOB_OBJECT_UILIMIT_HANDLES: JobObjectUilimit = 1u

public val JOB_OBJECT_UILIMIT_NONE: JobObjectUilimit = 0u

public val JOB_OBJECT_UILIMIT_READCLIPBOARD: JobObjectUilimit = 2u

public val JOB_OBJECT_UILIMIT_SYSTEMPARAMETERS: JobObjectUilimit = 8u

public val JOB_OBJECT_UILIMIT_WRITECLIPBOARD: JobObjectUilimit = 4u

public val JOB_OBJECT_ASSOCIATE_COMPLETION_PORT_INFORMATION: Jobobjectinfoclass = 7

public val JOB_OBJECT_BASIC_ACCOUNTING_INFORMATION: Jobobjectinfoclass = 1

public val JOB_OBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION: Jobobjectinfoclass = 8

public val JOB_OBJECT_BASIC_LIMIT_INFORMATION: Jobobjectinfoclass = 2

public val JOB_OBJECT_BASIC_PROCESS_ID_LIST: Jobobjectinfoclass = 3

public val JOB_OBJECT_BASIC_UI_RESTRICTIONS: Jobobjectinfoclass = 4

public val JOB_OBJECT_COMPLETION_COUNTER: Jobobjectinfoclass = 17

public val JOB_OBJECT_COMPLETION_FILTER: Jobobjectinfoclass = 16

public val JOB_OBJECT_CPU_RATE_CONTROL_INFORMATION: Jobobjectinfoclass = 15

public val JOB_OBJECT_CREATE_SILO: Jobobjectinfoclass = 35

public val JOB_OBJECT_END_OF_JOB_TIME_INFORMATION: Jobobjectinfoclass = 6

public val JOB_OBJECT_EXTENDED_LIMIT_INFORMATION: Jobobjectinfoclass = 9

public val JOB_OBJECT_GROUP_INFORMATION: Jobobjectinfoclass = 11

public val JOB_OBJECT_GROUP_INFORMATION_EX: Jobobjectinfoclass = 14

public val JOB_OBJECT_JOB_SET_INFORMATION: Jobobjectinfoclass = 10

public val JOB_OBJECT_LIMIT_VIOLATION_INFORMATION: Jobobjectinfoclass = 13

public val JOB_OBJECT_LIMIT_VIOLATION_INFORMATION2: Jobobjectinfoclass = 34

public val JOB_OBJECT_NET_RATE_CONTROL_INFORMATION: Jobobjectinfoclass = 32

public val JOB_OBJECT_NOTIFICATION_LIMIT_INFORMATION: Jobobjectinfoclass = 12

public val JOB_OBJECT_NOTIFICATION_LIMIT_INFORMATION2: Jobobjectinfoclass = 33

public val JOB_OBJECT_RESERVED10INFORMATION: Jobobjectinfoclass = 27

public val JOB_OBJECT_RESERVED11INFORMATION: Jobobjectinfoclass = 28

public val JOB_OBJECT_RESERVED12INFORMATION: Jobobjectinfoclass = 29

public val JOB_OBJECT_RESERVED13INFORMATION: Jobobjectinfoclass = 30

public val JOB_OBJECT_RESERVED14INFORMATION: Jobobjectinfoclass = 31

public val JOB_OBJECT_RESERVED15INFORMATION: Jobobjectinfoclass = 37

public val JOB_OBJECT_RESERVED16INFORMATION: Jobobjectinfoclass = 38

public val JOB_OBJECT_RESERVED17INFORMATION: Jobobjectinfoclass = 39

public val JOB_OBJECT_RESERVED18INFORMATION: Jobobjectinfoclass = 40

public val JOB_OBJECT_RESERVED19INFORMATION: Jobobjectinfoclass = 41

public val JOB_OBJECT_RESERVED1INFORMATION: Jobobjectinfoclass = 18

public val JOB_OBJECT_RESERVED20INFORMATION: Jobobjectinfoclass = 42

public val JOB_OBJECT_RESERVED21INFORMATION: Jobobjectinfoclass = 43

public val JOB_OBJECT_RESERVED22INFORMATION: Jobobjectinfoclass = 44

public val JOB_OBJECT_RESERVED23INFORMATION: Jobobjectinfoclass = 45

public val JOB_OBJECT_RESERVED24INFORMATION: Jobobjectinfoclass = 46

public val JOB_OBJECT_RESERVED25INFORMATION: Jobobjectinfoclass = 47

public val JOB_OBJECT_RESERVED26INFORMATION: Jobobjectinfoclass = 48

public val JOB_OBJECT_RESERVED27INFORMATION: Jobobjectinfoclass = 49

public val JOB_OBJECT_RESERVED2INFORMATION: Jobobjectinfoclass = 19

public val JOB_OBJECT_RESERVED3INFORMATION: Jobobjectinfoclass = 20

public val JOB_OBJECT_RESERVED4INFORMATION: Jobobjectinfoclass = 21

public val JOB_OBJECT_RESERVED5INFORMATION: Jobobjectinfoclass = 22

public val JOB_OBJECT_RESERVED6INFORMATION: Jobobjectinfoclass = 23

public val JOB_OBJECT_RESERVED7INFORMATION: Jobobjectinfoclass = 24

public val JOB_OBJECT_RESERVED8INFORMATION: Jobobjectinfoclass = 25

public val JOB_OBJECT_RESERVED9INFORMATION: Jobobjectinfoclass = 26

public val JOB_OBJECT_SECURITY_LIMIT_INFORMATION: Jobobjectinfoclass = 5

public val JOB_OBJECT_SILO_BASIC_INFORMATION: Jobobjectinfoclass = 36

public val MAX_JOB_OBJECT_INFO_CLASS: Jobobjectinfoclass = 50

public val TOLERANCE_HIGH: JobobjectRateControlTolerance = 3

public val TOLERANCE_INTERVAL_LONG: JobobjectRateControlToleranceInterval = 3

public val TOLERANCE_INTERVAL_MEDIUM: JobobjectRateControlToleranceInterval = 2

public val TOLERANCE_INTERVAL_SHORT: JobobjectRateControlToleranceInterval = 1

public val TOLERANCE_LOW: JobobjectRateControlTolerance = 1

public val TOLERANCE_MEDIUM: JobobjectRateControlTolerance = 2
