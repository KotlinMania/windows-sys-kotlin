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

public val CDDA: TRACK_MODE_TYPE = 2

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

public val Cdrom10Nominal20Exceptions: CDROM_PERFORMANCE_TOLERANCE_TYPE = 1

public val CdromCAVRotation: WRITE_ROTATION = 1

public val CdromDefaultRotation: WRITE_ROTATION = 0

public val CdromEntirePerformanceList: CDROM_PERFORMANCE_EXCEPTION_TYPE = 2

public val CdromNominalPerformance: CDROM_PERFORMANCE_EXCEPTION_TYPE = 1

public val CdromPerformanceExceptionsOnly: CDROM_PERFORMANCE_EXCEPTION_TYPE = 3

public val CdromPerformanceRequest: CDROM_PERFORMANCE_REQUEST_TYPE = 1

public val CdromReadPerformance: CDROM_PERFORMANCE_TYPE = 1

public val CdromSetSpeed: CDROM_SPEED_REQUEST = 0

public val CdromSetStreaming: CDROM_SPEED_REQUEST = 1

public val CdromStreamingDisable: STREAMING_CONTROL_REQUEST_TYPE = 1

public val CdromStreamingEnableForReadOnly: STREAMING_CONTROL_REQUEST_TYPE = 2

public val CdromStreamingEnableForReadWrite: STREAMING_CONTROL_REQUEST_TYPE = 4

public val CdromStreamingEnableForWriteOnly: STREAMING_CONTROL_REQUEST_TYPE = 3

public val CdromWritePerformance: CDROM_PERFORMANCE_TYPE = 2

public val CdromWriteSpeedRequest: CDROM_PERFORMANCE_REQUEST_TYPE = 2

public val DIGITAL_COPY_PERMITTED: UInt = 2u

public val ExclusiveAccessLockDevice: EXCLUSIVE_ACCESS_REQUEST_TYPE = 1

public val ExclusiveAccessQueryState: EXCLUSIVE_ACCESS_REQUEST_TYPE = 0

public val ExclusiveAccessUnlockDevice: EXCLUSIVE_ACCESS_REQUEST_TYPE = 2

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

public val MediaBlankTypeEraseLastSession: MEDIA_BLANK_TYPE = 6

public val MediaBlankTypeFull: MEDIA_BLANK_TYPE = 0

public val MediaBlankTypeIncompleteTrack: MEDIA_BLANK_TYPE = 2

public val MediaBlankTypeMinimal: MEDIA_BLANK_TYPE = 1

public val MediaBlankTypeTrackTail: MEDIA_BLANK_TYPE = 4

public val MediaBlankTypeUncloseLastSession: MEDIA_BLANK_TYPE = 5

public val MediaBlankTypeUnreserveLastTrack: MEDIA_BLANK_TYPE = 3

public val OBSOLETE_IOCTL_CDROM_GET_CONTROL: UInt = 147508u

public val RawWithC2: TRACK_MODE_TYPE = 4

public val RawWithC2AndSubCode: TRACK_MODE_TYPE = 3

public val RawWithSubCode: TRACK_MODE_TYPE = 5

public val SimpleOpcInfo: CDROM_OPC_INFO_TYPE = 1

public val TWO_FOUR_CHANNEL_AUDIO: UInt = 8u

public val XAForm2: TRACK_MODE_TYPE = 1

public val YellowMode2: TRACK_MODE_TYPE = 0
