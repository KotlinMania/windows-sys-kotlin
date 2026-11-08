package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

public val CE_BREAK: CLEAR_COMM_ERROR_FLAGS = 16u

public val CE_FRAME: CLEAR_COMM_ERROR_FLAGS = 8u

public val CE_OVERRUN: CLEAR_COMM_ERROR_FLAGS = 2u

public val CE_RXOVER: CLEAR_COMM_ERROR_FLAGS = 1u

public val CE_RXPARITY: CLEAR_COMM_ERROR_FLAGS = 4u

public val CLRBREAK: ESCAPE_COMM_FUNCTION = 9u

public val CLRDTR: ESCAPE_COMM_FUNCTION = 6u

public val CLRRTS: ESCAPE_COMM_FUNCTION = 4u

public val DIALOPTION_BILLING: MODEMDEVCAPS_DIAL_OPTIONS = 64u

public val DIALOPTION_DIALTONE: MODEMDEVCAPS_DIAL_OPTIONS = 256u

public val DIALOPTION_QUIET: MODEMDEVCAPS_DIAL_OPTIONS = 128u

public val EVENPARITY: DCB_PARITY = 2u

public val EV_BREAK: COMM_EVENT_MASK = 64u

public val EV_CTS: COMM_EVENT_MASK = 8u

public val EV_DSR: COMM_EVENT_MASK = 16u

public val EV_ERR: COMM_EVENT_MASK = 128u

public val EV_EVENT1: COMM_EVENT_MASK = 2048u

public val EV_EVENT2: COMM_EVENT_MASK = 4096u

public val EV_PERR: COMM_EVENT_MASK = 512u

public val EV_RING: COMM_EVENT_MASK = 256u

public val EV_RLSD: COMM_EVENT_MASK = 32u

public val EV_RX80FULL: COMM_EVENT_MASK = 1024u

public val EV_RXCHAR: COMM_EVENT_MASK = 1u

public val EV_RXFLAG: COMM_EVENT_MASK = 2u

public val EV_TXEMPTY: COMM_EVENT_MASK = 4u

public val MARKPARITY: DCB_PARITY = 3u

public val MAXLENGTH_NAI: UInt = 72u

public val MAXLENGTH_UICCDATASTORE: UInt = 10u

public val MDMSPKRFLAG_CALLSETUP: MODEMDEVCAPS_SPEAKER_MODE = 8u

public val MDMSPKRFLAG_DIAL: MODEMDEVCAPS_SPEAKER_MODE = 2u

public val MDMSPKRFLAG_OFF: MODEMDEVCAPS_SPEAKER_MODE = 1u

public val MDMSPKRFLAG_ON: MODEMDEVCAPS_SPEAKER_MODE = 4u

public val MDMSPKR_CALLSETUP: MODEMSETTINGS_SPEAKER_MODE = 8u

public val MDMSPKR_DIAL: MODEMSETTINGS_SPEAKER_MODE = 2u

public val MDMSPKR_OFF: MODEMSETTINGS_SPEAKER_MODE = 1u

public val MDMSPKR_ON: MODEMSETTINGS_SPEAKER_MODE = 4u

public val MDMVOLFLAG_HIGH: MODEMDEVCAPS_SPEAKER_VOLUME = 4u

public val MDMVOLFLAG_LOW: MODEMDEVCAPS_SPEAKER_VOLUME = 1u

public val MDMVOLFLAG_MEDIUM: MODEMDEVCAPS_SPEAKER_VOLUME = 2u

public val MDMVOL_HIGH: MODEM_SPEAKER_VOLUME = 2u

public val MDMVOL_LOW: MODEM_SPEAKER_VOLUME = 0u

public val MDMVOL_MEDIUM: MODEM_SPEAKER_VOLUME = 1u

public val MDM_ANALOG_RLP_OFF: UInt = 1u

public val MDM_ANALOG_RLP_ON: UInt = 0u

public val MDM_ANALOG_V34: UInt = 2u

public val MDM_AUTO_ML_2: UInt = 2u

public val MDM_AUTO_ML_DEFAULT: UInt = 0u

public val MDM_AUTO_ML_NONE: UInt = 1u

public val MDM_AUTO_SPEED_DEFAULT: UInt = 0u

public val MDM_BEARERMODE_ANALOG: UInt = 0u

public val MDM_BEARERMODE_GSM: UInt = 2u

public val MDM_BEARERMODE_ISDN: UInt = 1u

public val MDM_BLIND_DIAL: UInt = 512u

public val MDM_CCITT_OVERRIDE: UInt = 64u

public val MDM_CELLULAR: UInt = 8u

public val MDM_COMPRESSION: UInt = 1u

public val MDM_DIAGNOSTICS: UInt = 2048u

public val MDM_ERROR_CONTROL: UInt = 2u

public val MDM_FLOWCONTROL_HARD: UInt = 16u

public val MDM_FLOWCONTROL_SOFT: UInt = 32u

public val MDM_FORCED_EC: UInt = 4u

public val MDM_HDLCPPP_AUTH_CHAP: UInt = 3u

public val MDM_HDLCPPP_AUTH_DEFAULT: UInt = 0u

public val MDM_HDLCPPP_AUTH_MSCHAP: UInt = 4u

public val MDM_HDLCPPP_AUTH_NONE: UInt = 1u

public val MDM_HDLCPPP_AUTH_PAP: UInt = 2u

public val MDM_HDLCPPP_ML_2: UInt = 2u

public val MDM_HDLCPPP_ML_DEFAULT: UInt = 0u

public val MDM_HDLCPPP_ML_NONE: UInt = 1u

public val MDM_HDLCPPP_SPEED_56K: UInt = 2u

public val MDM_HDLCPPP_SPEED_64K: UInt = 1u

public val MDM_HDLCPPP_SPEED_DEFAULT: UInt = 0u

public val MDM_MASK_AUTO_SPEED: UInt = 7u

public val MDM_MASK_BEARERMODE: UInt = 61440u

public val MDM_MASK_HDLCPPP_SPEED: UInt = 7u

public val MDM_MASK_PROTOCOLDATA: UInt = 267386880u

public val MDM_MASK_PROTOCOLID: UInt = 983040u

public val MDM_MASK_V110_SPEED: UInt = 15u

public val MDM_MASK_V120_SPEED: UInt = 7u

public val MDM_MASK_X75_DATA: UInt = 7u

public val MDM_PIAFS_INCOMING: UInt = 0u

public val MDM_PIAFS_OUTGOING: UInt = 1u

public val MDM_PROTOCOLID_ANALOG: UInt = 7u

public val MDM_PROTOCOLID_AUTO: UInt = 6u

public val MDM_PROTOCOLID_DEFAULT: UInt = 0u

public val MDM_PROTOCOLID_GPRS: UInt = 8u

public val MDM_PROTOCOLID_HDLCPPP: UInt = 1u

public val MDM_PROTOCOLID_PIAFS: UInt = 9u

public val MDM_PROTOCOLID_V110: UInt = 4u

public val MDM_PROTOCOLID_V120: UInt = 5u

public val MDM_PROTOCOLID_V128: UInt = 2u

public val MDM_PROTOCOLID_X75: UInt = 3u

public val MDM_SHIFT_AUTO_ML: UInt = 6u

public val MDM_SHIFT_AUTO_SPEED: UInt = 0u

public val MDM_SHIFT_BEARERMODE: UInt = 12u

public val MDM_SHIFT_EXTENDEDINFO: UInt = 12u

public val MDM_SHIFT_HDLCPPP_AUTH: UInt = 3u

public val MDM_SHIFT_HDLCPPP_ML: UInt = 6u

public val MDM_SHIFT_HDLCPPP_SPEED: UInt = 0u

public val MDM_SHIFT_PROTOCOLDATA: UInt = 20u

public val MDM_SHIFT_PROTOCOLID: UInt = 16u

public val MDM_SHIFT_PROTOCOLINFO: UInt = 16u

public val MDM_SHIFT_V110_SPEED: UInt = 0u

public val MDM_SHIFT_V120_ML: UInt = 6u

public val MDM_SHIFT_V120_SPEED: UInt = 0u

public val MDM_SHIFT_X75_DATA: UInt = 0u

public val MDM_SPEED_ADJUST: UInt = 128u

public val MDM_TONE_DIAL: UInt = 256u

public val MDM_V110_SPEED_12DOT0K: UInt = 5u

public val MDM_V110_SPEED_14DOT4K: UInt = 6u

public val MDM_V110_SPEED_19DOT2K: UInt = 7u

public val MDM_V110_SPEED_1DOT2K: UInt = 1u

public val MDM_V110_SPEED_28DOT8K: UInt = 8u

public val MDM_V110_SPEED_2DOT4K: UInt = 2u

public val MDM_V110_SPEED_38DOT4K: UInt = 9u

public val MDM_V110_SPEED_4DOT8K: UInt = 3u

public val MDM_V110_SPEED_57DOT6K: UInt = 10u

public val MDM_V110_SPEED_9DOT6K: UInt = 4u

public val MDM_V110_SPEED_DEFAULT: UInt = 0u

public val MDM_V120_ML_2: UInt = 2u

public val MDM_V120_ML_DEFAULT: UInt = 0u

public val MDM_V120_ML_NONE: UInt = 1u

public val MDM_V120_SPEED_56K: UInt = 2u

public val MDM_V120_SPEED_64K: UInt = 1u

public val MDM_V120_SPEED_DEFAULT: UInt = 0u

public val MDM_V23_OVERRIDE: UInt = 1024u

public val MDM_X75_DATA_128K: UInt = 2u

public val MDM_X75_DATA_64K: UInt = 1u

public val MDM_X75_DATA_BTX: UInt = 4u

public val MDM_X75_DATA_DEFAULT: UInt = 0u

public val MDM_X75_DATA_T_70: UInt = 3u

public val MS_CTS_ON: MODEM_STATUS_FLAGS = 16u

public val MS_DSR_ON: MODEM_STATUS_FLAGS = 32u

public val MS_RING_ON: MODEM_STATUS_FLAGS = 64u

public val MS_RLSD_ON: MODEM_STATUS_FLAGS = 128u

public val NOPARITY: DCB_PARITY = 0u

public val ODDPARITY: DCB_PARITY = 1u

public val ONE5STOPBITS: DCB_STOP_BITS = 1u

public val ONESTOPBIT: DCB_STOP_BITS = 0u

public val PARITY_EVEN: COMMPROP_STOP_PARITY = 1024u

public val PARITY_MARK: COMMPROP_STOP_PARITY = 2048u

public val PARITY_NONE: COMMPROP_STOP_PARITY = 256u

public val PARITY_ODD: COMMPROP_STOP_PARITY = 512u

public val PARITY_SPACE: COMMPROP_STOP_PARITY = 4096u

public val PURGE_RXABORT: PURGE_COMM_FLAGS = 2u

public val PURGE_RXCLEAR: PURGE_COMM_FLAGS = 8u

public val PURGE_TXABORT: PURGE_COMM_FLAGS = 1u

public val PURGE_TXCLEAR: PURGE_COMM_FLAGS = 4u

public val SETBREAK: ESCAPE_COMM_FUNCTION = 8u

public val SETDTR: ESCAPE_COMM_FUNCTION = 5u

public val SETRTS: ESCAPE_COMM_FUNCTION = 3u

public val SETXOFF: ESCAPE_COMM_FUNCTION = 1u

public val SETXON: ESCAPE_COMM_FUNCTION = 2u

public val SID_3GPP_SUPSVCMODEL: GUID = GUID.from_u128(U128(0xd7d08e07d7674478uL, 0xb14aeecc87ea12f7uL))

public val SPACEPARITY: DCB_PARITY = 4u

public val STOPBITS_10: COMMPROP_STOP_PARITY = 1u

public val STOPBITS_15: COMMPROP_STOP_PARITY = 2u

public val STOPBITS_20: COMMPROP_STOP_PARITY = 4u

public val TWOSTOPBITS: DCB_STOP_BITS = 2u
