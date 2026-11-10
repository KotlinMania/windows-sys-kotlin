package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val CE_BREAK: ClearCommErrorFlags = 16u

public val CE_FRAME: ClearCommErrorFlags = 8u

public val CE_OVERRUN: ClearCommErrorFlags = 2u

public val CE_RXOVER: ClearCommErrorFlags = 1u

public val CE_RXPARITY: ClearCommErrorFlags = 4u

public val CLRBREAK: EscapeCommFunction = 9u

public val CLRDTR: EscapeCommFunction = 6u

public val CLRRTS: EscapeCommFunction = 4u

public val DIALOPTION_BILLING: ModemdevcapsDialOptions = 64u

public val DIALOPTION_DIALTONE: ModemdevcapsDialOptions = 256u

public val DIALOPTION_QUIET: ModemdevcapsDialOptions = 128u

public val EVENPARITY: DcbParity = 2u.toUByte()

public val EV_BREAK: CommEventMask = 64u

public val EV_CTS: CommEventMask = 8u

public val EV_DSR: CommEventMask = 16u

public val EV_ERR: CommEventMask = 128u

public val EV_EVENT1: CommEventMask = 2048u

public val EV_EVENT2: CommEventMask = 4096u

public val EV_PERR: CommEventMask = 512u

public val EV_RING: CommEventMask = 256u

public val EV_RLSD: CommEventMask = 32u

public val EV_RX80FULL: CommEventMask = 1024u

public val EV_RXCHAR: CommEventMask = 1u

public val EV_RXFLAG: CommEventMask = 2u

public val EV_TXEMPTY: CommEventMask = 4u

public val MARKPARITY: DcbParity = 3u.toUByte()

public val MAXLENGTH_NAI: UInt = 72u

public val MAXLENGTH_UICCDATASTORE: UInt = 10u

public val MDMSPKRFLAG_CALLSETUP: ModemdevcapsSpeakerMode = 8u

public val MDMSPKRFLAG_DIAL: ModemdevcapsSpeakerMode = 2u

public val MDMSPKRFLAG_OFF: ModemdevcapsSpeakerMode = 1u

public val MDMSPKRFLAG_ON: ModemdevcapsSpeakerMode = 4u

public val MDMSPKR_CALLSETUP: ModemsettingsSpeakerMode = 8u

public val MDMSPKR_DIAL: ModemsettingsSpeakerMode = 2u

public val MDMSPKR_OFF: ModemsettingsSpeakerMode = 1u

public val MDMSPKR_ON: ModemsettingsSpeakerMode = 4u

public val MDMVOLFLAG_HIGH: ModemdevcapsSpeakerVolume = 4u

public val MDMVOLFLAG_LOW: ModemdevcapsSpeakerVolume = 1u

public val MDMVOLFLAG_MEDIUM: ModemdevcapsSpeakerVolume = 2u

public val MDMVOL_HIGH: ModemSpeakerVolume = 2u

public val MDMVOL_LOW: ModemSpeakerVolume = 0u

public val MDMVOL_MEDIUM: ModemSpeakerVolume = 1u

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

public val MS_CTS_ON: ModemStatusFlags = 16u

public val MS_DSR_ON: ModemStatusFlags = 32u

public val MS_RING_ON: ModemStatusFlags = 64u

public val MS_RLSD_ON: ModemStatusFlags = 128u

public val NOPARITY: DcbParity = 0u.toUByte()

public val ODDPARITY: DcbParity = 1u.toUByte()

public val ONE5STOPBITS: DcbStopBits = 1u.toUByte()

public val ONESTOPBIT: DcbStopBits = 0u.toUByte()

public val PARITY_EVEN: CommpropStopParity = 1024u.toUShort()

public val PARITY_MARK: CommpropStopParity = 2048u.toUShort()

public val PARITY_NONE: CommpropStopParity = 256u.toUShort()

public val PARITY_ODD: CommpropStopParity = 512u.toUShort()

public val PARITY_SPACE: CommpropStopParity = 4096u.toUShort()

public val PURGE_RXABORT: PurgeCommFlags = 2u

public val PURGE_RXCLEAR: PurgeCommFlags = 8u

public val PURGE_TXABORT: PurgeCommFlags = 1u

public val PURGE_TXCLEAR: PurgeCommFlags = 4u

public val SETBREAK: EscapeCommFunction = 8u

public val SETDTR: EscapeCommFunction = 5u

public val SETRTS: EscapeCommFunction = 3u

public val SETXOFF: EscapeCommFunction = 1u

public val SETXON: EscapeCommFunction = 2u

public val SID_3GPP_SUPSVCMODEL: Guid = Guid.fromU128(U128(0xd7d08e07d7674478uL, 0xb14aeecc87ea12f7uL))

public val SPACEPARITY: DcbParity = 4u.toUByte()

public val STOPBITS_10: CommpropStopParity = 1u.toUShort()

public val STOPBITS_15: CommpropStopParity = 2u.toUShort()

public val STOPBITS_20: CommpropStopParity = 4u.toUShort()

public val TWOSTOPBITS: DcbStopBits = 2u.toUByte()
