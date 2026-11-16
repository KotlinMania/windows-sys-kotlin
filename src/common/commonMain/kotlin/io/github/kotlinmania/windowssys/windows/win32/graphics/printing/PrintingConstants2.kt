package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val XPS_FP_PRINTDEVICECAPABILITIES: Pcwstr = w("PrintDeviceCapabilities")

public val XPS_FP_PRINTER_HANDLE: Pcwstr = w("PrinterHandle")

public val XPS_FP_PRINTER_NAME: Pcwstr = w("PrinterName")

public val XPS_FP_PRINT_CLASS_FACTORY: Pcwstr = w("PrintClassFactory")

public val XPS_FP_PROGRESS_REPORT: Pcwstr = w("ProgressReport")

public val XPS_FP_QUEUE_PROPERTY_BAG: Pcwstr = w("QueuePropertyBag")

public val XPS_FP_RESOURCE_DLL_PATHS: Pcwstr = w("ResourceDLLPaths")

public val XPS_FP_USER_PRINT_TICKET: Pcwstr = w("PerUserPrintTicket")

public val XPS_FP_USER_TOKEN: Pcwstr = w("UserSecurityToken")

public val XPS_JOB_DOCUMENT_SEQUENCE_ADDED: EXpsJobConsumption = 0

public val XPS_JOB_FIXED_DOCUMENT_ADDED: EXpsJobConsumption = 1

public val XPS_JOB_FIXED_PAGE_ADDED: EXpsJobConsumption = 2

public val XPS_RESTRICTED_FONT_EDITABLE: EXpsFontRestriction = 8

public val XPS_RESTRICTED_FONT_INSTALLABLE: EXpsFontRestriction = 0

public val XPS_RESTRICTED_FONT_NO_EMBEDDING: EXpsFontRestriction = 2

public val XPS_RESTRICTED_FONT_PREVIEW_PRINT: EXpsFontRestriction = 4

public val K_ADT_ASCII: EattributeDatatype = 5

public val K_ADT_BINARY: EattributeDatatype = 7

public val K_ADT_BOOL: EattributeDatatype = 1

public val K_ADT_CUSTOMSIZEPARAMS: EattributeDatatype = 10

public val K_ADT_DWORD: EattributeDatatype = 4

public val K_ADT_INT: EattributeDatatype = 2

public val K_ADT_LONG: EattributeDatatype = 3

public val K_ADT_RECT: EattributeDatatype = 9

public val K_ADT_SIZE: EattributeDatatype = 8

public val K_ADT_UNICODE: EattributeDatatype = 6

public val K_ADT_UNKNOWN: EattributeDatatype = 0

public val K_ADDING_DOCUMENT_SEQUENCE: EPrintXPSJobProgress = 0

public val K_ADDING_FIXED_DOCUMENT: EPrintXPSJobProgress = 2

public val K_ADDING_FIXED_PAGE: EPrintXPSJobProgress = 4

public val K_ALL_USERS: PrintAsyncNotifyUserFilter = 1

public val K_BI_DIRECTIONAL: PrintAsyncNotifyConversationStyle = 0

public val K_DOCUMENT_SEQUENCE_ADDED: EPrintXPSJobProgress = 1

public val K_FIXED_DOCUMENT_ADDED: EPrintXPSJobProgress = 3

public val K_FIXED_PAGE_ADDED: EPrintXPSJobProgress = 5

public val K_FONT_ADDED: EPrintXPSJobProgress = 7

public val K_IMAGE_ADDED: EPrintXPSJobProgress = 8

public val K_INVALID_JOB_STATE: EBranchOfficeJobEventType = 0

public val K_JOB_CONSUMPTION: EPrintXPSJobOperation = 2

public val K_JOB_PRODUCTION: EPrintXPSJobOperation = 1

public val K_LOG_JOB_ERROR: EBranchOfficeJobEventType = 3

public val K_LOG_JOB_PIPELINE_ERROR: EBranchOfficeJobEventType = 4

public val K_LOG_JOB_PRINTED: EBranchOfficeJobEventType = 1

public val K_LOG_JOB_RENDERED: EBranchOfficeJobEventType = 2

public val K_LOG_OFFLINE_FILE_FULL: EBranchOfficeJobEventType = 5

public val K_MESSAGE_BOX: UiType = 0

public val K_PER_USER: PrintAsyncNotifyUserFilter = 0

public val K_PROPERTY_TYPE_BUFFER: EPrintPropertyType = 10

public val K_PROPERTY_TYPE_BYTE: EPrintPropertyType = 4

public val K_PROPERTY_TYPE_DEV_MODE: EPrintPropertyType = 6

public val K_PROPERTY_TYPE_INT32: EPrintPropertyType = 2

public val K_PROPERTY_TYPE_INT64: EPrintPropertyType = 3

public val K_PROPERTY_TYPE_NOTIFICATION_OPTIONS: EPrintPropertyType = 9

public val K_PROPERTY_TYPE_NOTIFICATION_REPLY: EPrintPropertyType = 8

public val K_PROPERTY_TYPE_SD: EPrintPropertyType = 7

public val K_PROPERTY_TYPE_STRING: EPrintPropertyType = 1

public val K_PROPERTY_TYPE_TIME: EPrintPropertyType = 5

public val K_RESOURCE_ADDED: EPrintXPSJobProgress = 6

public val K_UNI_DIRECTIONAL: PrintAsyncNotifyConversationStyle = 1

public val K_XPS_DOCUMENT_COMMITTED: EPrintXPSJobProgress = 9

public val BIDI_REQUEST: Guid = Guid.fromU128(U128(0xb9162a2345f947ccuL, 0x80f5fe0fe9b9e1a2uL))

public val BIDI_REQUEST_CONTAINER: Guid = Guid.fromU128(U128(0xfc5b8a24db054a01uL, 0x838822edf6c2bbbauL))

public val BIDI_SPL: Guid = Guid.fromU128(U128(0x2a614240a4c54c33uL, 0xbd871bc709331639uL))

public val CLSID_OEMPTPROVIDER: Guid = Guid.fromU128(U128(0x9172389245d248e2uL, 0x9ec9562379daf992uL))

public val CLSID_OEMRENDER: Guid = Guid.fromU128(U128(0x6d6abf269f3811d1uL, 0x882a00c04fb961ecuL))

public val CLSID_OEMUI: Guid = Guid.fromU128(U128(0xabce80d79f4611d1uL, 0x882a00c04fb961ecuL))

public val CLSID_OEMUIMXDC: Guid = Guid.fromU128(U128(0x4e1443005b434288uL, 0x932a5e4dd6d82beduL))

public val CLSID_PTPROVIDER: Guid = Guid.fromU128(U128(0x46ac151b84904531uL, 0x96cc55bf2bf19e11uL))

public val CLSID_XPSRASTERIZER_FACTORY: Guid = Guid.fromU128(U128(0x503e79bf1d094764uL, 0x9d721eb0c65967c6uL))

public val FMTID_PRINTER_PROPERTY_BAG: Guid = Guid.fromU128(U128(0x75f9adca097d45c3uL, 0xa6e4bab29e276f3euL))

public val GUID_DEVINTERFACE_IPPUSB_PRINT: Guid = Guid.fromU128(U128(0xf2f40381f46d4e51uL, 0xbce762de6cf2d098uL))

public val GUID_DEVINTERFACE_USBPRINT: Guid = Guid.fromU128(U128(0x28d78fad5a1211d1uL, 0xae5b0000f803a8c2uL))

public val NOTIFICATION_RELEASE: Guid = Guid.fromU128(U128(0xba9a5027a70e4ae7uL, 0x9b7deb3e06ad4157uL))

public val PRINTER_EXTENSION_DETAILEDREASON_PRINTER_STATUS: Guid = Guid.fromU128(U128(0x5d5a1704dfd14181uL, 0x8eee815c86edad31uL))

public val PRINTER_EXTENSION_REASON_DRIVER_EVENT: Guid = Guid.fromU128(U128(0x23bb132863de4293uL, 0x915ba6a23d929acbuL))

public val PRINTER_EXTENSION_REASON_PRINT_PREFERENCES: Guid = Guid.fromU128(U128(0xec8f261f267c469fuL, 0xb5d63933023c29ccuL))

public val PRINT_APP_BIDI_NOTIFY_CHANNEL: Guid = Guid.fromU128(U128(0x2abad223b9944acauL, 0x82fc4571b1b585acuL))

public val PRINT_PORT_MONITOR_NOTIFY_CHANNEL: Guid = Guid.fromU128(U128(0x25df3b0e74a947f5uL, 0x80ce79b4b1eb5c58uL))

public val PRINT_SCHEMA_ASYNC_OPERATION: Guid = Guid.fromU128(U128(0x43b2f83d10f248abuL, 0x831b55fdbdbd34a4uL))

public val PRINTER_EXTENSION_MANAGER: Guid = Guid.fromU128(U128(0x331b60da9e904dd0uL, 0x9c84eac4e659b61fuL))

public val PRINTER_QUEUE: Guid = Guid.fromU128(U128(0xeb54c230798c4c9euL, 0xb46129fad04039b1uL))

public val PRINTER_QUEUE_VIEW: Guid = Guid.fromU128(U128(0xeb54c231798c4c9euL, 0xb46129fad04039b1uL))
