package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID

public data class DMO_MEDIA_TYPE(
    public var majortype: GUID = GUID(),
    public var subtype: GUID = GUID(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var lSampleSize: UInt = 0u,
    public var formattype: GUID = GUID(),
    public var pUnk: Long = 0L,
    public var cbFormat: UInt = 0u,
    public var pbFormat: Long = 0L,
)

public data class DMO_OUTPUT_DATA_BUFFER(
    public var pBuffer: Long = 0L,
    public var dwStatus: UInt = 0u,
    public var rtTimestamp: Long = 0L,
    public var rtTimelength: Long = 0L,
)

public data class DMO_PARTIAL_MEDIATYPE(public var type: GUID = GUID(), public var subtype: GUID = GUID())
