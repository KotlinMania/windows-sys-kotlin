package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public data class DmoMediaType(
    public var majortype: Guid = Guid(),
    public var subtype: Guid = Guid(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var lSampleSize: UInt = 0u,
    public var formattype: Guid = Guid(),
    public var pUnk: COpaquePointer? = null,
    public var cbFormat: UInt = 0u,
    public var pbFormat: COpaquePointer? = null,
)

public data class DmoOutputDataBuffer(
    public var pBuffer: COpaquePointer? = null,
    public var dwStatus: UInt = 0u,
    public var rtTimestamp: Long = 0L,
    public var rtTimelength: Long = 0L,
)

public data class DmoPartialMediatype(public var type: Guid = Guid(), public var subtype: Guid = Guid())
