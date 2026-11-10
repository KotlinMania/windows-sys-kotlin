package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public data class KeyValueEntry(
    public var valueName: UnicodeString? = null,
    public var dataLength: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var type: UInt = 0u,
)

public data class RegEnumerateKeyInformation(
    public var obj: COpaquePointer? = null,
    public var index: UInt = 0u,
    public var keyInformationClass: KeyInformationClass = 0,
    public var keyInformation: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var resultLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegEnumerateValueKeyInformation(
    public var obj: COpaquePointer? = null,
    public var index: UInt = 0u,
    public var keyValueInformationClass: KeyValueInformationClass = 0,
    public var keyValueInformation: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var resultLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegQueryKeyInformation(
    public var obj: COpaquePointer? = null,
    public var keyInformationClass: KeyInformationClass = 0,
    public var keyInformation: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var resultLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegQueryMultipleValueKeyInformation(
    public var obj: COpaquePointer? = null,
    public var valueEntries: KeyValueEntry? = null,
    public var entryCount: UInt = 0u,
    public var valueBuffer: COpaquePointer? = null,
    public var bufferLength: UInt? = null,
    public var requiredBufferLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegQueryValueKeyInformation(
    public var obj: COpaquePointer? = null,
    public var valueName: UnicodeString? = null,
    public var keyValueInformationClass: KeyValueInformationClass = 0,
    public var keyValueInformation: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var resultLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegSetInformationKeyInformation(
    public var obj: COpaquePointer? = null,
    public var keySetInformationClass: KeySetInformationClass = 0,
    public var keySetInformation: COpaquePointer? = null,
    public var keySetInformationLength: UInt = 0u,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)
