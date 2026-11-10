package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val AM_CONFIGASFWRITER_PARAM_AUTOINDEX: AmAsfwriterconfigParam = 1

public val AM_CONFIGASFWRITER_PARAM_DONTCOMPRESS: AmAsfwriterconfigParam = 3

public val AM_CONFIGASFWRITER_PARAM_MULTIPASS: AmAsfwriterconfigParam = 2

public val CLSID_CLIENT_NET_MANAGER: Guid = Guid.fromU128(U128(0xcd12a3ce9c4211d2uL, 0xbeed0060082f2054uL))

public val CLSID_WM_BANDWIDTH_SHARING_EXCLUSIVE: Guid = Guid.fromU128(U128(0xaf6060aa519711d2uL, 0xb6af00c04fd908e9uL))

public val CLSID_WM_BANDWIDTH_SHARING_PARTIAL: Guid = Guid.fromU128(U128(0xaf6060ab519711d2uL, 0xb6af00c04fd908e9uL))

public val CLSID_WMMUTEX_BITRATE: Guid = Guid.fromU128(U128(0xd6e22a0135da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_LANGUAGE: Guid = Guid.fromU128(U128(0xd6e22a0035da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_PRESENTATION: Guid = Guid.fromU128(U128(0xd6e22a0235da11d1uL, 0x903400a0c90349beuL))

public val CLSID_WMMUTEX_UNKNOWN: Guid = Guid.fromU128(U128(0xd6e22a0335da11d1uL, 0x903400a0c90349beuL))

public val DRM_OPL_TYPES: UInt = 1u

public val NETSOURCE_URLCREDPOLICY_SETTING_ANONYMOUSONLY: NetsourceUrlcredpolicySettings = 2

public val NETSOURCE_URLCREDPOLICY_SETTING_MUSTPROMPTUSER: NetsourceUrlcredpolicySettings = 1

public val NETSOURCE_URLCREDPOLICY_SETTING_SILENTLOGONOK: NetsourceUrlcredpolicySettings = 0

public val WEBSTREAM_SAMPLE_TYPE_FILE: WebstreamSampleType = 1

public val WEBSTREAM_SAMPLE_TYPE_RENDER: WebstreamSampleType = 2

public val WMDRM_IMPORT_INIT_STRUCT_DEFINED: UInt = 1u

public val WMFORMAT_MPEG2VIDEO: Guid = Guid.fromU128(U128(0xe06d80e3db4611cfuL, 0xb4d100805f6cbbeauL))

public val WMFORMAT_SCRIPT: Guid = Guid.fromU128(U128(0x5c8510f2debe4ca7uL, 0xbba5f07a104f8dffuL))

public val WMFORMAT_VIDEO_INFO: Guid = Guid.fromU128(U128(0x5589f80c35611ceuL, 0xbf0100aa0055595auL))

public val WMFORMAT_WAVE_FORMAT_EX: Guid = Guid.fromU128(U128(0x5589f81c35611ceuL, 0xbf0100aa0055595auL))

public val WMFORMAT_WEB_STREAM: Guid = Guid.fromU128(U128(0xda1e6b1383594050uL, 0xb398388e965bf00cuL))

public val WMMEDIASUBTYPE_ACEL_PNET: Guid = Guid.fromU128(U128(0x13000000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_BASE: Guid = Guid.fromU128(U128(0x10uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_DRM: Guid = Guid.fromU128(U128(0x900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_I420: Guid = Guid.fromU128(U128(0x3032344900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_IYUV: Guid = Guid.fromU128(U128(0x5655594900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_M4S2: Guid = Guid.fromU128(U128(0x3253344d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP3: Guid = Guid.fromU128(U128(0x5500000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP43: Guid = Guid.fromU128(U128(0x3334504d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MP4S: Guid = Guid.fromU128(U128(0x5334504d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MPEG2_VIDEO: Guid = Guid.fromU128(U128(0xe06d8026db4611cfuL, 0xb4d100805f6cbbeauL))

public val WMMEDIASUBTYPE_MSS1: Guid = Guid.fromU128(U128(0x3153534d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_MSS2: Guid = Guid.fromU128(U128(0x3253534d00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_P422: Guid = Guid.fromU128(U128(0x3232345000000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_PCM: Guid = Guid.fromU128(U128(0x100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_RGB1: Guid = Guid.fromU128(U128(0xe436eb78524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB24: Guid = Guid.fromU128(U128(0xe436eb7d524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB32: Guid = Guid.fromU128(U128(0xe436eb7e524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB4: Guid = Guid.fromU128(U128(0xe436eb79524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB555: Guid = Guid.fromU128(U128(0xe436eb7c524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB565: Guid = Guid.fromU128(U128(0xe436eb7b524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_RGB8: Guid = Guid.fromU128(U128(0xe436eb7a524f11ceuL, 0x9f530020af0ba770uL))

public val WMMEDIASUBTYPE_UYVY: Guid = Guid.fromU128(U128(0x5956595500000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_VIDEOIMAGE: Guid = Guid.fromU128(U128(0x1d4a45f2e5f64b44uL, 0x8388f0ae5c0e0c37uL))

public val WMMEDIASUBTYPE_WM_AUDIO_V2: Guid = Guid.fromU128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WM_AUDIO_V7: Guid = Guid.fromU128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WM_AUDIO_V8: Guid = Guid.fromU128(U128(0x16100000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WM_AUDIO_V9: Guid = Guid.fromU128(U128(0x16200000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WM_AUDIO_LOSSLESS: Guid = Guid.fromU128(U128(0x16300000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMSP1: Guid = Guid.fromU128(U128(0xa00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMSP2: Guid = Guid.fromU128(U128(0xb00000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV1: Guid = Guid.fromU128(U128(0x31564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV2: Guid = Guid.fromU128(U128(0x32564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMV3: Guid = Guid.fromU128(U128(0x33564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMVA: Guid = Guid.fromU128(U128(0x41564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WMVP: Guid = Guid.fromU128(U128(0x50564d5700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WVC1: Guid = Guid.fromU128(U128(0x3143565700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WVP2: Guid = Guid.fromU128(U128(0x3250565700000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_WEB_STREAM: Guid = Guid.fromU128(U128(0x776257d4c62741cbuL, 0x8f817ac7ff1c40ccuL))

public val WMMEDIASUBTYPE_YUY2: Guid = Guid.fromU128(U128(0x3259555900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YV12: Guid = Guid.fromU128(U128(0x3231565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YVU9: Guid = Guid.fromU128(U128(0x3955565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIASUBTYPE_YVYU: Guid = Guid.fromU128(U128(0x5559565900000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_AUDIO: Guid = Guid.fromU128(U128(0x7364756100000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_FILE_TRANSFER: Guid = Guid.fromU128(U128(0xd9e47579930e4427uL, 0xadfcad80f290e470uL))

public val WMMEDIATYPE_IMAGE: Guid = Guid.fromU128(U128(0x34a50fd88aa54386uL, 0x81fea0efe0488e31uL))

public val WMMEDIATYPE_SCRIPT: Guid = Guid.fromU128(U128(0x73636d6400000010uL, 0x800000aa00389b71uL))

public val WMMEDIATYPE_TEXT: Guid = Guid.fromU128(U128(0x9bba1ea75ab24829uL, 0xba570940209bcf3euL))

public val WMMEDIATYPE_VIDEO: Guid = Guid.fromU128(U128(0x7364697600000010uL, 0x800000aa00389b71uL))

public val WMSCRIPTTYPE_TWO_STRINGS: Guid = Guid.fromU128(U128(0x82f38a70c29f11d1uL, 0x97ad00a0c95ea850uL))

public val WMT_ACQUIRE_LICENSE: WmtStatus = 23

public val WMT_BACKUPRESTORE_BEGIN: WmtStatus = 21

public val WMT_BACKUPRESTORE_CONNECTING: WmtStatus = 28

public val WMT_BACKUPRESTORE_DISCONNECTING: WmtStatus = 29

public val WMT_BACKUPRESTORE_END: WmtStatus = 27

public val WMT_BUFFERING_START: WmtStatus = 2

public val WMT_BUFFERING_STOP: WmtStatus = 3

public val WMT_CLEANPOINT_ONLY: WmtStreamSelection = 1

public val WMT_CLIENT_CONNECT: WmtStatus = 32

public val WMT_CLIENT_CONNECT_EX: WmtStatus = 37

public val WMT_CLIENT_DISCONNECT: WmtStatus = 33

public val WMT_CLIENT_DISCONNECT_EX: WmtStatus = 38

public val WMT_CLIENT_PROPERTIES: WmtStatus = 42

public val WMT_CLOSED: WmtStatus = 13

public val WMT_CODECINFO_AUDIO: WmtCodecInfoType = 0

public val WMT_CODECINFO_UNKNOWN: WmtCodecInfoType = -1

public val WMT_CODECINFO_VIDEO: WmtCodecInfoType = 1

public val WMT_CONNECTING: WmtStatus = 8

public val WMT_CONTENT_ENABLER: WmtStatus = 51

public val WMT_CREDENTIAL_CLEAR_TEXT: WmtCredentialFlags = 4

public val WMT_CREDENTIAL_DONT_CACHE: WmtCredentialFlags = 2

public val WMT_CREDENTIAL_ENCRYPT: WmtCredentialFlags = 16

public val WMT_CREDENTIAL_PROXY: WmtCredentialFlags = 8

public val WMT_CREDENTIAL_SAVE: WmtCredentialFlags = 1

public val WMT_DMOCATEGORY_AUDIO_WATERMARK: Guid = Guid.fromU128(U128(0x65221c5afa754b39uL, 0xb50c06c336b6a3efuL))

public val WMT_DMOCATEGORY_VIDEO_WATERMARK: Guid = Guid.fromU128(U128(0x187cc9228efc4404uL, 0x9daf63f4830df1bcuL))

public val WMT_DRMLA_TAMPERED: WmtDrmlaTrust = 2

public val WMT_DRMLA_TRUSTED: WmtDrmlaTrust = 1

public val WMT_DRMLA_UNTRUSTED: WmtDrmlaTrust = 0

public val WMT_END_OF_FILE: WmtStatus = 4

public val WMT_END_OF_SEGMENT: WmtStatus = 5

public val WMT_END_OF_STREAMING: WmtStatus = 6

public val WMT_EOF: WmtStatus = 4

public val WMT_ERROR: WmtStatus = 0

public val WMT_ERROR_WITHURL: WmtStatus = 30

public val WMT_FM_FILESINK_DATA_UNITS: WmtFilesinkMode = 2

public val WMT_FM_FILESINK_UNBUFFERED: WmtFilesinkMode = 4

public val WMT_FM_SINGLE_BUFFERS: WmtFilesinkMode = 1

public val WMT_IMAGETYPE_BITMAP: WmtAttrImagetype = 1

public val WMT_IMAGETYPE_GIF: WmtAttrImagetype = 3

public val WMT_IMAGETYPE_JPEG: WmtAttrImagetype = 2

public val WMT_INDEX_PROGRESS: WmtStatus = 16

public val WMT_INDIVIDUALIZE: WmtStatus = 24

public val WMT_INIT_PLAYLIST_BURN: WmtStatus = 44

public val WMT_IT_BITMAP: WmtImageType = 1

public val WMT_IT_FRAME_NUMBERS: WmtIndexerType = 1

public val WMT_IT_GIF: WmtImageType = 3

public val WMT_IT_JPEG: WmtImageType = 2

public val WMT_IT_NEAREST_CLEAN_POINT: WmtIndexType = 3

public val WMT_IT_NEAREST_DATA_UNIT: WmtIndexType = 1

public val WMT_IT_NEAREST_OBJECT: WmtIndexType = 2

public val WMT_IT_NONE: WmtImageType = 0

public val WMT_IT_PRESENTATION_TIME: WmtIndexerType = 0

public val WMT_IT_TIMECODE: WmtIndexerType = 2

public val WMT_LICENSEURL_SIGNATURE_STATE: WmtStatus = 43

public val WMT_LOCATING: WmtStatus = 7

public val WMT_MISSING_CODEC: WmtStatus = 10

public val WMT_MS_CLASS_MIXED: WmtMusicspeechClassMode = 2

public val WMT_MS_CLASS_MUSIC: WmtMusicspeechClassMode = 0

public val WMT_MS_CLASS_SPEECH: WmtMusicspeechClassMode = 1

public val WMT_NATIVE_OUTPUT_PROPS_CHANGED: WmtStatus = 34

public val WMT_NEEDS_INDIVIDUALIZATION: WmtStatus = 25

public val WMT_NEW_METADATA: WmtStatus = 20

public val WMT_NEW_SOURCEFLAGS: WmtStatus = 19

public val WMT_NO_RIGHTS: WmtStatus = 9

public val WMT_NO_RIGHTS_EX: WmtStatus = 26

public val WMT_OFF: WmtStreamSelection = 0

public val WMT_OFFSET_FORMAT_100NS: WmtOffsetFormat = 0

public val WMT_OFFSET_FORMAT_100NS_APPROXIMATE: WmtOffsetFormat = 4

public val WMT_OFFSET_FORMAT_FRAME_NUMBERS: WmtOffsetFormat = 1

public val WMT_OFFSET_FORMAT_PLAYLIST_OFFSET: WmtOffsetFormat = 2

public val WMT_OFFSET_FORMAT_TIMECODE: WmtOffsetFormat = 3

public val WMT_ON: WmtStreamSelection = 2

public val WMT_OPENED: WmtStatus = 1

public val WMT_PLAY_MODE_AUTOSELECT: WmtPlayMode = 0

public val WMT_PLAY_MODE_DOWNLOAD: WmtPlayMode = 2

public val WMT_PLAY_MODE_LOCAL: WmtPlayMode = 1

public val WMT_PLAY_MODE_STREAMING: WmtPlayMode = 3

public val WMT_PREROLL_COMPLETE: WmtStatus = 41

public val WMT_PREROLL_READY: WmtStatus = 40

public val WMT_PROTOCOL_HTTP: WmtNetProtocol = 0

public val WMT_PROXIMITY_COMPLETED: WmtStatus = 50

public val WMT_PROXIMITY_RESULT: WmtStatus = 49

public val WMT_PROXY_SETTING_AUTO: WmtProxySettings = 2

public val WMT_PROXY_SETTING_BROWSER: WmtProxySettings = 3

public val WMT_PROXY_SETTING_MANUAL: WmtProxySettings = 1

public val WMT_PROXY_SETTING_MAX: WmtProxySettings = 4

public val WMT_PROXY_SETTING_NONE: WmtProxySettings = 0

public val WMT_RECONNECT_END: WmtStatus = 36

public val WMT_RECONNECT_START: WmtStatus = 35

public val WMT_RESTRICTED_LICENSE: WmtStatus = 31

public val WMT_RIGHT_COLLABORATIVE_PLAY: WmtRights = 256

public val WMT_RIGHT_COPY: WmtRights = 128

public val WMT_RIGHT_COPY_TO_CD: WmtRights = 8

public val WMT_RIGHT_COPY_TO_NON_SDMI_DEVICE: WmtRights = 2

public val WMT_RIGHT_COPY_TO_SDMI_DEVICE: WmtRights = 16

public val WMT_RIGHT_ONE_TIME: WmtRights = 32

public val WMT_RIGHT_PLAYBACK: WmtRights = 1

public val WMT_RIGHT_SAVE_STREAM_PROTECTED: WmtRights = 64

public val WMT_RIGHT_SDMI_NOMORECOPIES: WmtRights = 131072

public val WMT_RIGHT_SDMI_TRIGGER: WmtRights = 65536

public val WMT_SAVEAS_START: WmtStatus = 17

public val WMT_SAVEAS_STOP: WmtStatus = 18

public val WMT_SET_FEC_SPAN: WmtStatus = 39

public val WMT_SOURCE_SWITCH: WmtStatus = 22

public val WMT_STARTED: WmtStatus = 11

public val WMT_STOPPED: WmtStatus = 12

public val WMT_STRIDING: WmtStatus = 14

public val WMT_STORAGE_FORMAT_MP3: WmtStorageFormat = 0

public val WMT_STORAGE_FORMAT_V1: WmtStorageFormat = 1

public val WMT_TIMECODE_FRAMERATE_24: WmtTimecodeFramerate = 3

public val WMT_TIMECODE_FRAMERATE_25: WmtTimecodeFramerate = 2

public val WMT_TIMECODE_FRAMERATE_30: WmtTimecodeFramerate = 0

public val WMT_TIMECODE_FRAMERATE_30DROP: WmtTimecodeFramerate = 1

public val WMT_TIMER: WmtStatus = 15

public val WMT_TRANSCRYPTOR_CLOSED: WmtStatus = 48

public val WMT_TRANSCRYPTOR_INIT: WmtStatus = 45

public val WMT_TRANSCRYPTOR_READ: WmtStatus = 47

public val WMT_TRANSCRYPTOR_SEEKED: WmtStatus = 46

public val WMT_TYPE_BINARY: WmtAttrDatatype = 2

public val WMT_TYPE_BOOL: WmtAttrDatatype = 3

public val WMT_TYPE_DWORD: WmtAttrDatatype = 0

public val WMT_TYPE_GUID: WmtAttrDatatype = 6

public val WMT_TYPE_QWORD: WmtAttrDatatype = 4

public val WMT_TYPE_STRING: WmtAttrDatatype = 1

public val WMT_TYPE_WORD: WmtAttrDatatype = 5

public val WMT_TRANSPORT_TYPE_RELIABLE: WmtTransportType = 1

public val WMT_TRANSPORT_TYPE_UNRELIABLE: WmtTransportType = 0

public val WMT_VER_4_0: WmtVersion = 262144

public val WMT_VER_7_0: WmtVersion = 458752

public val WMT_VER_8_0: WmtVersion = 524288

public val WMT_VER_9_0: WmtVersion = 589824

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

public val WMT_WMETYPE_AUDIO: WmtWatermarkEntryType = 1

public val WMT_WMETYPE_VIDEO: WmtWatermarkEntryType = 2

public val WM_AETYPE_EXCLUDE: WmAetype = 101

public val WM_AETYPE_INCLUDE: WmAetype = 105

public val WM_CL_INTERLACED420: UInt = 0u

public val WM_CL_PROGRESSIVE420: UInt = 1u

public val WM_CT_BOTTOM_FIELD_FIRST: UInt = 32u

public val WM_CT_INTERLACED: UInt = 128u

public val WM_CT_REPEAT_FIRST_FIELD: UInt = 16u

public val WM_CT_TOP_FIELD_FIRST: UInt = 64u

public val WM_DM_DEINTERLACE_HALFSIZE: WmDmInterlacedType = 2

public val WM_DM_DEINTERLACE_HALFSIZEDOUBLERATE: WmDmInterlacedType = 3

public val WM_DM_DEINTERLACE_INVERSETELECINE: WmDmInterlacedType = 4

public val WM_DM_DEINTERLACE_NORMAL: WmDmInterlacedType = 1

public val WM_DM_DEINTERLACE_VERTICALHALFSIZEDOUBLERATE: WmDmInterlacedType = 5

public val WM_DM_IT_DISABLE_COHERENT_MODE: WmDmItFirstFrameCoherency = 0

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_BOTTOM: WmDmItFirstFrameCoherency = 6

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_AA_TOP: WmDmItFirstFrameCoherency = 1

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_BOTTOM: WmDmItFirstFrameCoherency = 7

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BB_TOP: WmDmItFirstFrameCoherency = 2

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_BOTTOM: WmDmItFirstFrameCoherency = 8

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_BC_TOP: WmDmItFirstFrameCoherency = 3

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_BOTTOM: WmDmItFirstFrameCoherency = 9

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_CD_TOP: WmDmItFirstFrameCoherency = 4

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_BOTTOM: WmDmItFirstFrameCoherency = 10

public val WM_DM_IT_FIRST_FRAME_IN_CLIP_IS_DD_TOP: WmDmItFirstFrameCoherency = 5

public val WM_DM_NOTINTERLACED: WmDmInterlacedType = 0

public val WM_MAX_STREAMS: UInt = 63u

public val WM_MAX_VIDEO_STREAMS: UInt = 63u

public val WM_PLAYBACK_DRC_HIGH: WmPlaybackDrcLevel = 0

public val WM_PLAYBACK_DRC_LOW: WmPlaybackDrcLevel = 2

public val WM_PLAYBACK_DRC_MEDIUM: WmPlaybackDrcLevel = 1

public val WM_SFEX_DATALOSS: WmSfexType = 4

public val WM_SFEX_NOTASYNCPOINT: WmSfexType = 2

public val WM_SF_CLEANPOINT: WmSfType = 1

public val WM_SF_DATALOSS: WmSfType = 4

public val WM_SF_DISCONTINUITY: WmSfType = 2

public val WM_SAMPLE_EXTENSION_GUID_CHROMA_LOCATION: Guid = Guid.fromU128(U128(0x4c5acca092764b2cuL, 0x9e4ca0edefdd217euL))

public val WM_SAMPLE_EXTENSION_GUID_COLOR_SPACE_INFO: Guid = Guid.fromU128(U128(0xf79ada5630eb4f2buL, 0x9f7af24b139a1157uL))

public val WM_SAMPLE_EXTENSION_GUID_CONTENT_TYPE: Guid = Guid.fromU128(U128(0xd590dc2007bc436cuL, 0x9cf7f3bbfbf1a4dcuL))

public val WM_SAMPLE_EXTENSION_GUID_FILE_NAME: Guid = Guid.fromU128(U128(0xe165ec0e19ed45d7uL, 0xb4a725cbd1e28e9buL))

public val WM_SAMPLE_EXTENSION_GUID_OUTPUT_CLEAN_POINT: Guid = Guid.fromU128(U128(0xf72a3c6f6eb44ebcuL, 0xb19209ad9759e828uL))

public val WM_SAMPLE_EXTENSION_GUID_PIXEL_ASPECT_RATIO: Guid = Guid.fromU128(U128(0x1b1ee554f9ea4bc8uL, 0x821a376b74e4c4b8uL))

public val WM_SAMPLE_EXTENSION_GUID_SAMPLE_DURATION: Guid = Guid.fromU128(U128(0xc6bd9450867f4907uL, 0x83a3c77921b733aduL))

public val WM_SAMPLE_EXTENSION_GUID_SAMPLE_PROTECTION_SALT: Guid = Guid.fromU128(U128(0x5403deeeb9ee438fuL, 0xaa833804997e569duL))

public val WM_SAMPLE_EXTENSION_GUID_TIMECODE: Guid = Guid.fromU128(U128(0x399595ec86674e2duL, 0x8fdb98814ce76c1euL))

public val WM_SAMPLE_EXTENSION_GUID_USER_DATA_INFO: Guid = Guid.fromU128(U128(0x732bb4fa78be4549uL, 0x99bd02db1a55b7a8uL))

public val WM_SAMPLE_EXTENSION_CHROMA_LOCATION_SIZE: UInt = 1u

public val WM_SAMPLE_EXTENSION_COLOR_SPACE_INFO_SIZE: UInt = 3u

public val WM_SAMPLE_EXTENSION_CONTENT_TYPE_SIZE: UInt = 1u

public val WM_SAMPLE_EXTENSION_PIXEL_ASPECT_RATIO_SIZE: UInt = 2u

public val WM_SAMPLE_EXTENSION_SAMPLE_DURATION_SIZE: UInt = 2u

public val WM_SAMPLE_EXTENSION_TIMECODE_SIZE: UInt = 14u

public val G_DW_WM_CONTENT_ATTRIBUTES: UInt = 5u

public val G_DW_WMNSC_ATTRIBUTES: UInt = 5u

public val G_DW_WM_SPECIAL_ATTRIBUTES: UInt = 20u

public val G_WSZ_ASF_LEAKY_BUCKET_PAIRS: Pcwstr = w("ASFLeakyBucketPairs")

public val G_WSZ_ALLOW_INTERLACED_OUTPUT: Pcwstr = w("AllowInterlacedOutput")

public val G_WSZ_AVERAGE_LEVEL: Pcwstr = w("AverageLevel")

public val G_WSZ_BUFFER_AVERAGE: Pcwstr = w("Buffer Average")

public val G_WSZ_COMPLEXITY: Pcwstr = w("_COMPLEXITYEX")

public val G_WSZ_COMPLEXITY_LIVE: Pcwstr = w("_COMPLEXITYEXLIVE")

public val G_WSZ_COMPLEXITY_MAX: Pcwstr = w("_COMPLEXITYEXMAX")

public val G_WSZ_COMPLEXITY_OFFLINE: Pcwstr = w("_COMPLEXITYEXOFFLINE")

public val G_WSZ_DECODER_COMPLEXITY_REQUESTED: Pcwstr = w("_DECODERCOMPLEXITYPROFILE")

public val G_WSZ_DEDICATED_DELIVERY_THREAD: Pcwstr = w("DedicatedDeliveryThread")

public val G_WSZ_DEINTERLACE_MODE: Pcwstr = w("DeinterlaceMode")

public val G_WSZ_DELIVER_ON_RECEIVE: Pcwstr = w("DeliverOnReceive")

public val G_WSZ_DEVICE_CONFORMANCE_TEMPLATE: Pcwstr = w("DeviceConformanceTemplate")

public val G_WSZ_DYNAMIC_RANGE_CONTROL: Pcwstr = w("DynamicRangeControl")

public val G_WSZ_EDL: Pcwstr = w("_EDL")

public val G_WSZ_EARLY_DATA_DELIVERY: Pcwstr = w("EarlyDataDelivery")

public val G_WSZ_ENABLE_DISCRETE_OUTPUT: Pcwstr = w("EnableDiscreteOutput")

public val G_WSZ_ENABLE_FRAME_INTERPOLATION: Pcwstr = w("EnableFrameInterpolation")

public val G_WSZ_ENABLE_WMA_PRO_SPDIF_OUTPUT: Pcwstr = w("EnableWMAProSPDIFOutput")

public val G_WSZ_FAIL_SEEK_ON_ERROR: Pcwstr = w("FailSeekOnError")

public val G_WSZ_FIXED_FRAME_RATE: Pcwstr = w("FixedFrameRate")

public val G_WSZ_FOLD6TO2CHANNELS3: Pcwstr = w("Fold6To2Channels3")

public val G_WSZ_FOLD_TO_CHANNELS_TEMPLATE: Pcwstr = w("Fold%luTo%luChannels%lu")

public val G_WSZ_INITIAL_PATTERN_FOR_INVERSE_TELECINE: Pcwstr = w("InitialPatternForInverseTelecine")

public val G_WSZ_INTERLACED_CODING: Pcwstr = w("InterlacedCoding")

public val G_WSZ_IS_VBR_SUPPORTED: Pcwstr = w("_ISVBRSUPPORTED")

public val G_WSZ_JPEG_COMPRESSION_QUALITY: Pcwstr = w("JPEGCompressionQuality")

public val G_WSZ_JUST_IN_TIME_DECODE: Pcwstr = w("JustInTimeDecode")

public val G_WSZ_MIXED_CLASS_MODE: Pcwstr = w("MixedClassMode")

public val G_WSZ_MUSIC_CLASS_MODE: Pcwstr = w("MusicClassMode")

public val G_WSZ_MUSIC_SPEECH_CLASS_MODE: Pcwstr = w("MusicSpeechClassMode")

public val G_WSZ_NEEDS_PREVIOUS_SAMPLE: Pcwstr = w("NeedsPreviousSample")

public val G_WSZ_NUM_PASSES: Pcwstr = w("_PASSESUSED")

public val G_WSZ_ORIGINAL_SOURCE_FORMAT_TAG: Pcwstr = w("_SOURCEFORMATTAG")

public val G_WSZ_ORIGINAL_WAVE_FORMAT: Pcwstr = w("_ORIGINALWAVEFORMAT")

public val G_WSZ_PEAK_VALUE: Pcwstr = w("PeakValue")

public val G_WSZ_PERMIT_SEEKS_BEYOND_END_OF_STREAM: Pcwstr = w("PermitSeeksBeyondEndOfStream")

public val G_WSZ_RELOAD_INDEX_ON_SEEK: Pcwstr = w("ReloadIndexOnSeek")

public val G_WSZ_SCRAMBLED_AUDIO: Pcwstr = w("ScrambledAudio")

public val G_WSZ_SINGLE_OUTPUT_BUFFER: Pcwstr = w("SingleOutputBuffer")

public val G_WSZ_SOFTWARE_SCALING: Pcwstr = w("SoftwareScaling")

public val G_WSZ_SOURCE_BUFFER_TIME: Pcwstr = w("SourceBufferTime")

public val G_WSZ_SOURCE_MAX_BYTES_AT_ONCE: Pcwstr = w("SourceMaxBytesAtOnce")

public val G_WSZ_SPEAKER_CONFIG: Pcwstr = w("SpeakerConfig")

public val G_WSZ_SPEECH_CAPS: Pcwstr = w("SpeechFormatCap")

public val G_WSZ_SPEECH_CLASS_MODE: Pcwstr = w("SpeechClassMode")

public val G_WSZ_STREAM_LANGUAGE: Pcwstr = w("StreamLanguage")

public val G_WSZ_STREAM_NUM_INDEX_OBJECTS: Pcwstr = w("StreamNumIndexObjects")

public val G_WSZ_USE_PACKET_AT_SEEK_POINT: Pcwstr = w("UsePacketAtSeekPoint")

public val G_WSZ_VBR_BITRATE_MAX: Pcwstr = w("_RMAX")

public val G_WSZ_VBR_BUFFER_WINDOW_MAX: Pcwstr = w("_BMAX")

public val G_WSZ_VBR_ENABLED: Pcwstr = w("_VBRENABLED")

public val G_WSZ_VBR_PEAK: Pcwstr = w("VBR Peak")

public val G_WSZ_VBR_QUALITY: Pcwstr = w("_VBRQUALITY")

public val G_WSZ_VIDEO_SAMPLE_DURATIONS: Pcwstr = w("VideoSampleDurations")

public val G_WSZ_WMADID: Pcwstr = w("WM/ADID")

public val G_WSZ_WMASF_PACKET_COUNT: Pcwstr = w("WM/ASFPacketCount")

public val G_WSZ_WMASF_SECURITY_OBJECTS_SIZE: Pcwstr = w("WM/ASFSecurityObjectsSize")

public val G_WSZ_WM_ALBUM_ARTIST: Pcwstr = w("WM/AlbumArtist")

public val G_WSZ_WM_ALBUM_ARTIST_SORT: Pcwstr = w("WM/AlbumArtistSort")

public val G_WSZ_WM_ALBUM_COVER_URL: Pcwstr = w("WM/AlbumCoverURL")

public val G_WSZ_WM_ALBUM_TITLE: Pcwstr = w("WM/AlbumTitle")

public val G_WSZ_WM_ALBUM_TITLE_SORT: Pcwstr = w("WM/AlbumTitleSort")

public val G_WSZ_WM_ASPECT_RATIO_X: Pcwstr = w("AspectRatioX")

public val G_WSZ_WM_ASPECT_RATIO_Y: Pcwstr = w("AspectRatioY")

public val G_WSZ_WM_AUDIO_FILE_URL: Pcwstr = w("WM/AudioFileURL")

public val G_WSZ_WM_AUDIO_SOURCE_URL: Pcwstr = w("WM/AudioSourceURL")

public val G_WSZ_WM_AUTHOR: Pcwstr = w("Author")

public val G_WSZ_WM_AUTHOR_SORT: Pcwstr = w("AuthorSort")

public val G_WSZ_WM_AUTHOR_URL: Pcwstr = w("WM/AuthorURL")

public val G_WSZ_WM_BANNER_IMAGE_DATA: Pcwstr = w("BannerImageData")

public val G_WSZ_WM_BANNER_IMAGE_TYPE: Pcwstr = w("BannerImageType")

public val G_WSZ_WM_BANNER_IMAGE_URL: Pcwstr = w("BannerImageURL")

public val G_WSZ_WM_BEATS_PER_MINUTE: Pcwstr = w("WM/BeatsPerMinute")

public val G_WSZ_WM_BITRATE: Pcwstr = w("Bitrate")

public val G_WSZ_WM_BROADCAST: Pcwstr = w("Broadcast")

public val G_WSZ_WM_CATEGORY: Pcwstr = w("WM/Category")

public val G_WSZ_WM_CODEC: Pcwstr = w("WM/Codec")

public val G_WSZ_WM_COMPOSER: Pcwstr = w("WM/Composer")

public val G_WSZ_WM_COMPOSER_SORT: Pcwstr = w("WM/ComposerSort")

public val G_WSZ_WM_CONDUCTOR: Pcwstr = w("WM/Conductor")

public val G_WSZ_WM_CONTAINER_FORMAT: Pcwstr = w("WM/ContainerFormat")

public val G_WSZ_WM_CONTENT_DISTRIBUTOR: Pcwstr = w("WM/ContentDistributor")

public val G_WSZ_WM_CONTENT_GROUP_DESCRIPTION: Pcwstr = w("WM/ContentGroupDescription")

public val G_WSZ_WM_COPYRIGHT: Pcwstr = w("Copyright")

public val G_WSZ_WM_COPYRIGHT_URL: Pcwstr = w("CopyrightURL")

public val G_WSZ_WM_CURRENT_BITRATE: Pcwstr = w("CurrentBitrate")

public val G_WSZ_WMDRM: Pcwstr = w("WM/DRM")

public val G_WSZ_WMDRM_CONTENT_ID: Pcwstr = w("DRM_ContentID")

public val G_WSZ_WMDRM_FLAGS: Pcwstr = w("DRM_Flags")

public val G_WSZ_WMDRM_HEADER_SIGN_PRIV_KEY: Pcwstr = w("DRM_HeaderSignPrivKey")

public val G_WSZ_WMDRM_INDIVIDUALIZED_VERSION: Pcwstr = w("DRM_IndividualizedVersion")

public val G_WSZ_WMDRM_KEY_ID: Pcwstr = w("DRM_KeyID")

public val G_WSZ_WMDRM_KEY_SEED: Pcwstr = w("DRM_KeySeed")

public val G_WSZ_WMDRM_LA_SIGNATURE_CERT: Pcwstr = w("DRM_LASignatureCert")

public val G_WSZ_WMDRM_LA_SIGNATURE_LIC_SRV_CERT: Pcwstr = w("DRM_LASignatureLicSrvCert")

public val G_WSZ_WMDRM_LA_SIGNATURE_PRIV_KEY: Pcwstr = w("DRM_LASignaturePrivKey")

public val G_WSZ_WMDRM_LA_SIGNATURE_ROOT_CERT: Pcwstr = w("DRM_LASignatureRootCert")

public val G_WSZ_WMDRM_LEVEL: Pcwstr = w("DRM_Level")

public val G_WSZ_WMDRM_LICENSE_ACQ_URL: Pcwstr = w("DRM_LicenseAcqURL")

public val G_WSZ_WMDRM_SOURCE_ID: Pcwstr = w("DRM_SourceID")

public val G_WSZ_WMDRM_V1LICENSE_ACQ_URL: Pcwstr = w("DRM_V1LicenseAcqURL")

public val G_WSZ_WMDVDID: Pcwstr = w("WM/DVDID")

public val G_WSZ_WM_DESCRIPTION: Pcwstr = w("Description")

public val G_WSZ_WM_DIRECTOR: Pcwstr = w("WM/Director")

public val G_WSZ_WM_DURATION: Pcwstr = w("Duration")

public val G_WSZ_WM_ENCODED_BY: Pcwstr = w("WM/EncodedBy")

public val G_WSZ_WM_ENCODING_SETTINGS: Pcwstr = w("WM/EncodingSettings")

public val G_WSZ_WM_ENCODING_TIME: Pcwstr = w("WM/EncodingTime")

public val G_WSZ_WM_EPISODE_NUMBER: Pcwstr = w("WM/EpisodeNumber")

public val G_WSZ_WM_FILE_SIZE: Pcwstr = w("FileSize")

public val G_WSZ_WM_GENRE: Pcwstr = w("WM/Genre")

public val G_WSZ_WM_GENRE_ID: Pcwstr = w("WM/GenreID")

public val G_WSZ_WM_HAS_ARBITRARY_DATA_STREAM: Pcwstr = w("HasArbitraryDataStream")

public val G_WSZ_WM_HAS_ATTACHED_IMAGES: Pcwstr = w("HasAttachedImages")

public val G_WSZ_WM_HAS_AUDIO: Pcwstr = w("HasAudio")

public val G_WSZ_WM_HAS_FILE_TRANSFER_STREAM: Pcwstr = w("HasFileTransferStream")

public val G_WSZ_WM_HAS_IMAGE: Pcwstr = w("HasImage")

public val G_WSZ_WM_HAS_SCRIPT: Pcwstr = w("HasScript")

public val G_WSZ_WM_HAS_VIDEO: Pcwstr = w("HasVideo")

public val G_WSZ_WMISAN: Pcwstr = w("WM/ISAN")

public val G_WSZ_WMISRC: Pcwstr = w("WM/ISRC")

public val G_WSZ_WM_INITIAL_KEY: Pcwstr = w("WM/InitialKey")

public val G_WSZ_WM_IS_COMPILATION: Pcwstr = w("WM/IsCompilation")

public val G_WSZ_WM_IS_VBR: Pcwstr = w("IsVBR")

public val G_WSZ_WM_LANGUAGE: Pcwstr = w("WM/Language")

public val G_WSZ_WM_LYRICS: Pcwstr = w("WM/Lyrics")

public val G_WSZ_WM_LYRICS_SYNCHRONISED: Pcwstr = w("WM/Lyrics_Synchronised")

public val G_WSZ_WMMCDI: Pcwstr = w("WM/MCDI")

public val G_WSZ_WM_MEDIA_CLASS_PRIMARY_ID: Pcwstr = w("WM/MediaClassPrimaryID")

public val G_WSZ_WM_MEDIA_CLASS_SECONDARY_ID: Pcwstr = w("WM/MediaClassSecondaryID")

public val G_WSZ_WM_MEDIA_CREDITS: Pcwstr = w("WM/MediaCredits")

public val G_WSZ_WM_MEDIA_IS_DELAY: Pcwstr = w("WM/MediaIsDelay")

public val G_WSZ_WM_MEDIA_IS_FINALE: Pcwstr = w("WM/MediaIsFinale")

public val G_WSZ_WM_MEDIA_IS_LIVE: Pcwstr = w("WM/MediaIsLive")

public val G_WSZ_WM_MEDIA_IS_PREMIERE: Pcwstr = w("WM/MediaIsPremiere")

public val G_WSZ_WM_MEDIA_IS_REPEAT: Pcwstr = w("WM/MediaIsRepeat")

public val G_WSZ_WM_MEDIA_IS_SAP: Pcwstr = w("WM/MediaIsSAP")

public val G_WSZ_WM_MEDIA_IS_STEREO: Pcwstr = w("WM/MediaIsStereo")

public val G_WSZ_WM_MEDIA_IS_SUBTITLED: Pcwstr = w("WM/MediaIsSubtitled")

public val G_WSZ_WM_MEDIA_IS_TAPE: Pcwstr = w("WM/MediaIsTape")

public val G_WSZ_WM_MEDIA_NETWORK_AFFILIATION: Pcwstr = w("WM/MediaNetworkAffiliation")

public val G_WSZ_WM_MEDIA_ORIGINAL_BROADCAST_DATE_TIME: Pcwstr = w("WM/MediaOriginalBroadcastDateTime")

public val G_WSZ_WM_MEDIA_ORIGINAL_CHANNEL: Pcwstr = w("WM/MediaOriginalChannel")

public val G_WSZ_WM_MEDIA_STATION_CALL_SIGN: Pcwstr = w("WM/MediaStationCallSign")

public val G_WSZ_WM_MEDIA_STATION_NAME: Pcwstr = w("WM/MediaStationName")

public val G_WSZ_WM_MODIFIED_BY: Pcwstr = w("WM/ModifiedBy")

public val G_WSZ_WM_MOOD: Pcwstr = w("WM/Mood")

public val G_WSZ_WMNSC_ADDRESS: Pcwstr = w("NSC_Address")

public val G_WSZ_WMNSC_DESCRIPTION: Pcwstr = w("NSC_Description")

public val G_WSZ_WMNSC_EMAIL: Pcwstr = w("NSC_Email")

public val G_WSZ_WMNSC_NAME: Pcwstr = w("NSC_Name")

public val G_WSZ_WMNSC_PHONE: Pcwstr = w("NSC_Phone")

public val G_WSZ_WM_NUMBER_OF_FRAMES: Pcwstr = w("NumberOfFrames")

public val G_WSZ_WM_OPTIMAL_BITRATE: Pcwstr = w("OptimalBitrate")

public val G_WSZ_WM_ORIGINAL_ALBUM_TITLE: Pcwstr = w("WM/OriginalAlbumTitle")

public val G_WSZ_WM_ORIGINAL_ARTIST: Pcwstr = w("WM/OriginalArtist")

public val G_WSZ_WM_ORIGINAL_FILENAME: Pcwstr = w("WM/OriginalFilename")

public val G_WSZ_WM_ORIGINAL_LYRICIST: Pcwstr = w("WM/OriginalLyricist")

public val G_WSZ_WM_ORIGINAL_RELEASE_TIME: Pcwstr = w("WM/OriginalReleaseTime")

public val G_WSZ_WM_ORIGINAL_RELEASE_YEAR: Pcwstr = w("WM/OriginalReleaseYear")

public val G_WSZ_WM_PARENTAL_RATING: Pcwstr = w("WM/ParentalRating")

public val G_WSZ_WM_PARENTAL_RATING_REASON: Pcwstr = w("WM/ParentalRatingReason")

public val G_WSZ_WM_PART_OF_SET: Pcwstr = w("WM/PartOfSet")

public val G_WSZ_WM_PEAK_BITRATE: Pcwstr = w("WM/PeakBitrate")

public val G_WSZ_WM_PERIOD: Pcwstr = w("WM/Period")

public val G_WSZ_WM_PICTURE: Pcwstr = w("WM/Picture")

public val G_WSZ_WM_PLAYLIST_DELAY: Pcwstr = w("WM/PlaylistDelay")

public val G_WSZ_WM_PRODUCER: Pcwstr = w("WM/Producer")

public val G_WSZ_WM_PROMOTION_URL: Pcwstr = w("WM/PromotionURL")

public val G_WSZ_WM_PROTECTED: Pcwstr = w("Is_Protected")

public val G_WSZ_WM_PROTECTION_TYPE: Pcwstr = w("WM/ProtectionType")

public val G_WSZ_WM_PROVIDER: Pcwstr = w("WM/Provider")

public val G_WSZ_WM_PROVIDER_COPYRIGHT: Pcwstr = w("WM/ProviderCopyright")

public val G_WSZ_WM_PROVIDER_RATING: Pcwstr = w("WM/ProviderRating")

public val G_WSZ_WM_PROVIDER_STYLE: Pcwstr = w("WM/ProviderStyle")

public val G_WSZ_WM_PUBLISHER: Pcwstr = w("WM/Publisher")

public val G_WSZ_WM_RADIO_STATION_NAME: Pcwstr = w("WM/RadioStationName")

public val G_WSZ_WM_RADIO_STATION_OWNER: Pcwstr = w("WM/RadioStationOwner")

public val G_WSZ_WM_RATING: Pcwstr = w("Rating")

public val G_WSZ_WM_SEASON_NUMBER: Pcwstr = w("WM/SeasonNumber")

public val G_WSZ_WM_SEEKABLE: Pcwstr = w("Seekable")

public val G_WSZ_WM_SHARED_USER_RATING: Pcwstr = w("WM/SharedUserRating")

public val G_WSZ_WM_SIGNATURE_NAME: Pcwstr = w("Signature_Name")

public val G_WSZ_WM_SKIP_BACKWARD: Pcwstr = w("Can_Skip_Backward")

public val G_WSZ_WM_SKIP_FORWARD: Pcwstr = w("Can_Skip_Forward")

public val G_WSZ_WM_STREAM_TYPE_INFO: Pcwstr = w("WM/StreamTypeInfo")

public val G_WSZ_WM_STRIDABLE: Pcwstr = w("Stridable")

public val G_WSZ_WM_SUB_TITLE: Pcwstr = w("WM/SubTitle")

public val G_WSZ_WM_SUB_TITLE_DESCRIPTION: Pcwstr = w("WM/SubTitleDescription")

public val G_WSZ_WM_SUBSCRIPTION_CONTENT_ID: Pcwstr = w("WM/SubscriptionContentID")

public val G_WSZ_WM_TEXT: Pcwstr = w("WM/Text")

public val G_WSZ_WM_TITLE: Pcwstr = w("Title")

public val G_WSZ_WM_TITLE_SORT: Pcwstr = w("TitleSort")

public val G_WSZ_WM_TOOL_NAME: Pcwstr = w("WM/ToolName")

public val G_WSZ_WM_TOOL_VERSION: Pcwstr = w("WM/ToolVersion")

public val G_WSZ_WM_TRACK: Pcwstr = w("WM/Track")

public val G_WSZ_WM_TRACK_NUMBER: Pcwstr = w("WM/TrackNumber")

public val G_WSZ_WM_TRUSTED: Pcwstr = w("Is_Trusted")

public val G_WSZ_WM_UNIQUE_FILE_IDENTIFIER: Pcwstr = w("WM/UniqueFileIdentifier")

public val G_WSZ_WM_USE_ADVANCED_DRM: Pcwstr = w("Use_Advanced_DRM")

public val G_WSZ_WM_USE_DRM: Pcwstr = w("Use_DRM")

public val G_WSZ_WM_USER_WEB_URL: Pcwstr = w("WM/UserWebURL")

public val G_WSZ_WM_VIDEO_CLOSED_CAPTIONING: Pcwstr = w("WM/VideoClosedCaptioning")

public val G_WSZ_WM_VIDEO_FRAME_RATE: Pcwstr = w("WM/VideoFrameRate")

public val G_WSZ_WM_VIDEO_HEIGHT: Pcwstr = w("WM/VideoHeight")

public val G_WSZ_WM_VIDEO_WIDTH: Pcwstr = w("WM/VideoWidth")

public val G_WSZ_WMWMADRC_AVERAGE_REFERENCE: Pcwstr = w("WM/WMADRCAverageReference")

public val G_WSZ_WMWMADRC_AVERAGE_TARGET: Pcwstr = w("WM/WMADRCAverageTarget")

public val G_WSZ_WMWMADRC_PEAK_REFERENCE: Pcwstr = w("WM/WMADRCPeakReference")

public val G_WSZ_WMWMADRC_PEAK_TARGET: Pcwstr = w("WM/WMADRCPeakTarget")

public val G_WSZ_WMWMCP_DISTRIBUTOR: Pcwstr = w("WM/WMCPDistributor")

public val G_WSZ_WMWMCP_DISTRIBUTOR_ID: Pcwstr = w("WM/WMCPDistributorID")

public val G_WSZ_WMWM_COLLECTION_GROUP_ID: Pcwstr = w("WM/WMCollectionGroupID")

public val G_WSZ_WMWM_COLLECTION_ID: Pcwstr = w("WM/WMCollectionID")

public val G_WSZ_WMWM_CONTENT_ID: Pcwstr = w("WM/WMContentID")

public val G_WSZ_WMWM_SHADOW_FILE_SOURCE_DRM_TYPE: Pcwstr = w("WM/WMShadowFileSourceDRMType")

public val G_WSZ_WMWM_SHADOW_FILE_SOURCE_FILE_TYPE: Pcwstr = w("WM/WMShadowFileSourceFileType")

public val G_WSZ_WM_WRITER: Pcwstr = w("WM/Writer")

public val G_WSZ_WM_YEAR: Pcwstr = w("WM/Year")

public val G_WSZ_WATERMARK_CLSID: Pcwstr = w("WatermarkCLSID")

public val G_WSZ_WATERMARK_CONFIG: Pcwstr = w("WatermarkConfig")
