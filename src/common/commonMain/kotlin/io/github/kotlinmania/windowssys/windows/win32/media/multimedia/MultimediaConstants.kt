package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACMDM_BASE: UInt = 24576u

public val ACM_MPEG_COPYRIGHT: UInt = 2u

public val ACM_MPEG_DUALCHANNEL: UInt = 4u

public val ACM_MPEG_ID_MPEG1: UInt = 16u

public val ACM_MPEG_JOINTSTEREO: UInt = 2u

public val ACM_MPEG_LAYER1: UInt = 1u

public val ACM_MPEG_LAYER2: UInt = 2u

public val ACM_MPEG_LAYER3: UInt = 4u

public val ACM_MPEG_ORIGINALHOME: UInt = 4u

public val ACM_MPEG_PRIVATEBIT: UInt = 1u

public val ACM_MPEG_PROTECTIONBIT: UInt = 8u

public val ACM_MPEG_SINGLECHANNEL: UInt = 8u

public val ACM_MPEG_STEREO: UInt = 1u

public val AUXDM_GETDEVCAPS: UInt = 4u

public val AUXDM_GETNUMDEVS: UInt = 3u

public val AUXDM_GETVOLUME: UInt = 5u

public val AUXDM_SETVOLUME: UInt = 6u

public val AUXM_INIT: UInt = 100u

public val AUXM_INIT_EX: UInt = 104u

public val AVICOMPRESSF_DATARATE: UInt = 2u

public val AVICOMPRESSF_INTERLEAVE: UInt = 1u

public val AVICOMPRESSF_KEYFRAMES: UInt = 4u

public val AVICOMPRESSF_VALID: UInt = 8u

public val AVIERR_OK: Int = 0

public val AVIFILECAPS_ALLKEYFRAMES: UInt = 16u

public val AVIFILECAPS_CANREAD: UInt = 1u

public val AVIFILECAPS_CANWRITE: UInt = 2u

public val AVIFILECAPS_NOCOMPRESSION: UInt = 32u

public val AVIFILEHANDLER_CANACCEPTNONRGB: UInt = 4u

public val AVIFILEHANDLER_CANREAD: UInt = 1u

public val AVIFILEHANDLER_CANWRITE: UInt = 2u

public val AVIFILEINFO_COPYRIGHTED: UInt = 131072u

public val AVIFILEINFO_HASINDEX: UInt = 16u

public val AVIFILEINFO_ISINTERLEAVED: UInt = 256u

public val AVIFILEINFO_MUSTUSEINDEX: UInt = 32u

public val AVIFILEINFO_WASCAPTUREFILE: UInt = 65536u

public val AVIGETFRAMEF_BESTDISPLAYFMT: UInt = 1u

public val AVIIF_CONTROLFRAME: Int = 512

public val AVIIF_TWOCC: Int = 2

public val AVISTREAMINFO_DISABLED: UInt = 1u

public val AVISTREAMINFO_FORMATCHANGES: UInt = 65536u

public val AVISTREAMREAD_CONVENIENT: Int = -1

public val AVSTREAMMASTER_AUDIO: UInt = 0u

public val AVSTREAMMASTER_NONE: UInt = 1u

public val BI_1632: UInt = 842217009u

public val CLSID_AVI_FILE: Guid = Guid.fromU128(U128(0x2000000000000uL, 0xc000000000000046uL))

public val CLSID_AVI_SIMPLE_UN_MARSHAL: Guid = Guid.fromU128(U128(0x2000900000000uL, 0xc000000000000046uL))

public val CONTROLCALLBACK_CAPTURING: UInt = 2u

public val CONTROLCALLBACK_PREROLL: UInt = 1u

public val CRYSTAL_NET_SFM_CODEC: UInt = 1u

public val DCB_EVENT: UInt = 5u

public val DCB_FUNCTION: UInt = 3u

public val DCB_NOSWITCH: UInt = 8u

public val DCB_NULL: UInt = 0u

public val DCB_TASK: UInt = 2u

public val DCB_TYPEMASK: UInt = 7u

public val DCB_WINDOW: UInt = 1u

public val DDF_0001: UInt = 1u

public val DDF_2000: UInt = 8192u

public val DDF_ANIMATE: UInt = 32u

public val DDF_BACKGROUNDPAL: UInt = 512u

public val DDF_BUFFER: UInt = 64u

public val DDF_DONTDRAW: UInt = 16u

public val DDF_FULLSCREEN: UInt = 256u

public val DDF_HALFTONE: UInt = 4096u

public val DDF_HURRYUP: UInt = 2048u

public val DDF_JUSTDRAWIT: UInt = 128u

public val DDF_NOTKEYFRAME: UInt = 1024u

public val DDF_PREROLL: UInt = 16u

public val DDF_SAME_DIB: UInt = 8u

public val DDF_SAME_DRAW: UInt = 8u

public val DDF_SAME_HDC: UInt = 4u

public val DDF_SAME_SIZE: UInt = 8u

public val DDF_UPDATE: UInt = 2u

public val DLG_ACMFILTERCHOOSE_ID: UInt = 71u

public val DLG_ACMFORMATCHOOSE_ID: UInt = 70u

public val DRIVERS_SECTION: Pcwstr = w("DRIVERS32")

public val DRVCNF_CANCEL: UInt = 0u

public val DRVCNF_OK: UInt = 1u

public val DRVCNF_RESTART: UInt = 2u

public val DRVM_ADD_THRU: UInt = 257u

public val DRVM_DISABLE: UInt = 102u

public val DRVM_ENABLE: UInt = 103u

public val DRVM_EXIT: UInt = 101u

public val DRVM_INIT: UInt = 100u

public val DRVM_INIT_EX: UInt = 104u

public val DRVM_IOCTL: UInt = 256u

public val DRVM_IOCTL_CMD_SYSTEM: Int = -2147483648.toInt()

public val DRVM_IOCTL_CMD_USER: Int = 0

public val DRVM_IOCTL_LAST: UInt = 261u

public val DRVM_MAPPER_CONSOLEVOICECOM_GET: UInt = 8215u

public val DRVM_MAPPER_PREFERRED_FLAGS_PREFERREDONLY: UInt = 1u

public val DRVM_MAPPER_PREFERRED_GET: UInt = 8213u

public val DRVM_MAPPER_RECONFIGURE: UInt = 8193u

public val DRVM_REMOVE_THRU: UInt = 258u

public val DRVM_USER: UInt = 16384u

public val DRV_CANCEL: UInt = 0u

public val DRV_CLOSE: UInt = 4u

public val DRV_CONFIGURE: UInt = 7u

public val DRV_DISABLE: UInt = 5u

public val DRV_ENABLE: UInt = 2u

public val DRV_EXITSESSION: UInt = 11u

public val DRV_FREE: UInt = 6u

public val DRV_INSTALL: UInt = 9u

public val DRV_LOAD: UInt = 1u

public val DRV_MCI_FIRST: UInt = 2048u

public val DRV_MCI_LAST: UInt = 6143u

public val DRV_OK: UInt = 1u

public val DRV_OPEN: UInt = 3u

public val DRV_PNPINSTALL: UInt = 2059u

public val DRV_POWER: UInt = 15u

public val DRV_QUERYCONFIGURE: UInt = 8u

public val DRV_QUERYDEVICEINTERFACE: UInt = 2060u

public val DRV_QUERYDEVICEINTERFACESIZE: UInt = 2061u

public val DRV_QUERYDEVNODE: UInt = 2050u

public val DRV_QUERYFUNCTIONINSTANCEID: UInt = 2065u

public val DRV_QUERYFUNCTIONINSTANCEIDSIZE: UInt = 2066u

public val DRV_QUERYIDFROMSTRINGID: UInt = 2064u

public val DRV_QUERYMAPPABLE: UInt = 2053u

public val DRV_QUERYMODULE: UInt = 2057u

public val DRV_QUERYSTRINGID: UInt = 2062u

public val DRV_QUERYSTRINGIDSIZE: UInt = 2063u

public val DRV_REMOVE: UInt = 10u

public val DRV_RESERVED: UInt = 2048u

public val DRV_RESTART: UInt = 2u

public val DRV_USER: UInt = 16384u

public val DVM_CONFIGURE_END: UInt = 8191u

public val DVM_CONFIGURE_START: UInt = 4096u

public val DVM_DST_RECT: UInt = 4101u

public val DVM_FORMAT: UInt = 4098u

public val DVM_PALETTE: UInt = 4097u

public val DVM_PALETTERGB555: UInt = 4099u

public val DVM_SRC_RECT: UInt = 4100u

public val DVM_USER: UInt = 16384u

public val DV_ERR_13: UInt = 16u

public val DV_ERR_ALLOCATED: UInt = 19u

public val DV_ERR_BADDEVICEID: UInt = 20u

public val DV_ERR_BADERRNUM: UInt = 22u

public val DV_ERR_BADFORMAT: UInt = 2u

public val DV_ERR_BADINSTALL: UInt = 8u

public val DV_ERR_BASE: UInt = 1u

public val DV_ERR_CONFIG1: UInt = 13u

public val DV_ERR_CONFIG2: UInt = 14u

public val DV_ERR_CREATEPALETTE: UInt = 9u

public val DV_ERR_DMA_CONFLICT: UInt = 26u

public val DV_ERR_FLAGS: UInt = 15u

public val DV_ERR_INT_CONFLICT: UInt = 27u

public val DV_ERR_INVALHANDLE: UInt = 21u

public val DV_ERR_IO_CONFLICT: UInt = 25u

public val DV_ERR_LASTERROR: UInt = 28u

public val DV_ERR_MEM_CONFLICT: UInt = 24u

public val DV_ERR_NOMEM: UInt = 18u

public val DV_ERR_NONSPECIFIC: UInt = 1u

public val DV_ERR_NOTDETECTED: UInt = 7u

public val DV_ERR_NOTSUPPORTED: UInt = 17u

public val DV_ERR_NO_BUFFERS: UInt = 23u

public val DV_ERR_OK: UInt = 0u

public val DV_ERR_PARAM1: UInt = 11u

public val DV_ERR_PARAM2: UInt = 12u

public val DV_ERR_PROTECT_ONLY: UInt = 28u

public val DV_ERR_SIZEFIELD: UInt = 10u

public val DV_ERR_STILLPLAYING: UInt = 3u

public val DV_ERR_SYNC: UInt = 5u

public val DV_ERR_TOOMANYCHANNELS: UInt = 6u

public val DV_ERR_UNPREPARED: UInt = 4u

public val DV_ERR_USER_MSG: UInt = 1001u

public val DV_VM_CLOSE: UInt = 977u

public val DV_VM_DATA: UInt = 978u

public val DV_VM_ERROR: UInt = 979u

public val DV_VM_OPEN: UInt = 976u

public val FACILITY_NS: UInt = 13u

public val FACILITY_NS_WIN32: UInt = 7u

public val FIND_ANY: Int = 32

public val FIND_DIR: Int = 15

public val FIND_FORMAT: Int = 64

public val FIND_FROM_START: Int = 8

public val FIND_INDEX: Int = 16384

public val FIND_KEY: Int = 16

public val FIND_LENGTH: Int = 4096

public val FIND_NEXT: Int = 1

public val FIND_OFFSET: Int = 8192

public val FIND_POS: Int = 0

public val FIND_PREV: Int = 4

public val FIND_RET: Int = 61440

public val FIND_SIZE: Int = 12288

public val FIND_TYPE: Int = 240

public val ICCOMPRESSFRAMES_PADDING: UInt = 1u

public val ICCOMPRESS_KEYFRAME: Int = 1

public val ICDECOMPRESS_HURRYUP: Int = -2147483648.toInt()

public val ICDECOMPRESS_NOTKEYFRAME: Int = 134217728

public val ICDECOMPRESS_NULLFRAME: Int = 268435456

public val ICDECOMPRESS_PREROLL: Int = 536870912

public val ICDECOMPRESS_UPDATE: Int = 1073741824

public val ICDRAW_ANIMATE: Int = 8

public val ICDRAW_BUFFER: Int = 256

public val ICDRAW_CONTINUE: Int = 16

public val ICDRAW_FULLSCREEN: Int = 2

public val ICDRAW_HDC: Int = 4

public val ICDRAW_HURRYUP: Int = -2147483648.toInt()

public val ICDRAW_MEMORYDC: Int = 32

public val ICDRAW_NOTKEYFRAME: Int = 134217728

public val ICDRAW_NULLFRAME: Int = 268435456

public val ICDRAW_PREROLL: Int = 536870912

public val ICDRAW_QUERY: Int = 1

public val ICDRAW_RENDER: Int = 128

public val ICDRAW_UPDATE: Int = 1073741824

public val ICDRAW_UPDATING: Int = 64

public val ICERR_ABORT: Int = -10

public val ICERR_BADBITDEPTH: Int = -200

public val ICERR_BADFLAGS: Int = -5

public val ICERR_BADFORMAT: Int = -2

public val ICERR_BADHANDLE: Int = -8

public val ICERR_BADIMAGESIZE: Int = -201

public val ICERR_BADPARAM: Int = -6

public val ICERR_BADSIZE: Int = -7

public val ICERR_CANTUPDATE: Int = -9

public val ICERR_CUSTOM: Int = -400

public val ICERR_DONTDRAW: Int = 1

public val ICERR_ERROR: Int = -100

public val ICERR_GOTOKEYFRAME: Int = 3

public val ICERR_INTERNAL: Int = -4

public val ICERR_MEMORY: Int = -3

public val ICERR_NEWPALETTE: Int = 2

public val ICERR_OK: Int = 0

public val ICERR_STOPDRAWING: Int = 4

public val ICERR_UNSUPPORTED: Int = -1

public val ICINSTALL_DRIVER: UInt = 2u

public val ICINSTALL_DRIVERW: UInt = 32770u

public val ICINSTALL_FUNCTION: UInt = 1u

public val ICINSTALL_HDRV: UInt = 4u

public val ICINSTALL_UNICODE: UInt = 32768u

public val ICMF_ABOUT_QUERY: UInt = 1u

public val ICMF_CHOOSE_ALLCOMPRESSORS: UInt = 8u

public val ICMF_CHOOSE_DATARATE: UInt = 2u

public val ICMF_CHOOSE_KEYFRAME: UInt = 1u

public val ICMF_CHOOSE_PREVIEW: UInt = 4u

public val ICMF_COMPVARS_VALID: UInt = 1u

public val ICMF_CONFIGURE_QUERY: UInt = 1u

public val ICMODE_COMPRESS: UInt = 1u

public val ICMODE_DECOMPRESS: UInt = 2u

public val ICMODE_DRAW: UInt = 8u

public val ICMODE_FASTCOMPRESS: UInt = 5u

public val ICMODE_FASTDECOMPRESS: UInt = 3u

public val ICMODE_INTERNALF_FUNCTION32: UInt = 32768u

public val ICMODE_INTERNALF_MASK: UInt = 32768u

public val ICMODE_QUERY: UInt = 4u

public val ICM_ABOUT: UInt = 20491u

public val ICM_COMPRESS: UInt = 16392u

public val ICM_COMPRESS_BEGIN: UInt = 16391u

public val ICM_COMPRESS_END: UInt = 16393u

public val ICM_COMPRESS_FRAMES: UInt = 16455u

public val ICM_COMPRESS_FRAMES_INFO: UInt = 16454u

public val ICM_COMPRESS_GET_FORMAT: UInt = 16388u

public val ICM_COMPRESS_GET_SIZE: UInt = 16389u

public val ICM_COMPRESS_QUERY: UInt = 16390u

public val ICM_CONFIGURE: UInt = 20490u

public val ICM_DECOMPRESS: UInt = 16397u

public val ICM_DECOMPRESSEX: UInt = 16446u

public val ICM_DECOMPRESSEX_BEGIN: UInt = 16444u

public val ICM_DECOMPRESSEX_END: UInt = 16447u

public val ICM_DECOMPRESSEX_QUERY: UInt = 16445u

public val ICM_DECOMPRESS_BEGIN: UInt = 16396u

public val ICM_DECOMPRESS_END: UInt = 16398u

public val ICM_DECOMPRESS_GET_FORMAT: UInt = 16394u

public val ICM_DECOMPRESS_GET_PALETTE: UInt = 16414u

public val ICM_DECOMPRESS_QUERY: UInt = 16395u

public val ICM_DECOMPRESS_SET_PALETTE: UInt = 16413u

public val ICM_DRAW: UInt = 16417u

public val ICM_DRAW_BEGIN: UInt = 16399u

public val ICM_DRAW_BITS: UInt = 16404u

public val ICM_DRAW_CHANGEPALETTE: UInt = 16435u

public val ICM_DRAW_END: UInt = 16405u

public val ICM_DRAW_FLUSH: UInt = 16421u

public val ICM_DRAW_GETTIME: UInt = 16416u

public val ICM_DRAW_GET_PALETTE: UInt = 16400u

public val ICM_DRAW_IDLE: UInt = 16436u

public val ICM_DRAW_QUERY: UInt = 16415u

public val ICM_DRAW_REALIZE: UInt = 16420u

public val ICM_DRAW_RENDERBUFFER: UInt = 16422u

public val ICM_DRAW_SETTIME: UInt = 16419u

public val ICM_DRAW_START: UInt = 16402u

public val ICM_DRAW_START_PLAY: UInt = 16423u

public val ICM_DRAW_STOP: UInt = 16403u

public val ICM_DRAW_STOP_PLAY: UInt = 16424u

public val ICM_DRAW_SUGGESTFORMAT: UInt = 16434u

public val ICM_DRAW_UPDATE: UInt = 16401u

public val ICM_DRAW_WINDOW: UInt = 16418u

public val ICM_ENUMFORMATS: UInt = 20501u

public val ICM_GET: UInt = 20521u

public val ICM_GETBUFFERSWANTED: UInt = 16425u

public val ICM_GETDEFAULTKEYFRAMERATE: UInt = 16426u

public val ICM_GETDEFAULTQUALITY: UInt = 20510u

public val ICM_GETERRORTEXT: UInt = 20492u

public val ICM_GETFORMATNAME: UInt = 20500u

public val ICM_GETINFO: UInt = 20482u

public val ICM_GETQUALITY: UInt = 20511u

public val ICM_GETSTATE: UInt = 20480u

public val ICM_RESERVED: UInt = 20480u

public val ICM_RESERVED_HIGH: UInt = 24576u

public val ICM_RESERVED_LOW: UInt = 20480u

public val ICM_SET: UInt = 20520u

public val ICM_SETQUALITY: UInt = 20512u

public val ICM_SETSTATE: UInt = 20481u

public val ICM_SET_STATUS_PROC: UInt = 16456u

public val ICM_USER: UInt = 16384u

public val ICQUALITY_DEFAULT: Int = -1

public val ICQUALITY_HIGH: UInt = 10000u

public val ICQUALITY_LOW: UInt = 0u

public val ICSTATUS_END: UInt = 2u

public val ICSTATUS_ERROR: UInt = 3u

public val ICSTATUS_START: UInt = 0u

public val ICSTATUS_STATUS: UInt = 1u

public val ICSTATUS_YIELD: UInt = 4u

public val ICVERSION: UInt = 260u

public val IDD_ACMFILTERCHOOSE_BTN_DELNAME: UInt = 104u

public val IDD_ACMFILTERCHOOSE_BTN_HELP: UInt = 9u

public val IDD_ACMFILTERCHOOSE_BTN_SETNAME: UInt = 103u

public val IDD_ACMFILTERCHOOSE_CMB_CUSTOM: UInt = 100u

public val IDD_ACMFILTERCHOOSE_CMB_FILTER: UInt = 102u

public val IDD_ACMFILTERCHOOSE_CMB_FILTERTAG: UInt = 101u

public val IDD_ACMFORMATCHOOSE_BTN_DELNAME: UInt = 104u

public val IDD_ACMFORMATCHOOSE_BTN_HELP: UInt = 9u

public val IDD_ACMFORMATCHOOSE_BTN_SETNAME: UInt = 103u

public val IDD_ACMFORMATCHOOSE_CMB_CUSTOM: UInt = 100u

public val IDD_ACMFORMATCHOOSE_CMB_FORMAT: UInt = 102u

public val IDD_ACMFORMATCHOOSE_CMB_FORMATTAG: UInt = 101u

public val IDS_CAP_AUDIO_DROP_COMPERROR: UInt = 442u

public val IDS_CAP_AUDIO_DROP_ERROR: UInt = 441u

public val IDS_CAP_AVI_DRAWDIB_ERROR: UInt = 439u

public val IDS_CAP_AVI_INIT_ERROR: UInt = 433u

public val IDS_CAP_BEGIN: UInt = 300u

public val IDS_CAP_CANTOPEN: UInt = 409u

public val IDS_CAP_COMPRESSOR_ERROR: UInt = 440u

public val IDS_CAP_DEFAVIEXT: UInt = 407u

public val IDS_CAP_DEFPALEXT: UInt = 408u

public val IDS_CAP_DRIVER_ERROR: UInt = 418u

public val IDS_CAP_END: UInt = 301u

public val IDS_CAP_ERRORDIBSAVE: UInt = 406u

public val IDS_CAP_ERRORPALOPEN: UInt = 404u

public val IDS_CAP_ERRORPALSAVE: UInt = 405u

public val IDS_CAP_FILEEXISTS: UInt = 403u

public val IDS_CAP_FILE_OPEN_ERROR: UInt = 429u

public val IDS_CAP_FILE_WRITE_ERROR: UInt = 430u

public val IDS_CAP_INFO: UInt = 401u

public val IDS_CAP_MCI_CANT_STEP_ERROR: UInt = 437u

public val IDS_CAP_MCI_CONTROL_ERROR: UInt = 436u

public val IDS_CAP_NODISKSPACE: UInt = 415u

public val IDS_CAP_NO_AUDIO_CAP_ERROR: UInt = 438u

public val IDS_CAP_NO_FRAME_CAP_ERROR: UInt = 434u

public val IDS_CAP_NO_PALETTE_WARN: UInt = 435u

public val IDS_CAP_OUTOFMEM: UInt = 402u

public val IDS_CAP_READONLYFILE: UInt = 413u

public val IDS_CAP_RECORDING_ERROR: UInt = 431u

public val IDS_CAP_RECORDING_ERROR2: UInt = 432u

public val IDS_CAP_SAVEASPERCENT: UInt = 417u

public val IDS_CAP_SEQ_MSGSTART: UInt = 410u

public val IDS_CAP_SEQ_MSGSTOP: UInt = 411u

public val IDS_CAP_SETFILESIZE: UInt = 416u

public val IDS_CAP_STAT_CAP_AUDIO: UInt = 509u

public val IDS_CAP_STAT_CAP_FINI: UInt = 503u

public val IDS_CAP_STAT_CAP_INIT: UInt = 502u

public val IDS_CAP_STAT_CAP_L_FRAMES: UInt = 508u

public val IDS_CAP_STAT_FRAMESDROPPED: UInt = 513u

public val IDS_CAP_STAT_I_FRAMES: UInt = 506u

public val IDS_CAP_STAT_LIVE_MODE: UInt = 500u

public val IDS_CAP_STAT_L_FRAMES: UInt = 507u

public val IDS_CAP_STAT_OPTPAL_BUILD: UInt = 505u

public val IDS_CAP_STAT_OVERLAY_MODE: UInt = 501u

public val IDS_CAP_STAT_PALETTE_BUILD: UInt = 504u

public val IDS_CAP_STAT_VIDEOAUDIO: UInt = 511u

public val IDS_CAP_STAT_VIDEOCURRENT: UInt = 510u

public val IDS_CAP_STAT_VIDEOONLY: UInt = 512u

public val IDS_CAP_VIDEDITERR: UInt = 412u

public val IDS_CAP_VIDEO_ADD_ERROR: UInt = 427u

public val IDS_CAP_VIDEO_ALLOC_ERROR: UInt = 425u

public val IDS_CAP_VIDEO_OPEN_ERROR: UInt = 424u

public val IDS_CAP_VIDEO_PREPARE_ERROR: UInt = 426u

public val IDS_CAP_VIDEO_SIZE_ERROR: UInt = 428u

public val IDS_CAP_WAVE_ADD_ERROR: UInt = 422u

public val IDS_CAP_WAVE_ALLOC_ERROR: UInt = 420u

public val IDS_CAP_WAVE_OPEN_ERROR: UInt = 419u

public val IDS_CAP_WAVE_PREPARE_ERROR: UInt = 421u

public val IDS_CAP_WAVE_SIZE_ERROR: UInt = 423u

public val IDS_CAP_WRITEERROR: UInt = 414u

public val JDD_CONFIGCHANGED: UInt = 2307u

public val JDD_GETDEVCAPS: UInt = 2050u

public val JDD_GETNUMDEVS: UInt = 2049u

public val JDD_GETPOS: UInt = 2305u

public val JDD_GETPOSEX: UInt = 2308u

public val JDD_SETCALIBRATION: UInt = 2306u

public val JIFMK_00: UInt = 65280u

public val JIFMK_APP0: UInt = 65504u

public val JIFMK_APP1: UInt = 65505u

public val JIFMK_APP2: UInt = 65506u

public val JIFMK_APP3: UInt = 65507u

public val JIFMK_APP4: UInt = 65508u

public val JIFMK_APP5: UInt = 65509u

public val JIFMK_APP6: UInt = 65510u

public val JIFMK_APP7: UInt = 65511u

public val JIFMK_COM: UInt = 65534u

public val JIFMK_DAC: UInt = 65484u

public val JIFMK_DHP: UInt = 65502u

public val JIFMK_DHT: UInt = 65476u

public val JIFMK_DNL: UInt = 65500u

public val JIFMK_DQT: UInt = 65499u

public val JIFMK_DRI: UInt = 65501u

public val JIFMK_EOI: UInt = 65497u

public val JIFMK_EXP: UInt = 65503u

public val JIFMK_FF: UInt = 65535u

public val JIFMK_JPG: UInt = 65480u

public val JIFMK_JPG0: UInt = 65520u

public val JIFMK_JPG1: UInt = 65521u

public val JIFMK_JPG10: UInt = 65530u

public val JIFMK_JPG11: UInt = 65531u

public val JIFMK_JPG12: UInt = 65532u

public val JIFMK_JPG13: UInt = 65533u

public val JIFMK_JPG2: UInt = 65522u

public val JIFMK_JPG3: UInt = 65523u

public val JIFMK_JPG4: UInt = 65524u

public val JIFMK_JPG5: UInt = 65525u

public val JIFMK_JPG6: UInt = 65526u

public val JIFMK_JPG7: UInt = 65527u

public val JIFMK_JPG8: UInt = 65528u

public val JIFMK_JPG9: UInt = 65529u

public val JIFMK_RES: UInt = 65282u

public val JIFMK_RST0: UInt = 65488u

public val JIFMK_RST1: UInt = 65489u

public val JIFMK_RST2: UInt = 65490u

public val JIFMK_RST3: UInt = 65491u

public val JIFMK_RST4: UInt = 65492u

public val JIFMK_RST5: UInt = 65493u

public val JIFMK_RST6: UInt = 65494u

public val JIFMK_RST7: UInt = 65495u

public val JIFMK_SOF0: UInt = 65472u

public val JIFMK_SOF1: UInt = 65473u

public val JIFMK_SOF10: UInt = 65482u

public val JIFMK_SOF11: UInt = 65483u

public val JIFMK_SOF13: UInt = 65485u

public val JIFMK_SOF14: UInt = 65486u

public val JIFMK_SOF15: UInt = 65487u

public val JIFMK_SOF2: UInt = 65474u

public val JIFMK_SOF3: UInt = 65475u

public val JIFMK_SOF5: UInt = 65477u

public val JIFMK_SOF6: UInt = 65478u

public val JIFMK_SOF7: UInt = 65479u

public val JIFMK_SOF9: UInt = 65481u

public val JIFMK_SOI: UInt = 65496u

public val JIFMK_SOS: UInt = 65498u

public val JIFMK_TEM: UInt = 65281u

public val JOYCAPS_HASPOV: UInt = 16u

public val JOYCAPS_HASR: UInt = 2u

public val JOYCAPS_HASU: UInt = 4u

public val JOYCAPS_HASV: UInt = 8u

public val JOYCAPS_HASZ: UInt = 1u

public val JOYCAPS_POV4DIR: UInt = 32u

public val JOYCAPS_POVCTS: UInt = 64u

public val JOYERR_NOCANDO: UInt = 166u

public val JOYERR_NOERROR: UInt = 0u

public val JOYERR_PARMS: UInt = 165u

public val JOYERR_UNPLUGGED: UInt = 167u

public val JOYSTICKID1: UInt = 0u

public val JOYSTICKID2: UInt = 1u

public val JOY_BUTTON1: UInt = 1u

public val JOY_BUTTON10: Int = 512

public val JOY_BUTTON11: Int = 1024

public val JOY_BUTTON12: Int = 2048

public val JOY_BUTTON13: Int = 4096

public val JOY_BUTTON14: Int = 8192

public val JOY_BUTTON15: Int = 16384

public val JOY_BUTTON16: Int = 32768

public val JOY_BUTTON17: Int = 65536

public val JOY_BUTTON18: Int = 131072

public val JOY_BUTTON19: Int = 262144

public val JOY_BUTTON1CHG: UInt = 256u

public val JOY_BUTTON2: UInt = 2u

public val JOY_BUTTON20: Int = 524288

public val JOY_BUTTON21: Int = 1048576

public val JOY_BUTTON22: Int = 2097152

public val JOY_BUTTON23: Int = 4194304

public val JOY_BUTTON24: Int = 8388608

public val JOY_BUTTON25: Int = 16777216

public val JOY_BUTTON26: Int = 33554432

public val JOY_BUTTON27: Int = 67108864

public val JOY_BUTTON28: Int = 134217728

public val JOY_BUTTON29: Int = 268435456

public val JOY_BUTTON2CHG: UInt = 512u

public val JOY_BUTTON3: UInt = 4u

public val JOY_BUTTON30: Int = 536870912

public val JOY_BUTTON31: Int = 1073741824

public val JOY_BUTTON32: Int = -2147483648.toInt()

public val JOY_BUTTON3CHG: UInt = 1024u

public val JOY_BUTTON4: UInt = 8u

public val JOY_BUTTON4CHG: UInt = 2048u

public val JOY_BUTTON5: Int = 16

public val JOY_BUTTON6: Int = 32

public val JOY_BUTTON7: Int = 64

public val JOY_BUTTON8: Int = 128

public val JOY_BUTTON9: Int = 256

public val JOY_CAL_READ3: Int = 262144

public val JOY_CAL_READ4: Int = 524288

public val JOY_CAL_READ5: Int = 4194304

public val JOY_CAL_READ6: Int = 8388608

public val JOY_CAL_READALWAYS: Int = 65536

public val JOY_CAL_READRONLY: Int = 33554432

public val JOY_CAL_READUONLY: Int = 67108864

public val JOY_CAL_READVONLY: Int = 134217728

public val JOY_CAL_READXONLY: Int = 1048576

public val JOY_CAL_READXYONLY: Int = 131072

public val JOY_CAL_READYONLY: Int = 2097152

public val JOY_CAL_READZONLY: Int = 16777216

public val JOY_CONFIGCHANGED_MSGSTRING: Pcstr = s("MSJSTICK_VJOYD_MSGSTR")

public val JOY_POVBACKWARD: UInt = 18000u

public val JOY_POVFORWARD: UInt = 0u

public val JOY_POVLEFT: UInt = 27000u

public val JOY_POVRIGHT: UInt = 9000u

public val JOY_RETURNBUTTONS: Int = 128

public val JOY_RETURNCENTERED: Int = 1024

public val JOY_RETURNPOV: Int = 64

public val JOY_RETURNPOVCTS: Int = 512

public val JOY_RETURNR: Int = 8

public val JOY_RETURNRAWDATA: Int = 256

public val JOY_RETURNU: Int = 16

public val JOY_RETURNV: Int = 32

public val JOY_RETURNX: Int = 1

public val JOY_RETURNY: Int = 2

public val JOY_RETURNZ: Int = 4

public val JOY_USEDEADZONE: Int = 2048

public val JPEG_PROCESS_BASELINE: UInt = 0u

public val JPEG_RGB: UInt = 3u

public val JPEG_Y: UInt = 1u

public val JPEG_Y_CB_CR: UInt = 2u

public val KSDATAFORMAT_SUBTYPE_IEEE_FLOAT: Guid = Guid.fromU128(U128(0x300000010uL, 0x800000aa00389b71uL))

public val MCIERR_AVI_AUDIOERROR: UInt = 619u

public val MCIERR_AVI_BADPALETTE: UInt = 620u

public val MCIERR_AVI_CANTPLAYFULLSCREEN: UInt = 615u

public val MCIERR_AVI_DISPLAYERROR: UInt = 618u

public val MCIERR_AVI_NOCOMPRESSOR: UInt = 617u

public val MCIERR_AVI_NODISPDIB: UInt = 614u

public val MCIERR_AVI_NOTINTERLEAVED: UInt = 613u

public val MCIERR_AVI_OLDAVIFORMAT: UInt = 612u

public val MCIERR_AVI_TOOBIGFORVGA: UInt = 616u

public val MCIERR_BAD_CONSTANT: UInt = 290u

public val MCIERR_BAD_INTEGER: UInt = 270u

public val MCIERR_BAD_TIME_FORMAT: UInt = 293u

public val MCIERR_CANNOT_LOAD_DRIVER: UInt = 266u

public val MCIERR_CANNOT_USE_ALL: UInt = 279u

public val MCIERR_CREATEWINDOW: UInt = 347u

public val MCIERR_CUSTOM_DRIVER_BASE: UInt = 512u

public val MCIERR_DEVICE_LENGTH: UInt = 310u

public val MCIERR_DEVICE_LOCKED: UInt = 288u

public val MCIERR_DEVICE_NOT_INSTALLED: UInt = 306u

public val MCIERR_DEVICE_NOT_READY: UInt = 276u

public val MCIERR_DEVICE_OPEN: UInt = 265u

public val MCIERR_DEVICE_ORD_LENGTH: UInt = 311u

public val MCIERR_DEVICE_TYPE_REQUIRED: UInt = 287u

public val MCIERR_DGV_BAD_CLIPBOARD_RANGE: UInt = 517u

public val MCIERR_DGV_DEVICE_LIMIT: UInt = 512u

public val MCIERR_DGV_DEVICE_MEMORY_FULL: UInt = 516u

public val MCIERR_DGV_DISK_FULL: UInt = 515u

public val MCIERR_DGV_IOERR: UInt = 513u

public val MCIERR_DGV_WORKSPACE_EMPTY: UInt = 514u

public val MCIERR_DRIVER: UInt = 278u

public val MCIERR_DRIVER_INTERNAL: UInt = 272u

public val MCIERR_DUPLICATE_ALIAS: UInt = 289u

public val MCIERR_DUPLICATE_FLAGS: UInt = 295u

public val MCIERR_EXTENSION_NOT_FOUND: UInt = 281u

public val MCIERR_EXTRA_CHARACTERS: UInt = 305u

public val MCIERR_FILENAME_REQUIRED: UInt = 304u

public val MCIERR_FILE_NOT_FOUND: UInt = 275u

public val MCIERR_FILE_NOT_SAVED: UInt = 286u

public val MCIERR_FILE_READ: UInt = 348u

public val MCIERR_FILE_WRITE: UInt = 349u

public val MCIERR_FLAGS_NOT_COMPATIBLE: UInt = 284u

public val MCIERR_GET_CD: UInt = 307u

public val MCIERR_HARDWARE: UInt = 262u

public val MCIERR_ILLEGAL_FOR_AUTO_OPEN: UInt = 303u

public val MCIERR_INTERNAL: UInt = 277u

public val MCIERR_INVALID_DEVICE_ID: UInt = 257u

public val MCIERR_INVALID_DEVICE_NAME: UInt = 263u

public val MCIERR_INVALID_FILE: UInt = 296u

public val MCIERR_MISSING_COMMAND_STRING: UInt = 267u

public val MCIERR_MISSING_DEVICE_NAME: UInt = 292u

public val MCIERR_MISSING_PARAMETER: UInt = 273u

public val MCIERR_MISSING_STRING_ARGUMENT: UInt = 269u

public val MCIERR_MULTIPLE: UInt = 280u

public val MCIERR_MUST_USE_SHAREABLE: UInt = 291u

public val MCIERR_NEW_REQUIRES_ALIAS: UInt = 299u

public val MCIERR_NONAPPLICABLE_FUNCTION: UInt = 302u

public val MCIERR_NOTIFY_ON_AUTO_OPEN: UInt = 300u

public val MCIERR_NO_CLOSING_QUOTE: UInt = 294u

public val MCIERR_NO_ELEMENT_ALLOWED: UInt = 301u

public val MCIERR_NO_IDENTITY: UInt = 350u

public val MCIERR_NO_INTEGER: UInt = 312u

public val MCIERR_NO_WINDOW: UInt = 346u

public val MCIERR_NULL_PARAMETER_BLOCK: UInt = 297u

public val MCIERR_OUTOFRANGE: UInt = 282u

public val MCIERR_OUT_OF_MEMORY: UInt = 264u

public val MCIERR_PARAM_OVERFLOW: UInt = 268u

public val MCIERR_PARSER_INTERNAL: UInt = 271u

public val MCIERR_SEQ_DIV_INCOMPATIBLE: UInt = 336u

public val MCIERR_SEQ_NOMIDIPRESENT: UInt = 343u

public val MCIERR_SEQ_PORTUNSPECIFIED: UInt = 342u

public val MCIERR_SEQ_PORT_INUSE: UInt = 337u

public val MCIERR_SEQ_PORT_MAPNODEVICE: UInt = 339u

public val MCIERR_SEQ_PORT_MISCERROR: UInt = 340u

public val MCIERR_SEQ_PORT_NONEXISTENT: UInt = 338u

public val MCIERR_SEQ_TIMER: UInt = 341u

public val MCIERR_SET_CD: UInt = 308u

public val MCIERR_SET_DRIVE: UInt = 309u

public val MCIERR_UNNAMED_RESOURCE: UInt = 298u

public val MCIERR_UNRECOGNIZED_COMMAND: UInt = 261u

public val MCIERR_UNRECOGNIZED_KEYWORD: UInt = 259u

public val MCIERR_UNSUPPORTED_FUNCTION: UInt = 274u

public val MCIERR_WAVE_INPUTSINUSE: UInt = 322u

public val MCIERR_WAVE_INPUTSUNSUITABLE: UInt = 328u

public val MCIERR_WAVE_INPUTUNSPECIFIED: UInt = 325u

public val MCIERR_WAVE_OUTPUTSINUSE: UInt = 320u

public val MCIERR_WAVE_OUTPUTSUNSUITABLE: UInt = 326u

public val MCIERR_WAVE_OUTPUTUNSPECIFIED: UInt = 324u

public val MCIERR_WAVE_SETINPUTINUSE: UInt = 323u

public val MCIERR_WAVE_SETINPUTUNSUITABLE: UInt = 329u

public val MCIERR_WAVE_SETOUTPUTINUSE: UInt = 321u

public val MCIERR_WAVE_SETOUTPUTUNSUITABLE: UInt = 327u

public val MCIWNDF_NOAUTOSIZEMOVIE: UInt = 4u

public val MCIWNDF_NOAUTOSIZEWINDOW: UInt = 1u

public val MCIWNDF_NOERRORDLG: UInt = 16384u

public val MCIWNDF_NOMENU: UInt = 8u

public val MCIWNDF_NOOPEN: UInt = 32768u

public val MCIWNDF_NOPLAYBAR: UInt = 2u

public val MCIWNDF_NOTIFYALL: UInt = 7936u

public val MCIWNDF_NOTIFYANSI: UInt = 128u

public val MCIWNDF_NOTIFYERROR: UInt = 4096u

public val MCIWNDF_NOTIFYMEDIA: UInt = 2048u

public val MCIWNDF_NOTIFYMEDIAA: UInt = 2176u

public val MCIWNDF_NOTIFYMEDIAW: UInt = 2048u

public val MCIWNDF_NOTIFYMODE: UInt = 256u

public val MCIWNDF_NOTIFYPOS: UInt = 512u

public val MCIWNDF_NOTIFYSIZE: UInt = 1024u

public val MCIWNDF_RECORD: UInt = 8192u

public val MCIWNDF_SHOWALL: UInt = 112u

public val MCIWNDF_SHOWMODE: UInt = 64u

public val MCIWNDF_SHOWNAME: UInt = 16u

public val MCIWNDF_SHOWPOS: UInt = 32u

public val MCIWNDM_CAN_CONFIG: UInt = 1173u

public val MCIWNDM_CAN_EJECT: UInt = 1172u

public val MCIWNDM_CAN_PLAY: UInt = 1168u

public val MCIWNDM_CAN_RECORD: UInt = 1170u

public val MCIWNDM_CAN_SAVE: UInt = 1171u

public val MCIWNDM_CAN_WINDOW: UInt = 1169u

public val MCIWNDM_CHANGESTYLES: UInt = 1159u

public val MCIWNDM_EJECT: UInt = 1131u

public val MCIWNDM_GETACTIVETIMER: UInt = 1156u

public val MCIWNDM_GETALIAS: UInt = 1161u

public val MCIWNDM_GETDEVICE: UInt = 1249u

public val MCIWNDM_GETDEVICEA: UInt = 1149u

public val MCIWNDM_GETDEVICEID: UInt = 1124u

public val MCIWNDM_GETDEVICEW: UInt = 1249u

public val MCIWNDM_GETEND: UInt = 1129u

public val MCIWNDM_GETERROR: UInt = 1252u

public val MCIWNDM_GETERRORA: UInt = 1152u

public val MCIWNDM_GETERRORW: UInt = 1252u

public val MCIWNDM_GETFILENAME: UInt = 1248u

public val MCIWNDM_GETFILENAMEA: UInt = 1148u

public val MCIWNDM_GETFILENAMEW: UInt = 1248u

public val MCIWNDM_GETINACTIVETIMER: UInt = 1157u

public val MCIWNDM_GETLENGTH: UInt = 1128u

public val MCIWNDM_GETMODE: UInt = 1230u

public val MCIWNDM_GETMODEA: UInt = 1130u

public val MCIWNDM_GETMODEW: UInt = 1230u

public val MCIWNDM_GETPALETTE: UInt = 1150u

public val MCIWNDM_GETPOSITION: UInt = 1226u

public val MCIWNDM_GETPOSITIONA: UInt = 1126u

public val MCIWNDM_GETPOSITIONW: UInt = 1226u

public val MCIWNDM_GETREPEAT: UInt = 1139u

public val MCIWNDM_GETSPEED: UInt = 1137u

public val MCIWNDM_GETSTART: UInt = 1127u

public val MCIWNDM_GETSTYLES: UInt = 1160u

public val MCIWNDM_GETTIMEFORMAT: UInt = 1244u

public val MCIWNDM_GETTIMEFORMATA: UInt = 1144u

public val MCIWNDM_GETTIMEFORMATW: UInt = 1244u

public val MCIWNDM_GETVOLUME: UInt = 1135u

public val MCIWNDM_GETZOOM: UInt = 1133u

public val MCIWNDM_GET_DEST: UInt = 1166u

public val MCIWNDM_GET_SOURCE: UInt = 1164u

public val MCIWNDM_NEW: UInt = 1258u

public val MCIWNDM_NEWA: UInt = 1158u

public val MCIWNDM_NEWW: UInt = 1258u

public val MCIWNDM_NOTIFYERROR: UInt = 1229u

public val MCIWNDM_NOTIFYMEDIA: UInt = 1227u

public val MCIWNDM_NOTIFYMODE: UInt = 1224u

public val MCIWNDM_NOTIFYPOS: UInt = 1225u

public val MCIWNDM_NOTIFYSIZE: UInt = 1226u

public val MCIWNDM_OPEN: UInt = 1276u

public val MCIWNDM_OPENA: UInt = 1177u

public val MCIWNDM_OPENINTERFACE: UInt = 1175u

public val MCIWNDM_OPENW: UInt = 1276u

public val MCIWNDM_PALETTEKICK: UInt = 1174u

public val MCIWNDM_PLAYFROM: UInt = 1146u

public val MCIWNDM_PLAYREVERSE: UInt = 1163u

public val MCIWNDM_PLAYTO: UInt = 1147u

public val MCIWNDM_PUT_DEST: UInt = 1167u

public val MCIWNDM_PUT_SOURCE: UInt = 1165u

public val MCIWNDM_REALIZE: UInt = 1142u

public val MCIWNDM_RETURNSTRING: UInt = 1262u

public val MCIWNDM_RETURNSTRINGA: UInt = 1162u

public val MCIWNDM_RETURNSTRINGW: UInt = 1262u

public val MCIWNDM_SENDSTRING: UInt = 1225u

public val MCIWNDM_SENDSTRINGA: UInt = 1125u

public val MCIWNDM_SENDSTRINGW: UInt = 1225u

public val MCIWNDM_SETACTIVETIMER: UInt = 1154u

public val MCIWNDM_SETINACTIVETIMER: UInt = 1155u

public val MCIWNDM_SETOWNER: UInt = 1176u

public val MCIWNDM_SETPALETTE: UInt = 1151u

public val MCIWNDM_SETREPEAT: UInt = 1138u

public val MCIWNDM_SETSPEED: UInt = 1136u

public val MCIWNDM_SETTIMEFORMAT: UInt = 1243u

public val MCIWNDM_SETTIMEFORMATA: UInt = 1143u

public val MCIWNDM_SETTIMEFORMATW: UInt = 1243u

public val MCIWNDM_SETTIMERS: UInt = 1153u

public val MCIWNDM_SETVOLUME: UInt = 1134u

public val MCIWNDM_SETZOOM: UInt = 1132u

public val MCIWNDM_VALIDATEMEDIA: UInt = 1145u

public val MCIWNDOPENF_NEW: UInt = 1u

public val MCIWND_END: Int = -2

public val MCIWND_START: Int = -1

public val MCIWND_WINDOW_CLASS: Pcwstr = w("MCIWndClass")

public val MCI_ANIM_GETDEVCAPS_CAN_REVERSE: Int = 16385

public val MCI_ANIM_GETDEVCAPS_CAN_STRETCH: Int = 16391

public val MCI_ANIM_GETDEVCAPS_FAST_RATE: Int = 16386

public val MCI_ANIM_GETDEVCAPS_MAX_WINDOWS: Int = 16392

public val MCI_ANIM_GETDEVCAPS_NORMAL_RATE: Int = 16388

public val MCI_ANIM_GETDEVCAPS_PALETTES: Int = 16390

public val MCI_ANIM_GETDEVCAPS_SLOW_RATE: Int = 16387

public val MCI_ANIM_INFO_TEXT: Int = 65536

public val MCI_ANIM_OPEN_NOSTATIC: Int = 262144

public val MCI_ANIM_OPEN_PARENT: Int = 131072

public val MCI_ANIM_OPEN_WS: Int = 65536

public val MCI_ANIM_PLAY_FAST: Int = 262144

public val MCI_ANIM_PLAY_REVERSE: Int = 131072

public val MCI_ANIM_PLAY_SCAN: Int = 1048576

public val MCI_ANIM_PLAY_SLOW: Int = 524288

public val MCI_ANIM_PLAY_SPEED: Int = 65536

public val MCI_ANIM_PUT_DESTINATION: Int = 262144

public val MCI_ANIM_PUT_SOURCE: Int = 131072

public val MCI_ANIM_REALIZE_BKGD: Int = 131072

public val MCI_ANIM_REALIZE_NORM: Int = 65536

public val MCI_ANIM_RECT: Int = 65536

public val MCI_ANIM_STATUS_FORWARD: Int = 16386

public val MCI_ANIM_STATUS_HPAL: Int = 16388

public val MCI_ANIM_STATUS_HWND: Int = 16387

public val MCI_ANIM_STATUS_SPEED: Int = 16385

public val MCI_ANIM_STATUS_STRETCH: Int = 16389

public val MCI_ANIM_STEP_FRAMES: Int = 131072

public val MCI_ANIM_STEP_REVERSE: Int = 65536

public val MCI_ANIM_UPDATE_HDC: Int = 131072

public val MCI_ANIM_WHERE_DESTINATION: Int = 262144

public val MCI_ANIM_WHERE_SOURCE: Int = 131072

public val MCI_ANIM_WINDOW_DEFAULT: Int = 0

public val MCI_ANIM_WINDOW_DISABLE_STRETCH: Int = 2097152

public val MCI_ANIM_WINDOW_ENABLE_STRETCH: Int = 1048576

public val MCI_ANIM_WINDOW_HWND: Int = 65536

public val MCI_ANIM_WINDOW_STATE: Int = 262144

public val MCI_ANIM_WINDOW_TEXT: Int = 524288

public val MCI_AVI_SETVIDEO_DRAW_PROCEDURE: Int = 32768

public val MCI_AVI_SETVIDEO_PALETTE_COLOR: Int = 33024

public val MCI_AVI_SETVIDEO_PALETTE_HALFTONE: Int = 65535

public val MCI_AVI_STATUS_AUDIO_BREAKS: Int = 32771

public val MCI_AVI_STATUS_FRAMES_SKIPPED: Int = 32769

public val MCI_AVI_STATUS_LAST_PLAY_SPEED: Int = 32770

public val MCI_BREAK: UInt = 2065u

public val MCI_BREAK_HWND: Int = 512

public val MCI_BREAK_KEY: Int = 256

public val MCI_BREAK_OFF: Int = 1024

public val MCI_CAPTURE: UInt = 2160u

public val MCI_CDA_STATUS_TYPE_TRACK: Int = 16385

public val MCI_CDA_TRACK_AUDIO: UInt = 1088u

public val MCI_CDA_TRACK_OTHER: UInt = 1089u

public val MCI_CLOSE: UInt = 2052u

public val MCI_CLOSE_DRIVER: UInt = 2050u

public val MCI_COLONIZED3_RETURN: UInt = 131072u

public val MCI_COLONIZED4_RETURN: UInt = 262144u

public val MCI_COMMAND_HEAD: UInt = 0u

public val MCI_CONFIGURE: UInt = 2170u

public val MCI_CONSTANT: UInt = 8u

public val MCI_COPY: UInt = 2130u

public val MCI_CUE: UInt = 2096u

public val MCI_CUT: UInt = 2129u

public val MCI_DELETE: UInt = 2134u

public val MCI_DEVTYPE_ANIMATION: UInt = 519u

public val MCI_DEVTYPE_CD_AUDIO: UInt = 516u

public val MCI_DEVTYPE_DAT: UInt = 517u

public val MCI_DEVTYPE_DIGITAL_VIDEO: UInt = 520u

public val MCI_DEVTYPE_FIRST: UInt = 513u

public val MCI_DEVTYPE_FIRST_USER: UInt = 4096u

public val MCI_DEVTYPE_LAST: UInt = 523u

public val MCI_DEVTYPE_OTHER: UInt = 521u

public val MCI_DEVTYPE_OVERLAY: UInt = 515u

public val MCI_DEVTYPE_SCANNER: UInt = 518u

public val MCI_DEVTYPE_SEQUENCER: UInt = 523u

public val MCI_DEVTYPE_VCR: UInt = 513u

public val MCI_DEVTYPE_VIDEODISC: UInt = 514u

public val MCI_DEVTYPE_WAVEFORM_AUDIO: UInt = 522u

public val MCI_DGV_CAPTURE_AS: Int = 65536

public val MCI_DGV_CAPTURE_AT: Int = 131072

public val MCI_DGV_COPY_AT: Int = 65536

public val MCI_DGV_COPY_AUDIO_STREAM: Int = 131072

public val MCI_DGV_COPY_VIDEO_STREAM: Int = 262144

public val MCI_DGV_CUE_INPUT: Int = 65536

public val MCI_DGV_CUE_NOSHOW: Int = 262144

public val MCI_DGV_CUE_OUTPUT: Int = 131072

public val MCI_DGV_CUT_AT: Int = 65536

public val MCI_DGV_CUT_AUDIO_STREAM: Int = 131072

public val MCI_DGV_CUT_VIDEO_STREAM: Int = 262144

public val MCI_DGV_DELETE_AT: Int = 65536

public val MCI_DGV_DELETE_AUDIO_STREAM: Int = 131072

public val MCI_DGV_DELETE_VIDEO_STREAM: Int = 262144

public val MCI_DGV_FF_AVI: Int = 16385

public val MCI_DGV_FF_AVSS: Int = 16384

public val MCI_DGV_FF_DIB: Int = 16386

public val MCI_DGV_FF_JFIF: Int = 16390

public val MCI_DGV_FF_JPEG: Int = 16388

public val MCI_DGV_FF_MPEG: Int = 16391

public val MCI_DGV_FF_RDIB: Int = 16387

public val MCI_DGV_FF_RJPEG: Int = 16389

public val MCI_DGV_FILE_MODE_EDITING: UInt = 3u

public val MCI_DGV_FILE_MODE_EDITING_S: Int = 32774

public val MCI_DGV_FILE_MODE_IDLE: UInt = 4u

public val MCI_DGV_FILE_MODE_IDLE_S: Int = 32775

public val MCI_DGV_FILE_MODE_LOADING: UInt = 2u

public val MCI_DGV_FILE_MODE_LOADING_S: Int = 32773

public val MCI_DGV_FILE_MODE_SAVING: UInt = 1u

public val MCI_DGV_FILE_MODE_SAVING_S: Int = 32772

public val MCI_DGV_FILE_S: Int = 32770

public val MCI_DGV_FREEZE_AT: Int = 65536

public val MCI_DGV_FREEZE_OUTSIDE: Int = 131072

public val MCI_DGV_GETDEVCAPS_CAN_FREEZE: Int = 16386

public val MCI_DGV_GETDEVCAPS_CAN_LOCK: Int = 16384

public val MCI_DGV_GETDEVCAPS_CAN_REVERSE: Int = 16388

public val MCI_DGV_GETDEVCAPS_CAN_STRETCH: Int = 16385

public val MCI_DGV_GETDEVCAPS_CAN_STR_IN: Int = 16392

public val MCI_DGV_GETDEVCAPS_CAN_TEST: Int = 16393

public val MCI_DGV_GETDEVCAPS_HAS_STILL: Int = 16389

public val MCI_DGV_GETDEVCAPS_MAXIMUM_RATE: Int = 16394

public val MCI_DGV_GETDEVCAPS_MAX_WINDOWS: Int = 16387

public val MCI_DGV_GETDEVCAPS_MINIMUM_RATE: Int = 16395

public val MCI_DGV_GETDEVCAPS_PALETTES: Int = 16390

public val MCI_DGV_INFO_AUDIO_ALG: Int = 16388

public val MCI_DGV_INFO_AUDIO_QUALITY: Int = 16385

public val MCI_DGV_INFO_ITEM: Int = 131072

public val MCI_DGV_INFO_STILL_ALG: Int = 16389

public val MCI_DGV_INFO_STILL_QUALITY: Int = 16386

public val MCI_DGV_INFO_TEXT: Int = 65536

public val MCI_DGV_INFO_USAGE: Int = 16384

public val MCI_DGV_INFO_VIDEO_ALG: Int = 16390

public val MCI_DGV_INFO_VIDEO_QUALITY: Int = 16387

public val MCI_DGV_INPUT_S: Int = 32771

public val MCI_DGV_LIST_ALG: Int = 524288

public val MCI_DGV_LIST_AUDIO_ALG: Int = 16384

public val MCI_DGV_LIST_AUDIO_QUALITY: Int = 16385

public val MCI_DGV_LIST_AUDIO_STREAM: Int = 16386

public val MCI_DGV_LIST_COUNT: Int = 131072

public val MCI_DGV_LIST_ITEM: Int = 65536

public val MCI_DGV_LIST_NUMBER: Int = 262144

public val MCI_DGV_LIST_STILL_ALG: Int = 16387

public val MCI_DGV_LIST_STILL_QUALITY: Int = 16388

public val MCI_DGV_LIST_VIDEO_ALG: Int = 16389

public val MCI_DGV_LIST_VIDEO_QUALITY: Int = 16390

public val MCI_DGV_LIST_VIDEO_SOURCE: Int = 16392

public val MCI_DGV_LIST_VIDEO_STREAM: Int = 16391

public val MCI_DGV_METHOD_DIRECT: Int = 40962

public val MCI_DGV_METHOD_POST: Int = 40961

public val MCI_DGV_METHOD_PRE: Int = 40960

public val MCI_DGV_MONITOR_FILE: Int = 16385

public val MCI_DGV_MONITOR_INPUT: Int = 16384

public val MCI_DGV_MONITOR_METHOD: Int = 65536

public val MCI_DGV_MONITOR_SOURCE: Int = 131072

public val MCI_DGV_OPEN_16BIT: Int = 524288

public val MCI_DGV_OPEN_32BIT: Int = 1048576

public val MCI_DGV_OPEN_NOSTATIC: Int = 262144

public val MCI_DGV_OPEN_PARENT: Int = 131072

public val MCI_DGV_OPEN_WS: Int = 65536

public val MCI_DGV_PASTE_AT: Int = 65536

public val MCI_DGV_PASTE_AUDIO_STREAM: Int = 131072

public val MCI_DGV_PASTE_INSERT: Int = 524288

public val MCI_DGV_PASTE_OVERWRITE: Int = 1048576

public val MCI_DGV_PASTE_VIDEO_STREAM: Int = 262144

public val MCI_DGV_PLAY_REPEAT: Int = 65536

public val MCI_DGV_PLAY_REVERSE: Int = 131072

public val MCI_DGV_PUT_CLIENT: Int = 4194304

public val MCI_DGV_PUT_DESTINATION: Int = 262144

public val MCI_DGV_PUT_FRAME: Int = 524288

public val MCI_DGV_PUT_SOURCE: Int = 131072

public val MCI_DGV_PUT_VIDEO: Int = 1048576

public val MCI_DGV_PUT_WINDOW: Int = 2097152

public val MCI_DGV_REALIZE_BKGD: Int = 131072

public val MCI_DGV_REALIZE_NORM: Int = 65536

public val MCI_DGV_RECORD_AUDIO_STREAM: Int = 262144

public val MCI_DGV_RECORD_HOLD: Int = 131072

public val MCI_DGV_RECORD_VIDEO_STREAM: Int = 524288

public val MCI_DGV_RECT: Int = 65536

public val MCI_DGV_RESERVE_IN: Int = 65536

public val MCI_DGV_RESERVE_SIZE: Int = 131072

public val MCI_DGV_RESTORE_AT: Int = 131072

public val MCI_DGV_RESTORE_FROM: Int = 65536

public val MCI_DGV_SAVE_ABORT: Int = 131072

public val MCI_DGV_SAVE_KEEPRESERVE: Int = 262144

public val MCI_DGV_SETAUDIO_ALG: Int = 262144

public val MCI_DGV_SETAUDIO_AVGBYTESPERSEC: Int = 16390

public val MCI_DGV_SETAUDIO_BASS: Int = 16385

public val MCI_DGV_SETAUDIO_BITSPERSAMPLE: Int = 16392

public val MCI_DGV_SETAUDIO_BLOCKALIGN: Int = 16391

public val MCI_DGV_SETAUDIO_CLOCKTIME: Int = 131072

public val MCI_DGV_SETAUDIO_INPUT: Int = 33554432

public val MCI_DGV_SETAUDIO_ITEM: Int = 8388608

public val MCI_DGV_SETAUDIO_LEFT: Int = 2097152

public val MCI_DGV_SETAUDIO_OUTPUT: Int = 67108864

public val MCI_DGV_SETAUDIO_OVER: Int = 65536

public val MCI_DGV_SETAUDIO_QUALITY: Int = 524288

public val MCI_DGV_SETAUDIO_RECORD: Int = 1048576

public val MCI_DGV_SETAUDIO_RIGHT: Int = 4194304

public val MCI_DGV_SETAUDIO_SAMPLESPERSEC: Int = 16389

public val MCI_DGV_SETAUDIO_SOURCE: Int = 16388

public val MCI_DGV_SETAUDIO_SOURCE_AVERAGE: Int = 16384

public val MCI_DGV_SETAUDIO_SOURCE_LEFT: Int = 1

public val MCI_DGV_SETAUDIO_SOURCE_RIGHT: Int = 2

public val MCI_DGV_SETAUDIO_SOURCE_STEREO: Int = 0

public val MCI_DGV_SETAUDIO_SRC_AVERAGE_S: Int = 32802

public val MCI_DGV_SETAUDIO_SRC_LEFT_S: Int = 32800

public val MCI_DGV_SETAUDIO_SRC_RIGHT_S: Int = 32801

public val MCI_DGV_SETAUDIO_SRC_STEREO_S: Int = 32803

public val MCI_DGV_SETAUDIO_STREAM: Int = 16387

public val MCI_DGV_SETAUDIO_TREBLE: Int = 16384

public val MCI_DGV_SETAUDIO_VALUE: Int = 16777216

public val MCI_DGV_SETAUDIO_VOLUME: Int = 16386

public val MCI_DGV_SETVIDEO_ALG: Int = 131072

public val MCI_DGV_SETVIDEO_BITSPERPEL: Int = 16396

public val MCI_DGV_SETVIDEO_BRIGHTNESS: Int = 16384

public val MCI_DGV_SETVIDEO_CLOCKTIME: Int = 262144

public val MCI_DGV_SETVIDEO_COLOR: Int = 16385

public val MCI_DGV_SETVIDEO_CONTRAST: Int = 16386

public val MCI_DGV_SETVIDEO_FRAME_RATE: Int = 16392

public val MCI_DGV_SETVIDEO_GAMMA: Int = 16389

public val MCI_DGV_SETVIDEO_INPUT: Int = 33554432

public val MCI_DGV_SETVIDEO_ITEM: Int = 1048576

public val MCI_DGV_SETVIDEO_KEY_COLOR: Int = 16395

public val MCI_DGV_SETVIDEO_KEY_INDEX: Int = 16394

public val MCI_DGV_SETVIDEO_OUTPUT: Int = 67108864

public val MCI_DGV_SETVIDEO_OVER: Int = 2097152

public val MCI_DGV_SETVIDEO_PALHANDLE: Int = 16391

public val MCI_DGV_SETVIDEO_QUALITY: Int = 65536

public val MCI_DGV_SETVIDEO_RECORD: Int = 4194304

public val MCI_DGV_SETVIDEO_SHARPNESS: Int = 16388

public val MCI_DGV_SETVIDEO_SOURCE: Int = 16393

public val MCI_DGV_SETVIDEO_SRC_GENERIC: Int = 16389

public val MCI_DGV_SETVIDEO_SRC_GENERIC_S: Int = 32789

public val MCI_DGV_SETVIDEO_SRC_NTSC: Int = 16384

public val MCI_DGV_SETVIDEO_SRC_NTSC_S: Int = 32784

public val MCI_DGV_SETVIDEO_SRC_NUMBER: Int = 524288

public val MCI_DGV_SETVIDEO_SRC_PAL: Int = 16387

public val MCI_DGV_SETVIDEO_SRC_PAL_S: Int = 32787

public val MCI_DGV_SETVIDEO_SRC_RGB: Int = 16385

public val MCI_DGV_SETVIDEO_SRC_RGB_S: Int = 32785

public val MCI_DGV_SETVIDEO_SRC_SECAM: Int = 16388

public val MCI_DGV_SETVIDEO_SRC_SECAM_S: Int = 32788

public val MCI_DGV_SETVIDEO_SRC_SVIDEO: Int = 16386

public val MCI_DGV_SETVIDEO_SRC_SVIDEO_S: Int = 32786

public val MCI_DGV_SETVIDEO_STILL: Int = 8388608

public val MCI_DGV_SETVIDEO_STREAM: Int = 16390

public val MCI_DGV_SETVIDEO_TINT: Int = 16387

public val MCI_DGV_SETVIDEO_VALUE: Int = 16777216

public val MCI_DGV_SET_FILEFORMAT: Int = 524288

public val MCI_DGV_SET_SEEK_EXACTLY: Int = 65536

public val MCI_DGV_SET_SPEED: Int = 131072

public val MCI_DGV_SET_STILL: Int = 262144

public val MCI_DGV_SIGNAL_AT: Int = 65536

public val MCI_DGV_SIGNAL_CANCEL: Int = 524288

public val MCI_DGV_SIGNAL_EVERY: Int = 131072

public val MCI_DGV_SIGNAL_POSITION: Int = 1048576

public val MCI_DGV_SIGNAL_USERVAL: Int = 262144

public val MCI_DGV_STATUS_AUDIO: Int = 16404

public val MCI_DGV_STATUS_AUDIO_INPUT: Int = 16384

public val MCI_DGV_STATUS_AUDIO_RECORD: Int = 16410

public val MCI_DGV_STATUS_AUDIO_SOURCE: Int = 16393

public val MCI_DGV_STATUS_AUDIO_STREAM: Int = 16429

public val MCI_DGV_STATUS_AVGBYTESPERSEC: Int = 16424

public val MCI_DGV_STATUS_BASS: Int = 16399

public val MCI_DGV_STATUS_BITSPERPEL: Int = 16427

public val MCI_DGV_STATUS_BITSPERSAMPLE: Int = 16426

public val MCI_DGV_STATUS_BLOCKALIGN: Int = 16425

public val MCI_DGV_STATUS_BRIGHTNESS: Int = 16389

public val MCI_DGV_STATUS_COLOR: Int = 16390

public val MCI_DGV_STATUS_CONTRAST: Int = 16391

public val MCI_DGV_STATUS_DISKSPACE: Int = 2097152

public val MCI_DGV_STATUS_FILEFORMAT: Int = 16392

public val MCI_DGV_STATUS_FILE_COMPLETION: Int = 16416

public val MCI_DGV_STATUS_FILE_MODE: Int = 16415

public val MCI_DGV_STATUS_FORWARD: Int = 16428

public val MCI_DGV_STATUS_FRAME_RATE: Int = 16398

public val MCI_DGV_STATUS_GAMMA: Int = 16394

public val MCI_DGV_STATUS_HPAL: Int = 16388

public val MCI_DGV_STATUS_HWND: Int = 16385

public val MCI_DGV_STATUS_INPUT: Int = 4194304

public val MCI_DGV_STATUS_KEY_COLOR: Int = 16421

public val MCI_DGV_STATUS_KEY_INDEX: Int = 16420

public val MCI_DGV_STATUS_LEFT: Int = 524288

public val MCI_DGV_STATUS_MONITOR: Int = 16395

public val MCI_DGV_STATUS_MONITOR_METHOD: Int = 16396

public val MCI_DGV_STATUS_NOMINAL: Int = 131072

public val MCI_DGV_STATUS_OUTPUT: Int = 8388608

public val MCI_DGV_STATUS_PAUSE_MODE: Int = 16422

public val MCI_DGV_STATUS_RECORD: Int = 16777216

public val MCI_DGV_STATUS_REFERENCE: Int = 262144

public val MCI_DGV_STATUS_RIGHT: Int = 1048576

public val MCI_DGV_STATUS_SAMPLESPERSEC: Int = 16423

public val MCI_DGV_STATUS_SEEK_EXACTLY: Int = 16401

public val MCI_DGV_STATUS_SHARPNESS: Int = 16402

public val MCI_DGV_STATUS_SIZE: Int = 16400

public val MCI_DGV_STATUS_SMPTE: Int = 16403

public val MCI_DGV_STATUS_SPEED: Int = 16387

public val MCI_DGV_STATUS_STILL_FILEFORMAT: Int = 16413

public val MCI_DGV_STATUS_TINT: Int = 16405

public val MCI_DGV_STATUS_TREBLE: Int = 16406

public val MCI_DGV_STATUS_UNSAVED: Int = 16407

public val MCI_DGV_STATUS_VIDEO: Int = 16408

public val MCI_DGV_STATUS_VIDEO_RECORD: Int = 16412

public val MCI_DGV_STATUS_VIDEO_SOURCE: Int = 16411

public val MCI_DGV_STATUS_VIDEO_SRC_NUM: Int = 16414

public val MCI_DGV_STATUS_VIDEO_STREAM: Int = 16430

public val MCI_DGV_STATUS_VOLUME: Int = 16409

public val MCI_DGV_STATUS_WINDOW_MAXIMIZED: Int = 16419

public val MCI_DGV_STATUS_WINDOW_MINIMIZED: Int = 16418

public val MCI_DGV_STATUS_WINDOW_VISIBLE: Int = 16417

public val MCI_DGV_STEP_FRAMES: Int = 131072

public val MCI_DGV_STEP_REVERSE: Int = 65536

public val MCI_DGV_STOP_HOLD: Int = 65536

public val MCI_DGV_UPDATE_HDC: Int = 131072

public val MCI_DGV_UPDATE_PAINT: Int = 262144

public val MCI_DGV_WHERE_DESTINATION: Int = 262144

public val MCI_DGV_WHERE_FRAME: Int = 524288

public val MCI_DGV_WHERE_MAX: Int = 4194304

public val MCI_DGV_WHERE_SOURCE: Int = 131072

public val MCI_DGV_WHERE_VIDEO: Int = 1048576

public val MCI_DGV_WHERE_WINDOW: Int = 2097152

public val MCI_DGV_WINDOW_DEFAULT: Int = 0

public val MCI_DGV_WINDOW_HWND: Int = 65536

public val MCI_DGV_WINDOW_STATE: Int = 262144

public val MCI_DGV_WINDOW_TEXT: Int = 524288

public val MCI_END_COMMAND: UInt = 3u

public val MCI_END_COMMAND_LIST: UInt = 6u

public val MCI_END_CONSTANT: UInt = 9u

public val MCI_ESCAPE: UInt = 2053u

public val MCI_FALSE: UInt = 531u

public val MCI_FIRST: UInt = 2048u

public val MCI_FLAG: UInt = 5u

public val MCI_FORMAT_BYTES: UInt = 8u

public val MCI_FORMAT_BYTES_S: UInt = 541u

public val MCI_FORMAT_FRAMES: UInt = 3u

public val MCI_FORMAT_FRAMES_S: UInt = 536u

public val MCI_FORMAT_HMS: UInt = 1u

public val MCI_FORMAT_HMS_S: UInt = 534u

public val MCI_FORMAT_MILLISECONDS: UInt = 0u

public val MCI_FORMAT_MILLISECONDS_S: UInt = 533u

public val MCI_FORMAT_MSF: UInt = 2u

public val MCI_FORMAT_MSF_S: UInt = 535u

public val MCI_FORMAT_SAMPLES: UInt = 9u

public val MCI_FORMAT_SAMPLES_S: UInt = 542u

public val MCI_FORMAT_SMPTE_24: UInt = 4u

public val MCI_FORMAT_SMPTE_24_S: UInt = 537u

public val MCI_FORMAT_SMPTE_25: UInt = 5u

public val MCI_FORMAT_SMPTE_25_S: UInt = 538u

public val MCI_FORMAT_SMPTE_30: UInt = 6u

public val MCI_FORMAT_SMPTE_30DROP: UInt = 7u

public val MCI_FORMAT_SMPTE_30DROP_S: UInt = 540u

public val MCI_FORMAT_SMPTE_30_S: UInt = 539u

public val MCI_FORMAT_TMSF: UInt = 10u

public val MCI_FORMAT_TMSF_S: UInt = 543u

public val MCI_FREEZE: UInt = 2116u

public val MCI_FROM: Int = 4

public val MCI_GETDEVCAPS: UInt = 2059u

public val MCI_GETDEVCAPS_CAN_EJECT: Int = 7

public val MCI_GETDEVCAPS_CAN_PLAY: Int = 8

public val MCI_GETDEVCAPS_CAN_RECORD: Int = 1

public val MCI_GETDEVCAPS_CAN_SAVE: Int = 9

public val MCI_GETDEVCAPS_COMPOUND_DEVICE: Int = 6

public val MCI_GETDEVCAPS_DEVICE_TYPE: Int = 4

public val MCI_GETDEVCAPS_HAS_AUDIO: Int = 2

public val MCI_GETDEVCAPS_HAS_VIDEO: Int = 3

public val MCI_GETDEVCAPS_ITEM: Int = 256

public val MCI_GETDEVCAPS_USES_FILES: Int = 5

public val MCI_HDC: UInt = 12u

public val MCI_HPAL: UInt = 11u

public val MCI_HWND: UInt = 10u

public val MCI_INFO: UInt = 2058u

public val MCI_INFO_COPYRIGHT: Int = 8192

public val MCI_INFO_FILE: Int = 512

public val MCI_INFO_MEDIA_IDENTITY: Int = 2048

public val MCI_INFO_MEDIA_UPC: Int = 1024

public val MCI_INFO_NAME: Int = 4096

public val MCI_INFO_PRODUCT: Int = 256

public val MCI_INFO_VERSION: Int = 1024

public val MCI_INTEGER: UInt = 2u

public val MCI_INTEGER64: UInt = 13u

public val MCI_INTEGER_RETURNED: UInt = 524288u

public val MCI_LAST: UInt = 4095u

public val MCI_LIST: UInt = 2168u

public val MCI_LOAD: UInt = 2128u

public val MCI_LOAD_FILE: Int = 256

public val MCI_MAX_DEVICE_TYPE_LENGTH: UInt = 80u

public val MCI_MCIAVI_PLAY_FULLBY2: Int = 67108864

public val MCI_MCIAVI_PLAY_FULLSCREEN: Int = 33554432

public val MCI_MCIAVI_PLAY_WINDOW: Int = 16777216

public val MCI_MODE_NOT_READY: UInt = 524u

public val MCI_MODE_OPEN: UInt = 530u

public val MCI_MODE_PAUSE: UInt = 529u

public val MCI_MODE_PLAY: UInt = 526u

public val MCI_MODE_RECORD: UInt = 527u

public val MCI_MODE_SEEK: UInt = 528u

public val MCI_MODE_STOP: UInt = 525u

public val MCI_MONITOR: UInt = 2161u

public val MCI_NOTIFY: Int = 1

public val MCI_NOTIFY_ABORTED: UInt = 4u

public val MCI_NOTIFY_FAILURE: UInt = 8u

public val MCI_NOTIFY_SUCCESSFUL: UInt = 1u

public val MCI_NOTIFY_SUPERSEDED: UInt = 2u

public val MCI_OFF: UInt = 0u

public val MCI_OFF_S: Int = 32769

public val MCI_ON: UInt = 1u

public val MCI_ON_S: Int = 32768

public val MCI_OPEN: UInt = 2051u

public val MCI_OPEN_ALIAS: Int = 1024

public val MCI_OPEN_DRIVER: UInt = 2049u

public val MCI_OPEN_ELEMENT: Int = 512

public val MCI_OPEN_ELEMENT_ID: Int = 2048

public val MCI_OPEN_SHAREABLE: Int = 256

public val MCI_OPEN_TYPE: Int = 8192

public val MCI_OPEN_TYPE_ID: Int = 4096

public val MCI_OVLY_GETDEVCAPS_CAN_FREEZE: Int = 16386

public val MCI_OVLY_GETDEVCAPS_CAN_STRETCH: Int = 16385

public val MCI_OVLY_GETDEVCAPS_MAX_WINDOWS: Int = 16387

public val MCI_OVLY_INFO_TEXT: Int = 65536

public val MCI_OVLY_OPEN_PARENT: Int = 131072

public val MCI_OVLY_OPEN_WS: Int = 65536

public val MCI_OVLY_PUT_DESTINATION: Int = 262144

public val MCI_OVLY_PUT_FRAME: Int = 524288

public val MCI_OVLY_PUT_SOURCE: Int = 131072

public val MCI_OVLY_PUT_VIDEO: Int = 1048576

public val MCI_OVLY_RECT: Int = 65536

public val MCI_OVLY_STATUS_HWND: Int = 16385

public val MCI_OVLY_STATUS_STRETCH: Int = 16386

public val MCI_OVLY_WHERE_DESTINATION: Int = 262144

public val MCI_OVLY_WHERE_FRAME: Int = 524288

public val MCI_OVLY_WHERE_SOURCE: Int = 131072

public val MCI_OVLY_WHERE_VIDEO: Int = 1048576

public val MCI_OVLY_WINDOW_DEFAULT: Int = 0

public val MCI_OVLY_WINDOW_DISABLE_STRETCH: Int = 2097152

public val MCI_OVLY_WINDOW_ENABLE_STRETCH: Int = 1048576

public val MCI_OVLY_WINDOW_HWND: Int = 65536

public val MCI_OVLY_WINDOW_STATE: Int = 262144

public val MCI_OVLY_WINDOW_TEXT: Int = 524288

public val MCI_PASTE: UInt = 2131u

public val MCI_PAUSE: UInt = 2057u

public val MCI_PLAY: UInt = 2054u

public val MCI_PUT: UInt = 2114u

public val MCI_QUALITY: UInt = 2167u

public val MCI_QUALITY_ALG: Int = 262144

public val MCI_QUALITY_DIALOG: Int = 524288

public val MCI_QUALITY_HANDLE: Int = 1048576

public val MCI_QUALITY_ITEM: Int = 65536

public val MCI_QUALITY_ITEM_AUDIO: Int = 16384

public val MCI_QUALITY_ITEM_STILL: Int = 16385

public val MCI_QUALITY_ITEM_VIDEO: Int = 16386

public val MCI_QUALITY_NAME: Int = 131072

public val MCI_REALIZE: UInt = 2112u

public val MCI_RECORD: UInt = 2063u

public val MCI_RECORD_INSERT: Int = 256

public val MCI_RECORD_OVERWRITE: Int = 512

public val MCI_RECT: UInt = 7u

public val MCI_RESERVE: UInt = 2162u

public val MCI_RESOURCE_DRIVER: UInt = 1048576u

public val MCI_RESOURCE_RETURNED: UInt = 65536u

public val MCI_RESTORE: UInt = 2171u

public val MCI_RESUME: UInt = 2133u

public val MCI_RETURN: UInt = 4u

public val MCI_SAVE: UInt = 2067u

public val MCI_SAVE_FILE: Int = 256

public val MCI_SECTION: Pcwstr = w("MCI32")

public val MCI_SEEK: UInt = 2055u

public val MCI_SEEK_TO_END: Int = 512

public val MCI_SEEK_TO_START: Int = 256

public val MCI_SEQ_FILE: UInt = 16386u

public val MCI_SEQ_FILE_S: UInt = 1222u

public val MCI_SEQ_FORMAT_SONGPTR: UInt = 16385u

public val MCI_SEQ_FORMAT_SONGPTR_S: UInt = 1225u

public val MCI_SEQ_MAPPER: UInt = 65535u

public val MCI_SEQ_MAPPER_S: UInt = 1221u

public val MCI_SEQ_MIDI: UInt = 16387u

public val MCI_SEQ_MIDI_S: UInt = 1223u

public val MCI_SEQ_NONE: UInt = 65533u

public val MCI_SEQ_NONE_S: UInt = 1226u

public val MCI_SEQ_SET_MASTER: Int = 524288

public val MCI_SEQ_SET_OFFSET: Int = 16777216

public val MCI_SEQ_SET_PORT: Int = 131072

public val MCI_SEQ_SET_SLAVE: Int = 262144

public val MCI_SEQ_SET_TEMPO: Int = 65536

public val MCI_SEQ_SMPTE: UInt = 16388u

public val MCI_SEQ_SMPTE_S: UInt = 1224u

public val MCI_SEQ_STATUS_COPYRIGHT: Int = 16396

public val MCI_SEQ_STATUS_DIVTYPE: Int = 16394

public val MCI_SEQ_STATUS_MASTER: Int = 16392

public val MCI_SEQ_STATUS_NAME: Int = 16395

public val MCI_SEQ_STATUS_OFFSET: Int = 16393

public val MCI_SEQ_STATUS_PORT: Int = 16387

public val MCI_SEQ_STATUS_SLAVE: Int = 16391

public val MCI_SEQ_STATUS_TEMPO: Int = 16386

public val MCI_SET: UInt = 2061u

public val MCI_SETAUDIO: UInt = 2163u

public val MCI_SETVIDEO: UInt = 2166u

public val MCI_SET_AUDIO: Int = 2048

public val MCI_SET_AUDIO_ALL: Int = 0

public val MCI_SET_AUDIO_LEFT: Int = 1

public val MCI_SET_AUDIO_RIGHT: Int = 2

public val MCI_SET_DOOR_CLOSED: Int = 512

public val MCI_SET_DOOR_OPEN: Int = 256

public val MCI_SET_OFF: Int = 16384

public val MCI_SET_ON: Int = 8192

public val MCI_SET_TIME_FORMAT: Int = 1024

public val MCI_SET_VIDEO: Int = 4096

public val MCI_SIGNAL: UInt = 2165u

public val MCI_SPIN: UInt = 2060u

public val MCI_STATUS: UInt = 2068u

public val MCI_STATUS_CURRENT_TRACK: Int = 8

public val MCI_STATUS_ITEM: Int = 256

public val MCI_STATUS_LENGTH: Int = 1

public val MCI_STATUS_MEDIA_PRESENT: Int = 5

public val MCI_STATUS_MODE: Int = 4

public val MCI_STATUS_NUMBER_OF_TRACKS: Int = 3

public val MCI_STATUS_POSITION: Int = 2

public val MCI_STATUS_READY: Int = 7

public val MCI_STATUS_START: Int = 512

public val MCI_STATUS_TIME_FORMAT: Int = 6

public val MCI_STEP: UInt = 2062u

public val MCI_STOP: UInt = 2056u

public val MCI_STRING: UInt = 1u

public val MCI_SYSINFO: UInt = 2064u

public val MCI_SYSINFO_INSTALLNAME: Int = 2048

public val MCI_SYSINFO_NAME: Int = 1024

public val MCI_SYSINFO_OPEN: Int = 512

public val MCI_SYSINFO_QUANTITY: Int = 256

public val MCI_TEST: Int = 32

public val MCI_TO: Int = 8

public val MCI_TRACK: Int = 16

public val MCI_TRUE: UInt = 532u

public val MCI_UNDO: UInt = 2169u

public val MCI_UNFREEZE: UInt = 2117u

public val MCI_UPDATE: UInt = 2132u

public val MCI_USER_MESSAGES: UInt = 3072u

public val MCI_VD_ESCAPE_STRING: Int = 256

public val MCI_VD_FORMAT_TRACK: UInt = 16385u

public val MCI_VD_FORMAT_TRACK_S: UInt = 1029u

public val MCI_VD_GETDEVCAPS_CAN_REVERSE: Int = 16386

public val MCI_VD_GETDEVCAPS_CAV: Int = 131072

public val MCI_VD_GETDEVCAPS_CLV: Int = 65536

public val MCI_VD_GETDEVCAPS_FAST_RATE: Int = 16387

public val MCI_VD_GETDEVCAPS_NORMAL_RATE: Int = 16389

public val MCI_VD_GETDEVCAPS_SLOW_RATE: Int = 16388

public val MCI_VD_MEDIA_CAV: UInt = 1027u

public val MCI_VD_MEDIA_CLV: UInt = 1026u

public val MCI_VD_MEDIA_OTHER: UInt = 1028u

public val MCI_VD_MODE_PARK: UInt = 1025u

public val MCI_VD_PLAY_FAST: Int = 131072

public val MCI_VD_PLAY_REVERSE: Int = 65536

public val MCI_VD_PLAY_SCAN: Int = 524288

public val MCI_VD_PLAY_SLOW: Int = 1048576

public val MCI_VD_PLAY_SPEED: Int = 262144

public val MCI_VD_SEEK_REVERSE: Int = 65536

public val MCI_VD_SPIN_DOWN: Int = 131072

public val MCI_VD_SPIN_UP: Int = 65536

public val MCI_VD_STATUS_DISC_SIZE: Int = 16390

public val MCI_VD_STATUS_FORWARD: Int = 16387

public val MCI_VD_STATUS_MEDIA_TYPE: Int = 16388

public val MCI_VD_STATUS_SIDE: Int = 16389

public val MCI_VD_STATUS_SPEED: Int = 16386

public val MCI_VD_STEP_FRAMES: Int = 65536

public val MCI_VD_STEP_REVERSE: Int = 131072

public val MCI_WAIT: Int = 2

public val MCI_WAVE_GETDEVCAPS_INPUTS: Int = 16385

public val MCI_WAVE_GETDEVCAPS_OUTPUTS: Int = 16386

public val MCI_WAVE_INPUT: Int = 4194304

public val MCI_WAVE_MAPPER: UInt = 1153u

public val MCI_WAVE_OPEN_BUFFER: Int = 65536

public val MCI_WAVE_OUTPUT: Int = 8388608

public val MCI_WAVE_PCM: UInt = 1152u

public val MCI_WAVE_SET_ANYINPUT: Int = 67108864

public val MCI_WAVE_SET_ANYOUTPUT: Int = 134217728

public val MCI_WAVE_SET_AVGBYTESPERSEC: Int = 524288

public val MCI_WAVE_SET_BITSPERSAMPLE: Int = 2097152

public val MCI_WAVE_SET_BLOCKALIGN: Int = 1048576

public val MCI_WAVE_SET_CHANNELS: Int = 131072

public val MCI_WAVE_SET_FORMATTAG: Int = 65536

public val MCI_WAVE_SET_SAMPLESPERSEC: Int = 262144

public val MCI_WAVE_STATUS_AVGBYTESPERSEC: Int = 16388

public val MCI_WAVE_STATUS_BITSPERSAMPLE: Int = 16390

public val MCI_WAVE_STATUS_BLOCKALIGN: Int = 16389

public val MCI_WAVE_STATUS_CHANNELS: Int = 16386

public val MCI_WAVE_STATUS_FORMATTAG: Int = 16385

public val MCI_WAVE_STATUS_LEVEL: Int = 16391

public val MCI_WAVE_STATUS_SAMPLESPERSEC: Int = 16387

public val MCI_WHERE: UInt = 2115u

public val MCI_WINDOW: UInt = 2113u

public val MCMADM_E_REGKEY_NOT_FOUND: Hresult = 0xC00D006Au.toInt()

public val MCMADM_I_NO_EVENTS: Hresult = 0x400D0069u.toInt()

public val MIDIMAPPER_S: UInt = 1227u

public val MIDI_IO_COOKED: Int = 2

public val MIDI_IO_PACKED: Int = 0

public val MIDM_ADDBUFFER: UInt = 59u

public val MIDM_CLOSE: UInt = 56u

public val MIDM_GETDEVCAPS: UInt = 54u

public val MIDM_GETNUMDEVS: UInt = 53u

public val MIDM_INIT: UInt = 100u

public val MIDM_INIT_EX: UInt = 104u

public val MIDM_MAPPER: UInt = 8192u

public val MIDM_OPEN: UInt = 55u

public val MIDM_PREPARE: UInt = 57u

public val MIDM_RESET: UInt = 62u

public val MIDM_START: UInt = 60u

public val MIDM_STOP: UInt = 61u

public val MIDM_UNPREPARE: UInt = 58u

public val MIDM_USER: UInt = 16384u

public val MIXERCONTROL_CONTROLTYPE_SRS_MTS: UInt = 536936454u

public val MIXERCONTROL_CONTROLTYPE_SRS_ONOFF: UInt = 536936455u

public val MIXERCONTROL_CONTROLTYPE_SRS_SYNTHSELECT: UInt = 536936456u

public val MMIOERR_ACCESSDENIED: UInt = 268u

public val MMIOERR_BASE: UInt = 256u

public val MMIOERR_CANNOTCLOSE: UInt = 260u

public val MMIOERR_CANNOTEXPAND: UInt = 264u

public val MMIOERR_CANNOTOPEN: UInt = 259u

public val MMIOERR_CANNOTREAD: UInt = 261u

public val MMIOERR_CANNOTSEEK: UInt = 263u

public val MMIOERR_CANNOTWRITE: UInt = 262u

public val MMIOERR_CHUNKNOTFOUND: UInt = 265u

public val MMIOERR_FILENOTFOUND: UInt = 257u

public val MMIOERR_INVALIDFILE: UInt = 272u

public val MMIOERR_NETWORKERROR: UInt = 270u

public val MMIOERR_OUTOFMEMORY: UInt = 258u

public val MMIOERR_PATHNOTFOUND: UInt = 267u

public val MMIOERR_SHARINGVIOLATION: UInt = 269u

public val MMIOERR_TOOMANYOPENFILES: UInt = 271u

public val MMIOERR_UNBUFFERED: UInt = 266u

public val MMIOM_CLOSE: UInt = 4u

public val MMIOM_OPEN: UInt = 3u

public val MMIOM_READ: UInt = 0u

public val MMIOM_RENAME: UInt = 6u

public val MMIOM_SEEK: UInt = 2u

public val MMIOM_USER: UInt = 32768u

public val MMIOM_WRITE: UInt = 1u

public val MMIOM_WRITEFLUSH: UInt = 5u

public val MMIO_ALLOCBUF: UInt = 65536u

public val MMIO_COMPAT: UInt = 0u

public val MMIO_CREATE: UInt = 4096u

public val MMIO_CREATELIST: UInt = 64u

public val MMIO_CREATERIFF: UInt = 32u

public val MMIO_DEFAULTBUFFER: UInt = 8192u

public val MMIO_DELETE: UInt = 512u

public val MMIO_DENYNONE: UInt = 64u

public val MMIO_DENYREAD: UInt = 48u

public val MMIO_DENYWRITE: UInt = 32u

public val MMIO_DIRTY: UInt = 268435456u

public val MMIO_EMPTYBUF: UInt = 16u

public val MMIO_EXCLUSIVE: UInt = 16u

public val MMIO_EXIST: UInt = 16384u

public val MMIO_FHOPEN: UInt = 16u

public val MMIO_FINDCHUNK: UInt = 16u

public val MMIO_FINDLIST: UInt = 64u

public val MMIO_FINDPROC: UInt = 262144u

public val MMIO_FINDRIFF: UInt = 32u

public val MMIO_GETTEMP: UInt = 131072u

public val MMIO_GLOBALPROC: UInt = 268435456u

public val MMIO_INSTALLPROC: UInt = 65536u

public val MMIO_PARSE: UInt = 256u

public val MMIO_READ: UInt = 0u

public val MMIO_READWRITE: UInt = 2u

public val MMIO_REMOVEPROC: UInt = 131072u

public val MMIO_RWMODE: UInt = 3u

public val MMIO_SHAREMODE: UInt = 112u

public val MMIO_TOUPPER: UInt = 16u

public val MMIO_UNICODEPROC: UInt = 16777216u

public val MMIO_WRITE: UInt = 1u

public val MM_3COM: UInt = 260u

public val MM_3COM_CB_MIXER: UInt = 1u

public val MM_3COM_CB_WAVEIN: UInt = 2u

public val MM_3COM_CB_WAVEOUT: UInt = 3u

public val MM_3DFX: UInt = 262u

public val MM_AARDVARK: UInt = 11u

public val MM_AARDVARK_STUDIO12_WAVEIN: UInt = 2u

public val MM_AARDVARK_STUDIO12_WAVEOUT: UInt = 1u

public val MM_AARDVARK_STUDIO88_WAVEIN: UInt = 4u

public val MM_AARDVARK_STUDIO88_WAVEOUT: UInt = 3u

public val MM_ACTIVEVOICE: UInt = 225u

public val MM_ACTIVEVOICE_ACM_VOXADPCM: UInt = 1u

public val MM_ACULAB: UInt = 14u

public val MM_ADDX: UInt = 118u

public val MM_ADDX_PCTV_AUX_CD: UInt = 5u

public val MM_ADDX_PCTV_AUX_LINE: UInt = 6u

public val MM_ADDX_PCTV_DIGITALMIX: UInt = 1u

public val MM_ADDX_PCTV_MIXER: UInt = 4u

public val MM_ADDX_PCTV_WAVEIN: UInt = 2u

public val MM_ADDX_PCTV_WAVEOUT: UInt = 3u

public val MM_ADLACC: UInt = 91u

public val MM_ADMOS: UInt = 235u

public val MM_ADMOS_FM_SYNTH: UInt = 1u

public val MM_ADMOS_QS3AMIDIIN: UInt = 3u

public val MM_ADMOS_QS3AMIDIOUT: UInt = 2u

public val MM_ADMOS_QS3AWAVEIN: UInt = 5u

public val MM_ADMOS_QS3AWAVEOUT: UInt = 4u

public val MM_AHEAD: UInt = 77u

public val MM_AHEAD_GENERIC: UInt = 4u

public val MM_AHEAD_MULTISOUND: UInt = 1u

public val MM_AHEAD_PROAUDIO: UInt = 3u

public val MM_AHEAD_SOUNDBLASTER: UInt = 2u

public val MM_ALARIS: UInt = 174u

public val MM_ALDIGITAL: UInt = 143u

public val MM_ALESIS: UInt = 243u

public val MM_ALGOVISION: UInt = 266u

public val MM_ALGOVISION_VB80AUX: UInt = 4u

public val MM_ALGOVISION_VB80AUX2: UInt = 5u

public val MM_ALGOVISION_VB80MIXER: UInt = 3u

public val MM_ALGOVISION_VB80WAVEIN: UInt = 2u

public val MM_ALGOVISION_VB80WAVEOUT: UInt = 1u

public val MM_AMD: UInt = 146u

public val MM_AMD_INTERWAVE_AUX1: UInt = 10u

public val MM_AMD_INTERWAVE_AUX2: UInt = 11u

public val MM_AMD_INTERWAVE_AUX_CD: UInt = 13u

public val MM_AMD_INTERWAVE_AUX_MIC: UInt = 12u

public val MM_AMD_INTERWAVE_EX_CD: UInt = 7u

public val MM_AMD_INTERWAVE_EX_TELEPHONY: UInt = 16u

public val MM_AMD_INTERWAVE_JOYSTICK: UInt = 6u

public val MM_AMD_INTERWAVE_MIDIIN: UInt = 8u

public val MM_AMD_INTERWAVE_MIDIOUT: UInt = 9u

public val MM_AMD_INTERWAVE_MIXER1: UInt = 4u

public val MM_AMD_INTERWAVE_MIXER2: UInt = 5u

public val MM_AMD_INTERWAVE_MONO_IN: UInt = 14u

public val MM_AMD_INTERWAVE_MONO_OUT: UInt = 15u

public val MM_AMD_INTERWAVE_STEREO_ENHANCED: UInt = 19u

public val MM_AMD_INTERWAVE_SYNTH: UInt = 3u

public val MM_AMD_INTERWAVE_WAVEIN: UInt = 1u

public val MM_AMD_INTERWAVE_WAVEOUT: UInt = 2u

public val MM_AMD_INTERWAVE_WAVEOUT_BASE: UInt = 17u

public val MM_AMD_INTERWAVE_WAVEOUT_TREBLE: UInt = 18u

public val MM_ANALOGDEVICES: UInt = 252u

public val MM_ANTEX: UInt = 31u

public val MM_ANTEX_AUDIOPORT22_FEEDTHRU: UInt = 9u

public val MM_ANTEX_AUDIOPORT22_WAVEIN: UInt = 7u

public val MM_ANTEX_AUDIOPORT22_WAVEOUT: UInt = 8u

public val MM_ANTEX_SX12_WAVEIN: UInt = 1u

public val MM_ANTEX_SX12_WAVEOUT: UInt = 2u

public val MM_ANTEX_SX15_WAVEIN: UInt = 3u

public val MM_ANTEX_SX15_WAVEOUT: UInt = 4u

public val MM_ANTEX_VP625_WAVEIN: UInt = 5u

public val MM_ANTEX_VP625_WAVEOUT: UInt = 6u

public val MM_APICOM: UInt = 116u

public val MM_APPLE: UInt = 99u

public val MM_APPS: UInt = 42u

public val MM_APT: UInt = 56u

public val MM_APT_ACE100CD: UInt = 1u

public val MM_ARRAY: UInt = 231u

public val MM_ARTISOFT: UInt = 20u

public val MM_ARTISOFT_SBWAVEIN: UInt = 1u

public val MM_ARTISOFT_SBWAVEOUT: UInt = 2u

public val MM_AST: UInt = 64u

public val MM_AST_MODEMWAVE_WAVEIN: UInt = 13u

public val MM_AST_MODEMWAVE_WAVEOUT: UInt = 14u

public val MM_ATI: UInt = 27u

public val MM_ATT: UInt = 185u

public val MM_ATT_G729A: UInt = 1u

public val MM_ATT_MICROELECTRONICS: UInt = 139u

public val MM_AU8820_AUX: UInt = 21u

public val MM_AU8820_MIDIIN: UInt = 23u

public val MM_AU8820_MIDIOUT: UInt = 22u

public val MM_AU8820_MIXER: UInt = 20u

public val MM_AU8820_SYNTH: UInt = 17u

public val MM_AU8820_WAVEIN: UInt = 19u

public val MM_AU8820_WAVEOUT: UInt = 18u

public val MM_AU8830_AUX: UInt = 37u

public val MM_AU8830_MIDIIN: UInt = 39u

public val MM_AU8830_MIDIOUT: UInt = 38u

public val MM_AU8830_MIXER: UInt = 36u

public val MM_AU8830_SYNTH: UInt = 33u

public val MM_AU8830_WAVEIN: UInt = 35u

public val MM_AU8830_WAVEOUT: UInt = 34u

public val MM_AUDIOFILE: UInt = 47u

public val MM_AUDIOPT: UInt = 74u

public val MM_AUDIOSCIENCE: UInt = 217u

public val MM_AURAVISION: UInt = 80u

public val MM_AUREAL: UInt = 181u

public val MM_AUREAL_AU8820: UInt = 16u

public val MM_AUREAL_AU8830: UInt = 32u

public val MM_AZTECH: UInt = 52u

public val MM_AZTECH_AUX: UInt = 404u

public val MM_AZTECH_AUX_CD: UInt = 401u

public val MM_AZTECH_AUX_LINE: UInt = 402u
