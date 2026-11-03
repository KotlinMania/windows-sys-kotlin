package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val CDB_REPORT_BITS: UInt = 0u

public val CDB_REPORT_BYTES: UInt = 1u

public val COMDB_MAX_PORTS_ARBITRATED: UInt = 4096u

public val COMDB_MIN_PORTS_ARBITRATED: UInt = 256u

public val DEVPKEY_DeviceInterface_Serial_PortName: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x4c6bf15c4c034aacuL, 0x91f564c0f852bcf4uL), pid = 4u)

public val DEVPKEY_DeviceInterface_Serial_UsbProductId: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x4c6bf15c4c034aacuL, 0x91f564c0f852bcf4uL), pid = 3u)

public val DEVPKEY_DeviceInterface_Serial_UsbVendorId: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x4c6bf15c4c034aacuL, 0x91f564c0f852bcf4uL), pid = 2u)

public val EVEN_PARITY: UInt = 2u

public val IOCTL_INTERNAL_SERENUM_REMOVE_SELF: UInt = 3604999u

public val IOCTL_SERIAL_APPLY_DEFAULT_CONFIGURATION: UInt = 1769632u

public val IOCTL_SERIAL_CLEAR_STATS: UInt = 1769616u

public val IOCTL_SERIAL_CLR_DTR: UInt = 1769512u

public val IOCTL_SERIAL_CLR_RTS: UInt = 1769524u

public val IOCTL_SERIAL_CONFIG_SIZE: UInt = 1769600u

public val IOCTL_SERIAL_GET_BAUD_RATE: UInt = 1769552u

public val IOCTL_SERIAL_GET_CHARS: UInt = 1769560u

public val IOCTL_SERIAL_GET_COMMCONFIG: UInt = 1769604u

public val IOCTL_SERIAL_GET_COMMSTATUS: UInt = 1769580u

public val IOCTL_SERIAL_GET_DTRRTS: UInt = 1769592u

public val IOCTL_SERIAL_GET_HANDFLOW: UInt = 1769568u

public val IOCTL_SERIAL_GET_LINE_CONTROL: UInt = 1769556u

public val IOCTL_SERIAL_GET_MODEMSTATUS: UInt = 1769576u

public val IOCTL_SERIAL_GET_MODEM_CONTROL: UInt = 1769620u

public val IOCTL_SERIAL_GET_PROPERTIES: UInt = 1769588u

public val IOCTL_SERIAL_GET_STATS: UInt = 1769612u

public val IOCTL_SERIAL_GET_TIMEOUTS: UInt = 1769504u

public val IOCTL_SERIAL_GET_WAIT_MASK: UInt = 1769536u

public val IOCTL_SERIAL_IMMEDIATE_CHAR: UInt = 1769496u

public val IOCTL_SERIAL_INTERNAL_BASIC_SETTINGS: UInt = 1769484u

public val IOCTL_SERIAL_INTERNAL_CANCEL_WAIT_WAKE: UInt = 1769480u

public val IOCTL_SERIAL_INTERNAL_DO_WAIT_WAKE: UInt = 1769476u

public val IOCTL_SERIAL_INTERNAL_RESTORE_SETTINGS: UInt = 1769488u

public val IOCTL_SERIAL_PURGE: UInt = 1769548u

public val IOCTL_SERIAL_RESET_DEVICE: UInt = 1769516u

public val IOCTL_SERIAL_SET_BAUD_RATE: UInt = 1769476u

public val IOCTL_SERIAL_SET_BREAK_OFF: UInt = 1769492u

public val IOCTL_SERIAL_SET_BREAK_ON: UInt = 1769488u

public val IOCTL_SERIAL_SET_CHARS: UInt = 1769564u

public val IOCTL_SERIAL_SET_COMMCONFIG: UInt = 1769608u

public val IOCTL_SERIAL_SET_DTR: UInt = 1769508u

public val IOCTL_SERIAL_SET_FIFO_CONTROL: UInt = 1769628u

public val IOCTL_SERIAL_SET_HANDFLOW: UInt = 1769572u

public val IOCTL_SERIAL_SET_INTERVAL_TIMER_RESOLUTION: UInt = 1769636u

public val IOCTL_SERIAL_SET_LINE_CONTROL: UInt = 1769484u

public val IOCTL_SERIAL_SET_MODEM_CONTROL: UInt = 1769624u

public val IOCTL_SERIAL_SET_QUEUE_SIZE: UInt = 1769480u

public val IOCTL_SERIAL_SET_RTS: UInt = 1769520u

public val IOCTL_SERIAL_SET_TIMEOUTS: UInt = 1769500u

public val IOCTL_SERIAL_SET_WAIT_MASK: UInt = 1769540u

public val IOCTL_SERIAL_SET_XOFF: UInt = 1769528u

public val IOCTL_SERIAL_SET_XON: UInt = 1769532u

public val IOCTL_SERIAL_WAIT_ON_MASK: UInt = 1769544u

public val IOCTL_SERIAL_XOFF_COUNTER: UInt = 1769584u

public val MARK_PARITY: UInt = 3u

public val NO_PARITY: UInt = 0u

public val ODD_PARITY: UInt = 1u

public val SERIAL_EV_BREAK: UInt = 64u

public val SERIAL_EV_CTS: UInt = 8u

public val SERIAL_EV_DSR: UInt = 16u

public val SERIAL_EV_ERR: UInt = 128u

public val SERIAL_EV_EVENT1: UInt = 2048u

public val SERIAL_EV_EVENT2: UInt = 4096u

public val SERIAL_EV_PERR: UInt = 512u

public val SERIAL_EV_RING: UInt = 256u

public val SERIAL_EV_RLSD: UInt = 32u

public val SERIAL_EV_RX80FULL: UInt = 1024u

public val SERIAL_EV_RXCHAR: UInt = 1u

public val SERIAL_EV_RXFLAG: UInt = 2u

public val SERIAL_EV_TXEMPTY: UInt = 4u

public val SERIAL_LSRMST_ESCAPE: UShort = 0u

public val SERIAL_LSRMST_LSR_DATA: UShort = 1u

public val SERIAL_LSRMST_LSR_NODATA: UShort = 2u

public val SERIAL_LSRMST_MST: UShort = 3u

public val SERIAL_PURGE_RXABORT: UInt = 2u

public val SERIAL_PURGE_RXCLEAR: UInt = 8u

public val SERIAL_PURGE_TXABORT: UInt = 1u

public val SERIAL_PURGE_TXCLEAR: UInt = 4u

public val SPACE_PARITY: UInt = 4u

public val STOP_BITS_1_5: UInt = 1u

public val STOP_BITS_2: UInt = 2u

public val STOP_BIT_1: UInt = 0u

public val SerenumFirstHalf: SERENUM_PORTION = 0

public val SerenumSecondHalf: SERENUM_PORTION = 1

public val SerenumWhole: SERENUM_PORTION = 2
