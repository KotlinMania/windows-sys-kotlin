package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val KSPROPSETID_VBICAP_PROPERTIES: Guid = Guid.fromU128(U128(0xf162c6077b35496fuL, 0xad7f2dca3b46b718uL))

public val KSPROPSETID_VBI_CODEC_FILTERING: Guid = Guid.fromU128(U128(0xcafeb0ca871511d0uL, 0xbd6a0035c0edbabeuL))

public val KSPROPSETID_VP_CONFIG: Guid = Guid.fromU128(U128(0xbc29a66030e311d0uL, 0x9e6900c04fd7c15buL))

public val KSPROPSETID_VPVBI_CONFIG: Guid = Guid.fromU128(U128(0xec529b001a1f11d1uL, 0xbad900609744111auL))

public val KSPROPSETID_VRAM_CAPTURE: Guid = Guid.fromU128(U128(0xe73face328804902uL, 0xb79988d0cd634e0fuL))

public val KSPROPSETID_WAVE: Guid = Guid.fromU128(U128(0x924e54b0630f11cfuL, 0xada708003e30494auL))

public val KSPROPTYPESETID_GENERAL: Guid = Guid.fromU128(U128(0x97e99ba0bdea11cfuL, 0xa5d628db04c10000uL))

public val KSRATE_NOPRESENTATIONDURATION: UInt = 2u

public val KSRATE_NOPRESENTATIONSTART: UInt = 1u

public val KSRELATIVEEVENT_FLAG_HANDLE: UInt = 1u

public val KSRELATIVEEVENT_FLAG_POINTER: UInt = 2u

public val KSRESET_BEGIN: Ksreset = 0

public val KSRESET_END: Ksreset = 1

public val KSSTATE_ACQUIRE: Ksstate = 1

public val KSSTATE_PAUSE: Ksstate = 2

public val KSSTATE_RUN: Ksstate = 3

public val KSSTATE_STOP: Ksstate = 0

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

public val KSSTRING_ALLOCATOR: Pcwstr = w("{642F5D00-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_ALLOCATOR_EX: Pcwstr = w("{091BB63B-603F-11D1-B067-00A0C9062802}")

public val KSSTRING_CLOCK: Pcwstr = w("{53172480-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_FILTER: Pcwstr = w("{9B365890-165F-11D0-A195-0020AFD156E4}")

public val KSSTRING_PIN: Pcwstr = w("{146F1A80-4791-11D0-A5D6-28DB04C10000}")

public val KSSTRING_TOPOLOGY_NODE: Pcwstr = w("{0621061A-EE75-11D0-B915-00A0C9223196}")

public val KSTIME_FORMAT_BYTE: Guid = Guid.fromU128(U128(0x7b7855718c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_FIELD: Guid = Guid.fromU128(U128(0x7b7855738c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_FRAME: Guid = Guid.fromU128(U128(0x7b7855708c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_MEDIA_TIME: Guid = Guid.fromU128(U128(0x7b7855748c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSTIME_FORMAT_SAMPLE: Guid = Guid.fromU128(U128(0x7b7855728c8211cfuL, 0xbc0c00aa00ac74f6uL))

public val KSWAVE_BUFFER_ATTRIBUTEF_LOOPING: UInt = 1u

public val KSWAVE_BUFFER_ATTRIBUTEF_STATIC: UInt = 2u

public val KSWAVE_COMPATCAPS_INPUT: UInt = 0u

public val KSWAVE_COMPATCAPS_OUTPUT: UInt = 1u

public val KS_AMCONTROL_COLORINFO_PRESENT: UInt = 128u

public val KS_AMCONTROL_PAD_TO_16X9: UInt = 4u

public val KS_AMCONTROL_PAD_TO_4X3: UInt = 2u

public val KS_AMCONTROL_USED: UInt = 1u

public val KS_AMVP_BEST_BANDWIDTH: KsAmvpSelectformatby = 1

public val KS_AMVP_DO_NOT_CARE: KsAmvpSelectformatby = 0

public val KS_AMVP_INPUT_SAME_AS_OUTPUT: KsAmvpSelectformatby = 2

public val KS_AMVP_MODE_BOBINTERLEAVED: KsAmvpMode = 1

public val KS_AMVP_MODE_BOBNONINTERLEAVED: KsAmvpMode = 2

public val KS_AMVP_MODE_SKIPEVEN: KsAmvpMode = 3

public val KS_AMVP_MODE_SKIPODD: KsAmvpMode = 4

public val KS_AMVP_MODE_WEAVE: KsAmvpMode = 0

public val KS_AM_RATE_EXACT_RATE_CHANGE: KsAmPropertyTsRateChange = 2

public val KS_AM_RATE_MAX_FULL_DATA_RATE: KsAmPropertyTsRateChange = 3

public val KS_AM_RATE_SIMPLE_RATE_CHANGE: KsAmPropertyTsRateChange = 1

public val KS_AM_RATE_STEP: KsAmPropertyTsRateChange = 4

public val KS_AM_USE_NEW_CSS_KEY: Int = 1

public val KS_ANALOG_VIDEO_NTSC_433: KsAnalogVideoStandard = 4

public val KS_ANALOG_VIDEO_NTSC_M: KsAnalogVideoStandard = 1

public val KS_ANALOG_VIDEO_NTSC_M_J: KsAnalogVideoStandard = 2

public val KS_ANALOG_VIDEO_NTSC_MASK: UInt = 7u

public val KS_ANALOG_VIDEO_NONE: KsAnalogVideoStandard = 0

public val KS_ANALOG_VIDEO_PAL_60: KsAnalogVideoStandard = 2048

public val KS_ANALOG_VIDEO_PAL_B: KsAnalogVideoStandard = 16

public val KS_ANALOG_VIDEO_PAL_D: KsAnalogVideoStandard = 32

public val KS_ANALOG_VIDEO_PAL_G: KsAnalogVideoStandard = 64

public val KS_ANALOG_VIDEO_PAL_H: KsAnalogVideoStandard = 128

public val KS_ANALOG_VIDEO_PAL_I: KsAnalogVideoStandard = 256

public val KS_ANALOG_VIDEO_PAL_M: KsAnalogVideoStandard = 512

public val KS_ANALOG_VIDEO_PAL_MASK: UInt = 1052656u

public val KS_ANALOG_VIDEO_PAL_N: KsAnalogVideoStandard = 1024

public val KS_ANALOG_VIDEO_PAL_N_COMBO: KsAnalogVideoStandard = 1048576

public val KS_ANALOG_VIDEO_SECAM_B: KsAnalogVideoStandard = 4096

public val KS_ANALOG_VIDEO_SECAM_D: KsAnalogVideoStandard = 8192

public val KS_ANALOG_VIDEO_SECAM_G: KsAnalogVideoStandard = 16384

public val KS_ANALOG_VIDEO_SECAM_H: KsAnalogVideoStandard = 32768

public val KS_ANALOG_VIDEO_SECAM_K: KsAnalogVideoStandard = 65536

public val KS_ANALOG_VIDEO_SECAM_K1: KsAnalogVideoStandard = 131072

public val KS_ANALOG_VIDEO_SECAM_L: KsAnalogVideoStandard = 262144

public val KS_ANALOG_VIDEO_SECAM_L1: KsAnalogVideoStandard = 524288

public val KS_ANALOG_VIDEO_SECAM_MASK: UInt = 1044480u

public val KS_BI_BITFIELDS: Int = 3

public val KS_BI_JPEG: Int = 4

public val KS_BI_RGB: Int = 0

public val KS_BI_RLE4: Int = 2

public val KS_BI_RLE8: Int = 1

public val KS_CAMERACONTROL_ASYNC_RESET: KsCameraControlAsyncOperation = 3

public val KS_CAMERACONTROL_ASYNC_START: KsCameraControlAsyncOperation = 1

public val KS_CAMERACONTROL_ASYNC_STOP: KsCameraControlAsyncOperation = 2

public val KS_CAPTURE_ALLOC_INVALID: CaptureMemoryAllocationFlags = 0

public val KS_CAPTURE_ALLOC_SECURE_BUFFER: CaptureMemoryAllocationFlags = 16

public val KS_CAPTURE_ALLOC_SYSTEM: CaptureMemoryAllocationFlags = 1

public val KS_CAPTURE_ALLOC_SYSTEM_AGP: CaptureMemoryAllocationFlags = 4

public val KS_CAPTURE_ALLOC_VRAM: CaptureMemoryAllocationFlags = 2

public val KS_CAPTURE_ALLOC_VRAM_MAPPED: CaptureMemoryAllocationFlags = 8

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

public val KS_COPYPROTECT_RESTRICT_DUPLICATION: UInt = 1u

public val KS_COMPRESSION_CAPS_CAN_B_FRAME: KsCompressionCaps = 8

public val KS_COMPRESSION_CAPS_CAN_CRUNCH: KsCompressionCaps = 2

public val KS_COMPRESSION_CAPS_CAN_KEY_FRAME: KsCompressionCaps = 4

public val KS_COMPRESSION_CAPS_CAN_QUALITY: KsCompressionCaps = 1

public val KS_COMPRESSION_CAPS_CAN_WINDOW: KsCompressionCaps = 16

public val KS_DVDCOPYSTATE_AUTHENTICATION_NOT_REQUIRED: KsDvdcopystate = 2

public val KS_DVDCOPYSTATE_AUTHENTICATION_REQUIRED: KsDvdcopystate = 3

public val KS_DVDCOPYSTATE_DONE: KsDvdcopystate = 4

public val KS_DVDCOPYSTATE_INITIALIZE: KsDvdcopystate = 0

public val KS_DVDCOPYSTATE_INITIALIZE_TITLE: KsDvdcopystate = 1

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

public val KS_INTERLACE_1FIELD_PER_SAMPLE: UInt = 2u

public val KS_INTERLACE_DISPLAY_MODE_BOB_ONLY: UInt = 0u

public val KS_INTERLACE_DISPLAY_MODE_BOB_OR_WEAVE: UInt = 128u

public val KS_INTERLACE_DISPLAY_MODE_MASK: UInt = 192u

public val KS_INTERLACE_DISPLAY_MODE_WEAVE_ONLY: UInt = 64u

public val KS_INTERLACE_FIELD1FIRST: UInt = 4u

public val KS_INTERLACE_FIELD_PAT_BOTH_IRREGULAR: UInt = 48u

public val KS_INTERLACE_FIELD_PAT_BOTH_REGULAR: UInt = 32u

public val KS_INTERLACE_FIELD_PAT_FIELD1ONLY: UInt = 0u

public val KS_INTERLACE_FIELD_PAT_FIELD2ONLY: UInt = 16u

public val KS_INTERLACE_FIELD_PATTERN_MASK: UInt = 48u

public val KS_INTERLACE_IS_INTERLACED: UInt = 1u

public val KS_INTERLACE_UNUSED: UInt = 8u

public val KS_MACROVISION_DISABLED: KsCopyMacrovisionLevel = 0

public val KS_MACROVISION_LEVEL1: KsCopyMacrovisionLevel = 1

public val KS_MACROVISION_LEVEL2: KsCopyMacrovisionLevel = 2

public val KS_MACROVISION_LEVEL3: KsCopyMacrovisionLevel = 3

public val KS_MAX_SIZE_MPEG1_SEQUENCE_INFO: UInt = 140u

public val KS_MPEG2LEVEL_HIGH: KsMpeg2Level = 3

public val KS_MPEG2LEVEL_HIGH1440: KsMpeg2Level = 2

public val KS_MPEG2LEVEL_LOW: KsMpeg2Level = 0

public val KS_MPEG2LEVEL_MAIN: KsMpeg2Level = 1

public val KS_MPEG2PROFILE_HIGH: KsMpeg2Profile = 4

public val KS_MPEG2PROFILE_MAIN: KsMpeg2Profile = 1

public val KS_MPEG2PROFILE_SNR_SCALABLE: KsMpeg2Profile = 2

public val KS_MPEG2PROFILE_SIMPLE: KsMpeg2Profile = 0

public val KS_MPEG2PROFILE_SPATIALLY_SCALABLE: KsMpeg2Profile = 3

public val KS_MPEG2_27MHZ_TIMEBASE: UInt = 256u

public val KS_MPEG2_DSS_USER_DATA: UInt = 64u

public val KS_MPEG2_DVB_USER_DATA: UInt = 128u

public val KS_MPEG2_DVD_LINE21FIELD1: UInt = 2u

public val KS_MPEG2_DVD_LINE21FIELD2: UInt = 4u

public val KS_MPEG2_DO_PAN_SCAN: UInt = 1u

public val KS_MPEG2_FILM_CAMERA_MODE: UInt = 16u

public val KS_MPEG2_LETTERBOX_ANALOG_OUT: UInt = 32u

public val KS_MPEG2_SOURCE_IS_LETTERBOXED: UInt = 8u

public val KS_MPEG2_WIDESCREEN_ANALOG_OUT: UInt = 512u

public val KS_MPEGAUDIOINFO_27MHZ_TIMEBASE: UInt = 1u

public val KS_MEMORY_TYPE_ANY_HOST: KsLogicalMemoryType = 6

public val KS_MEMORY_TYPE_DEVICE_HOST_MAPPED: KsLogicalMemoryType = 3

public val KS_MEMORY_TYPE_DEVICE_SPECIFIC: KsLogicalMemoryType = 4

public val KS_MEMORY_TYPE_DONT_CARE: KsLogicalMemoryType = 0

public val KS_MEMORY_TYPE_KERNEL_NON_PAGED: KsLogicalMemoryType = 2

public val KS_MEMORY_TYPE_KERNEL_PAGED: KsLogicalMemoryType = 1

public val KS_MEMORY_TYPE_USER: KsLogicalMemoryType = 5

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

public val KS_OBSOLETE_VIDEO_CONTROL_FLAG_EXTERNAL_TRIGGER_ENABLE: KsVideoControlFlags = 16

public val KS_OBSOLETE_VIDEO_CONTROL_FLAG_TRIGGER: KsVideoControlFlags = 32

public val KS_PHYS_CONN_AUDIO_1394: KsPhysicalConnectorType = 4103

public val KS_PHYS_CONN_AUDIO_AES_DIGITAL: KsPhysicalConnectorType = 4099

public val KS_PHYS_CONN_AUDIO_AUX: KsPhysicalConnectorType = 4102

public val KS_PHYS_CONN_AUDIO_AUDIO_DECODER: KsPhysicalConnectorType = 4105

public val KS_PHYS_CONN_AUDIO_LINE: KsPhysicalConnectorType = 4097

public val KS_PHYS_CONN_AUDIO_MIC: KsPhysicalConnectorType = 4098

public val KS_PHYS_CONN_AUDIO_SCSI: KsPhysicalConnectorType = 4101

public val KS_PHYS_CONN_AUDIO_SPDIF_DIGITAL: KsPhysicalConnectorType = 4100

public val KS_PHYS_CONN_AUDIO_TUNER: KsPhysicalConnectorType = 4096

public val KS_PHYS_CONN_AUDIO_USB: KsPhysicalConnectorType = 4104

public val KS_PHYS_CONN_VIDEO_1394: KsPhysicalConnectorType = 10

public val KS_PHYS_CONN_VIDEO_AUX: KsPhysicalConnectorType = 9

public val KS_PHYS_CONN_VIDEO_COMPOSITE: KsPhysicalConnectorType = 2

public val KS_PHYS_CONN_VIDEO_PARALLEL_DIGITAL: KsPhysicalConnectorType = 7

public val KS_PHYS_CONN_VIDEO_RGB: KsPhysicalConnectorType = 4

public val KS_PHYS_CONN_VIDEO_SCART: KsPhysicalConnectorType = 14

public val KS_PHYS_CONN_VIDEO_SCSI: KsPhysicalConnectorType = 8

public val KS_PHYS_CONN_VIDEO_S_VIDEO: KsPhysicalConnectorType = 3

public val KS_PHYS_CONN_VIDEO_SERIAL_DIGITAL: KsPhysicalConnectorType = 6

public val KS_PHYS_CONN_VIDEO_TUNER: KsPhysicalConnectorType = 1

public val KS_PHYS_CONN_VIDEO_USB: KsPhysicalConnectorType = 11

public val KS_PHYS_CONN_VIDEO_VIDEO_DECODER: KsPhysicalConnectorType = 12

public val KS_PHYS_CONN_VIDEO_VIDEO_ENCODER: KsPhysicalConnectorType = 13

public val KS_PHYS_CONN_VIDEO_YRYBY: KsPhysicalConnectorType = 5

public val KS_PIX_ASPECT_RATIO_NTSC16X9: KsAmpixAspectRatio = 1

public val KS_PIX_ASPECT_RATIO_NTSC4X3: KsAmpixAspectRatio = 0

public val KS_PIX_ASPECT_RATIO_PAL16X9: KsAmpixAspectRatio = 3

public val KS_PIX_ASPECT_RATIO_PAL4X3: KsAmpixAspectRatio = 2

public val KS_SECURE_CAMERA_SCENARIO_ID: Guid = Guid.fromU128(U128(0xae53fc6e8d894488uL, 0x9d2e4d008731c5fduL))

public val KS_SEEKING_ABSOLUTE_POSITIONING: KsSeekingFlags = 1

public val KS_SEEKING_CAN_GET_CURRENT_POS: KsSeekingCapabilities = 8

public val KS_SEEKING_CAN_GET_DURATION: KsSeekingCapabilities = 32

public val KS_SEEKING_CAN_GET_STOP_POS: KsSeekingCapabilities = 16

public val KS_SEEKING_CAN_PLAY_BACKWARDS: KsSeekingCapabilities = 64

public val KS_SEEKING_CAN_SEEK_ABSOLUTE: KsSeekingCapabilities = 1

public val KS_SEEKING_CAN_SEEK_BACKWARDS: KsSeekingCapabilities = 4

public val KS_SEEKING_CAN_SEEK_FORWARDS: KsSeekingCapabilities = 2

public val KS_SEEKING_INCREMENTAL_POSITIONING: KsSeekingFlags = 3

public val KS_SEEKING_NO_POSITIONING: KsSeekingFlags = 0

public val KS_SEEKING_POSITIONING_BITS_MASK: KsSeekingFlags = 3

public val KS_SEEKING_RELATIVE_POSITIONING: KsSeekingFlags = 2

public val KS_SEEKING_RETURN_TIME: KsSeekingFlags = 8

public val KS_SEEKING_SEEK_TO_KEY_FRAME: KsSeekingFlags = 4

public val KS_STREAMING_HINT_COMP_QUALITY: KsVideoStreamingHints = 2048

public val KS_STREAMING_HINT_COMP_WINDOW_SIZE: KsVideoStreamingHints = 4096

public val KS_STREAMING_HINT_FRAME_INTERVAL: KsVideoStreamingHints = 256

public val KS_STREAMING_HINT_KEY_FRAME_RATE: KsVideoStreamingHints = 512

public val KS_STREAMING_HINT_P_FRAME_RATE: KsVideoStreamingHints = 1024

public val KS_TUNER_STRATEGY_DRIVER_TUNES: KsTunerStrategy = 4

public val KS_TUNER_STRATEGY_PLL: KsTunerStrategy = 1

public val KS_TUNER_STRATEGY_SIGNAL_STRENGTH: KsTunerStrategy = 2

public val KS_TUNER_TUNING_COARSE: KsTunerTuningFlags = 3

public val KS_TUNER_TUNING_EXACT: KsTunerTuningFlags = 1

public val KS_TUNER_TUNING_FINE: KsTunerTuningFlags = 2

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

public val KS_VIDEODECODER_FLAGS_CAN_DISABLE_OUTPUT: KsVideodecoderFlags = 1

public val KS_VIDEODECODER_FLAGS_CAN_INDICATE_LOCKED: KsVideodecoderFlags = 4

public val KS_VIDEODECODER_FLAGS_CAN_USE_VCR_LOCKING: KsVideodecoderFlags = 2

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

public val KS_VIDEO_CONTROL_FLAG_EXTERNAL_TRIGGER_ENABLE: KsVideoControlFlags = 4

public val KS_VIDEO_CONTROL_FLAG_FLIP_HORIZONTAL: KsVideoControlFlags = 1

public val KS_VIDEO_CONTROL_FLAG_FLIP_VERTICAL: KsVideoControlFlags = 2

public val KS_VIDEO_CONTROL_FLAG_INDEPENDENT_IMAGE_PIN: KsVideoControlFlags = 64

public val KS_VIDEO_CONTROL_FLAG_START_PHOTO_SEQUENCE_CAPTURE: KsVideoControlFlags = 256

public val KS_VIDEO_CONTROL_FLAG_STILL_CAPTURE_PREVIEW_FRAME: KsVideoControlFlags = 128

public val KS_VIDEO_CONTROL_FLAG_STOP_PHOTO_SEQUENCE_CAPTURE: KsVideoControlFlags = 512

public val KS_VIDEO_CONTROL_FLAG_TRIGGER: KsVideoControlFlags = 8

public val KS_I_BLUE: UInt = 2u

public val KS_I_EGA_COLORS: UInt = 16u

public val KS_I_GREEN: UInt = 1u

public val KS_I_MASK_COLORS: UInt = 3u

public val KS_I_MAXBITS: UInt = 8u

public val KS_I_PALETTE: UInt = 8u

public val KS_I_PALETTE_COLORS: UInt = 256u

public val KS_I_RED: UInt = 0u

public val KS_I_TRUECOLOR: UInt = 16u

public val KS_ALLOCATOR_MODE_KERNEL: Ksallocatormode = 1

public val KS_ALLOCATOR_MODE_USER: Ksallocatormode = 0

public val KS_IO_OPERATION_READ: Ksiooperation = 1

public val KS_IO_OPERATION_WRITE: Ksiooperation = 0

public val KS_PEEK_OPERATION_ADD_REF: Kspeekoperation = 1

public val KS_PEEK_OPERATION_PEEK_ONLY: Kspeekoperation = 0

public val LIGHT_FILTER: Ksds3dHrtfFilterQuality = 1

public val MAX_NABTS_VBI_LINES_PER_FIELD: UInt = 11u

public val MAX_RESOURCEGROUPID_LENGTH: UInt = 256u

public val MAX_SINK_DESCRIPTION_NAME_LENGTH: UInt = 32u

public val MAX_WST_VBI_LINES_PER_FIELD: UInt = 17u

public val MIN_DEV_VER_FOR_FLAGS: UInt = 272u

public val MIN_DEV_VER_FOR_QI: UInt = 256u

public val METADATA_ID_BACKGROUND_SEGMENTATION_MASK: KscameraMetadataId = 8

public val METADATA_ID_CAMERA_EXTRINSICS: KscameraMetadataId = 4

public val METADATA_ID_CAMERA_INTRINSICS: KscameraMetadataId = 5

public val METADATA_ID_CAPTURE_STATS: KscameraMetadataId = 3

public val METADATA_ID_CUSTOM_START: KscameraMetadataId = -2147483648.toInt()

public val METADATA_ID_DIGITAL_WINDOW: KscameraMetadataId = 7

public val METADATA_ID_FRAME_ILLUMINATION: KscameraMetadataId = 6

public val METADATA_ID_PHOTO_CONFIRMATION: KscameraMetadataId = 1

public val METADATA_ID_STANDARD_END: KscameraMetadataId = 8

public val METADATA_ID_STANDARD_START: KscameraMetadataId = 1

public val METADATA_ID_USB_VIDEO_HEADER: KscameraMetadataId = 2

public val NABTS_BUFFER_PICTURENUMBER_SUPPORT: UInt = 1u

public val NABTS_BYTES_PER_LINE: UInt = 36u

public val NABTS_LINES_PER_BUNDLE: UInt = 16u

public val NABTS_PAYLOAD_PER_LINE: UInt = 28u

public val NANOSECONDS: UInt = 10000000u

public val PINNAME_DISPLAYPORT_OUT: Guid = Guid.fromU128(U128(0x21fbb3291a4a48dauL, 0xa0762318a3c59b26uL))

public val PINNAME_HDMI_OUT: Guid = Guid.fromU128(U128(0x387bfc03e7ef4901uL, 0x86e035b7c32b00efuL))

public val PINNAME_IMAGE: Guid = Guid.fromU128(U128(0x38a0cd98d49b4ce8uL, 0xb48a344667a17830uL))

public val PINNAME_SPDIF_IN: Guid = Guid.fromU128(U128(0x15dc902522ad41b3uL, 0x8875f4ceb0299e20uL))

public val PINNAME_SPDIF_OUT: Guid = Guid.fromU128(U128(0x3a264481e52c4b82uL, 0x8e7ac8e2f91dc380uL))

public val PINNAME_VIDEO_ANALOGVIDEOIN: Guid = Guid.fromU128(U128(0xfb6c4283035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CAPTURE: Guid = Guid.fromU128(U128(0xfb6c4281035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CC: Guid = Guid.fromU128(U128(0xfb6c4289035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_CC_CAPTURE: Guid = Guid.fromU128(U128(0x1aad8061012d11d2uL, 0xb4b100a0d102cfbeuL))

public val PINNAME_VIDEO_EDS: Guid = Guid.fromU128(U128(0xfb6c4287035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_NABTS: Guid = Guid.fromU128(U128(0xfb6c4286035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_NABTS_CAPTURE: Guid = Guid.fromU128(U128(0x29703660498a11d2uL, 0xb4b100a0d102cfbeuL))

public val PINNAME_VIDEO_PREVIEW: Guid = Guid.fromU128(U128(0xfb6c4282035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_STILL: Guid = Guid.fromU128(U128(0xfb6c428a035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_TELETEXT: Guid = Guid.fromU128(U128(0xfb6c4288035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_TIMECODE: Guid = Guid.fromU128(U128(0xfb6c428b035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VBI: Guid = Guid.fromU128(U128(0xfb6c4284035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VIDEOPORT: Guid = Guid.fromU128(U128(0xfb6c4285035311d1uL, 0x905f0000c0cc16bauL))

public val PINNAME_VIDEO_VIDEOPORT_VBI: Guid = Guid.fromU128(U128(0xfb6c428c035311d1uL, 0x905f0000c0cc16bauL))

public val PROPSETID_ALLOCATOR_CONTROL: Guid = Guid.fromU128(U128(0x53171960148e11d2uL, 0x99790000c0cc16bauL))

public val PROPSETID_EXT_DEVICE: Guid = Guid.fromU128(U128(0xb5730a901a2c11cfuL, 0x8c2300aa006b6814uL))

public val PROPSETID_EXT_TRANSPORT: Guid = Guid.fromU128(U128(0xa03cd5f0304511cfuL, 0x8c4400aa006b6814uL))

public val PROPSETID_TIMECODE_READER: Guid = Guid.fromU128(U128(0x9b496ce1811b11cfuL, 0x8c7700aa006b6814uL))

public val PROPSETID_TUNER: Guid = Guid.fromU128(U128(0x6a2e060528e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_CAMERACONTROL: Guid = Guid.fromU128(U128(0xc6e1337030ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_FLASH: Guid = Guid.fromU128(U128(0x785e8f4963a24144uL, 0xab70ffb278fa26ceuL))

public val PROPSETID_VIDCAP_CAMERACONTROL_IMAGE_PIN_CAPABILITY: Guid = Guid.fromU128(U128(0x9d3d7bbf5c6d4138uL, 0xbb00584edd20f7c5uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_REGION_OF_INTEREST: Guid = Guid.fromU128(U128(0x9d12d198f86c4feduL, 0xb0235d87653da793uL))

public val PROPSETID_VIDCAP_CAMERACONTROL_VIDEO_STABILIZATION: Guid = Guid.fromU128(U128(0x43964bd37716404euL, 0x8be1d299b20e50fduL))

public val PROPSETID_VIDCAP_CROSSBAR: Guid = Guid.fromU128(U128(0x6a2e064028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_DROPPEDFRAMES: Guid = Guid.fromU128(U128(0xc6e1334430ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_SELECTOR: Guid = Guid.fromU128(U128(0x1abdaeca68b64f83uL, 0x9371b413907c7b9fuL))

public val PROPSETID_VIDCAP_TVAUDIO: Guid = Guid.fromU128(U128(0x6a2e065028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOCOMPRESSION: Guid = Guid.fromU128(U128(0xc6e1334330ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOCONTROL: Guid = Guid.fromU128(U128(0x6a2e067028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEODECODER: Guid = Guid.fromU128(U128(0xc6e1335030ac11d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOENCODER: Guid = Guid.fromU128(U128(0x6a2e061028e411d0uL, 0xa18c00a0c9118956uL))

public val PROPSETID_VIDCAP_VIDEOPROCAMP: Guid = Guid.fromU128(U128(0xc6e1336030ac11d0uL, 0xa18c00a0c9118956uL))

public val PIPE_FACTOR_ALIGN: UInt = 512u

public val PIPE_FACTOR_BUFFERS: UInt = 256u

public val PIPE_FACTOR_FIXED_COMPRESSION: UInt = 64u

public val PIPE_FACTOR_FLAGS: UInt = 8u

public val PIPE_FACTOR_LOGICAL_END: UInt = 2048u

public val PIPE_FACTOR_MEMORY_TYPES: UInt = 4u

public val PIPE_FACTOR_NONE: UInt = 0u

public val PIPE_FACTOR_OPTIMAL_RANGES: UInt = 32u

public val PIPE_FACTOR_PHYSICAL_END: UInt = 1024u

public val PIPE_FACTOR_PHYSICAL_RANGES: UInt = 16u

public val PIPE_FACTOR_UNKNOWN_COMPRESSION: UInt = 128u

public val PIPE_FACTOR_USER_MODE_DOWNSTREAM: UInt = 2u

public val PIPE_FACTOR_USER_MODE_UPSTREAM: UInt = 1u

public val PIPE_STATE_COMPRESSION_UNKNOWN: PipeState = 3

public val PIPE_STATE_DONT_CARE: PipeState = 0

public val PIPE_STATE_FINALIZED: PipeState = 4

public val PIPE_STATE_RANGE_FIXED: PipeState = 2

public val PIPE_STATE_RANGE_NOT_FIXED: PipeState = 1

public val PIPE_ALLOCATOR_FIRST_PIN: PipeAllocatorPlace = 1

public val PIPE_ALLOCATOR_LAST_PIN: PipeAllocatorPlace = 2

public val PIPE_ALLOCATOR_MIDDLE_PIN: PipeAllocatorPlace = 3

public val PIPE_ALLOCATOR_NONE: PipeAllocatorPlace = 0

public val RT_RCDATA: Pcwstr = COpaquePointer((10u.toUShort()).toLong())

public val RT_STRING: Pcwstr = COpaquePointer((6u.toUShort()).toLong())

public val SHORT_COEFF: Ksds3dHrtfCoeffFormat = 1

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

public val TELEPHONY_CALLCONTROLOP_DISABLE: TelephonyCallcontrolop = 0

public val TELEPHONY_CALLCONTROLOP_ENABLE: TelephonyCallcontrolop = 1

public val TELEPHONY_CALLSTATE_DISABLED: TelephonyCallstate = 0

public val TELEPHONY_CALLSTATE_ENABLED: TelephonyCallstate = 1

public val TELEPHONY_CALLSTATE_HOLD: TelephonyCallstate = 2

public val TELEPHONY_CALLSTATE_PROVIDERTRANSITION: TelephonyCallstate = 3

public val TELEPHONY_CALLTYPE_CIRCUITSWITCHED: TelephonyCalltype = 0

public val TELEPHONY_CALLTYPE_PACKETSWITCHED_LTE: TelephonyCalltype = 1

public val TELEPHONY_CALLTYPE_PACKETSWITCHED_WLAN: TelephonyCalltype = 2

public val TELEPHONY_PROVIDERCHANGEOP_BEGIN: TelephonyProviderchangeop = 1

public val TELEPHONY_PROVIDERCHANGEOP_CANCEL: TelephonyProviderchangeop = 2

public val TELEPHONY_PROVIDERCHANGEOP_END: TelephonyProviderchangeop = 0

public val TUNER_LOCK_TYPE_LOCKED: TunerLockType = 2

public val TUNER_LOCK_TYPE_NONE: TunerLockType = 0

public val TUNER_LOCK_TYPE_WITHIN_SCAN_SENSING_RANGE: TunerLockType = 1

public val WAVE_FORMAT_EXTENSIBLE: UInt = 65534u

public val WST_BYTES_PER_LINE: UInt = 42u

public val WST_TVTUNER_CHANGE_BEGIN_TUNE: Int = 4096

public val WST_TVTUNER_CHANGE_END_TUNE: Int = 8192

public val E_CONN_TYPE3POINT5MM: EPcxConnectionType = 1

public val E_CONN_TYPE_ATAPI_INTERNAL: EPcxConnectionType = 3

public val E_CONN_TYPE_COMBINATION: EPcxConnectionType = 11

public val E_CONN_TYPE_MULTICHANNEL_ANALOG_DIN: EPcxConnectionType = 8

public val E_CONN_TYPE_OPTICAL: EPcxConnectionType = 5

public val E_CONN_TYPE_OTHER_ANALOG: EPcxConnectionType = 7

public val E_CONN_TYPE_OTHER_DIGITAL: EPcxConnectionType = 6

public val E_CONN_TYPE_QUARTER: EPcxConnectionType = 2

public val E_CONN_TYPE_RCA: EPcxConnectionType = 4

public val E_CONN_TYPE_RJ11MODEM: EPcxConnectionType = 10

public val E_CONN_TYPE_UNKNOWN: EPcxConnectionType = 0

public val E_CONN_TYPE_XLR_PROFESSIONAL: EPcxConnectionType = 9

public val E_DEVICE_CONTROL_USE_MISSING: EDeviceControlUseType = 0

public val E_DEVICE_CONTROL_USE_PRIMARY: EDeviceControlUseType = 1

public val E_DEVICE_CONTROL_USE_SECONDARY: EDeviceControlUseType = 2

public val E_GEN_LOC_INTERNAL: EPcxGenLocation = 1

public val E_GEN_LOC_OTHER: EPcxGenLocation = 3

public val E_GEN_LOC_PRIMARY_BOX: EPcxGenLocation = 0

public val E_GEN_LOC_SEPARATE: EPcxGenLocation = 2

public val E_GEO_LOC_ATAPI: EPcxGeoLocation = 13

public val E_GEO_LOC_BOTTOM: EPcxGeoLocation = 6

public val E_GEO_LOC_DRIVEBAY: EPcxGeoLocation = 10

public val E_GEO_LOC_FRONT: EPcxGeoLocation = 2

public val E_GEO_LOC_HDMI: EPcxGeoLocation = 11

public val E_GEO_LOC_INSIDE_MOBILE_LID: EPcxGeoLocation = 9

public val E_GEO_LOC_LEFT: EPcxGeoLocation = 3

public val E_GEO_LOC_NOT_APPLICABLE: EPcxGeoLocation = 14

public val E_GEO_LOC_OUTSIDE_MOBILE_LID: EPcxGeoLocation = 12

public val E_GEO_LOC_REAR: EPcxGeoLocation = 1

public val E_GEO_LOC_REAR_PANEL: EPcxGeoLocation = 7

public val E_GEO_LOC_RESERVED6: EPcxGeoLocation = 15

public val E_GEO_LOC_RIGHT: EPcxGeoLocation = 4

public val E_GEO_LOC_RISER: EPcxGeoLocation = 8

public val E_GEO_LOC_TOP: EPcxGeoLocation = 5

public val E_PORT_CONN_BOTH_INTEGRATED_AND_JACK: EPxcPortConnection = 2

public val E_PORT_CONN_INTEGRATED_DEVICE: EPxcPortConnection = 1

public val E_PORT_CONN_JACK: EPxcPortConnection = 0

public val E_PORT_CONN_UNKNOWN: EPxcPortConnection = 3
