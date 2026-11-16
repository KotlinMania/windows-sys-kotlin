package io.github.kotlinmania.windowssys.windows.win32.devices.nfc

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val APPLICATION_SELECTED: SecureElementEventType = 2

public val CONNECTION_ORIENTED: NfcLlcpSocketType = 0

public val CONNECTIONLESS: NfcLlcpSocketType = 1

public val DEFAULT_SNEP_SERVER: NfcSnepServerType = 0

public val DEVICE_HOST: SecureElementType = 2

public val DISCOVERY: NfcReleaseType = 2

public val EVT_TRANSACTION_PARAMETER_MAX_LEN: UInt = 255u

public val EVT_TRANSACTION_TAG_AID: UInt = 129u

public val EVT_TRANSACTION_TAG_PARAMETERS: UInt = 130u

public val EMULATION_DISABLED: NfcSeEmulationMode = 0

public val EMULATION_ENABLED: NfcSeEmulationMode = 1

public val EMULATION_OFF: SecureElementCardEmulationMode = 0

public val EMULATION_ON_POWER_DEPENDENT: SecureElementCardEmulationMode = 2

public val EMULATION_ON_POWER_INDEPENDENT: SecureElementCardEmulationMode = 1

public val EMULATION_STEALTH_LISTEN: SecureElementCardEmulationMode = 3

public val EXTENDED_SNEP_SERVER: NfcSnepServerType = 1

public val EXTERNAL: SecureElementType = 1

public val EXTERNAL_FIELD_ENTER: SecureElementEventType = 6

public val EXTERNAL_FIELD_EXIT: SecureElementEventType = 7

public val EXTERNAL_READER_ARRIVAL: SecureElementEventType = 0

public val EXTERNAL_READER_DEPARTURE: SecureElementEventType = 1

public val HCE_ACTIVATED: SecureElementEventType = 4

public val HCE_DEACTIVATED: SecureElementEventType = 5

public val IOCTL_NFCDTA_CONFIG_P2P_PARAM: UInt = 2233376u

public val IOCTL_NFCDTA_CONFIG_RF_DISCOVERY: UInt = 2233344u

public val IOCTL_NFCDTA_LLCP_ACTIVATE: UInt = 2233476u

public val IOCTL_NFCDTA_LLCP_CONFIG: UInt = 2233472u

public val IOCTL_NFCDTA_LLCP_DEACTIVATE: UInt = 2233480u

public val IOCTL_NFCDTA_LLCP_DISCOVER_SERVICES: UInt = 2233484u

public val IOCTL_NFCDTA_LLCP_GET_NEXT_LINK_STATUS: UInt = 2233492u

public val IOCTL_NFCDTA_LLCP_LINK_STATUS_CHECK: UInt = 2233488u

public val IOCTL_NFCDTA_LLCP_SOCKET_ACCEPT: UInt = 2233512u

public val IOCTL_NFCDTA_LLCP_SOCKET_BIND: UInt = 2233504u

public val IOCTL_NFCDTA_LLCP_SOCKET_CLOSE: UInt = 2233500u

public val IOCTL_NFCDTA_LLCP_SOCKET_CONNECT: UInt = 2233516u

public val IOCTL_NFCDTA_LLCP_SOCKET_CREATE: UInt = 2233496u

public val IOCTL_NFCDTA_LLCP_SOCKET_DISCONNECT: UInt = 2233520u

public val IOCTL_NFCDTA_LLCP_SOCKET_GET_NEXT_ERROR: UInt = 2233540u

public val IOCTL_NFCDTA_LLCP_SOCKET_LISTEN: UInt = 2233508u

public val IOCTL_NFCDTA_LLCP_SOCKET_RECV: UInt = 2233524u

public val IOCTL_NFCDTA_LLCP_SOCKET_RECV_FROM: UInt = 2233528u

public val IOCTL_NFCDTA_LLCP_SOCKET_SEND: UInt = 2233532u

public val IOCTL_NFCDTA_LLCP_SOCKET_SNED_TO: UInt = 2233536u

public val IOCTL_NFCDTA_REMOTE_DEV_CHECK_PRESENCE: UInt = 2233372u

public val IOCTL_NFCDTA_REMOTE_DEV_CONNECT: UInt = 2233352u

public val IOCTL_NFCDTA_REMOTE_DEV_DISCONNECT: UInt = 2233356u

public val IOCTL_NFCDTA_REMOTE_DEV_GET_NEXT: UInt = 2233348u

public val IOCTL_NFCDTA_REMOTE_DEV_NDEF_CHECK: UInt = 2233420u

public val IOCTL_NFCDTA_REMOTE_DEV_NDEF_CONVERT_READ_ONLY: UInt = 2233416u

public val IOCTL_NFCDTA_REMOTE_DEV_NDEF_READ: UInt = 2233412u

public val IOCTL_NFCDTA_REMOTE_DEV_NDEF_WRITE: UInt = 2233408u

public val IOCTL_NFCDTA_REMOTE_DEV_RECV: UInt = 2233364u

public val IOCTL_NFCDTA_REMOTE_DEV_SEND: UInt = 2233368u

public val IOCTL_NFCDTA_REMOTE_DEV_TRANSCEIVE: UInt = 2233360u

public val IOCTL_NFCDTA_SET_RF_CONFIG: UInt = 2233380u

public val IOCTL_NFCDTA_SE_ENUMERATE: UInt = 2233728u

public val IOCTL_NFCDTA_SE_GET_NEXT_EVENT: UInt = 2233740u

public val IOCTL_NFCDTA_SE_SET_EMULATION_MODE: UInt = 2233732u

public val IOCTL_NFCDTA_SE_SET_ROUTING_TABLE: UInt = 2233736u

public val IOCTL_NFCDTA_SNEP_CLIENT_GET: UInt = 2233676u

public val IOCTL_NFCDTA_SNEP_CLIENT_PUT: UInt = 2233672u

public val IOCTL_NFCDTA_SNEP_DEINIT_CLIENT: UInt = 2233668u

public val IOCTL_NFCDTA_SNEP_DEINIT_SERVER: UInt = 2233604u

public val IOCTL_NFCDTA_SNEP_INIT_CLIENT: UInt = 2233664u

public val IOCTL_NFCDTA_SNEP_INIT_SERVER: UInt = 2233600u

public val IOCTL_NFCDTA_SNEP_SERVER_ACCEPT: UInt = 2233612u

public val IOCTL_NFCDTA_SNEP_SERVER_GET_NEXT_CONNECTION: UInt = 2233608u

public val IOCTL_NFCDTA_SNEP_SERVER_GET_NEXT_REQUEST: UInt = 2233616u

public val IOCTL_NFCDTA_SNEP_SERVER_SEND_RESPONSE: UInt = 2233620u

public val IOCTL_NFCRM_QUERY_RADIO_STATE: UInt = 5308808u

public val IOCTL_NFCRM_SET_RADIO_STATE: UInt = 5308804u

public val IOCTL_NFCSERM_QUERY_RADIO_STATE: UInt = 5308816u

public val IOCTL_NFCSERM_SET_RADIO_STATE: UInt = 5308812u

public val IOCTL_NFCSE_ENUM_ENDPOINTS: UInt = 2230272u

public val IOCTL_NFCSE_GET_NEXT_EVENT: UInt = 2230280u

public val IOCTL_NFCSE_GET_NFCC_CAPABILITIES: UInt = 2230288u

public val IOCTL_NFCSE_GET_ROUTING_TABLE: UInt = 2230292u

public val IOCTL_NFCSE_HCE_REMOTE_RECV: UInt = 2230592u

public val IOCTL_NFCSE_HCE_REMOTE_SEND: UInt = 2230596u

public val IOCTL_NFCSE_SET_CARD_EMULATION_MODE: UInt = 2230284u

public val IOCTL_NFCSE_SET_POWER_MODE: UInt = 2230600u

public val IOCTL_NFCSE_SET_ROUTING_TABLE: UInt = 2230296u

public val IOCTL_NFCSE_SUBSCRIBE_FOR_EVENT: UInt = 2230276u

public val ISO_7816_MAXIMUM_AID_LENGTH: UInt = 16u

public val ISO_7816_MINIMUM_AID_LENGTH: UInt = 5u

public val IDLE_MODE: NfcReleaseType = 0

public val INTEGRATED: SecureElementType = 0

public val LINK_ACTIVATED: NfcLlcpLinkStatus = 0

public val LINK_DEACTIVATED: NfcLlcpLinkStatus = 1

public val MAX_ATR_LENGTH: UInt = 48u

public val MAX_LLCP_SERVICE_NAME_SIZE: UInt = 256u

public val MAX_SNEP_SERVER_NAME_SIZE: UInt = 256u

public val MAX_UID_SIZE: UInt = 16u

public val NFCRMDDI_IOCTL_BASE: UInt = 80u

public val NFC_CONNECT_BY_SAP: NfcLlcpSocketConnectType = 0

public val NFC_CONNECT_BY_URI: NfcLlcpSocketConnectType = 1

public val NFC_DEP_DEFAULT: NfcP2pMode = 0

public val NFC_DEP_LISTEN: NfcP2pMode = 2

public val NFC_DEP_POLL: NfcP2pMode = 1

public val NFC_IP1INITIATOR: NfcDeviceType = 5

public val NFC_IP1TARGET: NfcDeviceType = 4

public val NFC_LLCP_ERROR_BUSY_CONDITION: NfcLlcpSocketError = 2

public val NFC_LLCP_ERROR_DISCONNECTED: NfcLlcpSocketError = 0

public val NFC_LLCP_ERROR_FRAME_REJECTED: NfcLlcpSocketError = 1

public val NFC_LLCP_ERROR_NOT_BUSY_CONDITION: NfcLlcpSocketError = 3

public val NFC_READER: NfcDeviceType = 6

public val NFC_TYPE1TAG: NfcDeviceType = 0

public val NFC_TYPE2TAG: NfcDeviceType = 1

public val NFC_TYPE3TAG: NfcDeviceType = 2

public val NFC_TYPE4TAG: NfcDeviceType = 3

public val RF_DISCOVERY_RESUME: NfcRfDiscoveryMode = 2

public val RF_DISCOVERY_CONFIG: NfcRfDiscoveryMode = 0

public val RF_DISCOVERY_START: NfcRfDiscoveryMode = 1

public val ROUTING_TYPE_AID: SecureElementRoutingType = 2

public val ROUTING_TYPE_PROTOCOL: SecureElementRoutingType = 1

public val ROUTING_TYPE_TECH: SecureElementRoutingType = 0

public val SE_POWER_MODE_ALLOW_OFF: SecureElementPowerMode = 1

public val SE_POWER_MODE_FORCE_ON: SecureElementPowerMode = 0

public val SLEEP_MODE: NfcReleaseType = 1

public val SNEP_REQUEST_GET: NfcSnepRequestType = 0

public val SNEP_REQUEST_PUT: NfcSnepRequestType = 1

public val TRANSACTION: SecureElementEventType = 3

public val GUID_DEVINTERFACE_NFCDTA: Guid = Guid.fromU128(U128(0x7fd3f30b5e494be1uL, 0xb3aaaf06260d236auL))

public val GUID_DEVINTERFACE_NFCSE: Guid = Guid.fromU128(U128(0x8dc7c854f5e54beduL, 0x815d0c85ad047725uL))

public val GUID_NFCSE_RADIO_MEDIA_DEVICE_INTERFACE: Guid = Guid.fromU128(U128(0xef8ba08f148d4116uL, 0x83efa2679dfc3fa5uL))

public val GUID_NFC_RADIO_MEDIA_DEVICE_INTERFACE: Guid = Guid.fromU128(U128(0x4d51e930750d4a36uL, 0xa9f791dc540fcd30uL))
