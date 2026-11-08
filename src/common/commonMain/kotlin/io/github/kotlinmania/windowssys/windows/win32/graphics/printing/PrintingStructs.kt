@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.devices.display.FD_KERNINGPAIR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.PANOSE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.DLGPROC
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public data class ADDJOB_INFO_1A(public var Path: PSTR = 0L, public var JobId: UInt = 0u)

public data class ADDJOB_INFO_1W(public var Path: PWSTR = 0L, public var JobId: UInt = 0u)

public data class ATTRIBUTE_INFO_1(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
)

public data class ATTRIBUTE_INFO_2(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
)

public data class ATTRIBUTE_INFO_3(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
    public var dmPrintQuality: Short = 0,
    public var dmYResolution: Short = 0,
)

public data class ATTRIBUTE_INFO_4(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
    public var dmPrintQuality: Short = 0,
    public var dmYResolution: Short = 0,
    public var dwDuplexFlags: UInt = 0u,
    public var dwNupDirection: UInt = 0u,
    public var dwBookletFlags: UInt = 0u,
    public var dwScalingPercentX: UInt = 0u,
    public var dwScalingPercentY: UInt = 0u,
)

public data class BIDI_DATA(public var dwBidiType: UInt = 0u, public var u: BIDI_DATA_0 = BIDI_DATA_0())

public data class BIDI_DATA_0(
    public var bData: BOOL = 0,
    public var iData: Int = 0,
    public var sData: PWSTR = 0L,
    public var fData: Float = 0.0f,
    public var biData: BINARY_CONTAINER = BINARY_CONTAINER(),
)

public data class BIDI_REQUEST_CONTAINER(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Count: UInt = 0u,
    public var aData: List<BIDI_REQUEST_DATA> = List(1) { BIDI_REQUEST_DATA() },
)

public data class BIDI_REQUEST_DATA(
    public var dwReqNumber: UInt = 0u,
    public var pSchema: PWSTR = 0L,
    public var data: BIDI_DATA = BIDI_DATA(),
)

public data class BIDI_RESPONSE_CONTAINER(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Count: UInt = 0u,
    public var aData: List<BIDI_RESPONSE_DATA> = List(1) { BIDI_RESPONSE_DATA() },
)

public data class BIDI_RESPONSE_DATA(
    public var dwResult: UInt = 0u,
    public var dwReqNumber: UInt = 0u,
    public var pSchema: PWSTR = 0L,
    public var data: BIDI_DATA = BIDI_DATA(),
)

public data class BINARY_CONTAINER(public var cbBuf: UInt = 0u, public var pData: Long = 0L)

public data class BranchOfficeJobData(
    public var eEventType: EBranchOfficeJobEventType = 0,
    public var JobId: UInt = 0u,
    public var JobInfo: BranchOfficeJobData_0 = BranchOfficeJobData_0(),
)

public data class BranchOfficeJobData_0(
    public var LogJobPrinted: BranchOfficeJobDataPrinted = BranchOfficeJobDataPrinted(),
    public var LogJobRendered: BranchOfficeJobDataRendered = BranchOfficeJobDataRendered(),
    public var LogJobError: BranchOfficeJobDataError = BranchOfficeJobDataError(),
    public var LogPipelineFailed: BranchOfficeJobDataPipelineFailed = BranchOfficeJobDataPipelineFailed(),
    public var LogOfflineFileFull: BranchOfficeLogOfflineFileFull = BranchOfficeLogOfflineFileFull(),
)

public data class BranchOfficeJobDataContainer(public var cJobDataEntries: UInt = 0u, public var JobData: List<BranchOfficeJobData> = List(1) { BranchOfficeJobData() })

public data class BranchOfficeJobDataError(
    public var LastError: UInt = 0u,
    public var pDocumentName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var pDataType: PWSTR = 0L,
    public var TotalSize: Long = 0L,
    public var PrintedSize: Long = 0L,
    public var TotalPages: UInt = 0u,
    public var PrintedPages: UInt = 0u,
    public var pMachineName: PWSTR = 0L,
    public var pJobError: PWSTR = 0L,
    public var pErrorDescription: PWSTR = 0L,
)

public data class BranchOfficeJobDataPipelineFailed(
    public var pDocumentName: PWSTR = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var pExtraErrorInfo: PWSTR = 0L,
)

public data class BranchOfficeJobDataPrinted(
    public var Status: UInt = 0u,
    public var pDocumentName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pMachineName: PWSTR = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var pPortName: PWSTR = 0L,
    public var Size: Long = 0L,
    public var TotalPages: UInt = 0u,
)

public data class BranchOfficeJobDataRendered(
    public var Size: Long = 0L,
    public var ICMMethod: UInt = 0u,
    public var Color: Short = 0,
    public var PrintQuality: Short = 0,
    public var YResolution: Short = 0,
    public var Copies: Short = 0,
    public var TTOption: Short = 0,
)

public data class BranchOfficeLogOfflineFileFull(public var pMachineName: PWSTR = 0L)

public data class COMPROPSHEETUI(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var hInstCaller: HINSTANCE = 0L,
    public var pCallerName: Long = 0L,
    public var UserData: ULong = 0uL,
    public var pHelpFile: Long = 0L,
    public var pfnCallBack: _CPSUICALLBACK = null,
    public var pOptItem: Long = 0L,
    public var pDlgPage: Long = 0L,
    public var cOptItem: UShort = 0u,
    public var cDlgPage: UShort = 0u,
    public var IconID: ULong = 0uL,
    public var pOptItemName: Long = 0L,
    public var CallerVersion: UShort = 0u,
    public var OptItemVersion: UShort = 0u,
    public var dwReserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COMPROPSHEETUI) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pCallerName != other.pCallerName) return false
        if (this.UserData != other.UserData) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pfnCallBack != other.pfnCallBack) return false
        if (this.pOptItem != other.pOptItem) return false
        if (this.pDlgPage != other.pDlgPage) return false
        if (this.cOptItem != other.cOptItem) return false
        if (this.cDlgPage != other.cDlgPage) return false
        if (this.IconID != other.IconID) return false
        if (this.pOptItemName != other.pOptItemName) return false
        if (this.CallerVersion != other.CallerVersion) return false
        if (this.OptItemVersion != other.OptItemVersion) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pCallerName.hashCode()
        result = 31 * result + this.UserData.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pfnCallBack.hashCode()
        result = 31 * result + this.pOptItem.hashCode()
        result = 31 * result + this.pDlgPage.hashCode()
        result = 31 * result + this.cOptItem.hashCode()
        result = 31 * result + this.cDlgPage.hashCode()
        result = 31 * result + this.IconID.hashCode()
        result = 31 * result + this.pOptItemName.hashCode()
        result = 31 * result + this.CallerVersion.hashCode()
        result = 31 * result + this.OptItemVersion.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class CONFIG_INFO_DATA_1(public var Reserved: UByteArray = UByteArray(128), public var dwVersion: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONFIG_INFO_DATA_1) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        return result
    }
}

public data class CORE_PRINTER_DRIVERA(
    public var CoreDriverGUID: GUID = GUID(),
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CORE_PRINTER_DRIVERA) return false
        if (this.CoreDriverGUID != other.CoreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CoreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public data class CORE_PRINTER_DRIVERW(
    public var CoreDriverGUID: GUID = GUID(),
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CORE_PRINTER_DRIVERW) return false
        if (this.CoreDriverGUID != other.CoreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CoreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public data class CPSUICBPARAM(
    public var cbSize: UShort = 0u,
    public var Reason: UShort = 0u,
    public var hDlg: HWND = 0L,
    public var pOptItem: Long = 0L,
    public var cOptItem: UShort = 0u,
    public var Flags: UShort = 0u,
    public var pCurItem: Long = 0L,
    public var Anonymous: CPSUICBPARAM_0 = CPSUICBPARAM_0(),
    public var UserData: ULong = 0uL,
    public var Result: ULong = 0uL,
)

public data class CPSUICBPARAM_0(public var OldSel: Int = 0, public var pOldSel: Long = 0L)

public data class CPSUIDATABLOCK(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class CUSTOMSIZEPARAM(
    public var dwOrder: Int = 0,
    public var lMinVal: Int = 0,
    public var lMaxVal: Int = 0,
)

public data class DATATYPES_INFO_1A(public var pName: PSTR = 0L)

public data class DATATYPES_INFO_1W(public var pName: PWSTR = 0L)

public data class DATA_HEADER(
    public var dwSignature: UInt = 0u,
    public var wSize: UShort = 0u,
    public var wDataID: UShort = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DELETE_PORT_DATA_1(
    public var psztPortName: UShortArray = UShortArray(64),
    public var Reserved: UByteArray = UByteArray(98),
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DELETE_PORT_DATA_1) return false
        if (!this.psztPortName.contentEquals(other.psztPortName)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psztPortName.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }
}

public data class DEVICEPROPERTYHEADER(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var hPrinter: HANDLE = 0L,
    public var pszPrinterName: Long = 0L,
)

public data class DEVQUERYPRINT_INFO(
    public var cbSize: UShort = 0u,
    public var Level: UShort = 0u,
    public var hPrinter: HANDLE = 0L,
    public var pDevMode: Long = 0L,
    public var pszErrorStr: PWSTR = 0L,
    public var cchErrorStr: UInt = 0u,
    public var cchNeeded: UInt = 0u,
)

public data class DLGPAGE(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var DlgProc: DLGPROC = null,
    public var pTabName: Long = 0L,
    public var IconID: ULong = 0uL,
    public var Anonymous: DLGPAGE_0 = DLGPAGE_0(),
)

public data class DLGPAGE_0(public var DlgTemplateID: UShort = 0u, public var hDlgTemplate: HANDLE = 0L)

public data class DOCEVENT_CREATEDCPRE(
    public var pszDriver: PWSTR = 0L,
    public var pszDevice: PWSTR = 0L,
    public var pdm: Long = 0L,
    public var bIC: BOOL = 0,
)

public data class DOCEVENT_ESCAPE(
    public var iEscape: Int = 0,
    public var cjInput: Int = 0,
    public var pvInData: Long = 0L,
)

public data class DOCEVENT_FILTER(
    public var cbSize: UInt = 0u,
    public var cElementsAllocated: UInt = 0u,
    public var cElementsNeeded: UInt = 0u,
    public var cElementsReturned: UInt = 0u,
    public var aDocEventCall: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOCEVENT_FILTER) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cElementsAllocated != other.cElementsAllocated) return false
        if (this.cElementsNeeded != other.cElementsNeeded) return false
        if (this.cElementsReturned != other.cElementsReturned) return false
        if (!this.aDocEventCall.contentEquals(other.aDocEventCall)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cElementsAllocated.hashCode()
        result = 31 * result + this.cElementsNeeded.hashCode()
        result = 31 * result + this.cElementsReturned.hashCode()
        result = 31 * result + this.aDocEventCall.contentHashCode()
        return result
    }
}

public data class DOCUMENTPROPERTYHEADER(
    public var cbSize: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var hPrinter: HANDLE = 0L,
    public var pszPrinterName: Long = 0L,
    public var pdmIn: Long = 0L,
    public var pdmOut: Long = 0L,
    public var cbOut: UInt = 0u,
    public var fMode: UInt = 0u,
)

public data class DOC_INFO_1A(
    public var pDocName: PSTR = 0L,
    public var pOutputFile: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
)

public data class DOC_INFO_1W(
    public var pDocName: PWSTR = 0L,
    public var pOutputFile: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
)

public data class DOC_INFO_2A(
    public var pDocName: PSTR = 0L,
    public var pOutputFile: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var dwMode: UInt = 0u,
    public var JobId: UInt = 0u,
)

public data class DOC_INFO_2W(
    public var pDocName: PWSTR = 0L,
    public var pOutputFile: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var dwMode: UInt = 0u,
    public var JobId: UInt = 0u,
)

public data class DOC_INFO_3A(
    public var pDocName: PSTR = 0L,
    public var pOutputFile: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var dwFlags: UInt = 0u,
)

public data class DOC_INFO_3W(
    public var pDocName: PWSTR = 0L,
    public var pOutputFile: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var dwFlags: UInt = 0u,
)

public data class DOC_INFO_INTERNAL(
    public var pDocName: Long = 0L,
    public var pOutputFile: Long = 0L,
    public var pDatatype: Long = 0L,
    public var bLowILJob: BOOL = 0,
    public var hTokenLowIL: HANDLE = 0L,
)

public data class DRIVER_INFO_1A(public var pName: PSTR = 0L)

public data class DRIVER_INFO_1W(public var pName: PWSTR = 0L)

public data class DRIVER_INFO_2A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
)

public data class DRIVER_INFO_2W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
)

public data class DRIVER_INFO_3A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
    public var pHelpFile: PSTR = 0L,
    public var pDependentFiles: PSTR = 0L,
    public var pMonitorName: PSTR = 0L,
    public var pDefaultDataType: PSTR = 0L,
)

public data class DRIVER_INFO_3W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
    public var pHelpFile: PWSTR = 0L,
    public var pDependentFiles: PWSTR = 0L,
    public var pMonitorName: PWSTR = 0L,
    public var pDefaultDataType: PWSTR = 0L,
)

public data class DRIVER_INFO_4A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
    public var pHelpFile: PSTR = 0L,
    public var pDependentFiles: PSTR = 0L,
    public var pMonitorName: PSTR = 0L,
    public var pDefaultDataType: PSTR = 0L,
    public var pszzPreviousNames: PSTR = 0L,
)

public data class DRIVER_INFO_4W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
    public var pHelpFile: PWSTR = 0L,
    public var pDependentFiles: PWSTR = 0L,
    public var pMonitorName: PWSTR = 0L,
    public var pDefaultDataType: PWSTR = 0L,
    public var pszzPreviousNames: PWSTR = 0L,
)

public data class DRIVER_INFO_5A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
    public var dwDriverAttributes: UInt = 0u,
    public var dwConfigVersion: UInt = 0u,
    public var dwDriverVersion: UInt = 0u,
)

public data class DRIVER_INFO_5W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
    public var dwDriverAttributes: UInt = 0u,
    public var dwConfigVersion: UInt = 0u,
    public var dwDriverVersion: UInt = 0u,
)

public class DRIVER_INFO_6A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
    public var pHelpFile: PSTR = 0L,
    public var pDependentFiles: PSTR = 0L,
    public var pMonitorName: PSTR = 0L,
    public var pDefaultDataType: PSTR = 0L,
    public var pszzPreviousNames: PSTR = 0L,
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: PSTR = 0L,
    public var pszOEMUrl: PSTR = 0L,
    public var pszHardwareID: PSTR = 0L,
    public var pszProvider: PSTR = 0L,
)

public class DRIVER_INFO_6W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
    public var pHelpFile: PWSTR = 0L,
    public var pDependentFiles: PWSTR = 0L,
    public var pMonitorName: PWSTR = 0L,
    public var pDefaultDataType: PWSTR = 0L,
    public var pszzPreviousNames: PWSTR = 0L,
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: PWSTR = 0L,
    public var pszOEMUrl: PWSTR = 0L,
    public var pszHardwareID: PWSTR = 0L,
    public var pszProvider: PWSTR = 0L,
)

public class DRIVER_INFO_8A(
    public var cVersion: UInt = 0u,
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDriverPath: PSTR = 0L,
    public var pDataFile: PSTR = 0L,
    public var pConfigFile: PSTR = 0L,
    public var pHelpFile: PSTR = 0L,
    public var pDependentFiles: PSTR = 0L,
    public var pMonitorName: PSTR = 0L,
    public var pDefaultDataType: PSTR = 0L,
    public var pszzPreviousNames: PSTR = 0L,
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: PSTR = 0L,
    public var pszOEMUrl: PSTR = 0L,
    public var pszHardwareID: PSTR = 0L,
    public var pszProvider: PSTR = 0L,
    public var pszPrintProcessor: PSTR = 0L,
    public var pszVendorSetup: PSTR = 0L,
    public var pszzColorProfiles: PSTR = 0L,
    public var pszInfPath: PSTR = 0L,
    public var dwPrinterDriverAttributes: UInt = 0u,
    public var pszzCoreDriverDependencies: PSTR = 0L,
    public var ftMinInboxDriverVerDate: FILETIME = FILETIME(),
    public var dwlMinInboxDriverVerVersion: ULong = 0uL,
)

public class DRIVER_INFO_8W(
    public var cVersion: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDriverPath: PWSTR = 0L,
    public var pDataFile: PWSTR = 0L,
    public var pConfigFile: PWSTR = 0L,
    public var pHelpFile: PWSTR = 0L,
    public var pDependentFiles: PWSTR = 0L,
    public var pMonitorName: PWSTR = 0L,
    public var pDefaultDataType: PWSTR = 0L,
    public var pszzPreviousNames: PWSTR = 0L,
    public var ftDriverDate: FILETIME = FILETIME(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: PWSTR = 0L,
    public var pszOEMUrl: PWSTR = 0L,
    public var pszHardwareID: PWSTR = 0L,
    public var pszProvider: PWSTR = 0L,
    public var pszPrintProcessor: PWSTR = 0L,
    public var pszVendorSetup: PWSTR = 0L,
    public var pszzColorProfiles: PWSTR = 0L,
    public var pszInfPath: PWSTR = 0L,
    public var dwPrinterDriverAttributes: UInt = 0u,
    public var pszzCoreDriverDependencies: PWSTR = 0L,
    public var ftMinInboxDriverVerDate: FILETIME = FILETIME(),
    public var dwlMinInboxDriverVerVersion: ULong = 0uL,
)

public data class DRIVER_UPGRADE_INFO_1(public var pPrinterName: Long = 0L, public var pOldDriverDirectory: Long = 0L)

public data class DRIVER_UPGRADE_INFO_2(
    public var pPrinterName: Long = 0L,
    public var pOldDriverDirectory: Long = 0L,
    public var cVersion: UInt = 0u,
    public var pName: Long = 0L,
    public var pEnvironment: Long = 0L,
    public var pDriverPath: Long = 0L,
    public var pDataFile: Long = 0L,
    public var pConfigFile: Long = 0L,
    public var pHelpFile: Long = 0L,
    public var pDependentFiles: Long = 0L,
    public var pMonitorName: Long = 0L,
    public var pDefaultDataType: Long = 0L,
    public var pszzPreviousNames: Long = 0L,
)

public data class EXTCHKBOX(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var pTitle: Long = 0L,
    public var pSeparator: Long = 0L,
    public var pCheckedName: Long = 0L,
    public var IconID: ULong = 0uL,
    public var wReserved: UShortArray = UShortArray(4),
    public var dwReserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTCHKBOX) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.pSeparator != other.pSeparator) return false
        if (this.pCheckedName != other.pCheckedName) return false
        if (this.IconID != other.IconID) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.pSeparator.hashCode()
        result = 31 * result + this.pCheckedName.hashCode()
        result = 31 * result + this.IconID.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class EXTPUSH(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var pTitle: Long = 0L,
    public var Anonymous1: EXTPUSH_0 = EXTPUSH_0(),
    public var IconID: ULong = 0uL,
    public var Anonymous2: EXTPUSH_1 = EXTPUSH_1(),
    public var dwReserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTPUSH) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.IconID != other.IconID) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.Anonymous1.hashCode()
        result = 31 * result + this.IconID.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class EXTPUSH_0(public var DlgProc: DLGPROC = null, public var pfnCallBack: FARPROC = null)

public data class EXTPUSH_1(public var DlgTemplateID: UShort = 0u, public var hDlgTemplate: HANDLE = 0L)

public class EXTTEXTMETRIC(
    public var emSize: Short = 0,
    public var emPointSize: Short = 0,
    public var emOrientation: Short = 0,
    public var emMasterHeight: Short = 0,
    public var emMinScale: Short = 0,
    public var emMaxScale: Short = 0,
    public var emMasterUnits: Short = 0,
    public var emCapHeight: Short = 0,
    public var emXHeight: Short = 0,
    public var emLowerCaseAscent: Short = 0,
    public var emLowerCaseDescent: Short = 0,
    public var emSlant: Short = 0,
    public var emSuperScript: Short = 0,
    public var emSubScript: Short = 0,
    public var emSuperScriptSize: Short = 0,
    public var emSubScriptSize: Short = 0,
    public var emUnderlineOffset: Short = 0,
    public var emUnderlineWidth: Short = 0,
    public var emDoubleUpperUnderlineOffset: Short = 0,
    public var emDoubleLowerUnderlineOffset: Short = 0,
    public var emDoubleUpperUnderlineWidth: Short = 0,
    public var emDoubleLowerUnderlineWidth: Short = 0,
    public var emStrikeOutOffset: Short = 0,
    public var emStrikeOutWidth: Short = 0,
    public var emKernPairs: UShort = 0u,
    public var emKernTracks: UShort = 0u,
)

public data class FORM_INFO_1A(
    public var Flags: UInt = 0u,
    public var pName: PSTR = 0L,
    public var Size: SIZE = SIZE(),
    public var ImageableArea: RECTL = RECTL(),
)

public data class FORM_INFO_1W(
    public var Flags: UInt = 0u,
    public var pName: PWSTR = 0L,
    public var Size: SIZE = SIZE(),
    public var ImageableArea: RECTL = RECTL(),
)

public data class FORM_INFO_2A(
    public var Flags: UInt = 0u,
    public var pName: PCSTR = 0L,
    public var Size: SIZE = SIZE(),
    public var ImageableArea: RECTL = RECTL(),
    public var pKeyword: PCSTR = 0L,
    public var StringType: UInt = 0u,
    public var pMuiDll: PCSTR = 0L,
    public var dwResourceId: UInt = 0u,
    public var pDisplayName: PCSTR = 0L,
    public var wLangId: UShort = 0u,
)

public data class FORM_INFO_2W(
    public var Flags: UInt = 0u,
    public var pName: PCWSTR = 0L,
    public var Size: SIZE = SIZE(),
    public var ImageableArea: RECTL = RECTL(),
    public var pKeyword: PCSTR = 0L,
    public var StringType: UInt = 0u,
    public var pMuiDll: PCWSTR = 0L,
    public var dwResourceId: UInt = 0u,
    public var pDisplayName: PCWSTR = 0L,
    public var wLangId: UShort = 0u,
)

public data class GLYPHRUN(public var wcLow: UShort = 0u, public var wGlyphCount: UShort = 0u)

public data class INSERTPSUIPAGE_INFO(
    public var cbSize: UShort = 0u,
    public var Type: UByte = 0u,
    public var Mode: UByte = 0u,
    public var dwData1: ULong = 0uL,
    public var dwData2: ULong = 0uL,
    public var dwData3: ULong = 0uL,
)

public data class INVOC(public var dwCount: UInt = 0u, public var loOffset: UInt = 0u)

public data class ImgErrorInfo(
    public var description: BSTR = 0L,
    public var guid: GUID = GUID(),
    public var helpContext: UInt = 0u,
    public var helpFile: BSTR = 0L,
    public var source: BSTR = 0L,
    public var devDescription: BSTR = 0L,
    public var errorID: GUID = GUID(),
    public var cUserParameters: UInt = 0u,
    public var aUserParameters: Long = 0L,
    public var userFallback: BSTR = 0L,
    public var exceptionID: UInt = 0u,
)

public data class JOB_INFO_1A(
    public var JobId: UInt = 0u,
    public var pPrinterName: PSTR = 0L,
    public var pMachineName: PSTR = 0L,
    public var pUserName: PSTR = 0L,
    public var pDocument: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var pStatus: PSTR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
)

public data class JOB_INFO_1W(
    public var JobId: UInt = 0u,
    public var pPrinterName: PWSTR = 0L,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pDocument: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var pStatus: PWSTR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
)

public class JOB_INFO_2A(
    public var JobId: UInt = 0u,
    public var pPrinterName: PSTR = 0L,
    public var pMachineName: PSTR = 0L,
    public var pUserName: PSTR = 0L,
    public var pDocument: PSTR = 0L,
    public var pNotifyName: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var pPrintProcessor: PSTR = 0L,
    public var pParameters: PSTR = 0L,
    public var pDriverName: PSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pStatus: PSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var Size: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var Time: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
)

public class JOB_INFO_2W(
    public var JobId: UInt = 0u,
    public var pPrinterName: PWSTR = 0L,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pDocument: PWSTR = 0L,
    public var pNotifyName: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var pPrintProcessor: PWSTR = 0L,
    public var pParameters: PWSTR = 0L,
    public var pDriverName: PWSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pStatus: PWSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var Size: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var Time: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
)

public data class JOB_INFO_3(
    public var JobId: UInt = 0u,
    public var NextJobId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public class JOB_INFO_4A(
    public var JobId: UInt = 0u,
    public var pPrinterName: PSTR = 0L,
    public var pMachineName: PSTR = 0L,
    public var pUserName: PSTR = 0L,
    public var pDocument: PSTR = 0L,
    public var pNotifyName: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var pPrintProcessor: PSTR = 0L,
    public var pParameters: PSTR = 0L,
    public var pDriverName: PSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pStatus: PSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var Size: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var Time: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
    public var SizeHigh: Int = 0,
)

public class JOB_INFO_4W(
    public var JobId: UInt = 0u,
    public var pPrinterName: PWSTR = 0L,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pDocument: PWSTR = 0L,
    public var pNotifyName: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var pPrintProcessor: PWSTR = 0L,
    public var pParameters: PWSTR = 0L,
    public var pDriverName: PWSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pStatus: PWSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Status: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Position: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var TotalPages: UInt = 0u,
    public var Size: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var Time: UInt = 0u,
    public var PagesPrinted: UInt = 0u,
    public var SizeHigh: Int = 0,
)

public data class KERNDATA(
    public var dwSize: UInt = 0u,
    public var dwKernPairNum: UInt = 0u,
    public var KernPair: List<FD_KERNINGPAIR> = List(1) { FD_KERNINGPAIR() },
)

public data class MAPTABLE(
    public var dwSize: UInt = 0u,
    public var dwGlyphNum: UInt = 0u,
    public var Trans: List<TRANSDATA> = List(1) { TRANSDATA() },
)

public data class MESSAGEBOX_PARAMS(
    public var cbSize: UInt = 0u,
    public var pTitle: PWSTR = 0L,
    public var pMessage: PWSTR = 0L,
    public var Style: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var bWait: BOOL = 0,
)

public class MONITOR(
    public var pfnEnumPorts: PFN_PRINTING_ENUMPORTS = null,
    public var pfnOpenPort: PFN_PRINTING_OPENPORT = null,
    public var pfnOpenPortEx: PFN_PRINTING_OPENPORTEX = null,
    public var pfnStartDocPort: PFN_PRINTING_STARTDOCPORT = null,
    public var pfnWritePort: PFN_PRINTING_WRITEPORT = null,
    public var pfnReadPort: PFN_PRINTING_READPORT = null,
    public var pfnEndDocPort: PFN_PRINTING_ENDDOCPORT = null,
    public var pfnClosePort: PFN_PRINTING_CLOSEPORT = null,
    public var pfnAddPort: PFN_PRINTING_ADDPORT = null,
    public var pfnAddPortEx: PFN_PRINTING_ADDPORTEX = null,
    public var pfnConfigurePort: PFN_PRINTING_CONFIGUREPORT = null,
    public var pfnDeletePort: PFN_PRINTING_DELETEPORT = null,
    public var pfnGetPrinterDataFromPort: PFN_PRINTING_GETPRINTERDATAFROMPORT = null,
    public var pfnSetPortTimeOuts: PFN_PRINTING_SETPORTTIMEOUTS = null,
    public var pfnXcvOpenPort: PFN_PRINTING_XCVOPENPORT = null,
    public var pfnXcvDataPort: PFN_PRINTING_XCVDATAPORT = null,
    public var pfnXcvClosePort: PFN_PRINTING_XCVCLOSEPORT = null,
)

public class MONITOR2(
    public var cbSize: UInt = 0u,
    public var pfnEnumPorts: PFN_PRINTING_ENUMPORTS2 = null,
    public var pfnOpenPort: PFN_PRINTING_OPENPORT2 = null,
    public var pfnOpenPortEx: PFN_PRINTING_OPENPORTEX2 = null,
    public var pfnStartDocPort: PFN_PRINTING_STARTDOCPORT2 = null,
    public var pfnWritePort: PFN_PRINTING_WRITEPORT2 = null,
    public var pfnReadPort: PFN_PRINTING_READPORT2 = null,
    public var pfnEndDocPort: PFN_PRINTING_ENDDOCPORT2 = null,
    public var pfnClosePort: PFN_PRINTING_CLOSEPORT2 = null,
    public var pfnAddPort: PFN_PRINTING_ADDPORT2 = null,
    public var pfnAddPortEx: PFN_PRINTING_ADDPORTEX2 = null,
    public var pfnConfigurePort: PFN_PRINTING_CONFIGUREPORT2 = null,
    public var pfnDeletePort: PFN_PRINTING_DELETEPORT2 = null,
    public var pfnGetPrinterDataFromPort: PFN_PRINTING_GETPRINTERDATAFROMPORT2 = null,
    public var pfnSetPortTimeOuts: PFN_PRINTING_SETPORTTIMEOUTS2 = null,
    public var pfnXcvOpenPort: PFN_PRINTING_XCVOPENPORT2 = null,
    public var pfnXcvDataPort: PFN_PRINTING_XCVDATAPORT2 = null,
    public var pfnXcvClosePort: PFN_PRINTING_XCVCLOSEPORT2 = null,
    public var pfnShutdown: PFN_PRINTING_SHUTDOWN2 = null,
    public var pfnSendRecvBidiDataFromPort: PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2 = null,
    public var pfnNotifyUsedPorts: PFN_PRINTING_NOTIFYUSEDPORTS2 = null,
    public var pfnNotifyUnusedPorts: PFN_PRINTING_NOTIFYUNUSEDPORTS2 = null,
    public var pfnPowerEvent: PFN_PRINTING_POWEREVENT2 = null,
)

public data class MONITOREX(public var dwMonitorSize: UInt = 0u, public var Monitor: MONITOR = MONITOR())

public data class MONITORINIT(
    public var cbSize: UInt = 0u,
    public var hSpooler: HANDLE = 0L,
    public var hckRegistryRoot: HKEY = 0L,
    public var pMonitorReg: Long = 0L,
    public var bLocal: BOOL = 0,
    public var pszServerName: PCWSTR = 0L,
)

public data class MONITORREG(
    public var cbSize: UInt = 0u,
    public var fpCreateKey: Long = 0L,
    public var fpOpenKey: Long = 0L,
    public var fpCloseKey: Long = 0L,
    public var fpDeleteKey: Long = 0L,
    public var fpEnumKey: Long = 0L,
    public var fpQueryInfoKey: Long = 0L,
    public var fpSetValue: Long = 0L,
    public var fpDeleteValue: Long = 0L,
    public var fpEnumValue: Long = 0L,
    public var fpQueryValue: Long = 0L,
)

public data class MONITORUI(
    public var dwMonitorUISize: UInt = 0u,
    public var pfnAddPortUI: Long = 0L,
    public var pfnConfigurePortUI: Long = 0L,
    public var pfnDeletePortUI: Long = 0L,
)

public data class MONITOR_INFO_1A(public var pName: PSTR = 0L)

public data class MONITOR_INFO_1W(public var pName: PWSTR = 0L)

public data class MONITOR_INFO_2A(
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDLLName: PSTR = 0L,
)

public data class MONITOR_INFO_2W(
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDLLName: PWSTR = 0L,
)

public data class MXDC_ESCAPE_HEADER_T(
    public var cbInput: UInt = 0u,
    public var cbOutput: UInt = 0u,
    public var opCode: UInt = 0u,
)

public data class MXDC_GET_FILENAME_DATA_T(public var cbOutput: UInt = 0u, public var wszData: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MXDC_GET_FILENAME_DATA_T) return false
        if (this.cbOutput != other.cbOutput) return false
        if (!this.wszData.contentEquals(other.wszData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbOutput.hashCode()
        result = 31 * result + this.wszData.contentHashCode()
        return result
    }
}

public data class MXDC_PRINTTICKET_DATA_T(public var dwDataSize: UInt = 0u, public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MXDC_PRINTTICKET_DATA_T) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class MXDC_PRINTTICKET_ESCAPE_T(public var mxdcEscape: MXDC_ESCAPE_HEADER_T = MXDC_ESCAPE_HEADER_T(), public var printTicketData: MXDC_PRINTTICKET_DATA_T = MXDC_PRINTTICKET_DATA_T())

public data class MXDC_S0PAGE_DATA_T(public var dwSize: UInt = 0u, public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MXDC_S0PAGE_DATA_T) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class MXDC_S0PAGE_PASSTHROUGH_ESCAPE_T(public var mxdcEscape: MXDC_ESCAPE_HEADER_T = MXDC_ESCAPE_HEADER_T(), public var xpsS0PageData: MXDC_S0PAGE_DATA_T = MXDC_S0PAGE_DATA_T())

public data class MXDC_S0PAGE_RESOURCE_ESCAPE_T(public var mxdcEscape: MXDC_ESCAPE_HEADER_T = MXDC_ESCAPE_HEADER_T(), public var xpsS0PageResourcePassthrough: MXDC_XPS_S0PAGE_RESOURCE_T = MXDC_XPS_S0PAGE_RESOURCE_T())

public data class MXDC_XPS_S0PAGE_RESOURCE_T(
    public var dwSize: UInt = 0u,
    public var dwResourceType: UInt = 0u,
    public var szUri: UByteArray = UByteArray(260),
    public var dwDataSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MXDC_XPS_S0PAGE_RESOURCE_T) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwResourceType != other.dwResourceType) return false
        if (!this.szUri.contentEquals(other.szUri)) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwResourceType.hashCode()
        result = 31 * result + this.szUri.contentHashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class NOTIFICATION_CONFIG_1(
    public var cbSize: UInt = 0u,
    public var fdwFlags: UInt = 0u,
    public var pfnNotifyCallback: ROUTER_NOTIFY_CALLBACK = null,
    public var pContext: Long = 0L,
)

public data class OEMCUIPPARAM(
    public var cbSize: UInt = 0u,
    public var poemuiobj: Long = 0L,
    public var hPrinter: HANDLE = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var hModule: HANDLE = 0L,
    public var hOEMHeap: HANDLE = 0L,
    public var pPublicDM: Long = 0L,
    public var pOEMDM: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var pDrvOptItems: Long = 0L,
    public var cDrvOptItems: UInt = 0u,
    public var pOEMOptItems: Long = 0L,
    public var cOEMOptItems: UInt = 0u,
    public var pOEMUserData: Long = 0L,
    public var OEMCUIPCallback: OEMCUIPCALLBACK = null,
)

public data class OEMDMPARAM(
    public var cbSize: UInt = 0u,
    public var pdriverobj: Long = 0L,
    public var hPrinter: HANDLE = 0L,
    public var hModule: HANDLE = 0L,
    public var pPublicDMIn: Long = 0L,
    public var pPublicDMOut: Long = 0L,
    public var pOEMDMIn: Long = 0L,
    public var pOEMDMOut: Long = 0L,
    public var cbBufSize: UInt = 0u,
)

public data class OEMFONTINSTPARAM(
    public var cbSize: UInt = 0u,
    public var hPrinter: HANDLE = 0L,
    public var hModule: HANDLE = 0L,
    public var hHeap: HANDLE = 0L,
    public var dwFlags: UInt = 0u,
    public var pFontInstallerName: PWSTR = 0L,
)

public data class OEMUIOBJ(public var cbSize: UInt = 0u, public var pOemUIProcs: Long = 0L)

public data class OEMUIPROCS(public var DrvGetDriverSetting: PFN_DrvGetDriverSetting = null, public var DrvUpdateUISetting: PFN_DrvUpdateUISetting = null)

public data class OEMUIPSPARAM(
    public var cbSize: UInt = 0u,
    public var poemuiobj: Long = 0L,
    public var hPrinter: HANDLE = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var hModule: HANDLE = 0L,
    public var hOEMHeap: HANDLE = 0L,
    public var pPublicDM: Long = 0L,
    public var pOEMDM: Long = 0L,
    public var pOEMUserData: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var pOemEntry: Long = 0L,
)

public data class OEM_DMEXTRAHEADER(
    public var dwSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
)

public data class OIEXT(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var hInstCaller: HINSTANCE = 0L,
    public var pHelpFile: Long = 0L,
    public var dwReserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OIEXT) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class OPTCOMBO(
    public var cbSize: UShort = 0u,
    public var Flags: UByte = 0u,
    public var cListItem: UShort = 0u,
    public var pListItem: Long = 0L,
    public var Sel: Int = 0,
    public var dwReserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OPTCOMBO) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.cListItem != other.cListItem) return false
        if (this.pListItem != other.pListItem) return false
        if (this.Sel != other.Sel) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.cListItem.hashCode()
        result = 31 * result + this.pListItem.hashCode()
        result = 31 * result + this.Sel.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class OPTITEM(
    public var cbSize: UShort = 0u,
    public var Level: UByte = 0u,
    public var DlgPageIdx: UByte = 0u,
    public var Flags: UInt = 0u,
    public var UserData: ULong = 0uL,
    public var pName: Long = 0L,
    public var Anonymous1: OPTITEM_0 = OPTITEM_0(),
    public var Anonymous2: OPTITEM_1 = OPTITEM_1(),
    public var pOptType: Long = 0L,
    public var HelpIndex: UInt = 0u,
    public var DMPubID: UByte = 0u,
    public var UserItemID: UByte = 0u,
    public var wReserved: UShort = 0u,
    public var pOIExt: Long = 0L,
    public var dwReserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OPTITEM) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Level != other.Level) return false
        if (this.DlgPageIdx != other.DlgPageIdx) return false
        if (this.Flags != other.Flags) return false
        if (this.UserData != other.UserData) return false
        if (this.pName != other.pName) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (this.pOptType != other.pOptType) return false
        if (this.HelpIndex != other.HelpIndex) return false
        if (this.DMPubID != other.DMPubID) return false
        if (this.UserItemID != other.UserItemID) return false
        if (this.wReserved != other.wReserved) return false
        if (this.pOIExt != other.pOIExt) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Level.hashCode()
        result = 31 * result + this.DlgPageIdx.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.UserData.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.pOptType.hashCode()
        result = 31 * result + this.HelpIndex.hashCode()
        result = 31 * result + this.DMPubID.hashCode()
        result = 31 * result + this.UserItemID.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.pOIExt.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class OPTITEM_0(public var Sel: Int = 0, public var pSel: Long = 0L)

public data class OPTITEM_1(public var pExtChkBox: Long = 0L, public var pExtPush: Long = 0L)

public data class OPTPARAM(
    public var cbSize: UShort = 0u,
    public var Flags: UByte = 0u,
    public var Style: UByte = 0u,
    public var pData: Long = 0L,
    public var IconID: ULong = 0uL,
    public var lParam: LPARAM = 0L,
    public var dwReserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OPTPARAM) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.Style != other.Style) return false
        if (this.pData != other.pData) return false
        if (this.IconID != other.IconID) return false
        if (this.lParam != other.lParam) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Style.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.IconID.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class OPTTYPE(
    public var cbSize: UShort = 0u,
    public var Type: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Count: UShort = 0u,
    public var BegCtrlID: UShort = 0u,
    public var pOptParam: Long = 0L,
    public var Style: UShort = 0u,
    public var wReserved: UShortArray = UShortArray(3),
    public var dwReserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OPTTYPE) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Type != other.Type) return false
        if (this.Flags != other.Flags) return false
        if (this.Count != other.Count) return false
        if (this.BegCtrlID != other.BegCtrlID) return false
        if (this.pOptParam != other.pOptParam) return false
        if (this.Style != other.Style) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.BegCtrlID.hashCode()
        result = 31 * result + this.pOptParam.hashCode()
        result = 31 * result + this.Style.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class PORT_DATA_1(
    public var sztPortName: UShortArray = UShortArray(64),
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var sztHostAddress: UShortArray = UShortArray(49),
    public var sztSNMPCommunity: UShortArray = UShortArray(33),
    public var dwDoubleSpool: UInt = 0u,
    public var sztQueue: UShortArray = UShortArray(33),
    public var sztIPAddress: UShortArray = UShortArray(16),
    public var Reserved: UByteArray = UByteArray(540),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PORT_DATA_1) return false
        if (!this.sztPortName.contentEquals(other.sztPortName)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.sztHostAddress.contentEquals(other.sztHostAddress)) return false
        if (!this.sztSNMPCommunity.contentEquals(other.sztSNMPCommunity)) return false
        if (this.dwDoubleSpool != other.dwDoubleSpool) return false
        if (!this.sztQueue.contentEquals(other.sztQueue)) return false
        if (!this.sztIPAddress.contentEquals(other.sztIPAddress)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.dwPortNumber != other.dwPortNumber) return false
        if (this.dwSNMPEnabled != other.dwSNMPEnabled) return false
        if (this.dwSNMPDevIndex != other.dwSNMPDevIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sztPortName.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.sztHostAddress.contentHashCode()
        result = 31 * result + this.sztSNMPCommunity.contentHashCode()
        result = 31 * result + this.dwDoubleSpool.hashCode()
        result = 31 * result + this.sztQueue.contentHashCode()
        result = 31 * result + this.sztIPAddress.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        return result
    }
}

public data class PORT_DATA_2(
    public var sztPortName: UShortArray = UShortArray(64),
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var sztHostAddress: UShortArray = UShortArray(128),
    public var sztSNMPCommunity: UShortArray = UShortArray(33),
    public var dwDoubleSpool: UInt = 0u,
    public var sztQueue: UShortArray = UShortArray(33),
    public var Reserved: UByteArray = UByteArray(514),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
    public var dwPortMonitorMibIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PORT_DATA_2) return false
        if (!this.sztPortName.contentEquals(other.sztPortName)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.sztHostAddress.contentEquals(other.sztHostAddress)) return false
        if (!this.sztSNMPCommunity.contentEquals(other.sztSNMPCommunity)) return false
        if (this.dwDoubleSpool != other.dwDoubleSpool) return false
        if (!this.sztQueue.contentEquals(other.sztQueue)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.dwPortNumber != other.dwPortNumber) return false
        if (this.dwSNMPEnabled != other.dwSNMPEnabled) return false
        if (this.dwSNMPDevIndex != other.dwSNMPDevIndex) return false
        if (this.dwPortMonitorMibIndex != other.dwPortMonitorMibIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sztPortName.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.sztHostAddress.contentHashCode()
        result = 31 * result + this.sztSNMPCommunity.contentHashCode()
        result = 31 * result + this.dwDoubleSpool.hashCode()
        result = 31 * result + this.sztQueue.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        result = 31 * result + this.dwPortMonitorMibIndex.hashCode()
        return result
    }
}

public data class PORT_DATA_LIST_1(
    public var dwVersion: UInt = 0u,
    public var cPortData: UInt = 0u,
    public var pPortData: List<PORT_DATA_2> = List(1) { PORT_DATA_2() },
)

public data class PORT_INFO_1A(public var pName: PSTR = 0L)

public data class PORT_INFO_1W(public var pName: PWSTR = 0L)

public data class PORT_INFO_2A(
    public var pPortName: PSTR = 0L,
    public var pMonitorName: PSTR = 0L,
    public var pDescription: PSTR = 0L,
    public var fPortType: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PORT_INFO_2W(
    public var pPortName: PWSTR = 0L,
    public var pMonitorName: PWSTR = 0L,
    public var pDescription: PWSTR = 0L,
    public var fPortType: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PORT_INFO_3A(
    public var dwStatus: UInt = 0u,
    public var pszStatus: PSTR = 0L,
    public var dwSeverity: UInt = 0u,
)

public data class PORT_INFO_3W(
    public var dwStatus: UInt = 0u,
    public var pszStatus: PWSTR = 0L,
    public var dwSeverity: UInt = 0u,
)

public data class PRINTER_CONNECTION_INFO_1A(public var dwFlags: UInt = 0u, public var pszDriverName: PSTR = 0L)

public data class PRINTER_CONNECTION_INFO_1W(public var dwFlags: UInt = 0u, public var pszDriverName: PWSTR = 0L)

public data class PRINTER_DEFAULTSA(
    public var pDatatype: PSTR = 0L,
    public var pDevMode: Long = 0L,
    public var DesiredAccess: PRINTER_ACCESS_RIGHTS = 0u,
)

public data class PRINTER_DEFAULTSW(
    public var pDatatype: PWSTR = 0L,
    public var pDevMode: Long = 0L,
    public var DesiredAccess: PRINTER_ACCESS_RIGHTS = 0u,
)

public data class PRINTER_ENUM_VALUESA(
    public var pValueName: PSTR = 0L,
    public var cbValueName: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pData: Long = 0L,
    public var cbData: UInt = 0u,
)

public data class PRINTER_ENUM_VALUESW(
    public var pValueName: PWSTR = 0L,
    public var cbValueName: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pData: Long = 0L,
    public var cbData: UInt = 0u,
)

public data class PRINTER_EVENT_ATTRIBUTES_INFO(
    public var cbSize: UInt = 0u,
    public var dwOldAttributes: UInt = 0u,
    public var dwNewAttributes: UInt = 0u,
)

public data class PRINTER_HANDLE(public var Value: Long = 0L)

public data class PRINTER_INFO_1A(
    public var Flags: UInt = 0u,
    public var pDescription: PSTR = 0L,
    public var pName: PSTR = 0L,
    public var pComment: PSTR = 0L,
)

public data class PRINTER_INFO_1W(
    public var Flags: UInt = 0u,
    public var pDescription: PWSTR = 0L,
    public var pName: PWSTR = 0L,
    public var pComment: PWSTR = 0L,
)

public class PRINTER_INFO_2A(
    public var pServerName: PSTR = 0L,
    public var pPrinterName: PSTR = 0L,
    public var pShareName: PSTR = 0L,
    public var pPortName: PSTR = 0L,
    public var pDriverName: PSTR = 0L,
    public var pComment: PSTR = 0L,
    public var pLocation: PSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pSepFile: PSTR = 0L,
    public var pPrintProcessor: PSTR = 0L,
    public var pDatatype: PSTR = 0L,
    public var pParameters: PSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Attributes: UInt = 0u,
    public var Priority: UInt = 0u,
    public var DefaultPriority: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var Status: UInt = 0u,
    public var cJobs: UInt = 0u,
    public var AveragePPM: UInt = 0u,
)

public class PRINTER_INFO_2W(
    public var pServerName: PWSTR = 0L,
    public var pPrinterName: PWSTR = 0L,
    public var pShareName: PWSTR = 0L,
    public var pPortName: PWSTR = 0L,
    public var pDriverName: PWSTR = 0L,
    public var pComment: PWSTR = 0L,
    public var pLocation: PWSTR = 0L,
    public var pDevMode: Long = 0L,
    public var pSepFile: PWSTR = 0L,
    public var pPrintProcessor: PWSTR = 0L,
    public var pDatatype: PWSTR = 0L,
    public var pParameters: PWSTR = 0L,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Attributes: UInt = 0u,
    public var Priority: UInt = 0u,
    public var DefaultPriority: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var UntilTime: UInt = 0u,
    public var Status: UInt = 0u,
    public var cJobs: UInt = 0u,
    public var AveragePPM: UInt = 0u,
)

public data class PRINTER_INFO_3(public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L)

public data class PRINTER_INFO_4A(
    public var pPrinterName: PSTR = 0L,
    public var pServerName: PSTR = 0L,
    public var Attributes: UInt = 0u,
)

public data class PRINTER_INFO_4W(
    public var pPrinterName: PWSTR = 0L,
    public var pServerName: PWSTR = 0L,
    public var Attributes: UInt = 0u,
)

public data class PRINTER_INFO_5A(
    public var pPrinterName: PSTR = 0L,
    public var pPortName: PSTR = 0L,
    public var Attributes: UInt = 0u,
    public var DeviceNotSelectedTimeout: UInt = 0u,
    public var TransmissionRetryTimeout: UInt = 0u,
)

public data class PRINTER_INFO_5W(
    public var pPrinterName: PWSTR = 0L,
    public var pPortName: PWSTR = 0L,
    public var Attributes: UInt = 0u,
    public var DeviceNotSelectedTimeout: UInt = 0u,
    public var TransmissionRetryTimeout: UInt = 0u,
)

public data class PRINTER_INFO_6(public var dwStatus: UInt = 0u)

public data class PRINTER_INFO_7A(public var pszObjectGUID: PSTR = 0L, public var dwAction: UInt = 0u)

public data class PRINTER_INFO_7W(public var pszObjectGUID: PWSTR = 0L, public var dwAction: UInt = 0u)

public data class PRINTER_INFO_8A(public var pDevMode: Long = 0L)

public data class PRINTER_INFO_8W(public var pDevMode: Long = 0L)

public data class PRINTER_INFO_9A(public var pDevMode: Long = 0L)

public data class PRINTER_INFO_9W(public var pDevMode: Long = 0L)

public data class PRINTER_NOTIFY_INFO(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Count: UInt = 0u,
    public var aData: List<PRINTER_NOTIFY_INFO_DATA> = List(1) { PRINTER_NOTIFY_INFO_DATA() },
)

public data class PRINTER_NOTIFY_INFO_DATA(
    public var Type: UShort = 0u,
    public var Field: UShort = 0u,
    public var Reserved: UInt = 0u,
    public var Id: UInt = 0u,
    public var NotifyData: PRINTER_NOTIFY_INFO_DATA_0 = PRINTER_NOTIFY_INFO_DATA_0(),
)

public data class PRINTER_NOTIFY_INFO_DATA_0(public var adwData: UIntArray = UIntArray(2), public var Data: PRINTER_NOTIFY_INFO_DATA_0_0 = PRINTER_NOTIFY_INFO_DATA_0_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PRINTER_NOTIFY_INFO_DATA_0) return false
        if (!this.adwData.contentEquals(other.adwData)) return false
        if (this.Data != other.Data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adwData.contentHashCode()
        result = 31 * result + this.Data.hashCode()
        return result
    }
}

public data class PRINTER_NOTIFY_INFO_DATA_0_0(public var cbBuf: UInt = 0u, public var pBuf: Long = 0L)

public data class PRINTER_NOTIFY_INIT(
    public var Size: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var PollTime: UInt = 0u,
)

public data class PRINTER_NOTIFY_OPTIONS(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Count: UInt = 0u,
    public var pTypes: Long = 0L,
)

public data class PRINTER_NOTIFY_OPTIONS_TYPE(
    public var Type: UShort = 0u,
    public var Reserved0: UShort = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Count: UInt = 0u,
    public var pFields: Long = 0L,
)

public data class PRINTER_OPTIONSA(public var cbSize: UInt = 0u, public var dwFlags: UInt = 0u)

public data class PRINTER_OPTIONSW(public var cbSize: UInt = 0u, public var dwFlags: UInt = 0u)

public class PRINTIFI32(
    public var cjThis: UInt = 0u,
    public var cjIfiExtra: UInt = 0u,
    public var dpwszFamilyName: Int = 0,
    public var dpwszStyleName: Int = 0,
    public var dpwszFaceName: Int = 0,
    public var dpwszUniqueName: Int = 0,
    public var dpFontSim: Int = 0,
    public var lEmbedId: Int = 0,
    public var lItalicAngle: Int = 0,
    public var lCharBias: Int = 0,
    public var dpCharSets: Int = 0,
    public var jWinCharSet: UByte = 0u,
    public var jWinPitchAndFamily: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var flInfo: UInt = 0u,
    public var fsSelection: UShort = 0u,
    public var fsType: UShort = 0u,
    public var fwdUnitsPerEm: Short = 0,
    public var fwdLowestPPEm: Short = 0,
    public var fwdWinAscender: Short = 0,
    public var fwdWinDescender: Short = 0,
    public var fwdMacAscender: Short = 0,
    public var fwdMacDescender: Short = 0,
    public var fwdMacLineGap: Short = 0,
    public var fwdTypoAscender: Short = 0,
    public var fwdTypoDescender: Short = 0,
    public var fwdTypoLineGap: Short = 0,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var fwdCapHeight: Short = 0,
    public var fwdXHeight: Short = 0,
    public var fwdSubscriptXSize: Short = 0,
    public var fwdSubscriptYSize: Short = 0,
    public var fwdSubscriptXOffset: Short = 0,
    public var fwdSubscriptYOffset: Short = 0,
    public var fwdSuperscriptXSize: Short = 0,
    public var fwdSuperscriptYSize: Short = 0,
    public var fwdSuperscriptXOffset: Short = 0,
    public var fwdSuperscriptYOffset: Short = 0,
    public var fwdUnderscoreSize: Short = 0,
    public var fwdUnderscorePosition: Short = 0,
    public var fwdStrikeoutSize: Short = 0,
    public var fwdStrikeoutPosition: Short = 0,
    public var chFirstChar: UByte = 0u,
    public var chLastChar: UByte = 0u,
    public var chDefaultChar: UByte = 0u,
    public var chBreakChar: UByte = 0u,
    public var wcFirstChar: UShort = 0u,
    public var wcLastChar: UShort = 0u,
    public var wcDefaultChar: UShort = 0u,
    public var wcBreakChar: UShort = 0u,
    public var ptlBaseline: POINTL = POINTL(),
    public var ptlAspect: POINTL = POINTL(),
    public var ptlCaret: POINTL = POINTL(),
    public var rclFontBox: RECTL = RECTL(),
    public var achVendId: UByteArray = UByteArray(4),
    public var cKerningPairs: UInt = 0u,
    public var ulPanoseCulture: UInt = 0u,
    public var panose: PANOSE = PANOSE(),
)

public data class PRINTPROCESSOROPENDATA(
    public var pDevMode: Long = 0L,
    public var pDatatype: PWSTR = 0L,
    public var pParameters: PWSTR = 0L,
    public var pDocumentName: PWSTR = 0L,
    public var JobId: UInt = 0u,
    public var pOutputFile: PWSTR = 0L,
    public var pPrinterName: PWSTR = 0L,
)

public data class PRINTPROCESSOR_CAPS_1(
    public var dwLevel: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
)

public data class PRINTPROCESSOR_CAPS_2(
    public var dwLevel: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
    public var dwDuplexHandlingCaps: UInt = 0u,
    public var dwNupDirectionCaps: UInt = 0u,
    public var dwNupBorderCaps: UInt = 0u,
    public var dwBookletHandlingCaps: UInt = 0u,
    public var dwScalingCaps: UInt = 0u,
)

public data class PRINTPROCESSOR_INFO_1A(public var pName: PSTR = 0L)

public data class PRINTPROCESSOR_INFO_1W(public var pName: PWSTR = 0L)

public class PRINTPROVIDOR {
    public var fpOpenPrinter: Long = 0L

    public var fpSetJob: Long = 0L

    public var fpGetJob: Long = 0L

    public var fpEnumJobs: Long = 0L

    public var fpAddPrinter: Long = 0L

    public var fpDeletePrinter: Long = 0L

    public var fpSetPrinter: Long = 0L

    public var fpGetPrinter: Long = 0L

    public var fpEnumPrinters: Long = 0L

    public var fpAddPrinterDriver: Long = 0L

    public var fpEnumPrinterDrivers: Long = 0L

    public var fpGetPrinterDriver: Long = 0L

    public var fpGetPrinterDriverDirectory: Long = 0L

    public var fpDeletePrinterDriver: Long = 0L

    public var fpAddPrintProcessor: Long = 0L

    public var fpEnumPrintProcessors: Long = 0L

    public var fpGetPrintProcessorDirectory: Long = 0L

    public var fpDeletePrintProcessor: Long = 0L

    public var fpEnumPrintProcessorDatatypes: Long = 0L

    public var fpStartDocPrinter: Long = 0L

    public var fpStartPagePrinter: Long = 0L

    public var fpWritePrinter: Long = 0L

    public var fpEndPagePrinter: Long = 0L

    public var fpAbortPrinter: Long = 0L

    public var fpReadPrinter: Long = 0L

    public var fpEndDocPrinter: Long = 0L

    public var fpAddJob: Long = 0L

    public var fpScheduleJob: Long = 0L

    public var fpGetPrinterData: Long = 0L

    public var fpSetPrinterData: Long = 0L

    public var fpWaitForPrinterChange: Long = 0L

    public var fpClosePrinter: Long = 0L

    public var fpAddForm: Long = 0L

    public var fpDeleteForm: Long = 0L

    public var fpGetForm: Long = 0L

    public var fpSetForm: Long = 0L

    public var fpEnumForms: Long = 0L

    public var fpEnumMonitors: Long = 0L

    public var fpEnumPorts: Long = 0L

    public var fpAddPort: Long = 0L

    public var fpConfigurePort: Long = 0L

    public var fpDeletePort: Long = 0L

    public var fpCreatePrinterIC: Long = 0L

    public var fpPlayGdiScriptOnPrinterIC: Long = 0L

    public var fpDeletePrinterIC: Long = 0L

    public var fpAddPrinterConnection: Long = 0L

    public var fpDeletePrinterConnection: Long = 0L

    public var fpPrinterMessageBox: Long = 0L

    public var fpAddMonitor: Long = 0L

    public var fpDeleteMonitor: Long = 0L

    public var fpResetPrinter: Long = 0L

    public var fpGetPrinterDriverEx: Long = 0L

    public var fpFindFirstPrinterChangeNotification: Long = 0L

    public var fpFindClosePrinterChangeNotification: Long = 0L

    public var fpAddPortEx: Long = 0L

    public var fpShutDown: Long = 0L

    public var fpRefreshPrinterChangeNotification: Long = 0L

    public var fpOpenPrinterEx: Long = 0L

    public var fpAddPrinterEx: Long = 0L

    public var fpSetPort: Long = 0L

    public var fpEnumPrinterData: Long = 0L

    public var fpDeletePrinterData: Long = 0L

    public var fpClusterSplOpen: Long = 0L

    public var fpClusterSplClose: Long = 0L

    public var fpClusterSplIsAlive: Long = 0L

    public var fpSetPrinterDataEx: Long = 0L

    public var fpGetPrinterDataEx: Long = 0L

    public var fpEnumPrinterDataEx: Long = 0L

    public var fpEnumPrinterKey: Long = 0L

    public var fpDeletePrinterDataEx: Long = 0L

    public var fpDeletePrinterKey: Long = 0L

    public var fpSeekPrinter: Long = 0L

    public var fpDeletePrinterDriverEx: Long = 0L

    public var fpAddPerMachineConnection: Long = 0L

    public var fpDeletePerMachineConnection: Long = 0L

    public var fpEnumPerMachineConnections: Long = 0L

    public var fpXcvData: Long = 0L

    public var fpAddPrinterDriverEx: Long = 0L

    public var fpSplReadPrinter: Long = 0L

    public var fpDriverUnloadComplete: Long = 0L

    public var fpGetSpoolFileInfo: Long = 0L

    public var fpCommitSpoolData: Long = 0L

    public var fpCloseSpoolFileHandle: Long = 0L

    public var fpFlushPrinter: Long = 0L

    public var fpSendRecvBidiData: Long = 0L

    public var fpAddPrinterConnection2: Long = 0L

    public var fpGetPrintClassObject: Long = 0L

    public var fpReportJobProcessingProgress: Long = 0L

    public var fpEnumAndLogProvidorObjects: Long = 0L

    public var fpInternalGetPrinterDriver: Long = 0L

    public var fpFindCompatibleDriver: Long = 0L

    public var fpInstallPrinterDriverPackageFromConnection: Long = 0L

    public var fpGetJobNamedPropertyValue: Long = 0L

    public var fpSetJobNamedProperty: Long = 0L

    public var fpDeleteJobNamedProperty: Long = 0L

    public var fpEnumJobNamedProperties: Long = 0L

    public var fpPowerEvent: Long = 0L

    public var fpGetUserPropertyBag: Long = 0L

    public var fpCanShutdown: Long = 0L

    public var fpLogJobInfoForBranchOffice: Long = 0L

    public var fpRegeneratePrintDeviceCapabilities: Long = 0L

    public var fpPrintSupportOperation: Long = 0L

    public var fpIppCreateJobOnPrinter: Long = 0L

    public var fpIppGetJobAttributes: Long = 0L

    public var fpIppSetJobAttributes: Long = 0L

    public var fpIppGetPrinterAttributes: Long = 0L

    public var fpIppSetPrinterAttributes: Long = 0L

    public var fpIppCreateJobOnPrinterWithAttributes: Long = 0L
}

public data class PRINT_EXECUTION_DATA(public var context: PRINT_EXECUTION_CONTEXT = 0, public var clientAppPID: UInt = 0u)

public data class PRINT_FEATURE_OPTION(public var pszFeature: PCSTR = 0L, public var pszOption: PCSTR = 0L)

public data class PROPSHEETUI_GETICON_INFO(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var cxIcon: UShort = 0u,
    public var cyIcon: UShort = 0u,
    public var hIcon: HICON = 0L,
)

public data class PROPSHEETUI_INFO(
    public var cbSize: UShort = 0u,
    public var Version: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Reason: UShort = 0u,
    public var hComPropSheet: HANDLE = 0L,
    public var pfnComPropSheet: PFNCOMPROPSHEET = null,
    public var lParamInit: LPARAM = 0L,
    public var UserData: ULong = 0uL,
    public var Result: ULong = 0uL,
)

public data class PROPSHEETUI_INFO_HEADER(
    public var cbSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var pTitle: Long = 0L,
    public var hWndParent: HWND = 0L,
    public var hInst: HINSTANCE = 0L,
    public var Anonymous: PROPSHEETUI_INFO_HEADER_0 = PROPSHEETUI_INFO_HEADER_0(),
)

public data class PROPSHEETUI_INFO_HEADER_0(public var hIcon: HICON = 0L, public var IconID: ULong = 0uL)

public data class PROVIDOR_INFO_1A(
    public var pName: PSTR = 0L,
    public var pEnvironment: PSTR = 0L,
    public var pDLLName: PSTR = 0L,
)

public data class PROVIDOR_INFO_1W(
    public var pName: PWSTR = 0L,
    public var pEnvironment: PWSTR = 0L,
    public var pDLLName: PWSTR = 0L,
)

public data class PROVIDOR_INFO_2A(public var pOrder: PSTR = 0L)

public data class PROVIDOR_INFO_2W(public var pOrder: PWSTR = 0L)

public data class PSCRIPT5_PRIVATE_DEVMODE(public var wReserved: UShortArray = UShortArray(57), public var wSize: UShort = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PSCRIPT5_PRIVATE_DEVMODE) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (this.wSize != other.wSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wReserved.contentHashCode()
        result = 31 * result + this.wSize.hashCode()
        return result
    }
}

public data class PSPINFO(
    public var cbSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var hComPropSheet: HANDLE = 0L,
    public var hCPSUIPage: HANDLE = 0L,
    public var pfnComPropSheet: PFNCOMPROPSHEET = null,
)

public data class PUBLISHERINFO(
    public var dwMode: UInt = 0u,
    public var wMinoutlinePPEM: UShort = 0u,
    public var wMaxbitmapPPEM: UShort = 0u,
)

public data class PrintNamedProperty(public var propertyName: PWSTR = 0L, public var propertyValue: PrintPropertyValue = PrintPropertyValue())

public data class PrintPropertiesCollection(public var numberOfProperties: UInt = 0u, public var propertiesCollection: Long = 0L)

public data class PrintPropertyValue(public var ePropertyType: EPrintPropertyType = 0, public var value: PrintPropertyValue_0 = PrintPropertyValue_0())

public data class PrintPropertyValue_0(
    public var propertyByte: UByte = 0u,
    public var propertyString: PWSTR = 0L,
    public var propertyInt32: Int = 0,
    public var propertyInt64: Long = 0L,
    public var propertyBlob: PrintPropertyValue_0_0 = PrintPropertyValue_0_0(),
)

public data class PrintPropertyValue_0_0(public var cbBuf: UInt = 0u, public var pBuf: Long = 0L)

public data class SETRESULT_INFO(
    public var cbSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var hSetResult: HANDLE = 0L,
    public var Result: LRESULT = 0L,
)

public data class SHOWUIPARAMS(public var UIType: UI_TYPE = 0, public var MessageBoxParams: MESSAGEBOX_PARAMS = MESSAGEBOX_PARAMS())

public data class SIMULATE_CAPS_1(
    public var dwLevel: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
    public var dwCollate: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
)

public data class SPLCLIENT_INFO_1(
    public var dwSize: UInt = 0u,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
)

public data class SPLCLIENT_INFO_2_W2K(public var hSplPrinter: ULong = 0uL)

public data class SPLCLIENT_INFO_2_WINXP(public var hSplPrinter: ULong = 0uL)

public data class SPLCLIENT_INFO_3_VISTA(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
    public var hSplPrinter: ULong = 0uL,
)

public data class SPLCLIENT_INFO_INTERNAL(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var pMachineName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
    public var hSplPrinter: ULong = 0uL,
    public var dwProcessId: UInt = 0u,
    public var dwSessionId: UInt = 0u,
)

public data class TRANSDATA(
    public var ubCodePageID: UByte = 0u,
    public var ubType: UByte = 0u,
    public var uCode: TRANSDATA_0 = TRANSDATA_0(),
)

public data class TRANSDATA_0(
    public var sCode: Short = 0,
    public var ubCode: UByte = 0u,
    public var ubPairs: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TRANSDATA_0) return false
        if (this.sCode != other.sCode) return false
        if (this.ubCode != other.ubCode) return false
        if (!this.ubPairs.contentEquals(other.ubPairs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sCode.hashCode()
        result = 31 * result + this.ubCode.hashCode()
        result = 31 * result + this.ubPairs.contentHashCode()
        return result
    }
}

public data class UFF_FILEHEADER(
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var nFonts: UInt = 0u,
    public var nGlyphSets: UInt = 0u,
    public var nVarData: UInt = 0u,
    public var offFontDir: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UFF_FILEHEADER) return false
        if (this.dwSignature != other.dwSignature) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.nFonts != other.nFonts) return false
        if (this.nGlyphSets != other.nGlyphSets) return false
        if (this.nVarData != other.nVarData) return false
        if (this.offFontDir != other.offFontDir) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSignature.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.nFonts.hashCode()
        result = 31 * result + this.nGlyphSets.hashCode()
        result = 31 * result + this.nVarData.hashCode()
        result = 31 * result + this.offFontDir.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class UFF_FONTDIRECTORY(
    public var dwSignature: UInt = 0u,
    public var wSize: UShort = 0u,
    public var wFontID: UShort = 0u,
    public var sGlyphID: Short = 0,
    public var wFlags: UShort = 0u,
    public var dwInstallerSig: UInt = 0u,
    public var offFontName: UInt = 0u,
    public var offCartridgeName: UInt = 0u,
    public var offFontData: UInt = 0u,
    public var offGlyphData: UInt = 0u,
    public var offVarData: UInt = 0u,
)

public data class UNIDRVINFO(
    public var dwSize: UInt = 0u,
    public var flGenFlags: UInt = 0u,
    public var wType: UShort = 0u,
    public var fCaps: UShort = 0u,
    public var wXRes: UShort = 0u,
    public var wYRes: UShort = 0u,
    public var sYAdjust: Short = 0,
    public var sYMoved: Short = 0,
    public var wPrivateData: UShort = 0u,
    public var sShift: Short = 0,
    public var SelectFont: INVOC = INVOC(),
    public var UnSelectFont: INVOC = INVOC(),
    public var wReserved: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UNIDRVINFO) return false
        if (this.dwSize != other.dwSize) return false
        if (this.flGenFlags != other.flGenFlags) return false
        if (this.wType != other.wType) return false
        if (this.fCaps != other.fCaps) return false
        if (this.wXRes != other.wXRes) return false
        if (this.wYRes != other.wYRes) return false
        if (this.sYAdjust != other.sYAdjust) return false
        if (this.sYMoved != other.sYMoved) return false
        if (this.wPrivateData != other.wPrivateData) return false
        if (this.sShift != other.sShift) return false
        if (this.SelectFont != other.SelectFont) return false
        if (this.UnSelectFont != other.UnSelectFont) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.flGenFlags.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.fCaps.hashCode()
        result = 31 * result + this.wXRes.hashCode()
        result = 31 * result + this.wYRes.hashCode()
        result = 31 * result + this.sYAdjust.hashCode()
        result = 31 * result + this.sYMoved.hashCode()
        result = 31 * result + this.wPrivateData.hashCode()
        result = 31 * result + this.sShift.hashCode()
        result = 31 * result + this.SelectFont.hashCode()
        result = 31 * result + this.UnSelectFont.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        return result
    }
}

public data class UNIDRV_PRIVATE_DEVMODE(public var wReserved: UShortArray = UShortArray(4), public var wSize: UShort = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UNIDRV_PRIVATE_DEVMODE) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (this.wSize != other.wSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wReserved.contentHashCode()
        result = 31 * result + this.wSize.hashCode()
        return result
    }
}

public data class UNIFM_HDR(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ulDefaultCodepage: UInt = 0u,
    public var lGlyphSetDataRCID: Int = 0,
    public var loUnidrvInfo: UInt = 0u,
    public var loIFIMetrics: UInt = 0u,
    public var loExtTextMetric: UInt = 0u,
    public var loWidthTable: UInt = 0u,
    public var loKernPair: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UNIFM_HDR) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ulDefaultCodepage != other.ulDefaultCodepage) return false
        if (this.lGlyphSetDataRCID != other.lGlyphSetDataRCID) return false
        if (this.loUnidrvInfo != other.loUnidrvInfo) return false
        if (this.loIFIMetrics != other.loIFIMetrics) return false
        if (this.loExtTextMetric != other.loExtTextMetric) return false
        if (this.loWidthTable != other.loWidthTable) return false
        if (this.loKernPair != other.loKernPair) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ulDefaultCodepage.hashCode()
        result = 31 * result + this.lGlyphSetDataRCID.hashCode()
        result = 31 * result + this.loUnidrvInfo.hashCode()
        result = 31 * result + this.loIFIMetrics.hashCode()
        result = 31 * result + this.loExtTextMetric.hashCode()
        result = 31 * result + this.loWidthTable.hashCode()
        result = 31 * result + this.loKernPair.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class UNI_CODEPAGEINFO(
    public var dwCodePage: UInt = 0u,
    public var SelectSymbolSet: INVOC = INVOC(),
    public var UnSelectSymbolSet: INVOC = INVOC(),
)

public data class UNI_GLYPHSETDATA(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lPredefinedID: Int = 0,
    public var dwGlyphCount: UInt = 0u,
    public var dwRunCount: UInt = 0u,
    public var loRunOffset: UInt = 0u,
    public var dwCodePageCount: UInt = 0u,
    public var loCodePageOffset: UInt = 0u,
    public var loMapTableOffset: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UNI_GLYPHSETDATA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lPredefinedID != other.lPredefinedID) return false
        if (this.dwGlyphCount != other.dwGlyphCount) return false
        if (this.dwRunCount != other.dwRunCount) return false
        if (this.loRunOffset != other.loRunOffset) return false
        if (this.dwCodePageCount != other.dwCodePageCount) return false
        if (this.loCodePageOffset != other.loCodePageOffset) return false
        if (this.loMapTableOffset != other.loMapTableOffset) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lPredefinedID.hashCode()
        result = 31 * result + this.dwGlyphCount.hashCode()
        result = 31 * result + this.dwRunCount.hashCode()
        result = 31 * result + this.loRunOffset.hashCode()
        result = 31 * result + this.dwCodePageCount.hashCode()
        result = 31 * result + this.loCodePageOffset.hashCode()
        result = 31 * result + this.loMapTableOffset.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class USERDATA(
    public var dwSize: UInt = 0u,
    public var dwItemID: ULong = 0uL,
    public var pKeyWordName: PSTR = 0L,
    public var dwReserved: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USERDATA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwItemID != other.dwItemID) return false
        if (this.pKeyWordName != other.pKeyWordName) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwItemID.hashCode()
        result = 31 * result + this.pKeyWordName.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class WIDTHRUN(
    public var wStartGlyph: UShort = 0u,
    public var wGlyphCount: UShort = 0u,
    public var loCharWidthOffset: UInt = 0u,
)

public data class WIDTHTABLE(
    public var dwSize: UInt = 0u,
    public var dwRunNum: UInt = 0u,
    public var WidthRun: List<WIDTHRUN> = List(1) { WIDTHRUN() },
)

public data class _SPLCLIENT_INFO_2_V3(public var hSplPrinter: ULong = 0uL)
