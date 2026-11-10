package io.github.kotlinmania.windowssys.windows.win32.devices.dvd

public val DVD_CGMS_COPY_ONCE: UInt = 16u

public val DVD_CGMS_COPY_PERMITTED: UInt = 0u

public val DVD_CGMS_COPY_PROTECT_MASK: UInt = 24u

public val DVD_CGMS_NO_COPY: UInt = 24u

public val DVD_CGMS_RESERVED_MASK: UInt = 120u

public val DVD_COPYRIGHTED: UInt = 64u

public val DVD_COPYRIGHT_MASK: UInt = 64u

public val DVD_NOT_COPYRIGHTED: UInt = 0u

public val DVD_SECTOR_NOT_PROTECTED: UInt = 0u

public val DVD_SECTOR_PROTECTED: UInt = 32u

public val DVD_SECTOR_PROTECT_MASK: UInt = 32u

public val DISC_CONTROL_BLOCK_LIST: DiscControlBlockType = -1

public val DVD_ASF: DvdKeyType = 5

public val DVD_BCA_DESCRIPTOR: DvdStructureFormat = 3

public val DVD_BUS_KEY1: DvdKeyType = 2

public val DVD_BUS_KEY2: DvdKeyType = 3

public val DVD_CHALLENGE_KEY: DvdKeyType = 1

public val DVD_COPYRIGHT_DESCRIPTOR: DvdStructureFormat = 1

public val DVD_DISK_KEY: DvdKeyType = 128

public val DVD_DISK_KEY_DESCRIPTOR: DvdStructureFormat = 2

public val DVD_GET_RPC_KEY: DvdKeyType = 8

public val DVD_INVALIDATE_AGID: DvdKeyType = 63

public val DVD_MANUFACTURER_DESCRIPTOR: DvdStructureFormat = 4

public val DVD_MAX_DESCRIPTOR: DvdStructureFormat = 5

public val DVD_PHYSICAL_DESCRIPTOR: DvdStructureFormat = 0

public val DVD_SET_RPC_KEY: DvdKeyType = 6

public val DVD_TITLE_KEY: DvdKeyType = 4

public val FORMATTING_DISC_CONTROL_BLOCK: DiscControlBlockType = 1178878720

public val IOCTL_AACS_END_SESSION: UInt = 3363020u

public val IOCTL_AACS_GENERATE_BINDING_NONCE: UInt = 3395824u

public val IOCTL_AACS_GET_CERTIFICATE: UInt = 3363028u

public val IOCTL_AACS_GET_CHALLENGE_KEY: UInt = 3363032u

public val IOCTL_AACS_READ_BINDING_NONCE: UInt = 3363052u

public val IOCTL_AACS_READ_MEDIA_ID: UInt = 3363048u

public val IOCTL_AACS_READ_MEDIA_KEY_BLOCK: UInt = 3363012u

public val IOCTL_AACS_READ_MEDIA_KEY_BLOCK_SIZE: UInt = 3363008u

public val IOCTL_AACS_READ_SERIAL_NUMBER: UInt = 3363044u

public val IOCTL_AACS_READ_VOLUME_ID: UInt = 3363040u

public val IOCTL_AACS_SEND_CERTIFICATE: UInt = 3363024u

public val IOCTL_AACS_SEND_CHALLENGE_KEY: UInt = 3363036u

public val IOCTL_AACS_START_SESSION: UInt = 3363016u

public val IOCTL_DVD_BASE: Int = 51

public val IOCTL_DVD_END_SESSION: UInt = 3362828u

public val IOCTL_DVD_GET_REGION: UInt = 3362836u

public val IOCTL_DVD_READ_KEY: UInt = 3362820u

public val IOCTL_DVD_READ_STRUCTURE: UInt = 3363136u

public val IOCTL_DVD_SEND_KEY: UInt = 3362824u

public val IOCTL_DVD_SEND_KEY2: UInt = 3395608u

public val IOCTL_DVD_SET_READ_AHEAD: UInt = 3362832u

public val IOCTL_DVD_START_SESSION: UInt = 3362816u

public val IOCTL_STORAGE_SET_READ_AHEAD: UInt = 2966528u

public val SESSION_INFO_DISC_CONTROL_BLOCK: DiscControlBlockType = 1396982528

public val WRITE_INHIBIT_DISC_CONTROL_BLOCK: DiscControlBlockType = 1464091392
