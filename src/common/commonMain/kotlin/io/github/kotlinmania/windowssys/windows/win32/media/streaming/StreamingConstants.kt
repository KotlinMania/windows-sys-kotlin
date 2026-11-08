package io.github.kotlinmania.windowssys.windows.win32.media.streaming

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val DEVPKEY_Device_DLNACAP: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 16u)

public val DEVPKEY_Device_DLNADOC: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 15u)

public val DEVPKEY_Device_MaxVolume: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 19u)

public val DEVPKEY_Device_PacketWakeSupported: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 0u)

public val DEVPKEY_Device_SendPacketWakeSupported: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 1u)

public val DEVPKEY_Device_SinkProtocolInfo: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 14u)

public val DEVPKEY_Device_SupportsAudio: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 8u)

public val DEVPKEY_Device_SupportsImages: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 10u)

public val DEVPKEY_Device_SupportsMute: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 18u)

public val DEVPKEY_Device_SupportsSearch: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 17u)

public val DEVPKEY_Device_SupportsSetNextAVT: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 20u)

public val DEVPKEY_Device_SupportsVideo: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 9u)

public val DEVPKEY_Device_UDN: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 6u)

public val GUID_DEVINTERFACE_DMP: GUID = GUID.from_u128(U128(0x25b4e2682a05496euL, 0x803b266837fbda4buL))

public val GUID_DEVINTERFACE_DMR: GUID = GUID.from_u128(U128(0xd0875fb421964c7auL, 0xa63de416addd60a1uL))

public val GUID_DEVINTERFACE_DMS: GUID = GUID.from_u128(U128(0xc96037aea5584470uL, 0xb432115a31b85553uL))

public val MF_MEDIASOURCE_STATUS_INFO_FULLYSUPPORTED: MF_MEDIASOURCE_STATUS_INFO = 0

public val MF_MEDIASOURCE_STATUS_INFO_UNKNOWN: MF_MEDIASOURCE_STATUS_INFO = 1

public val MF_TRANSFER_VIDEO_FRAME_DEFAULT: MF_TRANSFER_VIDEO_FRAME_FLAGS = 0

public val MF_TRANSFER_VIDEO_FRAME_IGNORE_PAR: MF_TRANSFER_VIDEO_FRAME_FLAGS = 2

public val MF_TRANSFER_VIDEO_FRAME_STRETCH: MF_TRANSFER_VIDEO_FRAME_FLAGS = 1
