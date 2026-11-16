package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey

public val ACMDM_DRIVER_ABOUT: UInt = 24587u

public val ACMDM_DRIVER_DETAILS: UInt = 24586u

public val ACMDM_DRIVER_NOTIFY: UInt = 24577u

public val ACMDM_FILTERTAG_DETAILS: UInt = 24626u

public val ACMDM_FILTER_DETAILS: UInt = 24627u

public val ACMDM_FORMATTAG_DETAILS: UInt = 24601u

public val ACMDM_FORMAT_DETAILS: UInt = 24602u

public val ACMDM_FORMAT_SUGGEST: UInt = 24603u

public val ACMDM_HARDWARE_WAVE_CAPS_INPUT: UInt = 24596u

public val ACMDM_HARDWARE_WAVE_CAPS_OUTPUT: UInt = 24597u

public val ACMDM_RESERVED_HIGH: UInt = 28671u

public val ACMDM_RESERVED_LOW: UInt = 24576u

public val ACMDM_STREAM_CLOSE: UInt = 24653u

public val ACMDM_STREAM_CONVERT: UInt = 24655u

public val ACMDM_STREAM_OPEN: UInt = 24652u

public val ACMDM_STREAM_PREPARE: UInt = 24657u

public val ACMDM_STREAM_RESET: UInt = 24656u

public val ACMDM_STREAM_SIZE: UInt = 24654u

public val ACMDM_STREAM_UNPREPARE: UInt = 24658u

public val ACMDM_STREAM_UPDATE: UInt = 24659u

public val ACMDM_USER: UInt = 16384u

public val ACMDRIVERDETAILS_COPYRIGHT_CHARS: UInt = 80u

public val ACMDRIVERDETAILS_FEATURES_CHARS: UInt = 512u

public val ACMDRIVERDETAILS_LICENSING_CHARS: UInt = 128u

public val ACMDRIVERDETAILS_LONGNAME_CHARS: UInt = 128u

public val ACMDRIVERDETAILS_SHORTNAME_CHARS: UInt = 32u

public val ACMDRIVERDETAILS_SUPPORTF_ASYNC: Int = 16

public val ACMDRIVERDETAILS_SUPPORTF_CODEC: Int = 1

public val ACMDRIVERDETAILS_SUPPORTF_CONVERTER: Int = 2

public val ACMDRIVERDETAILS_SUPPORTF_DISABLED: Int = -2147483648.toInt()

public val ACMDRIVERDETAILS_SUPPORTF_FILTER: Int = 4

public val ACMDRIVERDETAILS_SUPPORTF_HARDWARE: Int = 8

public val ACMDRIVERDETAILS_SUPPORTF_LOCAL: Int = 1073741824

public val ACMERR_BASE: UInt = 512u

public val ACMERR_BUSY: UInt = 513u

public val ACMERR_CANCELED: UInt = 515u

public val ACMERR_NOTPOSSIBLE: UInt = 512u

public val ACMERR_UNPREPARED: UInt = 514u

public val ACMFILTERCHOOSE_STYLEF_CONTEXTHELP: Int = 128

public val ACMFILTERCHOOSE_STYLEF_ENABLEHOOK: Int = 8

public val ACMFILTERCHOOSE_STYLEF_ENABLETEMPLATE: Int = 16

public val ACMFILTERCHOOSE_STYLEF_ENABLETEMPLATEHANDLE: Int = 32

public val ACMFILTERCHOOSE_STYLEF_INITTOFILTERSTRUCT: Int = 64

public val ACMFILTERCHOOSE_STYLEF_SHOWHELP: Int = 4

public val ACMFILTERDETAILS_FILTER_CHARS: UInt = 128u

public val ACMFILTERTAGDETAILS_FILTERTAG_CHARS: UInt = 48u

public val ACMFORMATCHOOSE_STYLEF_CONTEXTHELP: Int = 128

public val ACMFORMATCHOOSE_STYLEF_ENABLEHOOK: Int = 8

public val ACMFORMATCHOOSE_STYLEF_ENABLETEMPLATE: Int = 16

public val ACMFORMATCHOOSE_STYLEF_ENABLETEMPLATEHANDLE: Int = 32

public val ACMFORMATCHOOSE_STYLEF_INITTOWFXSTRUCT: Int = 64

public val ACMFORMATCHOOSE_STYLEF_SHOWHELP: Int = 4

public val ACMFORMATDETAILS_FORMAT_CHARS: UInt = 128u

public val ACMFORMATTAGDETAILS_FORMATTAG_CHARS: UInt = 48u

public val ACMHELPMSGCONTEXTHELP: Pcwstr = w("acmchoose_contexthelp")

public val ACMHELPMSGCONTEXTHELPA: Pcstr = s("acmchoose_contexthelp")

public val ACMHELPMSGCONTEXTHELPW: Pcwstr = w("acmchoose_contexthelp")

public val ACMHELPMSGCONTEXTMENU: Pcwstr = w("acmchoose_contextmenu")

public val ACMHELPMSGCONTEXTMENUA: Pcstr = s("acmchoose_contextmenu")

public val ACMHELPMSGCONTEXTMENUW: Pcwstr = w("acmchoose_contextmenu")

public val ACMHELPMSGSTRING: Pcwstr = w("acmchoose_help")

public val ACMHELPMSGSTRINGA: Pcstr = s("acmchoose_help")

public val ACMHELPMSGSTRINGW: Pcwstr = w("acmchoose_help")

public val ACMSTREAMHEADER_STATUSF_DONE: Int = 65536

public val ACMSTREAMHEADER_STATUSF_INQUEUE: Int = 1048576

public val ACMSTREAMHEADER_STATUSF_PREPARED: Int = 131072

public val ACM_DRIVERADDF_FUNCTION: Int = 3

public val ACM_DRIVERADDF_GLOBAL: Int = 8

public val ACM_DRIVERADDF_LOCAL: Int = 0

public val ACM_DRIVERADDF_NAME: Int = 1

public val ACM_DRIVERADDF_NOTIFYHWND: Int = 4

public val ACM_DRIVERADDF_TYPEMASK: Int = 7

public val ACM_DRIVERENUMF_DISABLED: Int = -2147483648.toInt()

public val ACM_DRIVERENUMF_NOLOCAL: Int = 1073741824

public val ACM_DRIVERPRIORITYF_ABLEMASK: Int = 3

public val ACM_DRIVERPRIORITYF_BEGIN: Int = 65536

public val ACM_DRIVERPRIORITYF_DEFERMASK: Int = 196608

public val ACM_DRIVERPRIORITYF_DISABLE: Int = 2

public val ACM_DRIVERPRIORITYF_ENABLE: Int = 1

public val ACM_DRIVERPRIORITYF_END: Int = 131072

public val ACM_FILTERDETAILSF_FILTER: Int = 1

public val ACM_FILTERDETAILSF_INDEX: Int = 0

public val ACM_FILTERDETAILSF_QUERYMASK: Int = 15

public val ACM_FILTERENUMF_DWFILTERTAG: Int = 65536

public val ACM_FILTERTAGDETAILSF_FILTERTAG: Int = 1

public val ACM_FILTERTAGDETAILSF_INDEX: Int = 0

public val ACM_FILTERTAGDETAILSF_LARGESTSIZE: Int = 2

public val ACM_FILTERTAGDETAILSF_QUERYMASK: Int = 15

public val ACM_FORMATDETAILSF_FORMAT: Int = 1

public val ACM_FORMATDETAILSF_INDEX: Int = 0

public val ACM_FORMATDETAILSF_QUERYMASK: Int = 15

public val ACM_FORMATENUMF_CONVERT: Int = 1048576

public val ACM_FORMATENUMF_HARDWARE: Int = 4194304

public val ACM_FORMATENUMF_INPUT: Int = 8388608

public val ACM_FORMATENUMF_NCHANNELS: Int = 131072

public val ACM_FORMATENUMF_NSAMPLESPERSEC: Int = 262144

public val ACM_FORMATENUMF_OUTPUT: Int = 16777216

public val ACM_FORMATENUMF_SUGGEST: Int = 2097152

public val ACM_FORMATENUMF_WBITSPERSAMPLE: Int = 524288

public val ACM_FORMATENUMF_WFORMATTAG: Int = 65536

public val ACM_FORMATSUGGESTF_NCHANNELS: Int = 131072

public val ACM_FORMATSUGGESTF_NSAMPLESPERSEC: Int = 262144

public val ACM_FORMATSUGGESTF_TYPEMASK: Int = 16711680

public val ACM_FORMATSUGGESTF_WBITSPERSAMPLE: Int = 524288

public val ACM_FORMATSUGGESTF_WFORMATTAG: Int = 65536

public val ACM_FORMATTAGDETAILSF_FORMATTAG: Int = 1

public val ACM_FORMATTAGDETAILSF_INDEX: Int = 0

public val ACM_FORMATTAGDETAILSF_LARGESTSIZE: Int = 2

public val ACM_FORMATTAGDETAILSF_QUERYMASK: Int = 15

public val ACM_METRIC_COUNT_CODECS: UInt = 2u

public val ACM_METRIC_COUNT_CONVERTERS: UInt = 3u

public val ACM_METRIC_COUNT_DISABLED: UInt = 5u

public val ACM_METRIC_COUNT_DRIVERS: UInt = 1u

public val ACM_METRIC_COUNT_FILTERS: UInt = 4u

public val ACM_METRIC_COUNT_HARDWARE: UInt = 6u

public val ACM_METRIC_COUNT_LOCAL_CODECS: UInt = 21u

public val ACM_METRIC_COUNT_LOCAL_CONVERTERS: UInt = 22u

public val ACM_METRIC_COUNT_LOCAL_DISABLED: UInt = 24u

public val ACM_METRIC_COUNT_LOCAL_DRIVERS: UInt = 20u

public val ACM_METRIC_COUNT_LOCAL_FILTERS: UInt = 23u

public val ACM_METRIC_DRIVER_PRIORITY: UInt = 101u

public val ACM_METRIC_DRIVER_SUPPORT: UInt = 100u

public val ACM_METRIC_HARDWARE_WAVE_INPUT: UInt = 30u

public val ACM_METRIC_HARDWARE_WAVE_OUTPUT: UInt = 31u

public val ACM_METRIC_MAX_SIZE_FILTER: UInt = 51u

public val ACM_METRIC_MAX_SIZE_FORMAT: UInt = 50u

public val ACM_STREAMCONVERTF_BLOCKALIGN: UInt = 4u

public val ACM_STREAMCONVERTF_END: UInt = 32u

public val ACM_STREAMCONVERTF_START: UInt = 16u

public val ACM_STREAMOPENF_ASYNC: UInt = 2u

public val ACM_STREAMOPENF_NONREALTIME: UInt = 4u

public val ACM_STREAMOPENF_QUERY: UInt = 1u

public val ACM_STREAMSIZEF_DESTINATION: Int = 1

public val ACM_STREAMSIZEF_QUERYMASK: Int = 15

public val ACM_STREAMSIZEF_SOURCE: Int = 0

public val AMBISONICS_CHANNEL_ORDERING_ACN: AmbisonicsChannelOrdering = 0

public val AMBISONICS_NORMALIZATION_N3D: AmbisonicsNormalization = 1

public val AMBISONICS_NORMALIZATION_SN3D: AmbisonicsNormalization = 0

public val AMBISONICS_PARAM_VERSION_1: UInt = 1u

public val AMBISONICS_TYPE_FULL3D: AmbisonicsType = 0

public val AUDCLNT_BUFFERFLAGS_DATA_DISCONTINUITY: AudclntBufferflags = 1

public val AUDCLNT_BUFFERFLAGS_SILENT: AudclntBufferflags = 2

public val AUDCLNT_BUFFERFLAGS_TIMESTAMP_ERROR: AudclntBufferflags = 4

public val AUDCLNT_E_ALREADY_INITIALIZED: Hresult = 0x88890002u.toInt()

public val AUDCLNT_E_BUFDURATION_PERIOD_NOT_EQUAL: Hresult = 0x88890013u.toInt()

public val AUDCLNT_E_BUFFER_ERROR: Hresult = 0x88890018u.toInt()

public val AUDCLNT_E_BUFFER_OPERATION_PENDING: Hresult = 0x8889000Bu.toInt()

public val AUDCLNT_E_BUFFER_SIZE_ERROR: Hresult = 0x88890016u.toInt()

public val AUDCLNT_E_BUFFER_SIZE_NOT_ALIGNED: Hresult = 0x88890019u.toInt()

public val AUDCLNT_E_BUFFER_TOO_LARGE: Hresult = 0x88890006u.toInt()

public val AUDCLNT_E_CPUUSAGE_EXCEEDED: Hresult = 0x88890017u.toInt()

public val AUDCLNT_E_DEVICE_INVALIDATED: Hresult = 0x88890004u.toInt()

public val AUDCLNT_E_DEVICE_IN_USE: Hresult = 0x8889000Au.toInt()

public val AUDCLNT_E_EFFECT_NOT_AVAILABLE: Hresult = 0x88890041u.toInt()

public val AUDCLNT_E_EFFECT_STATE_READ_ONLY: Hresult = 0x88890042u.toInt()

public val AUDCLNT_E_ENDPOINT_CREATE_FAILED: Hresult = 0x8889000Fu.toInt()

public val AUDCLNT_E_ENDPOINT_OFFLOAD_NOT_CAPABLE: Hresult = 0x88890022u.toInt()

public val AUDCLNT_E_ENGINE_FORMAT_LOCKED: Hresult = 0x88890029u.toInt()

public val AUDCLNT_E_ENGINE_PERIODICITY_LOCKED: Hresult = 0x88890028u.toInt()

public val AUDCLNT_E_EVENTHANDLE_NOT_EXPECTED: Hresult = 0x88890011u.toInt()

public val AUDCLNT_E_EVENTHANDLE_NOT_SET: Hresult = 0x88890014u.toInt()

public val AUDCLNT_E_EXCLUSIVE_MODE_NOT_ALLOWED: Hresult = 0x8889000Eu.toInt()

public val AUDCLNT_E_EXCLUSIVE_MODE_ONLY: Hresult = 0x88890012u.toInt()

public val AUDCLNT_E_HEADTRACKING_ENABLED: Hresult = 0x88890030u.toInt()

public val AUDCLNT_E_HEADTRACKING_UNSUPPORTED: Hresult = 0x88890040u.toInt()

public val AUDCLNT_E_INCORRECT_BUFFER_SIZE: Hresult = 0x88890015u.toInt()

public val AUDCLNT_E_INVALID_DEVICE_PERIOD: Hresult = 0x88890020u.toInt()

public val AUDCLNT_E_INVALID_SIZE: Hresult = 0x88890009u.toInt()

public val AUDCLNT_E_INVALID_STREAM_FLAG: Hresult = 0x88890021u.toInt()

public val AUDCLNT_E_NONOFFLOAD_MODE_ONLY: Hresult = 0x88890025u.toInt()

public val AUDCLNT_E_NOT_INITIALIZED: Hresult = 0x88890001u.toInt()

public val AUDCLNT_E_NOT_STOPPED: Hresult = 0x88890005u.toInt()

public val AUDCLNT_E_OFFLOAD_MODE_ONLY: Hresult = 0x88890024u.toInt()

public val AUDCLNT_E_OUT_OF_OFFLOAD_RESOURCES: Hresult = 0x88890023u.toInt()

public val AUDCLNT_E_OUT_OF_ORDER: Hresult = 0x88890007u.toInt()

public val AUDCLNT_E_RAW_MODE_UNSUPPORTED: Hresult = 0x88890027u.toInt()

public val AUDCLNT_E_RESOURCES_INVALIDATED: Hresult = 0x88890026u.toInt()

public val AUDCLNT_E_SERVICE_NOT_RUNNING: Hresult = 0x88890010u.toInt()

public val AUDCLNT_E_THREAD_NOT_REGISTERED: Hresult = 0x8889000Cu.toInt()

public val AUDCLNT_E_UNSUPPORTED_FORMAT: Hresult = 0x88890008u.toInt()

public val AUDCLNT_E_WRONG_ENDPOINT_TYPE: Hresult = 0x88890003u.toInt()

public val AUDCLNT_SESSIONFLAGS_DISPLAY_HIDE: UInt = 536870912u

public val AUDCLNT_SESSIONFLAGS_DISPLAY_HIDEWHENEXPIRED: UInt = 1073741824u

public val AUDCLNT_SESSIONFLAGS_EXPIREWHENUNOWNED: UInt = 268435456u

public val AUDCLNT_SHAREMODE_EXCLUSIVE: AudclntSharemode = 1

public val AUDCLNT_SHAREMODE_SHARED: AudclntSharemode = 0

public val AUDCLNT_STREAMFLAGS_AUTOCONVERTPCM: UInt = 2147483648u

public val AUDCLNT_STREAMFLAGS_CROSSPROCESS: UInt = 65536u

public val AUDCLNT_STREAMFLAGS_EVENTCALLBACK: UInt = 262144u

public val AUDCLNT_STREAMFLAGS_LOOPBACK: UInt = 131072u

public val AUDCLNT_STREAMFLAGS_NOPERSIST: UInt = 524288u

public val AUDCLNT_STREAMFLAGS_RATEADJUST: UInt = 1048576u

public val AUDCLNT_STREAMFLAGS_SRC_DEFAULT_QUALITY: UInt = 134217728u

public val AUDCLNT_STREAMOPTIONS_AMBISONICS: AudclntStreamoptions = 4

public val AUDCLNT_STREAMOPTIONS_MATCH_FORMAT: AudclntStreamoptions = 2

public val AUDCLNT_STREAMOPTIONS_NONE: AudclntStreamoptions = 0

public val AUDCLNT_STREAMOPTIONS_RAW: AudclntStreamoptions = 1

public val AUDCLNT_S_BUFFER_EMPTY: Hresult = 0x8890001u.toInt()

public val AUDCLNT_S_POSITION_STALLED: Hresult = 0x8890003u.toInt()

public val AUDCLNT_S_THREAD_ALREADY_REGISTERED: Hresult = 0x8890002u.toInt()

public val AUDIOCLIENT_ACTIVATION_TYPE_DEFAULT: AudioclientActivationType = 0

public val AUDIOCLIENT_ACTIVATION_TYPE_PROCESS_LOOPBACK: AudioclientActivationType = 1

public val AUDIOCLOCK_CHARACTERISTIC_FIXED_FREQ: UInt = 1u

public val AUDIO_DUCKING_OPTIONS_DEFAULT: AudioDuckingOptions = 0

public val AUDIO_DUCKING_OPTIONS_DO_NOT_DUCK_OTHER_STREAMS: AudioDuckingOptions = 1

public val AUDIO_EFFECT_STATE_OFF: AudioEffectState = 0

public val AUDIO_EFFECT_STATE_ON: AudioEffectState = 1

public val AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_DEFAULT: AudioSystemeffectsPropertystoreType = 0

public val AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_ENUM_COUNT: AudioSystemeffectsPropertystoreType = 3

public val AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_USER: AudioSystemeffectsPropertystoreType = 1

public val AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_VOLATILE: AudioSystemeffectsPropertystoreType = 2

public val AUXCAPS_AUXIN: UInt = 2u

public val AUXCAPS_CDAUDIO: UInt = 1u

public val AUXCAPS_LRVOLUME: UInt = 2u

public val AUXCAPS_VOLUME: UInt = 1u

public val AUDIO_CATEGORY_ALERTS: AudioStreamCategory = 4

public val AUDIO_CATEGORY_COMMUNICATIONS: AudioStreamCategory = 3

public val AUDIO_CATEGORY_FAR_FIELD_SPEECH: AudioStreamCategory = 12

public val AUDIO_CATEGORY_FOREGROUND_ONLY_MEDIA: AudioStreamCategory = 1

public val AUDIO_CATEGORY_GAME_CHAT: AudioStreamCategory = 8

public val AUDIO_CATEGORY_GAME_EFFECTS: AudioStreamCategory = 6

public val AUDIO_CATEGORY_GAME_MEDIA: AudioStreamCategory = 7

public val AUDIO_CATEGORY_MEDIA: AudioStreamCategory = 11

public val AUDIO_CATEGORY_MOVIE: AudioStreamCategory = 10

public val AUDIO_CATEGORY_OTHER: AudioStreamCategory = 0

public val AUDIO_CATEGORY_SOUND_EFFECTS: AudioStreamCategory = 5

public val AUDIO_CATEGORY_SPEECH: AudioStreamCategory = 9

public val AUDIO_CATEGORY_UNIFORM_SPEECH: AudioStreamCategory = 13

public val AUDIO_CATEGORY_VOICE_TYPING: AudioStreamCategory = 14

public val AUDIO_OBJECT_TYPE_BACK_CENTER: AudioObjectType = 131072

public val AUDIO_OBJECT_TYPE_BACK_LEFT: AudioObjectType = 128

public val AUDIO_OBJECT_TYPE_BACK_RIGHT: AudioObjectType = 256

public val AUDIO_OBJECT_TYPE_BOTTOM_BACK_LEFT: AudioObjectType = 32768

public val AUDIO_OBJECT_TYPE_BOTTOM_BACK_RIGHT: AudioObjectType = 65536

public val AUDIO_OBJECT_TYPE_BOTTOM_FRONT_LEFT: AudioObjectType = 8192

public val AUDIO_OBJECT_TYPE_BOTTOM_FRONT_RIGHT: AudioObjectType = 16384

public val AUDIO_OBJECT_TYPE_DYNAMIC: AudioObjectType = 1

public val AUDIO_OBJECT_TYPE_FRONT_CENTER: AudioObjectType = 8

public val AUDIO_OBJECT_TYPE_FRONT_LEFT: AudioObjectType = 2

public val AUDIO_OBJECT_TYPE_FRONT_RIGHT: AudioObjectType = 4

public val AUDIO_OBJECT_TYPE_LOW_FREQUENCY: AudioObjectType = 16

public val AUDIO_OBJECT_TYPE_NONE: AudioObjectType = 0

public val AUDIO_OBJECT_TYPE_SIDE_LEFT: AudioObjectType = 32

public val AUDIO_OBJECT_TYPE_SIDE_RIGHT: AudioObjectType = 64

public val AUDIO_OBJECT_TYPE_TOP_BACK_LEFT: AudioObjectType = 2048

public val AUDIO_OBJECT_TYPE_TOP_BACK_RIGHT: AudioObjectType = 4096

public val AUDIO_OBJECT_TYPE_TOP_FRONT_LEFT: AudioObjectType = 512

public val AUDIO_OBJECT_TYPE_TOP_FRONT_RIGHT: AudioObjectType = 1024

public val AUDIO_SESSION_STATE_ACTIVE: AudioSessionState = 1

public val AUDIO_SESSION_STATE_EXPIRED: AudioSessionState = 2

public val AUDIO_SESSION_STATE_INACTIVE: AudioSessionState = 0

public val CALLBACK_EVENT: MidiWaveOpenType = 327680u

public val CALLBACK_FUNCTION: MidiWaveOpenType = 196608u

public val CALLBACK_NULL: MidiWaveOpenType = 0u

public val CALLBACK_TASK: MidiWaveOpenType = 131072u

public val CALLBACK_THREAD: MidiWaveOpenType = 131072u

public val CALLBACK_TYPEMASK: MidiWaveOpenType = 458752u

public val CALLBACK_WINDOW: MidiWaveOpenType = 65536u

public val CONNECTOR: PartType = 0

public val DEVICE_STATEMASK_ALL: UInt = 15u

public val DEVICE_STATE_ACTIVE: DeviceState = 1u

public val DEVICE_STATE_DISABLED: DeviceState = 2u

public val DEVICE_STATE_NOTPRESENT: DeviceState = 4u

public val DEVICE_STATE_UNPLUGGED: DeviceState = 8u

public val DRVM_MAPPER: UInt = 8192u

public val DRVM_MAPPER_STATUS: UInt = 8192u

public val DRV_MAPPER_PREFERRED_INPUT_GET: UInt = 16384u

public val DRV_MAPPER_PREFERRED_OUTPUT_GET: UInt = 16386u

public val DIGITAL_AUDIO_DISPLAY_DEVICE: EndpointFormFactor = 9

public val DISCONNECT_REASON_DEVICE_REMOVAL: AudioSessionDisconnectReason = 0

public val DISCONNECT_REASON_EXCLUSIVE_MODE_OVERRIDE: AudioSessionDisconnectReason = 5

public val DISCONNECT_REASON_FORMAT_CHANGED: AudioSessionDisconnectReason = 2

public val DISCONNECT_REASON_SERVER_SHUTDOWN: AudioSessionDisconnectReason = 1

public val DISCONNECT_REASON_SESSION_DISCONNECTED: AudioSessionDisconnectReason = 4

public val DISCONNECT_REASON_SESSION_LOGOFF: AudioSessionDisconnectReason = 3

public val E_DATA_FLOW_ENUM_COUNT: EDataFlow = 3

public val ENDPOINT_FORMAT_RESET_MIX_ONLY: UInt = 1u

public val ENDPOINT_HARDWARE_SUPPORT_METER: UInt = 4u

public val ENDPOINT_HARDWARE_SUPPORT_MUTE: UInt = 2u

public val ENDPOINT_HARDWARE_SUPPORT_VOLUME: UInt = 1u

public val ENDPOINT_SYSFX_DISABLED: UInt = 1u

public val ENDPOINT_SYSFX_ENABLED: UInt = 0u

public val E_ROLE_ENUM_COUNT: ERole = 3

public val ENDPOINT_FORM_FACTOR_ENUM_COUNT: EndpointFormFactor = 11

public val FILTERCHOOSE_CUSTOM_VERIFY: UInt = 2u

public val FILTERCHOOSE_FILTERTAG_VERIFY: UInt = 0u

public val FILTERCHOOSE_FILTER_VERIFY: UInt = 1u

public val FILTERCHOOSE_MESSAGE: UInt = 0u

public val FORMATCHOOSE_CUSTOM_VERIFY: UInt = 2u

public val FORMATCHOOSE_FORMATTAG_VERIFY: UInt = 0u

public val FORMATCHOOSE_FORMAT_VERIFY: UInt = 1u

public val FORMATCHOOSE_MESSAGE: UInt = 0u

public val FULL: AudioStateMonitorSoundLevel = 2

public val HANDSET: EndpointFormFactor = 6

public val HEADPHONES: EndpointFormFactor = 3

public val HEADSET: EndpointFormFactor = 5

public val IN: DataFlow = 0

public val LINE_LEVEL: EndpointFormFactor = 2

public val LOW: AudioStateMonitorSoundLevel = 1

public val MEVT_COMMENT: UByte = 130u.toUByte()

public val MEVT_F_CALLBACK: Int = 1073741824

public val MEVT_F_LONG: Int = -2147483648.toInt()

public val MEVT_F_SHORT: Int = 0

public val MEVT_LONGMSG: UByte = 128u.toUByte()

public val MEVT_NOP: UByte = 2u.toUByte()

public val MEVT_SHORTMSG: UByte = 0u.toUByte()

public val MEVT_TEMPO: UByte = 1u.toUByte()

public val MEVT_VERSION: UByte = 132u.toUByte()

public val MHDR_DONE: UInt = 1u

public val MHDR_INQUEUE: UInt = 4u

public val MHDR_ISSTRM: UInt = 8u

public val MHDR_PREPARED: UInt = 2u

public val MIDICAPS_CACHE: UInt = 4u

public val MIDICAPS_LRVOLUME: UInt = 2u

public val MIDICAPS_STREAM: UInt = 8u

public val MIDICAPS_VOLUME: UInt = 1u

public val MIDIERR_BADOPENMODE: UInt = 70u

public val MIDIERR_DONT_CONTINUE: UInt = 71u

public val MIDIERR_INVALIDSETUP: UInt = 69u

public val MIDIERR_LASTERROR: UInt = 71u

public val MIDIERR_NODEVICE: UInt = 68u

public val MIDIERR_NOMAP: UInt = 66u

public val MIDIERR_NOTREADY: UInt = 67u

public val MIDIERR_STILLPLAYING: UInt = 65u

public val MIDIERR_UNPREPARED: UInt = 64u

public val MIDIPATCHSIZE: UInt = 128u

public val MIDIPROP_GET: Int = 1073741824

public val MIDIPROP_SET: Int = -2147483648.toInt()

public val MIDIPROP_TEMPO: Int = 2

public val MIDIPROP_TIMEDIV: Int = 1

public val MIDISTRM_ERROR: Int = -2

public val MIDI_CACHE_ALL: UInt = 1u

public val MIDI_CACHE_BESTFIT: UInt = 2u

public val MIDI_CACHE_QUERY: UInt = 3u

public val MIDI_IO_STATUS: MidiWaveOpenType = 32u

public val MIDI_UNCACHE: UInt = 4u

public val MIXERCONTROL_CONTROLF_DISABLED: Int = -2147483648.toInt()

public val MIXERCONTROL_CONTROLF_MULTIPLE: Int = 2

public val MIXERCONTROL_CONTROLF_UNIFORM: Int = 1

public val MIXERCONTROL_CONTROLTYPE_BASS: UInt = 1342373890u

public val MIXERCONTROL_CONTROLTYPE_BASS_BOOST: UInt = 536945271u

public val MIXERCONTROL_CONTROLTYPE_BOOLEAN: UInt = 536936448u

public val MIXERCONTROL_CONTROLTYPE_BOOLEANMETER: UInt = 268500992u

public val MIXERCONTROL_CONTROLTYPE_BUTTON: UInt = 553713664u

public val MIXERCONTROL_CONTROLTYPE_CUSTOM: UInt = 0u

public val MIXERCONTROL_CONTROLTYPE_DECIBELS: UInt = 805568512u

public val MIXERCONTROL_CONTROLTYPE_EQUALIZER: UInt = 1342373892u

public val MIXERCONTROL_CONTROLTYPE_FADER: UInt = 1342373888u

public val MIXERCONTROL_CONTROLTYPE_LOUDNESS: UInt = 536936452u

public val MIXERCONTROL_CONTROLTYPE_MICROTIME: UInt = 1610809344u

public val MIXERCONTROL_CONTROLTYPE_MILLITIME: UInt = 1627586560u

public val MIXERCONTROL_CONTROLTYPE_MIXER: UInt = 1895890945u

public val MIXERCONTROL_CONTROLTYPE_MONO: UInt = 536936451u

public val MIXERCONTROL_CONTROLTYPE_MULTIPLESELECT: UInt = 1895890944u

public val MIXERCONTROL_CONTROLTYPE_MUTE: UInt = 536936450u

public val MIXERCONTROL_CONTROLTYPE_MUX: UInt = 1879113729u

public val MIXERCONTROL_CONTROLTYPE_ONOFF: UInt = 536936449u

public val MIXERCONTROL_CONTROLTYPE_PAN: UInt = 1073872897u

public val MIXERCONTROL_CONTROLTYPE_PEAKMETER: UInt = 268566529u

public val MIXERCONTROL_CONTROLTYPE_PERCENT: UInt = 805634048u

public val MIXERCONTROL_CONTROLTYPE_QSOUNDPAN: UInt = 1073872898u

public val MIXERCONTROL_CONTROLTYPE_SIGNED: UInt = 805437440u

public val MIXERCONTROL_CONTROLTYPE_SIGNEDMETER: UInt = 268566528u

public val MIXERCONTROL_CONTROLTYPE_SINGLESELECT: UInt = 1879113728u

public val MIXERCONTROL_CONTROLTYPE_SLIDER: UInt = 1073872896u

public val MIXERCONTROL_CONTROLTYPE_STEREOENH: UInt = 536936453u

public val MIXERCONTROL_CONTROLTYPE_TREBLE: UInt = 1342373891u

public val MIXERCONTROL_CONTROLTYPE_UNSIGNED: UInt = 805502976u

public val MIXERCONTROL_CONTROLTYPE_UNSIGNEDMETER: UInt = 268632064u

public val MIXERCONTROL_CONTROLTYPE_VOLUME: UInt = 1342373889u

public val MIXERCONTROL_CT_CLASS_CUSTOM: Int = 0

public val MIXERCONTROL_CT_CLASS_FADER: Int = 1342177280

public val MIXERCONTROL_CT_CLASS_LIST: Int = 1879048192

public val MIXERCONTROL_CT_CLASS_MASK: Int = -268435456

public val MIXERCONTROL_CT_CLASS_METER: Int = 268435456

public val MIXERCONTROL_CT_CLASS_NUMBER: Int = 805306368

public val MIXERCONTROL_CT_CLASS_SLIDER: Int = 1073741824

public val MIXERCONTROL_CT_CLASS_SWITCH: Int = 536870912

public val MIXERCONTROL_CT_CLASS_TIME: Int = 1610612736

public val MIXERCONTROL_CT_SC_LIST_MULTIPLE: Int = 16777216

public val MIXERCONTROL_CT_SC_LIST_SINGLE: Int = 0

public val MIXERCONTROL_CT_SC_METER_POLLED: Int = 0

public val MIXERCONTROL_CT_SC_SWITCH_BOOLEAN: Int = 0

public val MIXERCONTROL_CT_SC_SWITCH_BUTTON: Int = 16777216

public val MIXERCONTROL_CT_SC_TIME_MICROSECS: Int = 0

public val MIXERCONTROL_CT_SC_TIME_MILLISECS: Int = 16777216

public val MIXERCONTROL_CT_SUBCLASS_MASK: Int = 251658240

public val MIXERCONTROL_CT_UNITS_BOOLEAN: Int = 65536

public val MIXERCONTROL_CT_UNITS_CUSTOM: Int = 0

public val MIXERCONTROL_CT_UNITS_DECIBELS: Int = 262144

public val MIXERCONTROL_CT_UNITS_MASK: Int = 16711680

public val MIXERCONTROL_CT_UNITS_PERCENT: Int = 327680

public val MIXERCONTROL_CT_UNITS_SIGNED: Int = 131072

public val MIXERCONTROL_CT_UNITS_UNSIGNED: Int = 196608

public val MIXERLINE_COMPONENTTYPE_DST_DIGITAL: MixerlineComponenttype = 1u

public val MIXERLINE_COMPONENTTYPE_DST_FIRST: Int = 0

public val MIXERLINE_COMPONENTTYPE_DST_HEADPHONES: MixerlineComponenttype = 5u

public val MIXERLINE_COMPONENTTYPE_DST_LAST: UInt = 8u

public val MIXERLINE_COMPONENTTYPE_DST_LINE: MixerlineComponenttype = 2u

public val MIXERLINE_COMPONENTTYPE_DST_MONITOR: MixerlineComponenttype = 3u

public val MIXERLINE_COMPONENTTYPE_DST_SPEAKERS: MixerlineComponenttype = 4u

public val MIXERLINE_COMPONENTTYPE_DST_TELEPHONE: MixerlineComponenttype = 6u

public val MIXERLINE_COMPONENTTYPE_DST_UNDEFINED: MixerlineComponenttype = 0u

public val MIXERLINE_COMPONENTTYPE_DST_VOICEIN: MixerlineComponenttype = 8u

public val MIXERLINE_COMPONENTTYPE_DST_WAVEIN: MixerlineComponenttype = 7u

public val MIXERLINE_COMPONENTTYPE_SRC_ANALOG: MixerlineComponenttype = 4106u

public val MIXERLINE_COMPONENTTYPE_SRC_AUXILIARY: MixerlineComponenttype = 4105u

public val MIXERLINE_COMPONENTTYPE_SRC_COMPACTDISC: MixerlineComponenttype = 4101u

public val MIXERLINE_COMPONENTTYPE_SRC_DIGITAL: MixerlineComponenttype = 4097u

public val MIXERLINE_COMPONENTTYPE_SRC_FIRST: Int = 4096

public val MIXERLINE_COMPONENTTYPE_SRC_LAST: UInt = 4106u

public val MIXERLINE_COMPONENTTYPE_SRC_LINE: MixerlineComponenttype = 4098u

public val MIXERLINE_COMPONENTTYPE_SRC_MICROPHONE: MixerlineComponenttype = 4099u

public val MIXERLINE_COMPONENTTYPE_SRC_PCSPEAKER: MixerlineComponenttype = 4103u

public val MIXERLINE_COMPONENTTYPE_SRC_SYNTHESIZER: MixerlineComponenttype = 4100u

public val MIXERLINE_COMPONENTTYPE_SRC_TELEPHONE: MixerlineComponenttype = 4102u

public val MIXERLINE_COMPONENTTYPE_SRC_UNDEFINED: MixerlineComponenttype = 4096u

public val MIXERLINE_COMPONENTTYPE_SRC_WAVEOUT: MixerlineComponenttype = 4104u

public val MIXERLINE_LINEF_ACTIVE: Int = 1

public val MIXERLINE_LINEF_DISCONNECTED: Int = 32768

public val MIXERLINE_LINEF_SOURCE: Int = -2147483648.toInt()

public val MIXERLINE_TARGETTYPE_AUX: UInt = 5u

public val MIXERLINE_TARGETTYPE_MIDIIN: UInt = 4u

public val MIXERLINE_TARGETTYPE_MIDIOUT: UInt = 3u

public val MIXERLINE_TARGETTYPE_UNDEFINED: UInt = 0u

public val MIXERLINE_TARGETTYPE_WAVEIN: UInt = 2u

public val MIXERLINE_TARGETTYPE_WAVEOUT: UInt = 1u

public val MIXERR_INVALCONTROL: UInt = 1025u

public val MIXERR_INVALLINE: UInt = 1024u

public val MIXERR_INVALVALUE: UInt = 1026u

public val MIXERR_LASTERROR: UInt = 1026u

public val MIXER_GETCONTROLDETAILSF_LISTTEXT: Int = 1

public val MIXER_GETCONTROLDETAILSF_QUERYMASK: Int = 15

public val MIXER_GETCONTROLDETAILSF_VALUE: Int = 0

public val MIXER_GETLINECONTROLSF_ALL: Int = 0

public val MIXER_GETLINECONTROLSF_ONEBYID: Int = 1

public val MIXER_GETLINECONTROLSF_ONEBYTYPE: Int = 2

public val MIXER_GETLINECONTROLSF_QUERYMASK: Int = 15

public val MIXER_GETLINEINFOF_COMPONENTTYPE: Int = 3

public val MIXER_GETLINEINFOF_DESTINATION: Int = 0

public val MIXER_GETLINEINFOF_LINEID: Int = 2

public val MIXER_GETLINEINFOF_QUERYMASK: Int = 15

public val MIXER_GETLINEINFOF_SOURCE: Int = 1

public val MIXER_GETLINEINFOF_TARGETTYPE: Int = 4

public val MIXER_LONG_NAME_CHARS: UInt = 64u

public val MIXER_OBJECTF_AUX: Int = 1342177280

public val MIXER_OBJECTF_HANDLE: Int = -2147483648.toInt()

public val MIXER_OBJECTF_MIDIIN: Int = 1073741824

public val MIXER_OBJECTF_MIDIOUT: Int = 805306368

public val MIXER_OBJECTF_MIXER: Int = 0

public val MIXER_OBJECTF_WAVEIN: Int = 536870912

public val MIXER_OBJECTF_WAVEOUT: Int = 268435456

public val MIXER_SETCONTROLDETAILSF_CUSTOM: Int = 1

public val MIXER_SETCONTROLDETAILSF_QUERYMASK: Int = 15

public val MIXER_SETCONTROLDETAILSF_VALUE: Int = 0

public val MIXER_SHORT_NAME_CHARS: UInt = 16u

public val MM_ACM_FILTERCHOOSE: UInt = 32768u

public val MM_ACM_FORMATCHOOSE: UInt = 32768u

public val MOD_FMSYNTH: UInt = 4u

public val MOD_MAPPER: UInt = 5u

public val MOD_MIDIPORT: UInt = 1u

public val MOD_SQSYNTH: UInt = 3u

public val MOD_SWSYNTH: UInt = 7u

public val MOD_SYNTH: UInt = 2u

public val MOD_WAVETABLE: UInt = 6u

public val MICROPHONE: EndpointFormFactor = 4

public val MUTED: AudioStateMonitorSoundLevel = 0

public val OUT: DataFlow = 1

public val PROCESS_LOOPBACK_MODE_EXCLUDE_TARGET_PROCESS_TREE: ProcessLoopbackMode = 1

public val PROCESS_LOOPBACK_MODE_INCLUDE_TARGET_PROCESS_TREE: ProcessLoopbackMode = 0

public val REMOTE_NETWORK_DEVICE: EndpointFormFactor = 0

public val SND_ALIAS: SndFlags = 65536u

public val SND_ALIAS_ID: SndFlags = 1114112u

public val SND_ALIAS_START: UInt = 0u

public val SND_APPLICATION: SndFlags = 128u

public val SND_ASYNC: SndFlags = 1u

public val SND_FILENAME: SndFlags = 131072u

public val SND_LOOP: SndFlags = 8u

public val SND_MEMORY: SndFlags = 4u

public val SND_NODEFAULT: SndFlags = 2u

public val SND_NOSTOP: SndFlags = 16u

public val SND_NOWAIT: SndFlags = 8192u

public val SND_PURGE: SndFlags = 64u

public val SND_RESOURCE: SndFlags = 262148u

public val SND_RING: Int = 1048576

public val SND_SENTRY: SndFlags = 524288u

public val SND_SYNC: SndFlags = 0u

public val SND_SYSTEM: SndFlags = 2097152u

public val SPATIAL_AUDIO_POSITION: UInt = 200u

public val SPATIAL_AUDIO_STANDARD_COMMANDS_START: UInt = 200u

public val SPATIAL_AUDIO_STREAM_OPTIONS_NONE: SpatialAudioStreamOptions = 0

public val SPATIAL_AUDIO_STREAM_OPTIONS_OFFLOAD: SpatialAudioStreamOptions = 1

public val SPDIF: EndpointFormFactor = 8

public val SPTLAUDCLNT_E_DESTROYED: Hresult = 0x88890100u.toInt()

public val SPTLAUDCLNT_E_ERRORS_IN_OBJECT_CALLS: Hresult = 0x88890105u.toInt()

public val SPTLAUDCLNT_E_INTERNAL: Hresult = 0x8889010Du.toInt()

public val SPTLAUDCLNT_E_INVALID_LICENSE: Hresult = 0x88890108u.toInt()

public val SPTLAUDCLNT_E_METADATA_FORMAT_NOT_SUPPORTED: Hresult = 0x88890106u.toInt()

public val SPTLAUDCLNT_E_NO_MORE_OBJECTS: Hresult = 0x88890103u.toInt()

public val SPTLAUDCLNT_E_OBJECT_ALREADY_ACTIVE: Hresult = 0x8889010Cu.toInt()

public val SPTLAUDCLNT_E_OUT_OF_ORDER: Hresult = 0x88890101u.toInt()

public val SPTLAUDCLNT_E_PROPERTY_NOT_SUPPORTED: Hresult = 0x88890104u.toInt()

public val SPTLAUDCLNT_E_RESOURCES_INVALIDATED: Hresult = 0x88890102u.toInt()

public val SPTLAUDCLNT_E_STATIC_OBJECT_NOT_AVAILABLE: Hresult = 0x8889010Bu.toInt()

public val SPTLAUDCLNT_E_STREAM_NOT_AVAILABLE: Hresult = 0x88890107u.toInt()

public val SPTLAUDCLNT_E_STREAM_NOT_STOPPED: Hresult = 0x8889010Au.toInt()

public val SPTLAUD_MD_CLNT_E_ATTACH_FAILED_INTERNAL_BUFFER: Hresult = 0x88890214u.toInt()

public val SPTLAUD_MD_CLNT_E_BUFFER_ALREADY_ATTACHED: Hresult = 0x88890207u.toInt()

public val SPTLAUD_MD_CLNT_E_BUFFER_NOT_ATTACHED: Hresult = 0x88890208u.toInt()

public val SPTLAUD_MD_CLNT_E_BUFFER_STILL_ATTACHED: Hresult = 0x88890224u.toInt()

public val SPTLAUD_MD_CLNT_E_COMMAND_ALREADY_WRITTEN: Hresult = 0x88890222u.toInt()

public val SPTLAUD_MD_CLNT_E_COMMAND_NOT_FOUND: Hresult = 0x88890200u.toInt()

public val SPTLAUD_MD_CLNT_E_DETACH_FAILED_INTERNAL_BUFFER: Hresult = 0x88890215u.toInt()

public val SPTLAUD_MD_CLNT_E_FORMAT_MISMATCH: Hresult = 0x88890223u.toInt()

public val SPTLAUD_MD_CLNT_E_FRAMECOUNT_OUT_OF_RANGE: Hresult = 0x88890209u.toInt()

public val SPTLAUD_MD_CLNT_E_FRAMEOFFSET_OUT_OF_RANGE: Hresult = 0x88890218u.toInt()

public val SPTLAUD_MD_CLNT_E_INVALID_ARGS: Hresult = 0x88890202u.toInt()

public val SPTLAUD_MD_CLNT_E_ITEMS_ALREADY_OPEN: Hresult = 0x88890213u.toInt()

public val SPTLAUD_MD_CLNT_E_ITEMS_LOCKED_FOR_WRITING: Hresult = 0x88890225u.toInt()

public val SPTLAUD_MD_CLNT_E_ITEM_COPY_OVERFLOW: Hresult = 0x88890211u.toInt()

public val SPTLAUD_MD_CLNT_E_ITEM_MUST_HAVE_COMMANDS: Hresult = 0x88890219u.toInt()

public val SPTLAUD_MD_CLNT_E_MEMORY_BOUNDS: Hresult = 0x88890205u.toInt()

public val SPTLAUD_MD_CLNT_E_METADATA_FORMAT_NOT_FOUND: Hresult = 0x88890203u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_BUFFER_ATTACHED: Hresult = 0x88890216u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_ITEMOFFSET_WRITTEN: Hresult = 0x88890220u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_ITEMS_FOUND: Hresult = 0x88890210u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_ITEMS_OPEN: Hresult = 0x88890212u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_ITEMS_WRITTEN: Hresult = 0x88890221u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_MORE_COMMANDS: Hresult = 0x88890206u.toInt()

public val SPTLAUD_MD_CLNT_E_NO_MORE_ITEMS: Hresult = 0x88890217u.toInt()

public val SPTLAUD_MD_CLNT_E_OBJECT_NOT_INITIALIZED: Hresult = 0x88890201u.toInt()

public val SPTLAUD_MD_CLNT_E_VALUE_BUFFER_INCORRECT_SIZE: Hresult = 0x88890204u.toInt()

public val SPATIAL_AUDIO_HRTF_DIRECTIVITY_CARDIOID: SpatialAudioHrtfDirectivityType = 1

public val SPATIAL_AUDIO_HRTF_DIRECTIVITY_CONE: SpatialAudioHrtfDirectivityType = 2

public val SPATIAL_AUDIO_HRTF_DIRECTIVITY_OMNI_DIRECTIONAL: SpatialAudioHrtfDirectivityType = 0

public val SPATIAL_AUDIO_HRTF_DISTANCE_DECAY_CUSTOM_DECAY: SpatialAudioHrtfDistanceDecayType = 1

public val SPATIAL_AUDIO_HRTF_DISTANCE_DECAY_NATURAL_DECAY: SpatialAudioHrtfDistanceDecayType = 0

public val SPATIAL_AUDIO_HRTF_ENVIRONMENT_AVERAGE: SpatialAudioHrtfEnvironmentType = 4

public val SPATIAL_AUDIO_HRTF_ENVIRONMENT_LARGE: SpatialAudioHrtfEnvironmentType = 2

public val SPATIAL_AUDIO_HRTF_ENVIRONMENT_MEDIUM: SpatialAudioHrtfEnvironmentType = 1

public val SPATIAL_AUDIO_HRTF_ENVIRONMENT_OUTDOORS: SpatialAudioHrtfEnvironmentType = 3

public val SPATIAL_AUDIO_HRTF_ENVIRONMENT_SMALL: SpatialAudioHrtfEnvironmentType = 0

public val SPATIAL_AUDIO_METADATA_COPY_APPEND: SpatialAudioMetadataCopyMode = 1

public val SPATIAL_AUDIO_METADATA_COPY_APPEND_MERGE_WITH_FIRST: SpatialAudioMetadataCopyMode = 3

public val SPATIAL_AUDIO_METADATA_COPY_APPEND_MERGE_WITH_LAST: SpatialAudioMetadataCopyMode = 2

public val SPATIAL_AUDIO_METADATA_COPY_OVERWRITE: SpatialAudioMetadataCopyMode = 0

public val SPATIAL_AUDIO_METADATA_WRITER_OVERFLOW_FAIL: SpatialAudioMetadataWriterOverflowMode = 0

public val SPATIAL_AUDIO_METADATA_WRITER_OVERFLOW_MERGE_WITH_LAST: SpatialAudioMetadataWriterOverflowMode = 2

public val SPATIAL_AUDIO_METADATA_WRITER_OVERFLOW_MERGE_WITH_NEW: SpatialAudioMetadataWriterOverflowMode = 1

public val SPEAKERS: EndpointFormFactor = 1

public val SUBUNIT: PartType = 1

public val UNKNOWN_DIGITAL_PASSTHROUGH: EndpointFormFactor = 7

public val UNKNOWN_FORM_FACTOR: EndpointFormFactor = 10

public val VIRTUAL_AUDIO_DEVICE_PROCESS_LOOPBACK: Pcwstr = w("VAD\\Process_Loopback")

public val WAVECAPS_LRVOLUME: UInt = 8u

public val WAVECAPS_PITCH: UInt = 1u

public val WAVECAPS_PLAYBACKRATE: UInt = 2u

public val WAVECAPS_SAMPLEACCURATE: UInt = 32u

public val WAVECAPS_SYNC: UInt = 16u

public val WAVECAPS_VOLUME: UInt = 4u

public val WAVEIN_MAPPER_STATUS_DEVICE: UInt = 0u

public val WAVEIN_MAPPER_STATUS_FORMAT: UInt = 2u

public val WAVEIN_MAPPER_STATUS_MAPPED: UInt = 1u

public val WAVEOUT_MAPPER_STATUS_DEVICE: UInt = 0u

public val WAVEOUT_MAPPER_STATUS_FORMAT: UInt = 2u

public val WAVEOUT_MAPPER_STATUS_MAPPED: UInt = 1u

public val WAVERR_BADFORMAT: UInt = 32u

public val WAVERR_LASTERROR: UInt = 35u

public val WAVERR_STILLPLAYING: UInt = 33u

public val WAVERR_SYNC: UInt = 35u

public val WAVERR_UNPREPARED: UInt = 34u

public val WAVE_ALLOWSYNC: MidiWaveOpenType = 2u

public val WAVE_FORMAT_1M08: UInt = 1u

public val WAVE_FORMAT_1M16: UInt = 4u

public val WAVE_FORMAT_1S08: UInt = 2u

public val WAVE_FORMAT_1S16: UInt = 8u

public val WAVE_FORMAT_2M08: UInt = 16u

public val WAVE_FORMAT_2M16: UInt = 64u

public val WAVE_FORMAT_2S08: UInt = 32u

public val WAVE_FORMAT_2S16: UInt = 128u

public val WAVE_FORMAT_44M08: UInt = 256u

public val WAVE_FORMAT_44M16: UInt = 1024u

public val WAVE_FORMAT_44S08: UInt = 512u

public val WAVE_FORMAT_44S16: UInt = 2048u

public val WAVE_FORMAT_48M08: UInt = 4096u

public val WAVE_FORMAT_48M16: UInt = 16384u

public val WAVE_FORMAT_48S08: UInt = 8192u

public val WAVE_FORMAT_48S16: UInt = 32768u

public val WAVE_FORMAT_4M08: UInt = 256u

public val WAVE_FORMAT_4M16: UInt = 1024u

public val WAVE_FORMAT_4S08: UInt = 512u

public val WAVE_FORMAT_4S16: UInt = 2048u

public val WAVE_FORMAT_96M08: UInt = 65536u

public val WAVE_FORMAT_96M16: UInt = 262144u

public val WAVE_FORMAT_96S08: UInt = 131072u

public val WAVE_FORMAT_96S16: UInt = 524288u

public val WAVE_FORMAT_DIRECT: MidiWaveOpenType = 8u

public val WAVE_FORMAT_DIRECT_QUERY: MidiWaveOpenType = 9u

public val WAVE_FORMAT_PCM: UInt = 1u

public val WAVE_FORMAT_QUERY: MidiWaveOpenType = 1u

public val WAVE_INVALIDFORMAT: UInt = 0u

public val WAVE_MAPPED: MidiWaveOpenType = 4u

public val WAVE_MAPPED_DEFAULT_COMMUNICATION_DEVICE: MidiWaveOpenType = 16u

public val WAVE_MAPPER: UInt = 4294967295u

public val WHDR_BEGINLOOP: UInt = 4u

public val WHDR_DONE: UInt = 1u

public val WHDR_ENDLOOP: UInt = 8u

public val WHDR_INQUEUE: UInt = 16u

public val WHDR_PREPARED: UInt = 2u

public val WIDM_MAPPER_STATUS: UInt = 8192u

public val WODM_MAPPER_STATUS: UInt = 8192u

public val E_ALL: EDataFlow = 2

public val E_CAPTURE: EDataFlow = 1

public val E_COMMUNICATIONS: ERole = 2

public val E_CONSOLE: ERole = 0

public val E_MULTIMEDIA: ERole = 1

public val E_RENDER: EDataFlow = 0

public val DEVINTERFACE_AUDIO_CAPTURE: Guid = Guid.fromU128(U128(0x2eef81be33fa4800uL, 0x96701cd474972c3fuL))

public val DEVINTERFACE_AUDIO_RENDER: Guid = Guid.fromU128(U128(0xe6327caddcec4949uL, 0xae8a991e976a79d2uL))

public val DEVINTERFACE_MIDI_INPUT: Guid = Guid.fromU128(U128(0x504be32cccf64d2cuL, 0xb73f6f8b3747e22buL))

public val DEVINTERFACE_MIDI_OUTPUT: Guid = Guid.fromU128(U128(0x6dc23320ab334ce4uL, 0x80d4bbb3ebbf2814uL))

public val DEVICE_TOPOLOGY: Guid = Guid.fromU128(U128(0x1df639d05ec147aauL, 0x9379828dc1aa8c59uL))

public val EVENTCONTEXT_VOLUMESLIDER: Guid = Guid.fromU128(U128(0xe2c2e9de09b14b04uL, 0x84e507931225ee04uL))

public val MM_DEVICE_ENUMERATOR: Guid = Guid.fromU128(U128(0xbcde0395e52f467cuL, 0x8e3dc4579291692euL))

public val PKEY_AUDIO_ENDPOINT_LOGO_ICON_EFFECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf1ab780d20104ed3uL, 0xa3a68b87f0f0c476uL)), pid = 0u)

public val PKEY_AUDIO_ENDPOINT_LOGO_ICON_PATH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf1ab780d20104ed3uL, 0xa3a68b87f0f0c476uL)), pid = 1u)

public val PKEY_AUDIO_ENDPOINT_SETTINGS_LAUNCH_CONTRACT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1424200203204de4uL, 0x9555a7d82b73c286uL)), pid = 1u)

public val PKEY_AUDIO_ENDPOINT_SETTINGS_MENU_TEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1424200203204de4uL, 0x9555a7d82b73c286uL)), pid = 0u)

public val PKEY_AUDIO_ENDPOINT_ASSOCIATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 2u)

public val PKEY_AUDIO_ENDPOINT_CONTROL_PANEL_PAGE_PROVIDER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 1u)

public val PKEY_AUDIO_ENDPOINT_DEFAULT_VOLUME_IN_DB: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 9u)

public val PKEY_AUDIO_ENDPOINT_DISABLE_SYS_FX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 5u)

public val PKEY_AUDIO_ENDPOINT_FORM_FACTOR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 0u)

public val PKEY_AUDIO_ENDPOINT_FULL_RANGE_SPEAKERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 6u)

public val PKEY_AUDIO_ENDPOINT_GUID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 4u)

public val PKEY_AUDIO_ENDPOINT_JACK_SUB_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 8u)

public val PKEY_AUDIO_ENDPOINT_PHYSICAL_SPEAKERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 3u)

public val PKEY_AUDIO_ENDPOINT_SUPPORTS_EVENT_DRIVEN_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1da5d803d4924edduL, 0x8c23e0c0ffee7f0euL)), pid = 7u)

public val PKEY_AUDIO_ENGINE_DEVICE_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf19f064d082c4e27uL, 0xbc736882a1bb8e4cuL)), pid = 0u)

public val PKEY_AUDIO_ENGINE_OEM_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4870e263cc54cd2uL, 0xba46ca0a9a70ed04uL)), pid = 3u)
