package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val UPDP_SILENT_UPLOAD: UInt = 1u

public val UPDP_UPLOAD_ALWAYS: UInt = 2u

public val USBPRINT_IOCTL_INDEX: UInt = 0u

public val USB_PRINTER_INTERFACE_CLASSIC: UInt = 1u

public val USB_PRINTER_INTERFACE_DUAL: UInt = 3u

public val USB_PRINTER_INTERFACE_IPP: UInt = 2u

public val WM_FI_FILENAME: UInt = 900u

public val XPSRAS_BACKGROUND_COLOR_OPAQUE: XPSRAS_BACKGROUND_COLOR = 1

public val XPSRAS_BACKGROUND_COLOR_TRANSPARENT: XPSRAS_BACKGROUND_COLOR = 0

public val XPSRAS_PIXEL_FORMAT_128BPP_PRGBA_FLOAT_SCRGB: XPSRAS_PIXEL_FORMAT = 3

public val XPSRAS_PIXEL_FORMAT_32BPP_PBGRA_UINT_SRGB: XPSRAS_PIXEL_FORMAT = 1

public val XPSRAS_PIXEL_FORMAT_64BPP_PRGBA_HALF_SCRGB: XPSRAS_PIXEL_FORMAT = 2

public val XPSRAS_RENDERING_MODE_ALIASED: XPSRAS_RENDERING_MODE = 1

public val XPSRAS_RENDERING_MODE_ANTIALIASED: XPSRAS_RENDERING_MODE = 0

public val XPS_FP_DRIVER_PROPERTY_BAG: PCWSTR = w("DriverPropertyBag")

public val XPS_FP_JOB_ID: PCWSTR = w("PrintJobId")

public val XPS_FP_JOB_LEVEL_PRINTTICKET: PCWSTR = w("JobPrintTicket")

public val XPS_FP_MERGED_DATAFILE_PATH: PCWSTR = w("MergedDataFilePath")

public val XPS_FP_MS_CONTENT_TYPE: PCWSTR = w("DriverMultiContentType")

public val XPS_FP_MS_CONTENT_TYPE_OPENXPS: PCWSTR = w("OpenXPS")

public val XPS_FP_MS_CONTENT_TYPE_XPS: PCWSTR = w("XPS")

public val XPS_FP_OUTPUT_FILE: PCWSTR = w("PrintOutputFileName")

public val XPS_FP_PRINTDEVICECAPABILITIES: PCWSTR = w("PrintDeviceCapabilities")

public val XPS_FP_PRINTER_HANDLE: PCWSTR = w("PrinterHandle")

public val XPS_FP_PRINTER_NAME: PCWSTR = w("PrinterName")

public val XPS_FP_PRINT_CLASS_FACTORY: PCWSTR = w("PrintClassFactory")

public val XPS_FP_PROGRESS_REPORT: PCWSTR = w("ProgressReport")

public val XPS_FP_QUEUE_PROPERTY_BAG: PCWSTR = w("QueuePropertyBag")

public val XPS_FP_RESOURCE_DLL_PATHS: PCWSTR = w("ResourceDLLPaths")

public val XPS_FP_USER_PRINT_TICKET: PCWSTR = w("PerUserPrintTicket")

public val XPS_FP_USER_TOKEN: PCWSTR = w("UserSecurityToken")

public val XpsJob_DocumentSequenceAdded: EXpsJobConsumption = 0

public val XpsJob_FixedDocumentAdded: EXpsJobConsumption = 1

public val XpsJob_FixedPageAdded: EXpsJobConsumption = 2

public val Xps_Restricted_Font_Editable: EXpsFontRestriction = 8

public val Xps_Restricted_Font_Installable: EXpsFontRestriction = 0

public val Xps_Restricted_Font_NoEmbedding: EXpsFontRestriction = 2

public val Xps_Restricted_Font_PreviewPrint: EXpsFontRestriction = 4

public val kADT_ASCII: EATTRIBUTE_DATATYPE = 5

public val kADT_BINARY: EATTRIBUTE_DATATYPE = 7

public val kADT_BOOL: EATTRIBUTE_DATATYPE = 1

public val kADT_CUSTOMSIZEPARAMS: EATTRIBUTE_DATATYPE = 10

public val kADT_DWORD: EATTRIBUTE_DATATYPE = 4

public val kADT_INT: EATTRIBUTE_DATATYPE = 2

public val kADT_LONG: EATTRIBUTE_DATATYPE = 3

public val kADT_RECT: EATTRIBUTE_DATATYPE = 9

public val kADT_SIZE: EATTRIBUTE_DATATYPE = 8

public val kADT_UNICODE: EATTRIBUTE_DATATYPE = 6

public val kADT_UNKNOWN: EATTRIBUTE_DATATYPE = 0

public val kAddingDocumentSequence: EPrintXPSJobProgress = 0

public val kAddingFixedDocument: EPrintXPSJobProgress = 2

public val kAddingFixedPage: EPrintXPSJobProgress = 4

public val kAllUsers: PrintAsyncNotifyUserFilter = 1

public val kBiDirectional: PrintAsyncNotifyConversationStyle = 0

public val kDocumentSequenceAdded: EPrintXPSJobProgress = 1

public val kFixedDocumentAdded: EPrintXPSJobProgress = 3

public val kFixedPageAdded: EPrintXPSJobProgress = 5

public val kFontAdded: EPrintXPSJobProgress = 7

public val kImageAdded: EPrintXPSJobProgress = 8

public val kInvalidJobState: EBranchOfficeJobEventType = 0

public val kJobConsumption: EPrintXPSJobOperation = 2

public val kJobProduction: EPrintXPSJobOperation = 1

public val kLogJobError: EBranchOfficeJobEventType = 3

public val kLogJobPipelineError: EBranchOfficeJobEventType = 4

public val kLogJobPrinted: EBranchOfficeJobEventType = 1

public val kLogJobRendered: EBranchOfficeJobEventType = 2

public val kLogOfflineFileFull: EBranchOfficeJobEventType = 5

public val kMessageBox: UI_TYPE = 0

public val kPerUser: PrintAsyncNotifyUserFilter = 0

public val kPropertyTypeBuffer: EPrintPropertyType = 10

public val kPropertyTypeByte: EPrintPropertyType = 4

public val kPropertyTypeDevMode: EPrintPropertyType = 6

public val kPropertyTypeInt32: EPrintPropertyType = 2

public val kPropertyTypeInt64: EPrintPropertyType = 3

public val kPropertyTypeNotificationOptions: EPrintPropertyType = 9

public val kPropertyTypeNotificationReply: EPrintPropertyType = 8

public val kPropertyTypeSD: EPrintPropertyType = 7

public val kPropertyTypeString: EPrintPropertyType = 1

public val kPropertyTypeTime: EPrintPropertyType = 5

public val kResourceAdded: EPrintXPSJobProgress = 6

public val kUniDirectional: PrintAsyncNotifyConversationStyle = 1

public val kXpsDocumentCommitted: EPrintXPSJobProgress = 9
