package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val AM_CONFIGASFWRITER_PARAM_AUTOINDEX: _AM_ASFWRITERCONFIG_PARAM = 1

public val AM_CONFIGASFWRITER_PARAM_DONTCOMPRESS: _AM_ASFWRITERCONFIG_PARAM = 3

public val AM_CONFIGASFWRITER_PARAM_MULTIPASS: _AM_ASFWRITERCONFIG_PARAM = 2

public val CLSID_ClientNetManager: GUID = GUID.from_u128(U128(0xcd12a3ce9c4211d2uL, 0xbeed0060082f2054uL))

public val CLSID_WMBandwidthSharing_Exclusive: GUID = GUID.from_u128(U128(0xaf6060aa519711d2uL, 0xb6af00c04fd908e9uL))

public val CLSID_WMBandwidthSharing_Partial: GUID = GUID.from_u128(U128(0xaf6060ab519711d2uL, 0xb6af00c04fd908e9uL))

public val CLSID_WMMUTEX_Bitrate: GUID = GUID.from_u128(U128(0xd6e22a0135da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_Language: GUID = GUID.from_u128(U128(0xd6e22a0035da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_Presentation: GUID = GUID.from_u128(U128(0xd6e22a0235da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_Unknown: GUID = GUID.from_u128(U128(0xd6e22a0335da11d1uL, 0x903400a0c90349beuL))

public val DRM_OPL_TYPES: UInt = 1u

public val NETSOURCE_URLCREDPOLICY_SETTING_ANONYMOUSONLY: NETSOURCE_URLCREDPOLICY_SETTINGS = 2

public val NETSOURCE_URLCREDPOLICY_SETTING_MUSTPROMPTUSER: NETSOURCE_URLCREDPOLICY_SETTINGS = 1

public val NETSOURCE_URLCREDPOLICY_SETTING_SILENTLOGONOK: NETSOURCE_URLCREDPOLICY_SETTINGS = 0

public val WEBSTREAM_SAMPLE_TYPE_FILE: WEBSTREAM_SAMPLE_TYPE = 1

public val WEBSTREAM_SAMPLE_TYPE_RENDER: WEBSTREAM_SAMPLE_TYPE = 2

public val WMDRM_IMPORT_INIT_STRUCT_DEFINED: UInt = 1u

public val WMFORMAT_MPEG2Video: GUID = GUID.from_u128(U128(0xe06d80e3db4611cfuL, 0xb4d100805f6cbbeauL))

public val WMFORMAT_Script: GUID = GUID.from_u128(U128(0x5c8510f2debe4ca7uL, 0xbba5f07a104f8dffuL))

public val WMFORMAT_VideoInfo: GUID = GUID.from_u128(U128(0x5589f80c35611ceuL, 0xbf0100aa0055595auL))

public val WMFORMAT_WaveFormatEx: GUID = GUID.from_u128(U128(0x5589f81c35611ceuL, 0xbf0100aa0055595auL))

public val WMFORMAT_WebStream: GUID = GUID.from_u128(U128(0xda1e6b1383594050uL, 0xb398388e965bf00cuL))

public val WMMEDIASUBTYPE_ACELPnet: GUID = GUID.from_u128(U128(0x13000000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_Base: GUID = GUID.from_u128(U128(0x10uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_DRM: GUID = GUID.from_u128(U128(0x900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_I420: GUID = GUID.from_u128(U128(0x3032344900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_IYUV: GUID = GUID.from_u128(U128(0x5655594900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_M4S2: GUID = GUID.from_u128(U128(0x3253344d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP3: GUID = GUID.from_u128(U128(0x5500000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP43: GUID = GUID.from_u128(U128(0x3334504d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP4S: GUID = GUID.from_u128(U128(0x5334504d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MPEG2_VIDEO: GUID = GUID.from_u128(U128(0xe06d8026db4611cfuL, 0xb4d100805f6cbbeauL))

public val WMMEDIASUBTYPE_MSS1: GUID = GUID.from_u128(U128(0x3153534d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MSS2: GUID = GUID.from_u128(U128(0x3253534d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_P422: GUID = GUID.from_u128(U128(0x3232345000000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_PCM: GUID = GUID.from_u128(U128(0x100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_RGB1: GUID = GUID.from_u128(U128(0xe436eb78524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB24: GUID = GUID.from_u128(U128(0xe436eb7d524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB32: GUID = GUID.from_u128(U128(0xe436eb7e524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB4: GUID = GUID.from_u128(U128(0xe436eb79524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB555: GUID = GUID.from_u128(U128(0xe436eb7c524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB565: GUID = GUID.from_u128(U128(0xe436eb7b524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB8: GUID = GUID.from_u128(U128(0xe436eb7a524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_UYVY: GUID = GUID.from_u128(U128(0x5956595500000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_VIDEOIMAGE: GUID = GUID.from_u128(U128(0x1d4a45f2e5f64b44uL, 0x8388f0ae5c0e0c37uL))

public val WMMEDIASUBTYPE_WMAudioV2: GUID = GUID.from_u128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMAudioV7: GUID = GUID.from_u128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMAudioV8: GUID = GUID.from_u128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMAudioV9: GUID = GUID.from_u128(U128(0x16200000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMAudio_Lossless: GUID = GUID.from_u128(U128(0x16300000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMSP1: GUID = GUID.from_u128(U128(0xa00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMSP2: GUID = GUID.from_u128(U128(0xb00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV1: GUID = GUID.from_u128(U128(0x31564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV2: GUID = GUID.from_u128(U128(0x32564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV3: GUID = GUID.from_u128(U128(0x33564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMVA: GUID = GUID.from_u128(U128(0x41564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMVP: GUID = GUID.from_u128(U128(0x50564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WVC1: GUID = GUID.from_u128(U128(0x3143565700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WVP2: GUID = GUID.from_u128(U128(0x3250565700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WebStream: GUID = GUID.from_u128(U128(0x776257d4c62741cbuL, 0x8f817ac7ff1c40ccuL))

public val WMMEDIASUBTYPE_YUY2: GUID = GUID.from_u128(U128(0x3259555900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YV12: GUID = GUID.from_u128(U128(0x3231565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YVU9: GUID = GUID.from_u128(U128(0x3955565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YVYU: GUID = GUID.from_u128(U128(0x5559565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_Audio: GUID = GUID.from_u128(U128(0x7364756100000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_FileTransfer: GUID = GUID.from_u128(U128(0xd9e47579930e4427uL, 0xadfcad80f290e470uL))

public val WMMEDIATYPE_Image: GUID = GUID.from_u128(U128(0x34a50fd88aa54386uL, 0x81fea0efe0488e31uL))

public val WMMEDIATYPE_Script: GUID = GUID.from_u128(U128(0x73636d6400000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_Text: GUID = GUID.from_u128(U128(0x9bba1ea75ab24829uL, 0xba570940209bcf3euL))

public val WMMEDIATYPE_Video: GUID = GUID.from_u128(U128(0x7364697600000010uL, 0x800000aa00389b71uL))

public val WMSCRIPTTYPE_TwoStrings: GUID = GUID.from_u128(U128(0x82f38a70c29f11d1uL, 0x97ad00a0c95ea850uL))

public val WMT_ACQUIRE_LICENSE: WMT_STATUS = 23

public val WMT_BACKUPRESTORE_BEGIN: WMT_STATUS = 21

public val WMT_BACKUPRESTORE_CONNECTING: WMT_STATUS = 28

public val WMT_BACKUPRESTORE_DISCONNECTING: WMT_STATUS = 29

public val WMT_BACKUPRESTORE_END: WMT_STATUS = 27

public val WMT_BUFFERING_START: WMT_STATUS = 2

public val WMT_BUFFERING_STOP: WMT_STATUS = 3

public val WMT_CLEANPOINT_ONLY: WMT_STREAM_SELECTION = 1

public val WMT_CLIENT_CONNECT: WMT_STATUS = 32

public val WMT_CLIENT_CONNECT_EX: WMT_STATUS = 37

public val WMT_CLIENT_DISCONNECT: WMT_STATUS = 33

public val WMT_CLIENT_DISCONNECT_EX: WMT_STATUS = 38

public val WMT_CLIENT_PROPERTIES: WMT_STATUS = 42

public val WMT_CLOSED: WMT_STATUS = 13

public val WMT_CODECINFO_AUDIO: WMT_CODEC_INFO_TYPE = 0

public val WMT_CODECINFO_UNKNOWN: WMT_CODEC_INFO_TYPE = -1

public val WMT_CODECINFO_VIDEO: WMT_CODEC_INFO_TYPE = 1

public val WMT_CONNECTING: WMT_STATUS = 8

public val WMT_CONTENT_ENABLER: WMT_STATUS = 51

public val WMT_CREDENTIAL_CLEAR_TEXT: WMT_CREDENTIAL_FLAGS = 4

public val WMT_CREDENTIAL_DONT_CACHE: WMT_CREDENTIAL_FLAGS = 2

public val WMT_CREDENTIAL_ENCRYPT: WMT_CREDENTIAL_FLAGS = 16

public val WMT_CREDENTIAL_PROXY: WMT_CREDENTIAL_FLAGS = 8

public val WMT_CREDENTIAL_SAVE: WMT_CREDENTIAL_FLAGS = 1

public val WMT_DMOCATEGORY_AUDIO_WATERMARK: GUID = GUID.from_u128(U128(0x65221c5afa754b39uL, 0xb50c06c336b6a3efuL))

public val WMT_DMOCATEGORY_VIDEO_WATERMARK: GUID = GUID.from_u128(U128(0x187cc9228efc4404uL, 0x9daf63f4830df1bcuL))

public val WMT_DRMLA_TAMPERED: WMT_DRMLA_TRUST = 2

public val WMT_DRMLA_TRUSTED: WMT_DRMLA_TRUST = 1

public val WMT_DRMLA_UNTRUSTED: WMT_DRMLA_TRUST = 0

public val WMT_END_OF_FILE: WMT_STATUS = 4

public val WMT_END_OF_SEGMENT: WMT_STATUS = 5

public val WMT_END_OF_STREAMING: WMT_STATUS = 6

public val WMT_EOF: WMT_STATUS = 4

public val WMT_ERROR: WMT_STATUS = 0

public val WMT_ERROR_WITHURL: WMT_STATUS = 30

public val WMT_FM_FILESINK_DATA_UNITS: WMT_FILESINK_MODE = 2

public val WMT_FM_FILESINK_UNBUFFERED: WMT_FILESINK_MODE = 4

public val WMT_FM_SINGLE_BUFFERS: WMT_FILESINK_MODE = 1

public val WMT_IMAGETYPE_BITMAP: WMT_ATTR_IMAGETYPE = 1

public val WMT_IMAGETYPE_GIF: WMT_ATTR_IMAGETYPE = 3

public val WMT_IMAGETYPE_JPEG: WMT_ATTR_IMAGETYPE = 2

public val WMT_INDEX_PROGRESS: WMT_STATUS = 16

public val WMT_INDIVIDUALIZE: WMT_STATUS = 24

public val WMT_INIT_PLAYLIST_BURN: WMT_STATUS = 44

public val WMT_IT_BITMAP: WMT_IMAGE_TYPE = 1

public val WMT_IT_FRAME_NUMBERS: WMT_INDEXER_TYPE = 1

public val WMT_IT_GIF: WMT_IMAGE_TYPE = 3

public val WMT_IT_JPEG: WMT_IMAGE_TYPE = 2

public val WMT_IT_NEAREST_CLEAN_POINT: WMT_INDEX_TYPE = 3

public val WMT_IT_NEAREST_DATA_UNIT: WMT_INDEX_TYPE = 1

public val WMT_IT_NEAREST_OBJECT: WMT_INDEX_TYPE = 2

public val WMT_IT_NONE: WMT_IMAGE_TYPE = 0

public val WMT_IT_PRESENTATION_TIME: WMT_INDEXER_TYPE = 0

public val WMT_IT_TIMECODE: WMT_INDEXER_TYPE = 2

public val WMT_LICENSEURL_SIGNATURE_STATE: WMT_STATUS = 43

public val WMT_LOCATING: WMT_STATUS = 7

public val WMT_MISSING_CODEC: WMT_STATUS = 10

public val WMT_MS_CLASS_MIXED: WMT_MUSICSPEECH_CLASS_MODE = 2

public val WMT_MS_CLASS_MUSIC: WMT_MUSICSPEECH_CLASS_MODE = 0

public val WMT_MS_CLASS_SPEECH: WMT_MUSICSPEECH_CLASS_MODE = 1

public val WMT_NATIVE_OUTPUT_PROPS_CHANGED: WMT_STATUS = 34

public val WMT_NEEDS_INDIVIDUALIZATION: WMT_STATUS = 25

public val WMT_NEW_METADATA: WMT_STATUS = 20

public val WMT_NEW_SOURCEFLAGS: WMT_STATUS = 19

public val WMT_NO_RIGHTS: WMT_STATUS = 9

public val WMT_NO_RIGHTS_EX: WMT_STATUS = 26

public val WMT_OFF: WMT_STREAM_SELECTION = 0

public val WMT_OFFSET_FORMAT_100NS: WMT_OFFSET_FORMAT = 0

public val WMT_OFFSET_FORMAT_100NS_APPROXIMATE: WMT_OFFSET_FORMAT = 4

public val WMT_OFFSET_FORMAT_FRAME_NUMBERS: WMT_OFFSET_FORMAT = 1

public val WMT_OFFSET_FORMAT_PLAYLIST_OFFSET: WMT_OFFSET_FORMAT = 2

public val WMT_OFFSET_FORMAT_TIMECODE: WMT_OFFSET_FORMAT = 3

public val WMT_ON: WMT_STREAM_SELECTION = 2

public val WMT_OPENED: WMT_STATUS = 1

public val WMT_PLAY_MODE_AUTOSELECT: WMT_PLAY_MODE = 0

public val WMT_PLAY_MODE_DOWNLOAD: WMT_PLAY_MODE = 2

public val WMT_PLAY_MODE_LOCAL: WMT_PLAY_MODE = 1

public val WMT_PLAY_MODE_STREAMING: WMT_PLAY_MODE = 3

public val WMT_PREROLL_COMPLETE: WMT_STATUS = 41

public val WMT_PREROLL_READY: WMT_STATUS = 40

public val WMT_PROTOCOL_HTTP: WMT_NET_PROTOCOL = 0

public val WMT_PROXIMITY_COMPLETED: WMT_STATUS = 50

public val WMT_PROXIMITY_RESULT: WMT_STATUS = 49

public val WMT_PROXY_SETTING_AUTO: WMT_PROXY_SETTINGS = 2

public val WMT_PROXY_SETTING_BROWSER: WMT_PROXY_SETTINGS = 3

public val WMT_PROXY_SETTING_MANUAL: WMT_PROXY_SETTINGS = 1

public val WMT_PROXY_SETTING_MAX: WMT_PROXY_SETTINGS = 4

public val WMT_PROXY_SETTING_NONE: WMT_PROXY_SETTINGS = 0

public val WMT_RECONNECT_END: WMT_STATUS = 36

public val WMT_RECONNECT_START: WMT_STATUS = 35

public val WMT_RESTRICTED_LICENSE: WMT_STATUS = 31

public val WMT_RIGHT_COLLABORATIVE_PLAY: WMT_RIGHTS = 256

public val WMT_RIGHT_COPY: WMT_RIGHTS = 128

public val WMT_RIGHT_COPY_TO_CD: WMT_RIGHTS = 8

public val WMT_RIGHT_COPY_TO_NON_SDMI_DEVICE: WMT_RIGHTS = 2

public val WMT_RIGHT_COPY_TO_SDMI_DEVICE: WMT_RIGHTS = 16

public val WMT_RIGHT_ONE_TIME: WMT_RIGHTS = 32

public val WMT_RIGHT_PLAYBACK: WMT_RIGHTS = 1

public val WMT_RIGHT_SAVE_STREAM_PROTECTED: WMT_RIGHTS = 64

public val WMT_RIGHT_SDMI_NOMORECOPIES: WMT_RIGHTS = 131072

public val WMT_RIGHT_SDMI_TRIGGER: WMT_RIGHTS = 65536

public val WMT_SAVEAS_START: WMT_STATUS = 17

public val WMT_SAVEAS_STOP: WMT_STATUS = 18

public val WMT_SET_FEC_SPAN: WMT_STATUS = 39

public val WMT_SOURCE_SWITCH: WMT_STATUS = 22

public val WMT_STARTED: WMT_STATUS = 11

public val WMT_STOPPED: WMT_STATUS = 12

public val WMT_STRIDING: WMT_STATUS = 14

public val WMT_Storage_Format_MP3: WMT_STORAGE_FORMAT = 0

public val WMT_Storage_Format_V1: WMT_STORAGE_FORMAT = 1

public val WMT_TIMECODE_FRAMERATE_24: WMT_TIMECODE_FRAMERATE = 3

public val WMT_TIMECODE_FRAMERATE_25: WMT_TIMECODE_FRAMERATE = 2

public val WMT_TIMECODE_FRAMERATE_30: WMT_TIMECODE_FRAMERATE = 0

public val WMT_TIMECODE_FRAMERATE_30DROP: WMT_TIMECODE_FRAMERATE = 1

public val WMT_TIMER: WMT_STATUS = 15

public val WMT_TRANSCRYPTOR_CLOSED: WMT_STATUS = 48

public val WMT_TRANSCRYPTOR_INIT: WMT_STATUS = 45

public val WMT_TRANSCRYPTOR_READ: WMT_STATUS = 47

public val WMT_TRANSCRYPTOR_SEEKED: WMT_STATUS = 46

public val WMT_TYPE_BINARY: WMT_ATTR_DATATYPE = 2

public val WMT_TYPE_BOOL: WMT_ATTR_DATATYPE = 3

public val WMT_TYPE_DWORD: WMT_ATTR_DATATYPE = 0

public val WMT_TYPE_GUID: WMT_ATTR_DATATYPE = 6

public val WMT_TYPE_QWORD: WMT_ATTR_DATATYPE = 4

public val WMT_TYPE_STRING: WMT_ATTR_DATATYPE = 1

public val WMT_TYPE_WORD: WMT_ATTR_DATATYPE = 5

public val WMT_Transport_Type_Reliable: WMT_TRANSPORT_TYPE = 1

public val WMT_Transport_Type_Unreliable: WMT_TRANSPORT_TYPE = 0

public val WMT_VER_4_0: WMT_VERSION = 262144

public val WMT_VER_7_0: WMT_VERSION = 458752

public val WMT_VER_8_0: WMT_VERSION = 524288

public val WMT_VER_9_0: WMT_VERSION = 589824

public val WMT_VIDEOIMAGE_INTEGER_DENOMINATOR: Int = 65536

public val WMT_VIDEOIMAGE_MAGIC_NUMBER: UInt = 491406834u

public val WMT_VIDEOIMAGE_MAGIC_NUMBER_2: UInt = 491406835u

public val WMT_VIDEOIMAGE_SAMPLE_ADV_BLENDING: UInt = 8u

public val WMT_VIDEOIMAGE_SAMPLE_BLENDING: UInt = 4u

public val WMT_VIDEOIMAGE_SAMPLE_INPUT_FRAME: UInt = 1u

public val WMT_VIDEOIMAGE_SAMPLE_MOTION: UInt = 1u

public val WMT_VIDEOIMAGE_SAMPLE_OUTPUT_FRAME: UInt = 2u

public val WMT_VIDEOIMAGE_SAMPLE_ROTATION: UInt = 2u

public val WMT_VIDEOIMAGE_SAMPLE_USES_CURRENT_INPUT_FRAME: UInt = 4u

public val WMT_VIDEOIMAGE_SAMPLE_USES_PREVIOUS_INPUT_FRAME: UInt = 8u

public val WMT_VIDEOIMAGE_TRANSITION_BOW_TIE: UInt = 11u

public val WMT_VIDEOIMAGE_TRANSITION_CIRCLE: UInt = 12u

public val WMT_VIDEOIMAGE_TRANSITION_CROSS_FADE: UInt = 13u

public val WMT_VIDEOIMAGE_TRANSITION_DIAGONAL: UInt = 14u

public val WMT_VIDEOIMAGE_TRANSITION_DIAMOND: UInt = 15u

public val WMT_VIDEOIMAGE_TRANSITION_FADE_TO_COLOR: UInt = 16u

public val WMT_VIDEOIMAGE_TRANSITION_FILLED_V: UInt = 17u

public val WMT_VIDEOIMAGE_TRANSITION_FLIP: UInt = 18u

public val WMT_VIDEOIMAGE_TRANSITION_INSET: UInt = 19u

public val WMT_VIDEOIMAGE_TRANSITION_IRIS: UInt = 20u

public val WMT_VIDEOIMAGE_TRANSITION_PAGE_ROLL: UInt = 21u

public val WMT_VIDEOIMAGE_TRANSITION_RECTANGLE: UInt = 23u

public val WMT_VIDEOIMAGE_TRANSITION_REVEAL: UInt = 24u

public val WMT_VIDEOIMAGE_TRANSITION_SLIDE: UInt = 27u

public val WMT_VIDEOIMAGE_TRANSITION_SPLIT: UInt = 29u

public val WMT_VIDEOIMAGE_TRANSITION_STAR: UInt = 30u

public val WMT_VIDEOIMAGE_TRANSITION_WHEEL: UInt = 31u

public val WMT_WMETYPE_AUDIO: WMT_WATERMARK_ENTRY_TYPE = 1

public val WMT_WMETYPE_VIDEO: WMT_WATERMARK_ENTRY_TYPE = 2

public val WM_AETYPE_EXCLUDE: WM_AETYPE = 101

public val WM_AETYPE_INCLUDE: WM_AETYPE = 105

public val WM_CL_INTERLACED420: UInt = 0u

public val WM_CL_PROGRESSIVE420: UInt = 1u

public val WM_CT_BOTTOM_FIELD_FIRST: UInt = 32u

public val WM_CT_INTERLACED: UInt = 128u

public val WM_CT_REPEAT_FIRST_FIELD: UInt = 16u

public val WM_CT_TOP_FIELD_FIRST: UInt = 64u

public val WM_DM_DEINTERLACE_HALFSIZE: WM_DM_INTERLACED_TYPE = 2

public val WM_DM_DEINTERLACE_HALFSIZEDOUBLERATE: WM_DM_INTERLACED_TYPE = 3

public val WM_DM_DEINTERLACE_INVERSETELECINE: WM_DM_INTERLACED_TYPE = 4

public val WM_DM_DEINTERLACE_NORMAL: WM_DM_INTERLACED_TYPE = 1

public val WM_DM_DEINTERLACE_VERTICALHALFSIZEDOUBLERATE: WM_DM_INTERLACED_TYPE = 5

public val WM_DM_IT_DISABLE_COHERENT_MODE: WM_DM_IT_FIRST_FRAME_COHERENCY = 0

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_BOTTOM: WM_DM_IT_FIRST_FRAME_COHERENCY = 6

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_TOP: WM_DM_IT_FIRST_FRAME_COHERENCY = 1

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_BOTTOM: WM_DM_IT_FIRST_FRAME_COHERENCY = 7

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_TOP: WM_DM_IT_FIRST_FRAME_COHERENCY = 2

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_BOTTOM: WM_DM_IT_FIRST_FRAME_COHERENCY = 8

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_TOP: WM_DM_IT_FIRST_FRAME_COHERENCY = 3

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_BOTTOM: WM_DM_IT_FIRST_FRAME_COHERENCY = 9

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_TOP: WM_DM_IT_FIRST_FRAME_COHERENCY = 4

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_BOTTOM: WM_DM_IT_FIRST_FRAME_COHERENCY = 10

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_TOP: WM_DM_IT_FIRST_FRAME_COHERENCY = 5

public val WM_DM_NOTINTERLACED: WM_DM_INTERLACED_TYPE = 0

public val WM_MAX_STREAMS: UInt = 63u

public val WM_MAX_VIDEO_STREAMS: UInt = 63u

public val WM_PLAYBACK_DRC_HIGH: WM_PLAYBACK_DRC_LEVEL = 0

public val WM_PLAYBACK_DRC_LOW: WM_PLAYBACK_DRC_LEVEL = 2

public val WM_PLAYBACK_DRC_MEDIUM: WM_PLAYBACK_DRC_LEVEL = 1

public val WM_SFEX_DATALOSS: WM_SFEX_TYPE = 4

public val WM_SFEX_NOTASYNCPOINT: WM_SFEX_TYPE = 2

public val WM_SF_CLEANPOINT: WM_SF_TYPE = 1

public val WM_SF_DATALOSS: WM_SF_TYPE = 4

public val WM_SF_DISCONTINUITY: WM_SF_TYPE = 2

public val WM_SampleExtensionGUID_ChromaLocation: GUID = GUID.from_u128(U128(0x4c5acca092764b2cuL, 0x9e4ca0edefdd217euL))

public val WM_SampleExtensionGUID_ColorSpaceInfo: GUID = GUID.from_u128(U128(0xf79ada5630eb4f2buL, 0x9f7af24b139a1157uL))

public val WM_SampleExtensionGUID_ContentType: GUID = GUID.from_u128(U128(0xd590dc2007bc436cuL, 0x9cf7f3bbfbf1a4dcuL))

public val WM_SampleExtensionGUID_FileName: GUID = GUID.from_u128(U128(0xe165ec0e19ed45d7uL, 0xb4a725cbd1e28e9buL))

public val WM_SampleExtensionGUID_OutputCleanPoint: GUID = GUID.from_u128(U128(0xf72a3c6f6eb44ebcuL, 0xb19209ad9759e828uL))

public val WM_SampleExtensionGUID_PixelAspectRatio: GUID = GUID.from_u128(U128(0x1b1ee554f9ea4bc8uL, 0x821a376b74e4c4b8uL))

public val WM_SampleExtensionGUID_SampleDuration: GUID = GUID.from_u128(U128(0xc6bd9450867f4907uL, 0x83a3c77921b733aduL))

public val WM_SampleExtensionGUID_SampleProtectionSalt: GUID = GUID.from_u128(U128(0x5403deeeb9ee438fuL, 0xaa833804997e569duL))

public val WM_SampleExtensionGUID_Timecode: GUID = GUID.from_u128(U128(0x399595ec86674e2duL, 0x8fdb98814ce76c1euL))

public val WM_SampleExtensionGUID_UserDataInfo: GUID = GUID.from_u128(U128(0x732bb4fa78be4549uL, 0x99bd02db1a55b7a8uL))

public val WM_SampleExtension_ChromaLocation_Size: UInt = 1u

public val WM_SampleExtension_ColorSpaceInfo_Size: UInt = 3u

public val WM_SampleExtension_ContentType_Size: UInt = 1u

public val WM_SampleExtension_PixelAspectRatio_Size: UInt = 2u

public val WM_SampleExtension_SampleDuration_Size: UInt = 2u

public val WM_SampleExtension_Timecode_Size: UInt = 14u

public val g_dwWMContentAttributes: UInt = 5u

public val g_dwWMNSCAttributes: UInt = 5u

public val g_dwWMSpecialAttributes: UInt = 20u

public val g_wszASFLeakyBucketPairs: PCWSTR = w("ASFLeakyBucketPairs")

public val g_wszAllowInterlacedOutput: PCWSTR = w("AllowInterlacedOutput")

public val g_wszAverageLevel: PCWSTR = w("AverageLevel")

public val g_wszBufferAverage: PCWSTR = w("Buffer Average")

public val g_wszComplexity: PCWSTR = w("_COMPLEXITYEX")

public val g_wszComplexityLive: PCWSTR = w("_COMPLEXITYEXLIVE")

public val g_wszComplexityMax: PCWSTR = w("_COMPLEXITYEXMAX")

public val g_wszComplexityOffline: PCWSTR = w("_COMPLEXITYEXOFFLINE")

public val g_wszDecoderComplexityRequested: PCWSTR = w("_DECODERCOMPLEXITYPROFILE")

public val g_wszDedicatedDeliveryThread: PCWSTR = w("DedicatedDeliveryThread")

public val g_wszDeinterlaceMode: PCWSTR = w("DeinterlaceMode")

public val g_wszDeliverOnReceive: PCWSTR = w("DeliverOnReceive")

public val g_wszDeviceConformanceTemplate: PCWSTR = w("DeviceConformanceTemplate")

public val g_wszDynamicRangeControl: PCWSTR = w("DynamicRangeControl")

public val g_wszEDL: PCWSTR = w("_EDL")

public val g_wszEarlyDataDelivery: PCWSTR = w("EarlyDataDelivery")

public val g_wszEnableDiscreteOutput: PCWSTR = w("EnableDiscreteOutput")

public val g_wszEnableFrameInterpolation: PCWSTR = w("EnableFrameInterpolation")

public val g_wszEnableWMAProSPDIFOutput: PCWSTR = w("EnableWMAProSPDIFOutput")

public val g_wszFailSeekOnError: PCWSTR = w("FailSeekOnError")

public val g_wszFixedFrameRate: PCWSTR = w("FixedFrameRate")

public val g_wszFold6To2Channels3: PCWSTR = w("Fold6To2Channels3")

public val g_wszFoldToChannelsTemplate: PCWSTR = w("Fold%luTo%luChannels%lu")

public val g_wszInitialPatternForInverseTelecine: PCWSTR = w("InitialPatternForInverseTelecine")

public val g_wszInterlacedCoding: PCWSTR = w("InterlacedCoding")

public val g_wszIsVBRSupported: PCWSTR = w("_ISVBRSUPPORTED")

public val g_wszJPEGCompressionQuality: PCWSTR = w("JPEGCompressionQuality")

public val g_wszJustInTimeDecode: PCWSTR = w("JustInTimeDecode")

public val g_wszMixedClassMode: PCWSTR = w("MixedClassMode")

public val g_wszMusicClassMode: PCWSTR = w("MusicClassMode")

public val g_wszMusicSpeechClassMode: PCWSTR = w("MusicSpeechClassMode")

public val g_wszNeedsPreviousSample: PCWSTR = w("NeedsPreviousSample")

public val g_wszNumPasses: PCWSTR = w("_PASSESUSED")

public val g_wszOriginalSourceFormatTag: PCWSTR = w("_SOURCEFORMATTAG")

public val g_wszOriginalWaveFormat: PCWSTR = w("_ORIGINALWAVEFORMAT")

public val g_wszPeakValue: PCWSTR = w("PeakValue")

public val g_wszPermitSeeksBeyondEndOfStream: PCWSTR = w("PermitSeeksBeyondEndOfStream")

public val g_wszReloadIndexOnSeek: PCWSTR = w("ReloadIndexOnSeek")

public val g_wszScrambledAudio: PCWSTR = w("ScrambledAudio")

public val g_wszSingleOutputBuffer: PCWSTR = w("SingleOutputBuffer")

public val g_wszSoftwareScaling: PCWSTR = w("SoftwareScaling")

public val g_wszSourceBufferTime: PCWSTR = w("SourceBufferTime")

public val g_wszSourceMaxBytesAtOnce: PCWSTR = w("SourceMaxBytesAtOnce")

public val g_wszSpeakerConfig: PCWSTR = w("SpeakerConfig")

public val g_wszSpeechCaps: PCWSTR = w("SpeechFormatCap")

public val g_wszSpeechClassMode: PCWSTR = w("SpeechClassMode")

public val g_wszStreamLanguage: PCWSTR = w("StreamLanguage")

public val g_wszStreamNumIndexObjects: PCWSTR = w("StreamNumIndexObjects")

public val g_wszUsePacketAtSeekPoint: PCWSTR = w("UsePacketAtSeekPoint")

public val g_wszVBRBitrateMax: PCWSTR = w("_RMAX")

public val g_wszVBRBufferWindowMax: PCWSTR = w("_BMAX")

public val g_wszVBREnabled: PCWSTR = w("_VBRENABLED")

public val g_wszVBRPeak: PCWSTR = w("VBR Peak")

public val g_wszVBRQuality: PCWSTR = w("_VBRQUALITY")

public val g_wszVideoSampleDurations: PCWSTR = w("VideoSampleDurations")

public val g_wszWMADID: PCWSTR = w("WM/ADID")

public val g_wszWMASFPacketCount: PCWSTR = w("WM/ASFPacketCount")

public val g_wszWMASFSecurityObjectsSize: PCWSTR = w("WM/ASFSecurityObjectsSize")

public val g_wszWMAlbumArtist: PCWSTR = w("WM/AlbumArtist")

public val g_wszWMAlbumArtistSort: PCWSTR = w("WM/AlbumArtistSort")

public val g_wszWMAlbumCoverURL: PCWSTR = w("WM/AlbumCoverURL")

public val g_wszWMAlbumTitle: PCWSTR = w("WM/AlbumTitle")

public val g_wszWMAlbumTitleSort: PCWSTR = w("WM/AlbumTitleSort")

public val g_wszWMAspectRatioX: PCWSTR = w("AspectRatioX")

public val g_wszWMAspectRatioY: PCWSTR = w("AspectRatioY")

public val g_wszWMAudioFileURL: PCWSTR = w("WM/AudioFileURL")

public val g_wszWMAudioSourceURL: PCWSTR = w("WM/AudioSourceURL")

public val g_wszWMAuthor: PCWSTR = w("Author")

public val g_wszWMAuthorSort: PCWSTR = w("AuthorSort")

public val g_wszWMAuthorURL: PCWSTR = w("WM/AuthorURL")

public val g_wszWMBannerImageData: PCWSTR = w("BannerImageData")

public val g_wszWMBannerImageType: PCWSTR = w("BannerImageType")

public val g_wszWMBannerImageURL: PCWSTR = w("BannerImageURL")

public val g_wszWMBeatsPerMinute: PCWSTR = w("WM/BeatsPerMinute")

public val g_wszWMBitrate: PCWSTR = w("Bitrate")

public val g_wszWMBroadcast: PCWSTR = w("Broadcast")

public val g_wszWMCategory: PCWSTR = w("WM/Category")

public val g_wszWMCodec: PCWSTR = w("WM/Codec")

public val g_wszWMComposer: PCWSTR = w("WM/Composer")

public val g_wszWMComposerSort: PCWSTR = w("WM/ComposerSort")

public val g_wszWMConductor: PCWSTR = w("WM/Conductor")

public val g_wszWMContainerFormat: PCWSTR = w("WM/ContainerFormat")

public val g_wszWMContentDistributor: PCWSTR = w("WM/ContentDistributor")

public val g_wszWMContentGroupDescription: PCWSTR = w("WM/ContentGroupDescription")

public val g_wszWMCopyright: PCWSTR = w("Copyright")

public val g_wszWMCopyrightURL: PCWSTR = w("CopyrightURL")

public val g_wszWMCurrentBitrate: PCWSTR = w("CurrentBitrate")

public val g_wszWMDRM: PCWSTR = w("WM/DRM")

public val g_wszWMDRM_ContentID: PCWSTR = w("DRM_ContentID")

public val g_wszWMDRM_Flags: PCWSTR = w("DRM_Flags")

public val g_wszWMDRM_HeaderSignPrivKey: PCWSTR = w("DRM_HeaderSignPrivKey")

public val g_wszWMDRM_IndividualizedVersion: PCWSTR = w("DRM_IndividualizedVersion")

public val g_wszWMDRM_KeyID: PCWSTR = w("DRM_KeyID")

public val g_wszWMDRM_KeySeed: PCWSTR = w("DRM_KeySeed")

public val g_wszWMDRM_LASignatureCert: PCWSTR = w("DRM_LASignatureCert")

public val g_wszWMDRM_LASignatureLicSrvCert: PCWSTR = w("DRM_LASignatureLicSrvCert")

public val g_wszWMDRM_LASignaturePrivKey: PCWSTR = w("DRM_LASignaturePrivKey")

public val g_wszWMDRM_LASignatureRootCert: PCWSTR = w("DRM_LASignatureRootCert")

public val g_wszWMDRM_Level: PCWSTR = w("DRM_Level")

public val g_wszWMDRM_LicenseAcqURL: PCWSTR = w("DRM_LicenseAcqURL")

public val g_wszWMDRM_SourceID: PCWSTR = w("DRM_SourceID")

public val g_wszWMDRM_V1LicenseAcqURL: PCWSTR = w("DRM_V1LicenseAcqURL")

public val g_wszWMDVDID: PCWSTR = w("WM/DVDID")

public val g_wszWMDescription: PCWSTR = w("Description")

public val g_wszWMDirector: PCWSTR = w("WM/Director")

public val g_wszWMDuration: PCWSTR = w("Duration")

public val g_wszWMEncodedBy: PCWSTR = w("WM/EncodedBy")

public val g_wszWMEncodingSettings: PCWSTR = w("WM/EncodingSettings")

public val g_wszWMEncodingTime: PCWSTR = w("WM/EncodingTime")

public val g_wszWMEpisodeNumber: PCWSTR = w("WM/EpisodeNumber")

public val g_wszWMFileSize: PCWSTR = w("FileSize")

public val g_wszWMGenre: PCWSTR = w("WM/Genre")

public val g_wszWMGenreID: PCWSTR = w("WM/GenreID")

public val g_wszWMHasArbitraryDataStream: PCWSTR = w("HasArbitraryDataStream")

public val g_wszWMHasAttachedImages: PCWSTR = w("HasAttachedImages")

public val g_wszWMHasAudio: PCWSTR = w("HasAudio")

public val g_wszWMHasFileTransferStream: PCWSTR = w("HasFileTransferStream")

public val g_wszWMHasImage: PCWSTR = w("HasImage")

public val g_wszWMHasScript: PCWSTR = w("HasScript")

public val g_wszWMHasVideo: PCWSTR = w("HasVideo")

public val g_wszWMISAN: PCWSTR = w("WM/ISAN")

public val g_wszWMISRC: PCWSTR = w("WM/ISRC")

public val g_wszWMInitialKey: PCWSTR = w("WM/InitialKey")

public val g_wszWMIsCompilation: PCWSTR = w("WM/IsCompilation")

public val g_wszWMIsVBR: PCWSTR = w("IsVBR")

public val g_wszWMLanguage: PCWSTR = w("WM/Language")

public val g_wszWMLyrics: PCWSTR = w("WM/Lyrics")

public val g_wszWMLyrics_Synchronised: PCWSTR = w("WM/Lyrics_Synchronised")

public val g_wszWMMCDI: PCWSTR = w("WM/MCDI")

public val g_wszWMMediaClassPrimaryID: PCWSTR = w("WM/MediaClassPrimaryID")

public val g_wszWMMediaClassSecondaryID: PCWSTR = w("WM/MediaClassSecondaryID")

public val g_wszWMMediaCredits: PCWSTR = w("WM/MediaCredits")

public val g_wszWMMediaIsDelay: PCWSTR = w("WM/MediaIsDelay")

public val g_wszWMMediaIsFinale: PCWSTR = w("WM/MediaIsFinale")

public val g_wszWMMediaIsLive: PCWSTR = w("WM/MediaIsLive")

public val g_wszWMMediaIsPremiere: PCWSTR = w("WM/MediaIsPremiere")

public val g_wszWMMediaIsRepeat: PCWSTR = w("WM/MediaIsRepeat")

public val g_wszWMMediaIsSAP: PCWSTR = w("WM/MediaIsSAP")

public val g_wszWMMediaIsStereo: PCWSTR = w("WM/MediaIsStereo")

public val g_wszWMMediaIsSubtitled: PCWSTR = w("WM/MediaIsSubtitled")

public val g_wszWMMediaIsTape: PCWSTR = w("WM/MediaIsTape")

public val g_wszWMMediaNetworkAffiliation: PCWSTR = w("WM/MediaNetworkAffiliation")

public val g_wszWMMediaOriginalBroadcastDateTime: PCWSTR = w("WM/MediaOriginalBroadcastDateTime")

public val g_wszWMMediaOriginalChannel: PCWSTR = w("WM/MediaOriginalChannel")

public val g_wszWMMediaStationCallSign: PCWSTR = w("WM/MediaStationCallSign")

public val g_wszWMMediaStationName: PCWSTR = w("WM/MediaStationName")

public val g_wszWMModifiedBy: PCWSTR = w("WM/ModifiedBy")

public val g_wszWMMood: PCWSTR = w("WM/Mood")

public val g_wszWMNSCAddress: PCWSTR = w("NSC_Address")

public val g_wszWMNSCDescription: PCWSTR = w("NSC_Description")

public val g_wszWMNSCEmail: PCWSTR = w("NSC_Email")

public val g_wszWMNSCName: PCWSTR = w("NSC_Name")

public val g_wszWMNSCPhone: PCWSTR = w("NSC_Phone")

public val g_wszWMNumberOfFrames: PCWSTR = w("NumberOfFrames")

public val g_wszWMOptimalBitrate: PCWSTR = w("OptimalBitrate")

public val g_wszWMOriginalAlbumTitle: PCWSTR = w("WM/OriginalAlbumTitle")

public val g_wszWMOriginalArtist: PCWSTR = w("WM/OriginalArtist")

public val g_wszWMOriginalFilename: PCWSTR = w("WM/OriginalFilename")

public val g_wszWMOriginalLyricist: PCWSTR = w("WM/OriginalLyricist")

public val g_wszWMOriginalReleaseTime: PCWSTR = w("WM/OriginalReleaseTime")

public val g_wszWMOriginalReleaseYear: PCWSTR = w("WM/OriginalReleaseYear")

public val g_wszWMParentalRating: PCWSTR = w("WM/ParentalRating")

public val g_wszWMParentalRatingReason: PCWSTR = w("WM/ParentalRatingReason")

public val g_wszWMPartOfSet: PCWSTR = w("WM/PartOfSet")

public val g_wszWMPeakBitrate: PCWSTR = w("WM/PeakBitrate")

public val g_wszWMPeriod: PCWSTR = w("WM/Period")

public val g_wszWMPicture: PCWSTR = w("WM/Picture")

public val g_wszWMPlaylistDelay: PCWSTR = w("WM/PlaylistDelay")

public val g_wszWMProducer: PCWSTR = w("WM/Producer")

public val g_wszWMPromotionURL: PCWSTR = w("WM/PromotionURL")

public val g_wszWMProtected: PCWSTR = w("Is_Protected")

public val g_wszWMProtectionType: PCWSTR = w("WM/ProtectionType")

public val g_wszWMProvider: PCWSTR = w("WM/Provider")

public val g_wszWMProviderCopyright: PCWSTR = w("WM/ProviderCopyright")

public val g_wszWMProviderRating: PCWSTR = w("WM/ProviderRating")

public val g_wszWMProviderStyle: PCWSTR = w("WM/ProviderStyle")

public val g_wszWMPublisher: PCWSTR = w("WM/Publisher")

public val g_wszWMRadioStationName: PCWSTR = w("WM/RadioStationName")

public val g_wszWMRadioStationOwner: PCWSTR = w("WM/RadioStationOwner")

public val g_wszWMRating: PCWSTR = w("Rating")

public val g_wszWMSeasonNumber: PCWSTR = w("WM/SeasonNumber")

public val g_wszWMSeekable: PCWSTR = w("Seekable")

public val g_wszWMSharedUserRating: PCWSTR = w("WM/SharedUserRating")

public val g_wszWMSignature_Name: PCWSTR = w("Signature_Name")

public val g_wszWMSkipBackward: PCWSTR = w("Can_Skip_Backward")

public val g_wszWMSkipForward: PCWSTR = w("Can_Skip_Forward")

public val g_wszWMStreamTypeInfo: PCWSTR = w("WM/StreamTypeInfo")

public val g_wszWMStridable: PCWSTR = w("Stridable")

public val g_wszWMSubTitle: PCWSTR = w("WM/SubTitle")

public val g_wszWMSubTitleDescription: PCWSTR = w("WM/SubTitleDescription")

public val g_wszWMSubscriptionContentID: PCWSTR = w("WM/SubscriptionContentID")

public val g_wszWMText: PCWSTR = w("WM/Text")

public val g_wszWMTitle: PCWSTR = w("Title")

public val g_wszWMTitleSort: PCWSTR = w("TitleSort")

public val g_wszWMToolName: PCWSTR = w("WM/ToolName")

public val g_wszWMToolVersion: PCWSTR = w("WM/ToolVersion")

public val g_wszWMTrack: PCWSTR = w("WM/Track")

public val g_wszWMTrackNumber: PCWSTR = w("WM/TrackNumber")

public val g_wszWMTrusted: PCWSTR = w("Is_Trusted")

public val g_wszWMUniqueFileIdentifier: PCWSTR = w("WM/UniqueFileIdentifier")

public val g_wszWMUse_Advanced_DRM: PCWSTR = w("Use_Advanced_DRM")

public val g_wszWMUse_DRM: PCWSTR = w("Use_DRM")

public val g_wszWMUserWebURL: PCWSTR = w("WM/UserWebURL")

public val g_wszWMVideoClosedCaptioning: PCWSTR = w("WM/VideoClosedCaptioning")

public val g_wszWMVideoFrameRate: PCWSTR = w("WM/VideoFrameRate")

public val g_wszWMVideoHeight: PCWSTR = w("WM/VideoHeight")

public val g_wszWMVideoWidth: PCWSTR = w("WM/VideoWidth")

public val g_wszWMWMADRCAverageReference: PCWSTR = w("WM/WMADRCAverageReference")

public val g_wszWMWMADRCAverageTarget: PCWSTR = w("WM/WMADRCAverageTarget")

public val g_wszWMWMADRCPeakReference: PCWSTR = w("WM/WMADRCPeakReference")

public val g_wszWMWMADRCPeakTarget: PCWSTR = w("WM/WMADRCPeakTarget")

public val g_wszWMWMCPDistributor: PCWSTR = w("WM/WMCPDistributor")

public val g_wszWMWMCPDistributorID: PCWSTR = w("WM/WMCPDistributorID")

public val g_wszWMWMCollectionGroupID: PCWSTR = w("WM/WMCollectionGroupID")

public val g_wszWMWMCollectionID: PCWSTR = w("WM/WMCollectionID")

public val g_wszWMWMContentID: PCWSTR = w("WM/WMContentID")

public val g_wszWMWMShadowFileSourceDRMType: PCWSTR = w("WM/WMShadowFileSourceDRMType")

public val g_wszWMWMShadowFileSourceFileType: PCWSTR = w("WM/WMShadowFileSourceFileType")

public val g_wszWMWriter: PCWSTR = w("WM/Writer")

public val g_wszWMYear: PCWSTR = w("WM/Year")

public val g_wszWatermarkCLSID: PCWSTR = w("WatermarkCLSID")

public val g_wszWatermarkConfig: PCWSTR = w("WatermarkConfig")
