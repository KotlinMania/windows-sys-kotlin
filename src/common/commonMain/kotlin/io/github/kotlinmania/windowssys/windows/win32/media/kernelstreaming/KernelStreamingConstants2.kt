package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val KSPROPSETID_VBICAP_PROPERTIES: GUID = GUID.from_u128(U128(0xf162c6077b35496fuL, 0xad7f2dca3b46b718uL))

public val KSPROPSETID_VBICodecFiltering: GUID = GUID.from_u128(U128(0xcafeb0ca871511d0uL, 0xbd6a0035c0edbabeuL))

public val KSPROPSETID_VPConfig: GUID = GUID.from_u128(U128(0xbc29a66030e311d0uL, 0x9e6900c04fd7c15buL))

public val KSPROPSETID_VPVBIConfig: GUID = GUID.from_u128(U128(0xec529b001a1f11d1uL, 0xbad900609744111auL))

public val KSPROPSETID_VramCapture: GUID = GUID.from_u128(U128(0xe73face328804902uL, 0xb79988d0cd634e0fuL))

public val KSPROPSETID_Wave: GUID = GUID.from_u128(U128(0x924e54b0630f11cfuL, 0xada708003e30494auL))

public val KSPROPTYPESETID_General: GUID = GUID.from_u128(U128(0x97e99ba0bdea11cfuL, 0xa5d628db04c10000uL))

public val KSRATE_NOPRESENTATIONDURATION: UInt = 2u

public val KSRATE_NOPRESENTATIONSTART: UInt = 1u

public val KSRELATIVEEVENT_FLAG_HANDLE: UInt = 1u

public val KSRELATIVEEVENT_FLAG_POINTER: UInt = 2u

public val KSRESET_BEGIN: KSRESET = 0

public val KSRESET_END: KSRESET = 1

public val KSSTATE_ACQUIRE: KSSTATE = 1

public val KSSTATE_PAUSE: KSSTATE = 2

public val KSSTATE_RUN: KSSTATE = 3

public val KSSTATE_STOP: KSSTATE = 0

public val KSSTREAM_FAILUREEXCEPTION: UInt = 8192u

public val KSSTREAM_HEADER_OPTIONSF_BUFFEREDTRANSFER: UInt = 1024u

public val KSSTREAM_HEADER_OPTIONSF_DATADISCONTINUITY: UInt = 4u

public val KSSTREAM_HEADER_OPTIONSF_DURATIONVALID: UInt = 256u

public val KSSTREAM_HEADER_OPTIONSF_ENDOFPHOTOSEQUENCE: UInt = 8192u

public val KSSTREAM_HEADER_OPTIONSF_ENDOFSTREAM: UInt = 512u

public val KSSTREAM_HEADER_OPTIONSF_FLUSHONPAUSE: UInt = 128u

public val KSSTREAM_HEADER_OPTIONSF_FRAMEINFO: UInt = 16384u

public val KSSTREAM_HEADER_OPTIONSF_LOOPEDDATA: UInt = 2147483648u

public val KSSTREAM_HEADER_OPTIONSF_METADATA: UInt = 4096u

public val KSSTREAM_HEADER_OPTIONSF_PERSIST_SAMPLE: UInt = 32768u

public val KSSTREAM_HEADER_OPTIONSF_PREROLL: UInt = 2u

public val KSSTREAM_HEADER_OPTIONSF_SAMPLE_PERSISTED: UInt = 65536u

public val KSSTREAM_HEADER_OPTIONSF_SECUREBUFFERTRANSFER: UInt = 262144u

public val KSSTREAM_HEADER_OPTIONSF_SPLICEPOINT: UInt = 1u

public val KSSTREAM_HEADER_OPTIONSF_TIMEDISCONTINUITY: UInt = 64u

public val KSSTREAM_HEADER_OPTIONSF_TIMEVALID: UInt = 16u

public val KSSTREAM_HEADER_OPTIONSF_TYPECHANGED: UInt = 8u

public val KSSTREAM_HEADER_OPTIONSF_VRAM_DATA_TRANSFER: UInt = 2048u

public val KSSTREAM_HEADER_TRACK_COMPLETION_NUMBERS: UInt = 131072u

public val KSSTREAM_NONPAGED_DATA: UInt = 256u

public val KSSTREAM_PAGED_DATA: UInt = 0u

public val KSSTREAM_READ: UInt = 0u

public val KSSTREAM_SYNCHRONOUS: UInt = 4096u

public val KSSTREAM_UVC_SECURE_ATTRIBUTE_SIZE: UInt = 8192u

public val KSSTREAM_WRITE: UInt = 1u

public val KSSTRING_Allocator: PCWSTR = w("{642F5D00-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_AllocatorEx: PCWSTR = w("{091BB63B-603F-11D1-B067-00A0C9062802}")

public val KSSTRING_Clock: PCWSTR = w("{53172480-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_Filter: PCWSTR = w("{9B365890-165F-11D0-A195-0020AFD156E4}")

public val KSSTRING_Pin: PCWSTR = w("{146F1A80-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_TopologyNode: PCWSTR = w("{0621061A-EE75-11D0-B915-00A0C9223196}")

public val KSTIME_FORMAT_BYTE: GUID = GUID.from_u128(U128(0x7b7855718c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_FIELD: GUID = GUID.from_u128(U128(0x7b7855738c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_FRAME: GUID = GUID.from_u128(U128(0x7b7855708c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_MEDIA_TIME: GUID = GUID.from_u128(U128(0x7b7855748c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_SAMPLE: GUID = GUID.from_u128(U128(0x7b7855728c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSWAVE_BUFFER_ATTRIBUTEF_LOOPING: UInt = 1u

public val KSWAVE_BUFFER_ATTRIBUTEF_STATIC: UInt = 2u

public val KSWAVE_COMPATCAPS_INPUT: UInt = 0u

public val KSWAVE_COMPATCAPS_OUTPUT: UInt = 1u

public val KS_AMCONTROL_COLORINFO_PRESENT: UInt = 128u

public val KS_AMCONTROL_PAD_TO_16x9: UInt = 4u

public val KS_AMCONTROL_PAD_TO_4x3: UInt = 2u

public val KS_AMCONTROL_USED: UInt = 1u

public val KS_AMVP_BEST_BANDWIDTH: KS_AMVP_SELECTFORMATBY = 1

public val KS_AMVP_DO_NOT_CARE: KS_AMVP_SELECTFORMATBY = 0

public val KS_AMVP_INPUT_SAME_AS_OUTPUT: KS_AMVP_SELECTFORMATBY = 2

public val KS_AMVP_MODE_BOBINTERLEAVED: KS_AMVP_MODE = 1

public val KS_AMVP_MODE_BOBNONINTERLEAVED: KS_AMVP_MODE = 2

public val KS_AMVP_MODE_SKIPEVEN: KS_AMVP_MODE = 3

public val KS_AMVP_MODE_SKIPODD: KS_AMVP_MODE = 4

public val KS_AMVP_MODE_WEAVE: KS_AMVP_MODE = 0

public val KS_AM_RATE_ExactRateChange: KS_AM_PROPERTY_TS_RATE_CHANGE = 2

public val KS_AM_RATE_MaxFullDataRate: KS_AM_PROPERTY_TS_RATE_CHANGE = 3

public val KS_AM_RATE_SimpleRateChange: KS_AM_PROPERTY_TS_RATE_CHANGE = 1

public val KS_AM_RATE_Step: KS_AM_PROPERTY_TS_RATE_CHANGE = 4

public val KS_AM_UseNewCSSKey: Int = 1

public val KS_AnalogVideo_NTSC_433: KS_AnalogVideoStandard = 4

public val KS_AnalogVideo_NTSC_M: KS_AnalogVideoStandard = 1

public val KS_AnalogVideo_NTSC_M_J: KS_AnalogVideoStandard = 2

public val KS_AnalogVideo_NTSC_Mask: UInt = 7u

public val KS_AnalogVideo_None: KS_AnalogVideoStandard = 0

public val KS_AnalogVideo_PAL_60: KS_AnalogVideoStandard = 2048

public val KS_AnalogVideo_PAL_B: KS_AnalogVideoStandard = 16

public val KS_AnalogVideo_PAL_D: KS_AnalogVideoStandard = 32

public val KS_AnalogVideo_PAL_G: KS_AnalogVideoStandard = 64

public val KS_AnalogVideo_PAL_H: KS_AnalogVideoStandard = 128

public val KS_AnalogVideo_PAL_I: KS_AnalogVideoStandard = 256

public val KS_AnalogVideo_PAL_M: KS_AnalogVideoStandard = 512

public val KS_AnalogVideo_PAL_Mask: UInt = 1052656u

public val KS_AnalogVideo_PAL_N: KS_AnalogVideoStandard = 1024

public val KS_AnalogVideo_PAL_N_COMBO: KS_AnalogVideoStandard = 1048576

public val KS_AnalogVideo_SECAM_B: KS_AnalogVideoStandard = 4096

public val KS_AnalogVideo_SECAM_D: KS_AnalogVideoStandard = 8192

public val KS_AnalogVideo_SECAM_G: KS_AnalogVideoStandard = 16384

public val KS_AnalogVideo_SECAM_H: KS_AnalogVideoStandard = 32768

public val KS_AnalogVideo_SECAM_K: KS_AnalogVideoStandard = 65536

public val KS_AnalogVideo_SECAM_K1: KS_AnalogVideoStandard = 131072

public val KS_AnalogVideo_SECAM_L: KS_AnalogVideoStandard = 262144

public val KS_AnalogVideo_SECAM_L1: KS_AnalogVideoStandard = 524288

public val KS_AnalogVideo_SECAM_Mask: UInt = 1044480u

public val KS_BI_BITFIELDS: Int = 3

public val KS_BI_JPEG: Int = 4

public val KS_BI_RGB: Int = 0

public val KS_BI_RLE4: Int = 2

public val KS_BI_RLE8: Int = 1

public val KS_CAMERACONTROL_ASYNC_RESET: KS_CameraControlAsyncOperation = 3

public val KS_CAMERACONTROL_ASYNC_START: KS_CameraControlAsyncOperation = 1

public val KS_CAMERACONTROL_ASYNC_STOP: KS_CameraControlAsyncOperation = 2

public val KS_CAPTURE_ALLOC_INVALID: CAPTURE_MEMORY_ALLOCATION_FLAGS = 0

public val KS_CAPTURE_ALLOC_SECURE_BUFFER: CAPTURE_MEMORY_ALLOCATION_FLAGS = 16

public val KS_CAPTURE_ALLOC_SYSTEM: CAPTURE_MEMORY_ALLOCATION_FLAGS = 1

public val KS_CAPTURE_ALLOC_SYSTEM_AGP: CAPTURE_MEMORY_ALLOCATION_FLAGS = 4

public val KS_CAPTURE_ALLOC_VRAM: CAPTURE_MEMORY_ALLOCATION_FLAGS = 2

public val KS_CAPTURE_ALLOC_VRAM_MAPPED: CAPTURE_MEMORY_ALLOCATION_FLAGS = 8

public val KS_CC_SUBSTREAM_EVEN: Int = 2

public val KS_CC_SUBSTREAM_FIELD1_MASK: Int = 240

public val KS_CC_SUBSTREAM_FIELD2_MASK: Int = 7936

public val KS_CC_SUBSTREAM_ODD: Int = 1

public val KS_CC_SUBSTREAM_SERVICE_CC1: Int = 16

public val KS_CC_SUBSTREAM_SERVICE_CC2: Int = 32

public val KS_CC_SUBSTREAM_SERVICE_CC3: Int = 256

public val KS_CC_SUBSTREAM_SERVICE_CC4: Int = 512

public val KS_CC_SUBSTREAM_SERVICE_T1: Int = 64

public val KS_CC_SUBSTREAM_SERVICE_T2: Int = 128

public val KS_CC_SUBSTREAM_SERVICE_T3: Int = 1024

public val KS_CC_SUBSTREAM_SERVICE_T4: Int = 2048

public val KS_CC_SUBSTREAM_SERVICE_XDS: Int = 4096

public val KS_COPYPROTECT_RestrictDuplication: UInt = 1u

public val KS_CompressionCaps_CanBFrame: KS_CompressionCaps = 8

public val KS_CompressionCaps_CanCrunch: KS_CompressionCaps = 2

public val KS_CompressionCaps_CanKeyFrame: KS_CompressionCaps = 4

public val KS_CompressionCaps_CanQuality: KS_CompressionCaps = 1

public val KS_CompressionCaps_CanWindow: KS_CompressionCaps = 16

public val KS_DVDCOPYSTATE_AUTHENTICATION_NOT_REQUIRED: KS_DVDCOPYSTATE = 2

public val KS_DVDCOPYSTATE_AUTHENTICATION_REQUIRED: KS_DVDCOPYSTATE = 3

public val KS_DVDCOPYSTATE_DONE: KS_DVDCOPYSTATE = 4

public val KS_DVDCOPYSTATE_INITIALIZE: KS_DVDCOPYSTATE = 0

public val KS_DVDCOPYSTATE_INITIALIZE_TITLE: KS_DVDCOPYSTATE = 1

public val KS_DVD_CGMS_COPY_ONCE: UInt = 16u

public val KS_DVD_CGMS_COPY_PERMITTED: UInt = 0u

public val KS_DVD_CGMS_COPY_PROTECT_MASK: UInt = 24u

public val KS_DVD_CGMS_NO_COPY: UInt = 24u

public val KS_DVD_CGMS_RESERVED_MASK: UInt = 120u

public val KS_DVD_COPYRIGHTED: UInt = 64u

public val KS_DVD_COPYRIGHT_MASK: UInt = 64u

public val KS_DVD_NOT_COPYRIGHTED: UInt = 0u

public val KS_DVD_SECTOR_NOT_PROTECTED: UInt = 0u

public val KS_DVD_SECTOR_PROTECTED: UInt = 32u

public val KS_DVD_SECTOR_PROTECT_MASK: UInt = 32u

public val KS_INTERLACE_1FieldPerSample: UInt = 2u

public val KS_INTERLACE_DisplayModeBobOnly: UInt = 0u

public val KS_INTERLACE_DisplayModeBobOrWeave: UInt = 128u

public val KS_INTERLACE_DisplayModeMask: UInt = 192u

public val KS_INTERLACE_DisplayModeWeaveOnly: UInt = 64u

public val KS_INTERLACE_Field1First: UInt = 4u

public val KS_INTERLACE_FieldPatBothIrregular: UInt = 48u

public val KS_INTERLACE_FieldPatBothRegular: UInt = 32u

public val KS_INTERLACE_FieldPatField1Only: UInt = 0u

public val KS_INTERLACE_FieldPatField2Only: UInt = 16u

public val KS_INTERLACE_FieldPatternMask: UInt = 48u

public val KS_INTERLACE_IsInterlaced: UInt = 1u

public val KS_INTERLACE_UNUSED: UInt = 8u

public val KS_MACROVISION_DISABLED: KS_COPY_MACROVISION_LEVEL = 0

public val KS_MACROVISION_LEVEL1: KS_COPY_MACROVISION_LEVEL = 1

public val KS_MACROVISION_LEVEL2: KS_COPY_MACROVISION_LEVEL = 2

public val KS_MACROVISION_LEVEL3: KS_COPY_MACROVISION_LEVEL = 3

public val KS_MAX_SIZE_MPEG1_SEQUENCE_INFO: UInt = 140u

public val KS_MPEG2Level_High: KS_MPEG2Level = 3

public val KS_MPEG2Level_High1440: KS_MPEG2Level = 2

public val KS_MPEG2Level_Low: KS_MPEG2Level = 0

public val KS_MPEG2Level_Main: KS_MPEG2Level = 1

public val KS_MPEG2Profile_High: KS_MPEG2Profile = 4

public val KS_MPEG2Profile_Main: KS_MPEG2Profile = 1

public val KS_MPEG2Profile_SNRScalable: KS_MPEG2Profile = 2

public val KS_MPEG2Profile_Simple: KS_MPEG2Profile = 0

public val KS_MPEG2Profile_SpatiallyScalable: KS_MPEG2Profile = 3

public val KS_MPEG2_27MhzTimebase: UInt = 256u

public val KS_MPEG2_DSS_UserData: UInt = 64u

public val KS_MPEG2_DVB_UserData: UInt = 128u

public val KS_MPEG2_DVDLine21Field1: UInt = 2u

public val KS_MPEG2_DVDLine21Field2: UInt = 4u

public val KS_MPEG2_DoPanScan: UInt = 1u

public val KS_MPEG2_FilmCameraMode: UInt = 16u

public val KS_MPEG2_LetterboxAnalogOut: UInt = 32u

public val KS_MPEG2_SourceIsLetterboxed: UInt = 8u

public val KS_MPEG2_WidescreenAnalogOut: UInt = 512u

public val KS_MPEGAUDIOINFO_27MhzTimebase: UInt = 1u

public val KS_MemoryTypeAnyHost: KS_LogicalMemoryType = 6

public val KS_MemoryTypeDeviceHostMapped: KS_LogicalMemoryType = 3

public val KS_MemoryTypeDeviceSpecific: KS_LogicalMemoryType = 4

public val KS_MemoryTypeDontCare: KS_LogicalMemoryType = 0

public val KS_MemoryTypeKernelNonPaged: KS_LogicalMemoryType = 2

public val KS_MemoryTypeKernelPaged: KS_LogicalMemoryType = 1

public val KS_MemoryTypeUser: KS_LogicalMemoryType = 5

public val KS_NABTS_GROUPID_LOCAL_CABLE_SYSTEM_ADVERTISER_BASE: UInt = 2224u

public val KS_NABTS_GROUPID_LOCAL_CABLE_SYSTEM_CONTENT_BASE: UInt = 2208u

public val KS_NABTS_GROUPID_MICROSOFT_RESERVED_TEST_DATA_BASE: UInt = 2288u

public val KS_NABTS_GROUPID_NETWORK_WIDE_ADVERTISER_BASE: UInt = 2160u

public val KS_NABTS_GROUPID_NETWORK_WIDE_CONTENT_BASE: UInt = 2144u

public val KS_NABTS_GROUPID_ORIGINAL_CONTENT_ADVERTISER_BASE: UInt = 2064u

public val KS_NABTS_GROUPID_ORIGINAL_CONTENT_BASE: UInt = 2048u

public val KS_NABTS_GROUPID_PRODUCTION_COMPANY_ADVERTISER_BASE: UInt = 2096u

public val KS_NABTS_GROUPID_PRODUCTION_COMPANY_CONTENT_BASE: UInt = 2080u

public val KS_NABTS_GROUPID_SYNDICATED_SHOW_ADVERTISER_BASE: UInt = 2128u

public val KS_NABTS_GROUPID_SYNDICATED_SHOW_CONTENT_BASE: UInt = 2112u

public val KS_NABTS_GROUPID_TELEVISION_STATION_ADVERTISER_BASE: UInt = 2192u

public val KS_NABTS_GROUPID_TELEVISION_STATION_CONTENT_BASE: UInt = 2176u

public val KS_Obsolete_VideoControlFlag_ExternalTriggerEnable: KS_VideoControlFlags = 16

public val KS_Obsolete_VideoControlFlag_Trigger: KS_VideoControlFlags = 32

public val KS_PhysConn_Audio_1394: KS_PhysicalConnectorType = 4103

public val KS_PhysConn_Audio_AESDigital: KS_PhysicalConnectorType = 4099

public val KS_PhysConn_Audio_AUX: KS_PhysicalConnectorType = 4102

public val KS_PhysConn_Audio_AudioDecoder: KS_PhysicalConnectorType = 4105

public val KS_PhysConn_Audio_Line: KS_PhysicalConnectorType = 4097

public val KS_PhysConn_Audio_Mic: KS_PhysicalConnectorType = 4098

public val KS_PhysConn_Audio_SCSI: KS_PhysicalConnectorType = 4101

public val KS_PhysConn_Audio_SPDIFDigital: KS_PhysicalConnectorType = 4100

public val KS_PhysConn_Audio_Tuner: KS_PhysicalConnectorType = 4096

public val KS_PhysConn_Audio_USB: KS_PhysicalConnectorType = 4104

public val KS_PhysConn_Video_1394: KS_PhysicalConnectorType = 10

public val KS_PhysConn_Video_AUX: KS_PhysicalConnectorType = 9

public val KS_PhysConn_Video_Composite: KS_PhysicalConnectorType = 2

public val KS_PhysConn_Video_ParallelDigital: KS_PhysicalConnectorType = 7

public val KS_PhysConn_Video_RGB: KS_PhysicalConnectorType = 4

public val KS_PhysConn_Video_SCART: KS_PhysicalConnectorType = 14

public val KS_PhysConn_Video_SCSI: KS_PhysicalConnectorType = 8

public val KS_PhysConn_Video_SVideo: KS_PhysicalConnectorType = 3

public val KS_PhysConn_Video_SerialDigital: KS_PhysicalConnectorType = 6

public val KS_PhysConn_Video_Tuner: KS_PhysicalConnectorType = 1

public val KS_PhysConn_Video_USB: KS_PhysicalConnectorType = 11

public val KS_PhysConn_Video_VideoDecoder: KS_PhysicalConnectorType = 12

public val KS_PhysConn_Video_VideoEncoder: KS_PhysicalConnectorType = 13

public val KS_PhysConn_Video_YRYBY: KS_PhysicalConnectorType = 5

public val KS_PixAspectRatio_NTSC16x9: KS_AMPixAspectRatio = 1

public val KS_PixAspectRatio_NTSC4x3: KS_AMPixAspectRatio = 0

public val KS_PixAspectRatio_PAL16x9: KS_AMPixAspectRatio = 3

public val KS_PixAspectRatio_PAL4x3: KS_AMPixAspectRatio = 2

public val KS_SECURE_CAMERA_SCENARIO_ID: GUID = GUID.from_u128(U128(0xae53fc6e8d894488uL, 0x9d2e4d008731c5fduL))

public val KS_SEEKING_AbsolutePositioning: KS_SEEKING_FLAGS = 1

public val KS_SEEKING_CanGetCurrentPos: KS_SEEKING_CAPABILITIES = 8

public val KS_SEEKING_CanGetDuration: KS_SEEKING_CAPABILITIES = 32

public val KS_SEEKING_CanGetStopPos: KS_SEEKING_CAPABILITIES = 16

public val KS_SEEKING_CanPlayBackwards: KS_SEEKING_CAPABILITIES = 64

public val KS_SEEKING_CanSeekAbsolute: KS_SEEKING_CAPABILITIES = 1

public val KS_SEEKING_CanSeekBackwards: KS_SEEKING_CAPABILITIES = 4

public val KS_SEEKING_CanSeekForwards: KS_SEEKING_CAPABILITIES = 2

public val KS_SEEKING_IncrementalPositioning: KS_SEEKING_FLAGS = 3

public val KS_SEEKING_NoPositioning: KS_SEEKING_FLAGS = 0

public val KS_SEEKING_PositioningBitsMask: KS_SEEKING_FLAGS = 3

public val KS_SEEKING_RelativePositioning: KS_SEEKING_FLAGS = 2

public val KS_SEEKING_ReturnTime: KS_SEEKING_FLAGS = 8

public val KS_SEEKING_SeekToKeyFrame: KS_SEEKING_FLAGS = 4

public val KS_StreamingHint_CompQuality: KS_VideoStreamingHints = 2048

public val KS_StreamingHint_CompWindowSize: KS_VideoStreamingHints = 4096

public val KS_StreamingHint_FrameInterval: KS_VideoStreamingHints = 256

public val KS_StreamingHint_KeyFrameRate: KS_VideoStreamingHints = 512

public val KS_StreamingHint_PFrameRate: KS_VideoStreamingHints = 1024

public val KS_TUNER_STRATEGY_DRIVER_TUNES: KS_TUNER_STRATEGY = 4

public val KS_TUNER_STRATEGY_PLL: KS_TUNER_STRATEGY = 1

public val KS_TUNER_STRATEGY_SIGNAL_STRENGTH: KS_TUNER_STRATEGY = 2

public val KS_TUNER_TUNING_COARSE: KS_TUNER_TUNING_FLAGS = 3

public val KS_TUNER_TUNING_EXACT: KS_TUNER_TUNING_FLAGS = 1

public val KS_TUNER_TUNING_FINE: KS_TUNER_TUNING_FLAGS = 2

public val KS_TVAUDIO_MODE_LANG_A: UInt = 16u

public val KS_TVAUDIO_MODE_LANG_B: UInt = 32u

public val KS_TVAUDIO_MODE_LANG_C: UInt = 64u

public val KS_TVAUDIO_MODE_MONO: UInt = 1u

public val KS_TVAUDIO_MODE_STEREO: UInt = 2u

public val KS_TVAUDIO_PRESET_LANG_A: UInt = 4096u

public val KS_TVAUDIO_PRESET_LANG_B: UInt = 8192u

public val KS_TVAUDIO_PRESET_LANG_C: UInt = 16384u

public val KS_TVAUDIO_PRESET_STEREO: UInt = 512u

public val KS_TVTUNER_CHANGE_BEGIN_TUNE: Int = 1

public val KS_TVTUNER_CHANGE_END_TUNE: Int = 2

public val KS_VBICAP_PROTECTION_MV_DETECTED: Int = 4

public val KS_VBICAP_PROTECTION_MV_HARDWARE: Int = 2

public val KS_VBICAP_PROTECTION_MV_PRESENT: Int = 1

public val KS_VBIDATARATE_CC: Int = 503493

public val KS_VBIDATARATE_NABTS: Int = 5727272

public val KS_VBI_FLAG_FIELD1: Int = 1

public val KS_VBI_FLAG_FIELD2: Int = 2

public val KS_VBI_FLAG_FRAME: Int = 0

public val KS_VBI_FLAG_MV_DETECTED: Int = 1024

public val KS_VBI_FLAG_MV_HARDWARE: Int = 512

public val KS_VBI_FLAG_MV_PRESENT: Int = 256

public val KS_VBI_FLAG_TVTUNER_CHANGE: Int = 16

public val KS_VBI_FLAG_VBIINFOHEADER_CHANGE: Int = 32

public val KS_VIDEODECODER_FLAGS_CAN_DISABLE_OUTPUT: KS_VIDEODECODER_FLAGS = 1

public val KS_VIDEODECODER_FLAGS_CAN_INDICATE_LOCKED: KS_VIDEODECODER_FLAGS = 4

public val KS_VIDEODECODER_FLAGS_CAN_USE_VCR_LOCKING: KS_VIDEODECODER_FLAGS = 2

public val KS_VIDEOSTREAM_CAPTURE: UInt = 2u

public val KS_VIDEOSTREAM_CC: UInt = 256u

public val KS_VIDEOSTREAM_EDS: UInt = 512u

public val KS_VIDEOSTREAM_IS_VPE: UInt = 32768u

public val KS_VIDEOSTREAM_NABTS: UInt = 32u

public val KS_VIDEOSTREAM_PREVIEW: UInt = 1u

public val KS_VIDEOSTREAM_STILL: UInt = 4096u

public val KS_VIDEOSTREAM_TELETEXT: UInt = 1024u

public val KS_VIDEOSTREAM_VBI: UInt = 16u

public val KS_VIDEO_ALLOC_VPE_AGP: UInt = 4u

public val KS_VIDEO_ALLOC_VPE_DISPLAY: UInt = 2u

public val KS_VIDEO_ALLOC_VPE_SYSTEM: UInt = 1u

public val KS_VIDEO_FLAG_B_FRAME: Int = 32

public val KS_VIDEO_FLAG_FIELD1: Int = 1

public val KS_VIDEO_FLAG_FIELD1FIRST: Int = 4

public val KS_VIDEO_FLAG_FIELD2: Int = 2

public val KS_VIDEO_FLAG_FIELD_MASK: Int = 3

public val KS_VIDEO_FLAG_FRAME: Int = 0

public val KS_VIDEO_FLAG_IPB_MASK: Int = 48

public val KS_VIDEO_FLAG_I_FRAME: Int = 0

public val KS_VIDEO_FLAG_P_FRAME: Int = 16

public val KS_VIDEO_FLAG_REPEAT_FIELD: Int = 64

public val KS_VIDEO_FLAG_WEAVE: Int = 8

public val KS_VideoControlFlag_ExternalTriggerEnable: KS_VideoControlFlags = 4

public val KS_VideoControlFlag_FlipHorizontal: KS_VideoControlFlags = 1

public val KS_VideoControlFlag_FlipVertical: KS_VideoControlFlags = 2

public val KS_VideoControlFlag_IndependentImagePin: KS_VideoControlFlags = 64

public val KS_VideoControlFlag_StartPhotoSequenceCapture: KS_VideoControlFlags = 256

public val KS_VideoControlFlag_StillCapturePreviewFrame: KS_VideoControlFlags = 128

public val KS_VideoControlFlag_StopPhotoSequenceCapture: KS_VideoControlFlags = 512

public val KS_VideoControlFlag_Trigger: KS_VideoControlFlags = 8

public val KS_iBLUE: UInt = 2u

public val KS_iEGA_COLORS: UInt = 16u

public val KS_iGREEN: UInt = 1u

public val KS_iMASK_COLORS: UInt = 3u

public val KS_iMAXBITS: UInt = 8u

public val KS_iPALETTE: UInt = 8u

public val KS_iPALETTE_COLORS: UInt = 256u

public val KS_iRED: UInt = 0u

public val KS_iTRUECOLOR: UInt = 16u

public val KsAllocatorMode_Kernel: KSALLOCATORMODE = 1

public val KsAllocatorMode_User: KSALLOCATORMODE = 0

public val KsIoOperation_Read: KSIOOPERATION = 1

public val KsIoOperation_Write: KSIOOPERATION = 0

public val KsPeekOperation_AddRef: KSPEEKOPERATION = 1

public val KsPeekOperation_PeekOnly: KSPEEKOPERATION = 0

public val LIGHT_FILTER: KSDS3D_HRTF_FILTER_QUALITY = 1

public val MAX_NABTS_VBI_LINES_PER_FIELD: UInt = 11u

public val MAX_RESOURCEGROUPID_LENGTH: UInt = 256u

public val MAX_SINK_DESCRIPTION_NAME_LENGTH: UInt = 32u

public val MAX_WST_VBI_LINES_PER_FIELD: UInt = 17u

public val MIN_DEV_VER_FOR_FLAGS: UInt = 272u

public val MIN_DEV_VER_FOR_QI: UInt = 256u

public val MetadataId_BackgroundSegmentationMask: KSCAMERA_MetadataId = 8

public val MetadataId_CameraExtrinsics: KSCAMERA_MetadataId = 4

public val MetadataId_CameraIntrinsics: KSCAMERA_MetadataId = 5

public val MetadataId_CaptureStats: KSCAMERA_MetadataId = 3

public val MetadataId_Custom_Start: KSCAMERA_MetadataId = -2147483648

public val MetadataId_DigitalWindow: KSCAMERA_MetadataId = 7

public val MetadataId_FrameIllumination: KSCAMERA_MetadataId = 6

public val MetadataId_PhotoConfirmation: KSCAMERA_MetadataId = 1

public val MetadataId_Standard_End: KSCAMERA_MetadataId = 8

public val MetadataId_Standard_Start: KSCAMERA_MetadataId = 1

public val MetadataId_UsbVideoHeader: KSCAMERA_MetadataId = 2

public val NABTS_BUFFER_PICTURENUMBER_SUPPORT: UInt = 1u

public val NABTS_BYTES_PER_LINE: UInt = 36u

public val NABTS_LINES_PER_BUNDLE: UInt = 16u

public val NABTS_PAYLOAD_PER_LINE: UInt = 28u

public val NANOSECONDS: UInt = 10000000u

public val PINNAME_DISPLAYPORT_OUT: GUID = GUID.from_u128(U128(0x21fbb3291a4a48dauL, 0xa0762318a3c59b26uL))

public val PINNAME_HDMI_OUT: GUID = GUID.from_u128(U128(0x387bfc03e7ef4901uL, 0x86e035b7c32b00efuL))

public val PINNAME_IMAGE: GUID = GUID.from_u128(U128(0x38a0cd98d49b4ce8uL, 0xb48a344667a17830uL))

public val PINNAME_SPDIF_IN: GUID = GUID.from_u128(U128(0x15dc902522ad41b3uL, 0x8875f4ceb0299e20uL))

public val PINNAME_SPDIF_OUT: GUID = GUID.from_u128(U128(0x3a264481e52c4b82uL, 0x8e7ac8e2f91dc380uL))

public val PINNAME_VIDEO_ANALOGVIDEOIN: GUID = GUID.from_u128(U128(0xfb6c4283035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CAPTURE: GUID = GUID.from_u128(U128(0xfb6c4281035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CC: GUID = GUID.from_u128(U128(0xfb6c4289035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CC_CAPTURE: GUID = GUID.from_u128(U128(0x1aad8061012d11d2uL, 0xb4b100a0d102cfbeuL))

public val PINNAME_VIDEO_EDS: GUID = GUID.from_u128(U128(0xfb6c4287035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_NABTS: GUID = GUID.from_u128(U128(0xfb6c4286035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_NABTS_CAPTURE: GUID = GUID.from_u128(U128(0x29703660498a11d2uL, 0xb4b100a0d102cfbeuL))

public val PINNAME_VIDEO_PREVIEW: GUID = GUID.from_u128(U128(0xfb6c4282035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_STILL: GUID = GUID.from_u128(U128(0xfb6c428a035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_TELETEXT: GUID = GUID.from_u128(U128(0xfb6c4288035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_TIMECODE: GUID = GUID.from_u128(U128(0xfb6c428b035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VBI: GUID = GUID.from_u128(U128(0xfb6c4284035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VIDEOPORT: GUID = GUID.from_u128(U128(0xfb6c4285035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VIDEOPORT_VBI: GUID = GUID.from_u128(U128(0xfb6c428c035311d1uL, 0x905f0000c0cc16bauL))

public val PROPSETID_ALLOCATOR_CONTROL: GUID = GUID.from_u128(U128(0x53171960148e11d2uL, 0x99790000c0cc16bauL))

public val PROPSETID_EXT_DEVICE: GUID = GUID.from_u128(U128(0xb5730a901a2c11cfuL, 0x8c2300aa006b6814uL))

public val PROPSETID_EXT_TRANSPORT: GUID = GUID.from_u128(U128(0xa03cd5f0304511cfuL, 0x8c4400aa006b6814uL))

public val PROPSETID_TIMECODE_READER: GUID = GUID.from_u128(U128(0x9b496ce1811b11cfuL, 0x8c7700aa006b6814uL))

public val PROPSETID_TUNER: GUID = GUID.from_u128(U128(0x6a2e060528e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_CAMERACONTROL: GUID = GUID.from_u128(U128(0xc6e1337030ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_FLASH: GUID = GUID.from_u128(U128(0x785e8f4963a24144uL, 0xab70ffb278fa26ceuL))

public val PROPSETID_VIDCAP_CAMERACONTROL_IMAGE_PIN_CAPABILITY: GUID = GUID.from_u128(U128(0x9d3d7bbf5c6d4138uL, 0xbb00584edd20f7c5uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_REGION_OF_INTEREST: GUID = GUID.from_u128(U128(0x9d12d198f86c4feduL, 0xb0235d87653da793uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_VIDEO_STABILIZATION: GUID = GUID.from_u128(U128(0x43964bd37716404euL, 0x8be1d299b20e50fduL))

public val PROPSETID_VIDCAP_CROSSBAR: GUID = GUID.from_u128(U128(0x6a2e064028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_DROPPEDFRAMES: GUID = GUID.from_u128(U128(0xc6e1334430ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_SELECTOR: GUID = GUID.from_u128(U128(0x1abdaeca68b64f83uL, 0x9371b413907c7b9fuL))

public val PROPSETID_VIDCAP_TVAUDIO: GUID = GUID.from_u128(U128(0x6a2e065028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOCOMPRESSION: GUID = GUID.from_u128(U128(0xc6e1334330ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOCONTROL: GUID = GUID.from_u128(U128(0x6a2e067028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEODECODER: GUID = GUID.from_u128(U128(0xc6e1335030ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOENCODER: GUID = GUID.from_u128(U128(0x6a2e061028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOPROCAMP: GUID = GUID.from_u128(U128(0xc6e1336030ac11d0uL, 0xa18c00a0c9118956uL))

public val PipeFactor_Align: UInt = 512u

public val PipeFactor_Buffers: UInt = 256u

public val PipeFactor_FixedCompression: UInt = 64u

public val PipeFactor_Flags: UInt = 8u

public val PipeFactor_LogicalEnd: UInt = 2048u

public val PipeFactor_MemoryTypes: UInt = 4u

public val PipeFactor_None: UInt = 0u

public val PipeFactor_OptimalRanges: UInt = 32u

public val PipeFactor_PhysicalEnd: UInt = 1024u

public val PipeFactor_PhysicalRanges: UInt = 16u

public val PipeFactor_UnknownCompression: UInt = 128u

public val PipeFactor_UserModeDownstream: UInt = 2u

public val PipeFactor_UserModeUpstream: UInt = 1u

public val PipeState_CompressionUnknown: PIPE_STATE = 3

public val PipeState_DontCare: PIPE_STATE = 0

public val PipeState_Finalized: PIPE_STATE = 4

public val PipeState_RangeFixed: PIPE_STATE = 2

public val PipeState_RangeNotFixed: PIPE_STATE = 1

public val Pipe_Allocator_FirstPin: PIPE_ALLOCATOR_PLACE = 1

public val Pipe_Allocator_LastPin: PIPE_ALLOCATOR_PLACE = 2

public val Pipe_Allocator_MiddlePin: PIPE_ALLOCATOR_PLACE = 3

public val Pipe_Allocator_None: PIPE_ALLOCATOR_PLACE = 0

public val RT_RCDATA: PCWSTR = 10u.toLong()

public val RT_STRING: PCWSTR = 6u.toLong()

public val SHORT_COEFF: KSDS3D_HRTF_COEFF_FORMAT = 1

public val SPEAKER_ALL: UInt = 2147483648u

public val SPEAKER_BACK_CENTER: UInt = 256u

public val SPEAKER_BACK_LEFT: UInt = 16u

public val SPEAKER_BACK_RIGHT: UInt = 32u

public val SPEAKER_FRONT_CENTER: UInt = 4u

public val SPEAKER_FRONT_LEFT: UInt = 1u

public val SPEAKER_FRONT_LEFT_OF_CENTER: UInt = 64u

public val SPEAKER_FRONT_RIGHT: UInt = 2u

public val SPEAKER_FRONT_RIGHT_OF_CENTER: UInt = 128u

public val SPEAKER_LOW_FREQUENCY: UInt = 8u

public val SPEAKER_RESERVED: UInt = 2147221504u

public val SPEAKER_SIDE_LEFT: UInt = 512u

public val SPEAKER_SIDE_RIGHT: UInt = 1024u

public val SPEAKER_TOP_BACK_CENTER: UInt = 65536u

public val SPEAKER_TOP_BACK_LEFT: UInt = 32768u

public val SPEAKER_TOP_BACK_RIGHT: UInt = 131072u

public val SPEAKER_TOP_CENTER: UInt = 2048u

public val SPEAKER_TOP_FRONT_CENTER: UInt = 8192u

public val SPEAKER_TOP_FRONT_LEFT: UInt = 4096u

public val SPEAKER_TOP_FRONT_RIGHT: UInt = 16384u

public val SYSAUDIO_FLAGS_CLEAR_PREFERRED: UInt = 2u

public val SYSAUDIO_FLAGS_DONT_COMBINE_PINS: UInt = 1u

public val TELEPHONY_CALLCONTROLOP_DISABLE: TELEPHONY_CALLCONTROLOP = 0

public val TELEPHONY_CALLCONTROLOP_ENABLE: TELEPHONY_CALLCONTROLOP = 1

public val TELEPHONY_CALLSTATE_DISABLED: TELEPHONY_CALLSTATE = 0

public val TELEPHONY_CALLSTATE_ENABLED: TELEPHONY_CALLSTATE = 1

public val TELEPHONY_CALLSTATE_HOLD: TELEPHONY_CALLSTATE = 2

public val TELEPHONY_CALLSTATE_PROVIDERTRANSITION: TELEPHONY_CALLSTATE = 3

public val TELEPHONY_CALLTYPE_CIRCUITSWITCHED: TELEPHONY_CALLTYPE = 0

public val TELEPHONY_CALLTYPE_PACKETSWITCHED_LTE: TELEPHONY_CALLTYPE = 1

public val TELEPHONY_CALLTYPE_PACKETSWITCHED_WLAN: TELEPHONY_CALLTYPE = 2

public val TELEPHONY_PROVIDERCHANGEOP_BEGIN: TELEPHONY_PROVIDERCHANGEOP = 1

public val TELEPHONY_PROVIDERCHANGEOP_CANCEL: TELEPHONY_PROVIDERCHANGEOP = 2

public val TELEPHONY_PROVIDERCHANGEOP_END: TELEPHONY_PROVIDERCHANGEOP = 0

public val Tuner_LockType_Locked: TunerLockType = 2

public val Tuner_LockType_None: TunerLockType = 0

public val Tuner_LockType_Within_Scan_Sensing_Range: TunerLockType = 1

public val WAVE_FORMAT_EXTENSIBLE: UInt = 65534u

public val WST_BYTES_PER_LINE: UInt = 42u

public val WST_TVTUNER_CHANGE_BEGIN_TUNE: Int = 4096

public val WST_TVTUNER_CHANGE_END_TUNE: Int = 8192

public val eConnType3Point5mm: EPcxConnectionType = 1

public val eConnTypeAtapiInternal: EPcxConnectionType = 3

public val eConnTypeCombination: EPcxConnectionType = 11

public val eConnTypeMultichannelAnalogDIN: EPcxConnectionType = 8

public val eConnTypeOptical: EPcxConnectionType = 5

public val eConnTypeOtherAnalog: EPcxConnectionType = 7

public val eConnTypeOtherDigital: EPcxConnectionType = 6

public val eConnTypeQuarter: EPcxConnectionType = 2

public val eConnTypeRCA: EPcxConnectionType = 4

public val eConnTypeRJ11Modem: EPcxConnectionType = 10

public val eConnTypeUnknown: EPcxConnectionType = 0

public val eConnTypeXlrProfessional: EPcxConnectionType = 9

public val eDeviceControlUseMissing: EDeviceControlUseType = 0

public val eDeviceControlUsePrimary: EDeviceControlUseType = 1

public val eDeviceControlUseSecondary: EDeviceControlUseType = 2

public val eGenLocInternal: EPcxGenLocation = 1

public val eGenLocOther: EPcxGenLocation = 3

public val eGenLocPrimaryBox: EPcxGenLocation = 0

public val eGenLocSeparate: EPcxGenLocation = 2

public val eGeoLocATAPI: EPcxGeoLocation = 13

public val eGeoLocBottom: EPcxGeoLocation = 6

public val eGeoLocDrivebay: EPcxGeoLocation = 10

public val eGeoLocFront: EPcxGeoLocation = 2

public val eGeoLocHDMI: EPcxGeoLocation = 11

public val eGeoLocInsideMobileLid: EPcxGeoLocation = 9

public val eGeoLocLeft: EPcxGeoLocation = 3

public val eGeoLocNotApplicable: EPcxGeoLocation = 14

public val eGeoLocOutsideMobileLid: EPcxGeoLocation = 12

public val eGeoLocRear: EPcxGeoLocation = 1

public val eGeoLocRearPanel: EPcxGeoLocation = 7

public val eGeoLocReserved6: EPcxGeoLocation = 15

public val eGeoLocRight: EPcxGeoLocation = 4

public val eGeoLocRiser: EPcxGeoLocation = 8

public val eGeoLocTop: EPcxGeoLocation = 5

public val ePortConnBothIntegratedAndJack: EPxcPortConnection = 2

public val ePortConnIntegratedDevice: EPxcPortConnection = 1

public val ePortConnJack: EPxcPortConnection = 0

public val ePortConnUnknown: EPxcPortConnection = 3
