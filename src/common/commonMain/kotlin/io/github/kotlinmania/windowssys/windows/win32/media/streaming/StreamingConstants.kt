package io.github.kotlinmania.windowssys.windows.win32.media.streaming

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val DEVPKEY_DEVICE_DLNACAP: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 16u)

public val DEVPKEY_DEVICE_DLNADOC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 15u)

public val DEVPKEY_DEVICE_MAX_VOLUME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 19u)

public val DEVPKEY_DEVICE_PACKET_WAKE_SUPPORTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 0u)

public val DEVPKEY_DEVICE_SEND_PACKET_WAKE_SUPPORTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 1u)

public val DEVPKEY_DEVICE_SINK_PROTOCOL_INFO: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 14u)

public val DEVPKEY_DEVICE_SUPPORTS_AUDIO: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 8u)

public val DEVPKEY_DEVICE_SUPPORTS_IMAGES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 10u)

public val DEVPKEY_DEVICE_SUPPORTS_MUTE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 18u)

public val DEVPKEY_DEVICE_SUPPORTS_SEARCH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 17u)

public val DEVPKEY_DEVICE_SUPPORTS_SET_NEXT_AVT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 20u)

public val DEVPKEY_DEVICE_SUPPORTS_VIDEO: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 9u)

public val DEVPKEY_DEVICE_UDN: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x88ad39db0d0c4a38uL, 0x84354043826b5c91uL)), pid = 6u)

public val GUID_DEVINTERFACE_DMP: Guid = Guid.fromU128(U128(0x25b4e2682a05496euL, 0x803b266837fbda4buL))

public val GUID_DEVINTERFACE_DMR: Guid = Guid.fromU128(U128(0xd0875fb421964c7auL, 0xa63de416addd60a1uL))

public val GUID_DEVINTERFACE_DMS: Guid = Guid.fromU128(U128(0xc96037aea5584470uL, 0xb432115a31b85553uL))

public val MF_MEDIASOURCE_STATUS_INFO_FULLYSUPPORTED: MfMediasourceStatusInfo = 0

public val MF_MEDIASOURCE_STATUS_INFO_UNKNOWN: MfMediasourceStatusInfo = 1

public val MF_TRANSFER_VIDEO_FRAME_DEFAULT: MfTransferVideoFrameFlags = 0

public val MF_TRANSFER_VIDEO_FRAME_IGNORE_PAR: MfTransferVideoFrameFlags = 2

public val MF_TRANSFER_VIDEO_FRAME_STRETCH: MfTransferVideoFrameFlags = 1
