package io.github.kotlinmania.windowssys.windows.win32.devices.cdrom

public val ADR_ENCODES_CURRENT_POSITION: UInt = 1u

public val ADR_ENCODES_ISRC: UInt = 3u

public val ADR_ENCODES_MEDIA_CATALOG: UInt = 2u

public val ADR_NO_MODE_INFORMATION: UInt = 0u

public val AUDIO_DATA_TRACK: UInt = 4u

public val AUDIO_STATUS_IN_PROGRESS: UInt = 17u

public val AUDIO_STATUS_NOT_SUPPORTED: UInt = 0u

public val AUDIO_STATUS_NO_STATUS: UInt = 21u

public val AUDIO_STATUS_PAUSED: UInt = 18u

public val AUDIO_STATUS_PLAY_COMPLETE: UInt = 19u

public val AUDIO_STATUS_PLAY_ERROR: UInt = 20u

public val AUDIO_WITH_PREEMPHASIS: UInt = 1u

public val CDDA: TrackModeType = 2

public val CDROM_CD_TEXT_PACK_ALBUM_NAME: UInt = 128u

public val CDROM_CD_TEXT_PACK_ARRANGER: UInt = 132u

public val CDROM_CD_TEXT_PACK_COMPOSER: UInt = 131u

public val CDROM_CD_TEXT_PACK_DISC_ID: UInt = 134u

public val CDROM_CD_TEXT_PACK_GENRE: UInt = 135u

public val CDROM_CD_TEXT_PACK_MESSAGES: UInt = 133u

public val CDROM_CD_TEXT_PACK_PERFORMER: UInt = 129u

public val CDROM_CD_TEXT_PACK_SIZE_INFO: UInt = 143u

public val CDROM_CD_TEXT_PACK_SONGWRITER: UInt = 130u

public val CDROM_CD_TEXT_PACK_TOC_INFO: UInt = 136u

public val CDROM_CD_TEXT_PACK_TOC_INFO2: UInt = 137u

public val CDROM_CD_TEXT_PACK_UPC_EAN: UInt = 142u

public val CDROM_DISK_AUDIO_TRACK: UInt = 1u

public val CDROM_DISK_DATA_TRACK: UInt = 2u

public val CDROM_EXCLUSIVE_CALLER_LENGTH: UInt = 64u

public val CDROM_IN_EXCLUSIVE_MODE: UInt = 1u

public val CDROM_LOCK_IGNORE_VOLUME: UInt = 1u

public val CDROM_NOT_IN_EXCLUSIVE_MODE: UInt = 0u

public val CDROM_NO_MEDIA_NOTIFICATIONS: UInt = 2u

public val CDROM_READ_TOC_EX_FORMAT_ATIP: UInt = 4u

public val CDROM_READ_TOC_EX_FORMAT_CDTEXT: UInt = 5u

public val CDROM_READ_TOC_EX_FORMAT_FULL_TOC: UInt = 2u

public val CDROM_READ_TOC_EX_FORMAT_PMA: UInt = 3u

public val CDROM_READ_TOC_EX_FORMAT_SESSION: UInt = 1u

public val CDROM_READ_TOC_EX_FORMAT_TOC: UInt = 0u

public val CD_RAW_READ_C2_SIZE: UInt = 296u

public val CD_RAW_READ_SUBCODE_SIZE: UInt = 96u

public val CD_RAW_SECTOR_WITH_C2_SIZE: UInt = 2648u

public val CD_RAW_SECTOR_WITH_SUBCODE_SIZE: UInt = 2448u

public val CDROM10NOMINAL20EXCEPTIONS: CdromPerformanceToleranceType = 1

public val CDROM_CAV_ROTATION: WriteRotation = 1

public val CDROM_DEFAULT_ROTATION: WriteRotation = 0

public val CDROM_ENTIRE_PERFORMANCE_LIST: CdromPerformanceExceptionType = 2

public val CDROM_NOMINAL_PERFORMANCE: CdromPerformanceExceptionType = 1

public val CDROM_PERFORMANCE_EXCEPTIONS_ONLY: CdromPerformanceExceptionType = 3

public val CDROM_PERFORMANCE_REQUEST: CdromPerformanceRequestType = 1

public val CDROM_READ_PERFORMANCE: CdromPerformanceType = 1

public val CDROM_SET_SPEED: CdromSpeedRequest = 0

public val CDROM_SET_STREAMING: CdromSpeedRequest = 1

public val CDROM_STREAMING_DISABLE: StreamingControlRequestType = 1

public val CDROM_STREAMING_ENABLE_FOR_READ_ONLY: StreamingControlRequestType = 2

public val CDROM_STREAMING_ENABLE_FOR_READ_WRITE: StreamingControlRequestType = 4

public val CDROM_STREAMING_ENABLE_FOR_WRITE_ONLY: StreamingControlRequestType = 3

public val CDROM_WRITE_PERFORMANCE: CdromPerformanceType = 2

public val CDROM_WRITE_SPEED_REQUEST: CdromPerformanceRequestType = 2

public val DIGITAL_COPY_PERMITTED: UInt = 2u

public val EXCLUSIVE_ACCESS_LOCK_DEVICE: ExclusiveAccessRequestType = 1

public val EXCLUSIVE_ACCESS_QUERY_STATE: ExclusiveAccessRequestType = 0

public val EXCLUSIVE_ACCESS_UNLOCK_DEVICE: ExclusiveAccessRequestType = 2

public val IOCTL_CDROM_BASE: Int = 2

public val IOCTL_CDROM_CHECK_VERIFY: UInt = 149504u

public val IOCTL_CDROM_CURRENT_POSITION: UInt = 1u

public val IOCTL_CDROM_DISK_TYPE: UInt = 131136u

public val IOCTL_CDROM_EJECT_MEDIA: UInt = 149512u

public val IOCTL_CDROM_ENABLE_STREAMING: UInt = 147560u

public val IOCTL_CDROM_EXCLUSIVE_ACCESS: UInt = 180316u

public val IOCTL_CDROM_FIND_NEW_DEVICES: UInt = 149528u

public val IOCTL_CDROM_GET_CONFIGURATION: UInt = 147544u

public val IOCTL_CDROM_GET_CONTROL: UInt = 147508u

public val IOCTL_CDROM_GET_DRIVE_GEOMETRY: UInt = 147532u

public val IOCTL_CDROM_GET_DRIVE_GEOMETRY_EX: UInt = 147536u

public val IOCTL_CDROM_GET_INQUIRY_DATA: UInt = 147556u

public val IOCTL_CDROM_GET_LAST_SESSION: UInt = 147512u

public val IOCTL_CDROM_GET_PERFORMANCE: UInt = 147568u

public val IOCTL_CDROM_GET_VOLUME: UInt = 147476u

public val IOCTL_CDROM_LOAD_MEDIA: UInt = 149516u

public val IOCTL_CDROM_MEDIA_CATALOG: UInt = 2u

public val IOCTL_CDROM_MEDIA_REMOVAL: UInt = 149508u

public val IOCTL_CDROM_PAUSE_AUDIO: UInt = 147468u

public val IOCTL_CDROM_PLAY_AUDIO_MSF: UInt = 147480u

public val IOCTL_CDROM_RAW_READ: UInt = 147518u

public val IOCTL_CDROM_READ_Q_CHANNEL: UInt = 147500u

public val IOCTL_CDROM_READ_TOC: UInt = 147456u

public val IOCTL_CDROM_READ_TOC_EX: UInt = 147540u

public val IOCTL_CDROM_RELEASE: UInt = 149524u

public val IOCTL_CDROM_RESERVE: UInt = 149520u

public val IOCTL_CDROM_RESUME_AUDIO: UInt = 147472u

public val IOCTL_CDROM_SEEK_AUDIO_MSF: UInt = 147460u

public val IOCTL_CDROM_SEND_OPC_INFORMATION: UInt = 180332u

public val IOCTL_CDROM_SET_SPEED: UInt = 147552u

public val IOCTL_CDROM_SET_VOLUME: UInt = 147496u

public val IOCTL_CDROM_SIMBAD: UInt = 147468u

public val IOCTL_CDROM_STOP_AUDIO: UInt = 147464u

public val IOCTL_CDROM_SUB_Q_CHANNEL: UInt = 0u

public val IOCTL_CDROM_TRACK_ISRC: UInt = 3u

public val IOCTL_CDROM_UNLOAD_DRIVER: UInt = 151560u

public val MAXIMUM_CDROM_INQUIRY_SIZE: UInt = 260u

public val MAXIMUM_CDROM_SIZE: UInt = 804u

public val MAXIMUM_NUMBER_TRACKS: UInt = 100u

public val MINIMUM_CDROM_INQUIRY_SIZE: UInt = 36u

public val MINIMUM_CDROM_READ_TOC_EX_SIZE: UInt = 2u

public val MEDIA_BLANK_TYPE_ERASE_LAST_SESSION: MediaBlankType = 6

public val MEDIA_BLANK_TYPE_FULL: MediaBlankType = 0

public val MEDIA_BLANK_TYPE_INCOMPLETE_TRACK: MediaBlankType = 2

public val MEDIA_BLANK_TYPE_MINIMAL: MediaBlankType = 1

public val MEDIA_BLANK_TYPE_TRACK_TAIL: MediaBlankType = 4

public val MEDIA_BLANK_TYPE_UNCLOSE_LAST_SESSION: MediaBlankType = 5

public val MEDIA_BLANK_TYPE_UNRESERVE_LAST_TRACK: MediaBlankType = 3

public val OBSOLETE_IOCTL_CDROM_GET_CONTROL: UInt = 147508u

public val RAW_WITH_C2: TrackModeType = 4

public val RAW_WITH_C2AND_SUB_CODE: TrackModeType = 3

public val RAW_WITH_SUB_CODE: TrackModeType = 5

public val SIMPLE_OPC_INFO: CdromOpcInfoType = 1

public val TWO_FOUR_CHANNEL_AUDIO: UInt = 8u

public val XA_FORM2: TrackModeType = 1

public val YELLOW_MODE2: TrackModeType = 0
