package io.github.kotlinmania.windowssys.windows.wdk.system.registry

public data class KEY_VALUE_ENTRY(
    public var ValueName: Long = 0L,
    public var DataLength: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var Type: UInt = 0u,
)

public data class REG_ENUMERATE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var Index: UInt = 0u,
    public var KeyInformationClass: KEY_INFORMATION_CLASS = 0,
    public var KeyInformation: Long = 0L,
    public var Length: UInt = 0u,
    public var ResultLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_ENUMERATE_VALUE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var Index: UInt = 0u,
    public var KeyValueInformationClass: KEY_VALUE_INFORMATION_CLASS = 0,
    public var KeyValueInformation: Long = 0L,
    public var Length: UInt = 0u,
    public var ResultLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_QUERY_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var KeyInformationClass: KEY_INFORMATION_CLASS = 0,
    public var KeyInformation: Long = 0L,
    public var Length: UInt = 0u,
    public var ResultLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_QUERY_MULTIPLE_VALUE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var ValueEntries: Long = 0L,
    public var EntryCount: UInt = 0u,
    public var ValueBuffer: Long = 0L,
    public var BufferLength: Long = 0L,
    public var RequiredBufferLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_QUERY_VALUE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var ValueName: Long = 0L,
    public var KeyValueInformationClass: KEY_VALUE_INFORMATION_CLASS = 0,
    public var KeyValueInformation: Long = 0L,
    public var Length: UInt = 0u,
    public var ResultLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_SET_INFORMATION_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var KeySetInformationClass: KEY_SET_INFORMATION_CLASS = 0,
    public var KeySetInformation: Long = 0L,
    public var KeySetInformationLength: UInt = 0u,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)
