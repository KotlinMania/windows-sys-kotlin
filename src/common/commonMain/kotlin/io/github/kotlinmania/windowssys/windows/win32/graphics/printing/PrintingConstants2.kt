package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val UPDP_SILENT_UPLOAD: UInt = 1u

public val UPDP_UPLOAD_ALWAYS: UInt = 2u

public val USBPRINT_IOCTL_INDEX: UInt = 0u

public val USB_PRINTER_INTERFACE_CLASSIC: UInt = 1u

public val USB_PRINTER_INTERFACE_DUAL: UInt = 3u

public val USB_PRINTER_INTERFACE_IPP: UInt = 2u

public val WM_FI_FILENAME: UInt = 900u

public val XPSRAS_BACKGROUND_COLOR_OPAQUE: XpsrasBackgroundColor = 1

public val XPSRAS_BACKGROUND_COLOR_TRANSPARENT: XpsrasBackgroundColor = 0

public val XPSRAS_PIXEL_FORMAT_128BPP_PRGBA_FLOAT_SCRGB: XpsrasPixelFormat = 3

public val XPSRAS_PIXEL_FORMAT_32BPP_PBGRA_UINT_SRGB: XpsrasPixelFormat = 1

public val XPSRAS_PIXEL_FORMAT_64BPP_PRGBA_HALF_SCRGB: XpsrasPixelFormat = 2

public val XPSRAS_RENDERING_MODE_ALIASED: XpsrasRenderingMode = 1

public val XPSRAS_RENDERING_MODE_ANTIALIASED: XpsrasRenderingMode = 0

public val XPS_FP_DRIVER_PROPERTY_BAG: Pcwstr = w("DriverPropertyBag")

public val XPS_FP_JOB_ID: Pcwstr = w("PrintJobId")

public val XPS_FP_JOB_LEVEL_PRINTTICKET: Pcwstr = w("JobPrintTicket")

public val XPS_FP_MERGED_DATAFILE_PATH: Pcwstr = w("MergedDataFilePath")

public val XPS_FP_MS_CONTENT_TYPE: Pcwstr = w("DriverMultiContentType")

public val XPS_FP_MS_CONTENT_TYPE_OPENXPS: Pcwstr = w("OpenXPS")

public val XPS_FP_MS_CONTENT_TYPE_XPS: Pcwstr = w("XPS")

public val XPS_FP_OUTPUT_FILE: Pcwstr = w("PrintOutputFileName")

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
