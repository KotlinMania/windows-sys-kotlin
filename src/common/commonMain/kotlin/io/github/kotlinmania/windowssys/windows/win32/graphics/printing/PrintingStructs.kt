@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.display.FdKerningpair
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Panose
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public data class AddjobInfo1a(
    public var path: Pstr = null,
    public var jobId: UInt = 0u,
)

public data class AddjobInfo1w(
    public var path: Pwstr = null,
    public var jobId: UInt = 0u,
)

public data class AttributeInfo1(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
)

public data class AttributeInfo2(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
)

public data class AttributeInfo3(
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

public data class AttributeInfo4(
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

public data class BidiData(
    public var dwBidiType: UInt = 0u,
    public var u: BidiData0 = BidiData0(),
)

public data class BidiData0(
    public var bData: Bool = 0,
    public var iData: Int = 0,
    public var sData: Pwstr = null,
    public var fData: Float = 0.0f,
    public var biData: BinaryContainer = BinaryContainer(),
)

public data class BidiRequestContainer(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<BidiRequestData> = List(1) { BidiRequestData() },
)

public data class BidiRequestData(
    public var dwReqNumber: UInt = 0u,
    public var pSchema: Pwstr = null,
    public var data: BidiData = BidiData(),
)

public data class BidiResponseContainer(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<BidiResponseData> = List(1) { BidiResponseData() },
)

public data class BidiResponseData(
    public var dwResult: UInt = 0u,
    public var dwReqNumber: UInt = 0u,
    public var pSchema: Pwstr = null,
    public var data: BidiData = BidiData(),
)

public data class BinaryContainer(
    public var cbBuf: UInt = 0u,
    public var pData: COpaquePointer? = null,
)

public data class BranchOfficeJobData(
    public var eEventType: EBranchOfficeJobEventType = 0,
    public var jobId: UInt = 0u,
    public var jobInfo: BranchOfficeJobData0 = BranchOfficeJobData0(),
)

public data class BranchOfficeJobData0(
    public var logJobPrinted: BranchOfficeJobDataPrinted = BranchOfficeJobDataPrinted(),
    public var logJobRendered: BranchOfficeJobDataRendered = BranchOfficeJobDataRendered(),
    public var logJobError: BranchOfficeJobDataError = BranchOfficeJobDataError(),
    public var logPipelineFailed: BranchOfficeJobDataPipelineFailed = BranchOfficeJobDataPipelineFailed(),
    public var logOfflineFileFull: BranchOfficeLogOfflineFileFull = BranchOfficeLogOfflineFileFull(),
)

public data class BranchOfficeJobDataContainer(
    public var cJobDataEntries: UInt = 0u,
    public var jobData: List<BranchOfficeJobData> = List(1) { BranchOfficeJobData() },
)

public data class BranchOfficeJobDataError(
    public var lastError: UInt = 0u,
    public var pDocumentName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pPrinterName: Pwstr = null,
    public var pDataType: Pwstr = null,
    public var totalSize: Long = 0L,
    public var printedSize: Long = 0L,
    public var totalPages: UInt = 0u,
    public var printedPages: UInt = 0u,
    public var pMachineName: Pwstr = null,
    public var pJobError: Pwstr = null,
    public var pErrorDescription: Pwstr = null,
)

public data class BranchOfficeJobDataPipelineFailed(
    public var pDocumentName: Pwstr = null,
    public var pPrinterName: Pwstr = null,
    public var pExtraErrorInfo: Pwstr = null,
)

public data class BranchOfficeJobDataPrinted(
    public var status: UInt = 0u,
    public var pDocumentName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pMachineName: Pwstr = null,
    public var pPrinterName: Pwstr = null,
    public var pPortName: Pwstr = null,
    public var size: Long = 0L,
    public var totalPages: UInt = 0u,
)

public data class BranchOfficeJobDataRendered(
    public var size: Long = 0L,
    public var iCMMethod: UInt = 0u,
    public var color: Short = 0,
    public var printQuality: Short = 0,
    public var yResolution: Short = 0,
    public var copies: Short = 0,
    public var tTOption: Short = 0,
)

public data class BranchOfficeLogOfflineFileFull(
    public var pMachineName: Pwstr = null,
)

public data class Compropsheetui(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var hInstCaller: Hinstance = null,
    public var pCallerName: COpaquePointer? = null,
    public var userData: Int = 0,
    public var pHelpFile: COpaquePointer? = null,
    public var pfnCallBack: Cpsuicallback = null,
    public var pOptItem: Optitem? = null,
    public var pDlgPage: Dlgpage? = null,
    public var cOptItem: UShort = 0u,
    public var cDlgPage: UShort = 0u,
    public var iconID: Int = 0,
    public var pOptItemName: COpaquePointer? = null,
    public var callerVersion: UShort = 0u,
    public var optItemVersion: UShort = 0u,
    public var dwReserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Compropsheetui) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pCallerName != other.pCallerName) return false
        if (this.userData != other.userData) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pfnCallBack != other.pfnCallBack) return false
        if (this.pOptItem != other.pOptItem) return false
        if (this.pDlgPage != other.pDlgPage) return false
        if (this.cOptItem != other.cOptItem) return false
        if (this.cDlgPage != other.cDlgPage) return false
        if (this.iconID != other.iconID) return false
        if (this.pOptItemName != other.pOptItemName) return false
        if (this.callerVersion != other.callerVersion) return false
        if (this.optItemVersion != other.optItemVersion) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pCallerName.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pfnCallBack.hashCode()
        result = 31 * result + this.pOptItem.hashCode()
        result = 31 * result + this.pDlgPage.hashCode()
        result = 31 * result + this.cOptItem.hashCode()
        result = 31 * result + this.cDlgPage.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.pOptItemName.hashCode()
        result = 31 * result + this.callerVersion.hashCode()
        result = 31 * result + this.optItemVersion.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class ConfigInfoData1(
    public var reserved: UByteArray = UByteArray(128),
    public var dwVersion: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigInfoData1) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        return result
    }
}

public data class CorePrinterDrivera(
    public var coreDriverGUID: Guid = Guid(),
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorePrinterDrivera) return false
        if (this.coreDriverGUID != other.coreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public data class CorePrinterDriverw(
    public var coreDriverGUID: Guid = Guid(),
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorePrinterDriverw) return false
        if (this.coreDriverGUID != other.coreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public data class Cpsuicbparam(
    public var cbSize: UShort = 0u,
    public var reason: UShort = 0u,
    public var hDlg: Hwnd = null,
    public var pOptItem: Optitem? = null,
    public var cOptItem: UShort = 0u,
    public var flags: UShort = 0u,
    public var pCurItem: Optitem? = null,
    public var anonymous: Cpsuicbparam0 = Cpsuicbparam0(),
    public var userData: Int = 0,
    public var result: Int = 0,
)

public data class Cpsuicbparam0(
    public var oldSel: Int = 0,
    public var pOldSel: COpaquePointer? = null,
)

public data class Cpsuidatablock(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class Customsizeparam(
    public var dwOrder: Int = 0,
    public var lMinVal: Int = 0,
    public var lMaxVal: Int = 0,
)

public data class DatatypesInfo1a(
    public var pName: Pstr = null,
)

public data class DatatypesInfo1w(
    public var pName: Pwstr = null,
)

public data class DataHeader(
    public var dwSignature: UInt = 0u,
    public var wSize: UShort = 0u,
    public var wDataID: UShort = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DeletePortData1(
    public var psztPortName: UShortArray = UShortArray(64),
    public var reserved: UByteArray = UByteArray(98),
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeletePortData1) return false
        if (!this.psztPortName.contentEquals(other.psztPortName)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psztPortName.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }
}

public data class Devicepropertyheader(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var hPrinter: Handle = null,
    public var pszPrinterName: COpaquePointer? = null,
)

public data class DevqueryprintInfo(
    public var cbSize: UShort = 0u,
    public var level: UShort = 0u,
    public var hPrinter: Handle = null,
    public var pDevMode: Devmodea? = null,
    public var pszErrorStr: Pwstr = null,
    public var cchErrorStr: UInt = 0u,
    public var cchNeeded: UInt = 0u,
)

public data class Dlgpage(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var dlgProc: Dlgproc = null,
    public var pTabName: COpaquePointer? = null,
    public var iconID: Int = 0,
    public var anonymous: Dlgpage0 = Dlgpage0(),
)

public data class Dlgpage0(
    public var dlgTemplateID: UShort = 0u,
    public var hDlgTemplate: Handle = null,
)

public data class DoceventCreatedcpre(
    public var pszDriver: Pwstr = null,
    public var pszDevice: Pwstr = null,
    public var pdm: Devmodew? = null,
    public var bIC: Bool = 0,
)

public data class DoceventEscape(
    public var iEscape: Int = 0,
    public var cjInput: Int = 0,
    public var pvInData: COpaquePointer? = null,
)

public data class DoceventFilter(
    public var cbSize: UInt = 0u,
    public var cElementsAllocated: UInt = 0u,
    public var cElementsNeeded: UInt = 0u,
    public var cElementsReturned: UInt = 0u,
    public var aDocEventCall: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoceventFilter) return false
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

public data class Documentpropertyheader(
    public var cbSize: UShort = 0u,
    public var reserved: UShort = 0u,
    public var hPrinter: Handle = null,
    public var pszPrinterName: COpaquePointer? = null,
    public var pdmIn: Devmodea? = null,
    public var pdmOut: Devmodea? = null,
    public var cbOut: UInt = 0u,
    public var fMode: UInt = 0u,
)

public data class DocInfo1a(
    public var pDocName: Pstr = null,
    public var pOutputFile: Pstr = null,
    public var pDatatype: Pstr = null,
)

public data class DocInfo1w(
    public var pDocName: Pwstr = null,
    public var pOutputFile: Pwstr = null,
    public var pDatatype: Pwstr = null,
)

public data class DocInfo2a(
    public var pDocName: Pstr = null,
    public var pOutputFile: Pstr = null,
    public var pDatatype: Pstr = null,
    public var dwMode: UInt = 0u,
    public var jobId: UInt = 0u,
)

public data class DocInfo2w(
    public var pDocName: Pwstr = null,
    public var pOutputFile: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var dwMode: UInt = 0u,
    public var jobId: UInt = 0u,
)

public data class DocInfo3a(
    public var pDocName: Pstr = null,
    public var pOutputFile: Pstr = null,
    public var pDatatype: Pstr = null,
    public var dwFlags: UInt = 0u,
)

public data class DocInfo3w(
    public var pDocName: Pwstr = null,
    public var pOutputFile: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var dwFlags: UInt = 0u,
)

public data class DocInfoInternal(
    public var pDocName: COpaquePointer? = null,
    public var pOutputFile: COpaquePointer? = null,
    public var pDatatype: COpaquePointer? = null,
    public var bLowILJob: Bool = 0,
    public var hTokenLowIL: Handle = null,
)

public data class DriverInfo1a(
    public var pName: Pstr = null,
)

public data class DriverInfo1w(
    public var pName: Pwstr = null,
)

public data class DriverInfo2a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
)

public data class DriverInfo2w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
)

public data class DriverInfo3a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
    public var pHelpFile: Pstr = null,
    public var pDependentFiles: Pstr = null,
    public var pMonitorName: Pstr = null,
    public var pDefaultDataType: Pstr = null,
)

public data class DriverInfo3w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
    public var pHelpFile: Pwstr = null,
    public var pDependentFiles: Pwstr = null,
    public var pMonitorName: Pwstr = null,
    public var pDefaultDataType: Pwstr = null,
)

public data class DriverInfo4a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
    public var pHelpFile: Pstr = null,
    public var pDependentFiles: Pstr = null,
    public var pMonitorName: Pstr = null,
    public var pDefaultDataType: Pstr = null,
    public var pszzPreviousNames: Pstr = null,
)

public data class DriverInfo4w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
    public var pHelpFile: Pwstr = null,
    public var pDependentFiles: Pwstr = null,
    public var pMonitorName: Pwstr = null,
    public var pDefaultDataType: Pwstr = null,
    public var pszzPreviousNames: Pwstr = null,
)

public data class DriverInfo5a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
    public var dwDriverAttributes: UInt = 0u,
    public var dwConfigVersion: UInt = 0u,
    public var dwDriverVersion: UInt = 0u,
)

public data class DriverInfo5w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
    public var dwDriverAttributes: UInt = 0u,
    public var dwConfigVersion: UInt = 0u,
    public var dwDriverVersion: UInt = 0u,
)

public class DriverInfo6a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
    public var pHelpFile: Pstr = null,
    public var pDependentFiles: Pstr = null,
    public var pMonitorName: Pstr = null,
    public var pDefaultDataType: Pstr = null,
    public var pszzPreviousNames: Pstr = null,
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: Pstr = null,
    public var pszOEMUrl: Pstr = null,
    public var pszHardwareID: Pstr = null,
    public var pszProvider: Pstr = null,
)

public class DriverInfo6w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
    public var pHelpFile: Pwstr = null,
    public var pDependentFiles: Pwstr = null,
    public var pMonitorName: Pwstr = null,
    public var pDefaultDataType: Pwstr = null,
    public var pszzPreviousNames: Pwstr = null,
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: Pwstr = null,
    public var pszOEMUrl: Pwstr = null,
    public var pszHardwareID: Pwstr = null,
    public var pszProvider: Pwstr = null,
)

public class DriverInfo8a(
    public var cVersion: UInt = 0u,
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDriverPath: Pstr = null,
    public var pDataFile: Pstr = null,
    public var pConfigFile: Pstr = null,
    public var pHelpFile: Pstr = null,
    public var pDependentFiles: Pstr = null,
    public var pMonitorName: Pstr = null,
    public var pDefaultDataType: Pstr = null,
    public var pszzPreviousNames: Pstr = null,
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: Pstr = null,
    public var pszOEMUrl: Pstr = null,
    public var pszHardwareID: Pstr = null,
    public var pszProvider: Pstr = null,
    public var pszPrintProcessor: Pstr = null,
    public var pszVendorSetup: Pstr = null,
    public var pszzColorProfiles: Pstr = null,
    public var pszInfPath: Pstr = null,
    public var dwPrinterDriverAttributes: UInt = 0u,
    public var pszzCoreDriverDependencies: Pstr = null,
    public var ftMinInboxDriverVerDate: Filetime = Filetime(),
    public var dwlMinInboxDriverVerVersion: ULong = 0uL,
)

public class DriverInfo8w(
    public var cVersion: UInt = 0u,
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDriverPath: Pwstr = null,
    public var pDataFile: Pwstr = null,
    public var pConfigFile: Pwstr = null,
    public var pHelpFile: Pwstr = null,
    public var pDependentFiles: Pwstr = null,
    public var pMonitorName: Pwstr = null,
    public var pDefaultDataType: Pwstr = null,
    public var pszzPreviousNames: Pwstr = null,
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var pszMfgName: Pwstr = null,
    public var pszOEMUrl: Pwstr = null,
    public var pszHardwareID: Pwstr = null,
    public var pszProvider: Pwstr = null,
    public var pszPrintProcessor: Pwstr = null,
    public var pszVendorSetup: Pwstr = null,
    public var pszzColorProfiles: Pwstr = null,
    public var pszInfPath: Pwstr = null,
    public var dwPrinterDriverAttributes: UInt = 0u,
    public var pszzCoreDriverDependencies: Pwstr = null,
    public var ftMinInboxDriverVerDate: Filetime = Filetime(),
    public var dwlMinInboxDriverVerVersion: ULong = 0uL,
)

public data class DriverUpgradeInfo1(
    public var pPrinterName: COpaquePointer? = null,
    public var pOldDriverDirectory: COpaquePointer? = null,
)

public data class DriverUpgradeInfo2(
    public var pPrinterName: COpaquePointer? = null,
    public var pOldDriverDirectory: COpaquePointer? = null,
    public var cVersion: UInt = 0u,
    public var pName: COpaquePointer? = null,
    public var pEnvironment: COpaquePointer? = null,
    public var pDriverPath: COpaquePointer? = null,
    public var pDataFile: COpaquePointer? = null,
    public var pConfigFile: COpaquePointer? = null,
    public var pHelpFile: COpaquePointer? = null,
    public var pDependentFiles: COpaquePointer? = null,
    public var pMonitorName: COpaquePointer? = null,
    public var pDefaultDataType: COpaquePointer? = null,
    public var pszzPreviousNames: COpaquePointer? = null,
)

public data class Extchkbox(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var pTitle: COpaquePointer? = null,
    public var pSeparator: COpaquePointer? = null,
    public var pCheckedName: COpaquePointer? = null,
    public var iconID: Int = 0,
    public var wReserved: UShortArray = UShortArray(4),
    public var dwReserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extchkbox) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.pSeparator != other.pSeparator) return false
        if (this.pCheckedName != other.pCheckedName) return false
        if (this.iconID != other.iconID) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.pSeparator.hashCode()
        result = 31 * result + this.pCheckedName.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Extpush(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var pTitle: COpaquePointer? = null,
    public var anonymous1: Extpush0 = Extpush0(),
    public var iconID: Int = 0,
    public var anonymous2: Extpush1 = Extpush1(),
    public var dwReserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extpush) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.iconID != other.iconID) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Extpush0(
    public var dlgProc: Dlgproc = null,
    public var pfnCallBack: Farproc = null,
)

public data class Extpush1(
    public var dlgTemplateID: UShort = 0u,
    public var hDlgTemplate: Handle = null,
)

public class Exttextmetric(
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

public data class FormInfo1a(
    public var flags: UInt = 0u,
    public var pName: Pstr = null,
    public var size: Size = Size(),
    public var imageableArea: Rectl = Rectl(),
)

public data class FormInfo1w(
    public var flags: UInt = 0u,
    public var pName: Pwstr = null,
    public var size: Size = Size(),
    public var imageableArea: Rectl = Rectl(),
)

public data class FormInfo2a(
    public var flags: UInt = 0u,
    public var pName: Pcstr = null,
    public var size: Size = Size(),
    public var imageableArea: Rectl = Rectl(),
    public var pKeyword: Pcstr = null,
    public var stringType: UInt = 0u,
    public var pMuiDll: Pcstr = null,
    public var dwResourceId: UInt = 0u,
    public var pDisplayName: Pcstr = null,
    public var wLangId: UShort = 0u,
)

public data class FormInfo2w(
    public var flags: UInt = 0u,
    public var pName: Pcwstr = null,
    public var size: Size = Size(),
    public var imageableArea: Rectl = Rectl(),
    public var pKeyword: Pcstr = null,
    public var stringType: UInt = 0u,
    public var pMuiDll: Pcwstr = null,
    public var dwResourceId: UInt = 0u,
    public var pDisplayName: Pcwstr = null,
    public var wLangId: UShort = 0u,
)

public data class Glyphrun(
    public var wcLow: UShort = 0u,
    public var wGlyphCount: UShort = 0u,
)

public data class InsertpsuipageInfo(
    public var cbSize: UShort = 0u,
    public var type: UByte = 0u,
    public var mode: UByte = 0u,
    public var dwData1: Int = 0,
    public var dwData2: Int = 0,
    public var dwData3: Int = 0,
)

public data class Invoc(
    public var dwCount: UInt = 0u,
    public var loOffset: UInt = 0u,
)

public data class ImgErrorInfo(
    public var description: Bstr = null,
    public var guid: Guid = Guid(),
    public var helpContext: UInt = 0u,
    public var helpFile: Bstr = null,
    public var source: Bstr = null,
    public var devDescription: Bstr = null,
    public var errorID: Guid = Guid(),
    public var cUserParameters: UInt = 0u,
    public var aUserParameters: Bstr? = null,
    public var userFallback: Bstr = null,
    public var exceptionID: UInt = 0u,
)

public data class JobInfo1a(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pstr = null,
    public var pMachineName: Pstr = null,
    public var pUserName: Pstr = null,
    public var pDocument: Pstr = null,
    public var pDatatype: Pstr = null,
    public var pStatus: Pstr = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
)

public data class JobInfo1w(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pwstr = null,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pDocument: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var pStatus: Pwstr = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
)

public class JobInfo2a(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pstr = null,
    public var pMachineName: Pstr = null,
    public var pUserName: Pstr = null,
    public var pDocument: Pstr = null,
    public var pNotifyName: Pstr = null,
    public var pDatatype: Pstr = null,
    public var pPrintProcessor: Pstr = null,
    public var pParameters: Pstr = null,
    public var pDriverName: Pstr = null,
    public var pDevMode: Devmodea? = null,
    public var pStatus: Pstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var size: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var time: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
)

public class JobInfo2w(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pwstr = null,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pDocument: Pwstr = null,
    public var pNotifyName: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var pPrintProcessor: Pwstr = null,
    public var pParameters: Pwstr = null,
    public var pDriverName: Pwstr = null,
    public var pDevMode: Devmodew? = null,
    public var pStatus: Pwstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var size: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var time: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
)

public data class JobInfo3(
    public var jobId: UInt = 0u,
    public var nextJobId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public class JobInfo4a(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pstr = null,
    public var pMachineName: Pstr = null,
    public var pUserName: Pstr = null,
    public var pDocument: Pstr = null,
    public var pNotifyName: Pstr = null,
    public var pDatatype: Pstr = null,
    public var pPrintProcessor: Pstr = null,
    public var pParameters: Pstr = null,
    public var pDriverName: Pstr = null,
    public var pDevMode: Devmodea? = null,
    public var pStatus: Pstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var size: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var time: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
    public var sizeHigh: Int = 0,
)

public class JobInfo4w(
    public var jobId: UInt = 0u,
    public var pPrinterName: Pwstr = null,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pDocument: Pwstr = null,
    public var pNotifyName: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var pPrintProcessor: Pwstr = null,
    public var pParameters: Pwstr = null,
    public var pDriverName: Pwstr = null,
    public var pDevMode: Devmodew? = null,
    public var pStatus: Pwstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var status: UInt = 0u,
    public var priority: UInt = 0u,
    public var position: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var totalPages: UInt = 0u,
    public var size: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var time: UInt = 0u,
    public var pagesPrinted: UInt = 0u,
    public var sizeHigh: Int = 0,
)

public data class Kerndata(
    public var dwSize: UInt = 0u,
    public var dwKernPairNum: UInt = 0u,
    public var kernPair: List<FdKerningpair> = List(1) { FdKerningpair() },
)

public data class Maptable(
    public var dwSize: UInt = 0u,
    public var dwGlyphNum: UInt = 0u,
    public var trans: List<Transdata> = List(1) { Transdata() },
)

public data class MessageboxParams(
    public var cbSize: UInt = 0u,
    public var pTitle: Pwstr = null,
    public var pMessage: Pwstr = null,
    public var style: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var bWait: Bool = 0,
)

public class Monitor(
    public var pfnEnumPorts: PfnPrintingEnumports = null,
    public var pfnOpenPort: PfnPrintingOpenport = null,
    public var pfnOpenPortEx: PfnPrintingOpenportex = null,
    public var pfnStartDocPort: PfnPrintingStartdocport = null,
    public var pfnWritePort: PfnPrintingWriteport = null,
    public var pfnReadPort: PfnPrintingReadport = null,
    public var pfnEndDocPort: PfnPrintingEnddocport = null,
    public var pfnClosePort: PfnPrintingCloseport = null,
    public var pfnAddPort: PfnPrintingAddport = null,
    public var pfnAddPortEx: PfnPrintingAddportex = null,
    public var pfnConfigurePort: PfnPrintingConfigureport = null,
    public var pfnDeletePort: PfnPrintingDeleteport = null,
    public var pfnGetPrinterDataFromPort: PfnPrintingGetprinterdatafromport = null,
    public var pfnSetPortTimeOuts: PfnPrintingSetporttimeouts = null,
    public var pfnXcvOpenPort: PfnPrintingXcvopenport = null,
    public var pfnXcvDataPort: PfnPrintingXcvdataport = null,
    public var pfnXcvClosePort: PfnPrintingXcvcloseport = null,
)

public class Monitor2(
    public var cbSize: UInt = 0u,
    public var pfnEnumPorts: PfnPrintingEnumports2 = null,
    public var pfnOpenPort: PfnPrintingOpenport2 = null,
    public var pfnOpenPortEx: PfnPrintingOpenportex2 = null,
    public var pfnStartDocPort: PfnPrintingStartdocport2 = null,
    public var pfnWritePort: PfnPrintingWriteport2 = null,
    public var pfnReadPort: PfnPrintingReadport2 = null,
    public var pfnEndDocPort: PfnPrintingEnddocport2 = null,
    public var pfnClosePort: PfnPrintingCloseport2 = null,
    public var pfnAddPort: PfnPrintingAddport2 = null,
    public var pfnAddPortEx: PfnPrintingAddportex2 = null,
    public var pfnConfigurePort: PfnPrintingConfigureport2 = null,
    public var pfnDeletePort: PfnPrintingDeleteport2 = null,
    public var pfnGetPrinterDataFromPort: PfnPrintingGetprinterdatafromport2 = null,
    public var pfnSetPortTimeOuts: PfnPrintingSetporttimeouts2 = null,
    public var pfnXcvOpenPort: PfnPrintingXcvopenport2 = null,
    public var pfnXcvDataPort: PfnPrintingXcvdataport2 = null,
    public var pfnXcvClosePort: PfnPrintingXcvcloseport2 = null,
    public var pfnShutdown: PfnPrintingShutdown2 = null,
    public var pfnSendRecvBidiDataFromPort: PfnPrintingSendrecvbididatafromport2 = null,
    public var pfnNotifyUsedPorts: PfnPrintingNotifyusedports2 = null,
    public var pfnNotifyUnusedPorts: PfnPrintingNotifyunusedports2 = null,
    public var pfnPowerEvent: PfnPrintingPowerevent2 = null,
)

public data class Monitorex(
    public var dwMonitorSize: UInt = 0u,
    public var monitor: Monitor = Monitor(),
)

public data class Monitorinit(
    public var cbSize: UInt = 0u,
    public var hSpooler: Handle = null,
    public var hckRegistryRoot: Hkey = null,
    public var pMonitorReg: Monitorreg? = null,
    public var bLocal: Bool = 0,
    public var pszServerName: Pcwstr = null,
)

public data class Monitorreg(
    public var cbSize: UInt = 0u,
    public var fpCreateKey: Int = 0,
    public var fpOpenKey: Int = 0,
    public var fpCloseKey: Int = 0,
    public var fpDeleteKey: Int = 0,
    public var fpEnumKey: Int = 0,
    public var fpQueryInfoKey: Int = 0,
    public var fpSetValue: Int = 0,
    public var fpDeleteValue: Int = 0,
    public var fpEnumValue: Int = 0,
    public var fpQueryValue: Int = 0,
)

public data class Monitorui(
    public var dwMonitorUISize: UInt = 0u,
    public var pfnAddPortUI: Int = 0,
    public var pfnConfigurePortUI: Int = 0,
    public var pfnDeletePortUI: Int = 0,
)

public data class MonitorInfo1a(
    public var pName: Pstr = null,
)

public data class MonitorInfo1w(
    public var pName: Pwstr = null,
)

public data class MonitorInfo2a(
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDLLName: Pstr = null,
)

public data class MonitorInfo2w(
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDLLName: Pwstr = null,
)

public data class MxdcEscapeHeaderT(
    public var cbInput: UInt = 0u,
    public var cbOutput: UInt = 0u,
    public var opCode: UInt = 0u,
)

public data class MxdcGetFilenameDataT(
    public var cbOutput: UInt = 0u,
    public var wszData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcGetFilenameDataT) return false
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

public data class MxdcPrintticketDataT(
    public var dwDataSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcPrintticketDataT) return false
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

public data class MxdcPrintticketEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var printTicketData: MxdcPrintticketDataT = MxdcPrintticketDataT(),
)

public data class MxdcS0pageDataT(
    public var dwSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcS0pageDataT) return false
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

public data class MxdcS0pagePassthroughEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var xpsS0PageData: MxdcS0pageDataT = MxdcS0pageDataT(),
)

public data class MxdcS0pageResourceEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var xpsS0PageResourcePassthrough: MxdcXpsS0pageResourceT = MxdcXpsS0pageResourceT(),
)

public data class MxdcXpsS0pageResourceT(
    public var dwSize: UInt = 0u,
    public var dwResourceType: UInt = 0u,
    public var szUri: UByteArray = UByteArray(260),
    public var dwDataSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcXpsS0pageResourceT) return false
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

public data class NotificationConfig1(
    public var cbSize: UInt = 0u,
    public var fdwFlags: UInt = 0u,
    public var pfnNotifyCallback: RouterNotifyCallback = null,
    public var pContext: COpaquePointer? = null,
)

public data class Oemcuipparam(
    public var cbSize: UInt = 0u,
    public var poemuiobj: Oemuiobj? = null,
    public var hPrinter: Handle = null,
    public var pPrinterName: Pwstr = null,
    public var hModule: Handle = null,
    public var hOEMHeap: Handle = null,
    public var pPublicDM: Devmodea? = null,
    public var pOEMDM: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
    public var pDrvOptItems: Optitem? = null,
    public var cDrvOptItems: UInt = 0u,
    public var pOEMOptItems: Optitem? = null,
    public var cOEMOptItems: UInt = 0u,
    public var pOEMUserData: COpaquePointer? = null,
    public var oEMCUIPCallback: Oemcuipcallback = null,
)

public data class Oemdmparam(
    public var cbSize: UInt = 0u,
    public var pdriverobj: COpaquePointer? = null,
    public var hPrinter: Handle = null,
    public var hModule: Handle = null,
    public var pPublicDMIn: Devmodea? = null,
    public var pPublicDMOut: Devmodea? = null,
    public var pOEMDMIn: COpaquePointer? = null,
    public var pOEMDMOut: COpaquePointer? = null,
    public var cbBufSize: UInt = 0u,
)

public data class Oemfontinstparam(
    public var cbSize: UInt = 0u,
    public var hPrinter: Handle = null,
    public var hModule: Handle = null,
    public var hHeap: Handle = null,
    public var dwFlags: UInt = 0u,
    public var pFontInstallerName: Pwstr = null,
)

public data class Oemuiobj(
    public var cbSize: UInt = 0u,
    public var pOemUIProcs: Oemuiprocs? = null,
)

public data class Oemuiprocs(
    public var drvGetDriverSetting: PfnDrvGetDriverSetting = null,
    public var drvUpdateUISetting: PfnDrvUpdateUisetting = null,
)

public data class Oemuipsparam(
    public var cbSize: UInt = 0u,
    public var poemuiobj: Oemuiobj? = null,
    public var hPrinter: Handle = null,
    public var pPrinterName: Pwstr = null,
    public var hModule: Handle = null,
    public var hOEMHeap: Handle = null,
    public var pPublicDM: Devmodea? = null,
    public var pOEMDM: COpaquePointer? = null,
    public var pOEMUserData: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
    public var pOemEntry: COpaquePointer? = null,
)

public data class OemDmextraheader(
    public var dwSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
)

public data class Oiext(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var hInstCaller: Hinstance = null,
    public var pHelpFile: COpaquePointer? = null,
    public var dwReserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oiext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Optcombo(
    public var cbSize: UShort = 0u,
    public var flags: UByte = 0u,
    public var cListItem: UShort = 0u,
    public var pListItem: Optparam? = null,
    public var sel: Int = 0,
    public var dwReserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optcombo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.cListItem != other.cListItem) return false
        if (this.pListItem != other.pListItem) return false
        if (this.sel != other.sel) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cListItem.hashCode()
        result = 31 * result + this.pListItem.hashCode()
        result = 31 * result + this.sel.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Optitem(
    public var cbSize: UShort = 0u,
    public var level: UByte = 0u,
    public var dlgPageIdx: UByte = 0u,
    public var flags: UInt = 0u,
    public var userData: Int = 0,
    public var pName: COpaquePointer? = null,
    public var anonymous1: Optitem0 = Optitem0(),
    public var anonymous2: Optitem1 = Optitem1(),
    public var pOptType: Opttype? = null,
    public var helpIndex: UInt = 0u,
    public var dMPubID: UByte = 0u,
    public var userItemID: UByte = 0u,
    public var wReserved: UShort = 0u,
    public var pOIExt: Oiext? = null,
    public var dwReserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optitem) return false
        if (this.cbSize != other.cbSize) return false
        if (this.level != other.level) return false
        if (this.dlgPageIdx != other.dlgPageIdx) return false
        if (this.flags != other.flags) return false
        if (this.userData != other.userData) return false
        if (this.pName != other.pName) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pOptType != other.pOptType) return false
        if (this.helpIndex != other.helpIndex) return false
        if (this.dMPubID != other.dMPubID) return false
        if (this.userItemID != other.userItemID) return false
        if (this.wReserved != other.wReserved) return false
        if (this.pOIExt != other.pOIExt) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.dlgPageIdx.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pOptType.hashCode()
        result = 31 * result + this.helpIndex.hashCode()
        result = 31 * result + this.dMPubID.hashCode()
        result = 31 * result + this.userItemID.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.pOIExt.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Optitem0(
    public var sel: Int = 0,
    public var pSel: COpaquePointer? = null,
)

public data class Optitem1(
    public var pExtChkBox: Extchkbox? = null,
    public var pExtPush: Extpush? = null,
)

public data class Optparam(
    public var cbSize: UShort = 0u,
    public var flags: UByte = 0u,
    public var style: UByte = 0u,
    public var pData: COpaquePointer? = null,
    public var iconID: Int = 0,
    public var lParam: Lparam = 0L,
    public var dwReserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.style != other.style) return false
        if (this.pData != other.pData) return false
        if (this.iconID != other.iconID) return false
        if (this.lParam != other.lParam) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Opttype(
    public var cbSize: UShort = 0u,
    public var type: UByte = 0u,
    public var flags: UByte = 0u,
    public var count: UShort = 0u,
    public var begCtrlID: UShort = 0u,
    public var pOptParam: Optparam? = null,
    public var style: UShort = 0u,
    public var wReserved: UShortArray = UShortArray(3),
    public var dwReserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Opttype) return false
        if (this.cbSize != other.cbSize) return false
        if (this.type != other.type) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (this.begCtrlID != other.begCtrlID) return false
        if (this.pOptParam != other.pOptParam) return false
        if (this.style != other.style) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.begCtrlID.hashCode()
        result = 31 * result + this.pOptParam.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class PortData1(
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
    public var reserved: UByteArray = UByteArray(540),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortData1) return false
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
        if (!this.reserved.contentEquals(other.reserved)) return false
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
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        return result
    }
}

public data class PortData2(
    public var sztPortName: UShortArray = UShortArray(64),
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var sztHostAddress: UShortArray = UShortArray(128),
    public var sztSNMPCommunity: UShortArray = UShortArray(33),
    public var dwDoubleSpool: UInt = 0u,
    public var sztQueue: UShortArray = UShortArray(33),
    public var reserved: UByteArray = UByteArray(514),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
    public var dwPortMonitorMibIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortData2) return false
        if (!this.sztPortName.contentEquals(other.sztPortName)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.sztHostAddress.contentEquals(other.sztHostAddress)) return false
        if (!this.sztSNMPCommunity.contentEquals(other.sztSNMPCommunity)) return false
        if (this.dwDoubleSpool != other.dwDoubleSpool) return false
        if (!this.sztQueue.contentEquals(other.sztQueue)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
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
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        result = 31 * result + this.dwPortMonitorMibIndex.hashCode()
        return result
    }
}

public data class PortDataList1(
    public var dwVersion: UInt = 0u,
    public var cPortData: UInt = 0u,
    public var pPortData: List<PortData2> = List(1) { PortData2() },
)

public data class PortInfo1a(
    public var pName: Pstr = null,
)

public data class PortInfo1w(
    public var pName: Pwstr = null,
)

public data class PortInfo2a(
    public var pPortName: Pstr = null,
    public var pMonitorName: Pstr = null,
    public var pDescription: Pstr = null,
    public var fPortType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PortInfo2w(
    public var pPortName: Pwstr = null,
    public var pMonitorName: Pwstr = null,
    public var pDescription: Pwstr = null,
    public var fPortType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PortInfo3a(
    public var dwStatus: UInt = 0u,
    public var pszStatus: Pstr = null,
    public var dwSeverity: UInt = 0u,
)

public data class PortInfo3w(
    public var dwStatus: UInt = 0u,
    public var pszStatus: Pwstr = null,
    public var dwSeverity: UInt = 0u,
)

public data class PrinterConnectionInfo1a(
    public var dwFlags: UInt = 0u,
    public var pszDriverName: Pstr = null,
)

public data class PrinterConnectionInfo1w(
    public var dwFlags: UInt = 0u,
    public var pszDriverName: Pwstr = null,
)

public data class PrinterDefaultsa(
    public var pDatatype: Pstr = null,
    public var pDevMode: Devmodea? = null,
    public var desiredAccess: PrinterAccessRights = 0u,
)

public data class PrinterDefaultsw(
    public var pDatatype: Pwstr = null,
    public var pDevMode: Devmodew? = null,
    public var desiredAccess: PrinterAccessRights = 0u,
)

public data class PrinterEnumValuesa(
    public var pValueName: Pstr = null,
    public var cbValueName: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
)

public data class PrinterEnumValuesw(
    public var pValueName: Pwstr = null,
    public var cbValueName: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
)

public data class PrinterEventAttributesInfo(
    public var cbSize: UInt = 0u,
    public var dwOldAttributes: UInt = 0u,
    public var dwNewAttributes: UInt = 0u,
)

public data class PrinterHandle(
    public var value: COpaquePointer? = null,
)

public data class PrinterInfo1a(
    public var flags: UInt = 0u,
    public var pDescription: Pstr = null,
    public var pName: Pstr = null,
    public var pComment: Pstr = null,
)

public data class PrinterInfo1w(
    public var flags: UInt = 0u,
    public var pDescription: Pwstr = null,
    public var pName: Pwstr = null,
    public var pComment: Pwstr = null,
)

public class PrinterInfo2a(
    public var pServerName: Pstr = null,
    public var pPrinterName: Pstr = null,
    public var pShareName: Pstr = null,
    public var pPortName: Pstr = null,
    public var pDriverName: Pstr = null,
    public var pComment: Pstr = null,
    public var pLocation: Pstr = null,
    public var pDevMode: Devmodea? = null,
    public var pSepFile: Pstr = null,
    public var pPrintProcessor: Pstr = null,
    public var pDatatype: Pstr = null,
    public var pParameters: Pstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var attributes: UInt = 0u,
    public var priority: UInt = 0u,
    public var defaultPriority: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var status: UInt = 0u,
    public var cJobs: UInt = 0u,
    public var averagePPM: UInt = 0u,
)

public class PrinterInfo2w(
    public var pServerName: Pwstr = null,
    public var pPrinterName: Pwstr = null,
    public var pShareName: Pwstr = null,
    public var pPortName: Pwstr = null,
    public var pDriverName: Pwstr = null,
    public var pComment: Pwstr = null,
    public var pLocation: Pwstr = null,
    public var pDevMode: Devmodew? = null,
    public var pSepFile: Pwstr = null,
    public var pPrintProcessor: Pwstr = null,
    public var pDatatype: Pwstr = null,
    public var pParameters: Pwstr = null,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var attributes: UInt = 0u,
    public var priority: UInt = 0u,
    public var defaultPriority: UInt = 0u,
    public var startTime: UInt = 0u,
    public var untilTime: UInt = 0u,
    public var status: UInt = 0u,
    public var cJobs: UInt = 0u,
    public var averagePPM: UInt = 0u,
)

public data class PrinterInfo3(
    public var pSecurityDescriptor: PsecurityDescriptor = null,
)

public data class PrinterInfo4a(
    public var pPrinterName: Pstr = null,
    public var pServerName: Pstr = null,
    public var attributes: UInt = 0u,
)

public data class PrinterInfo4w(
    public var pPrinterName: Pwstr = null,
    public var pServerName: Pwstr = null,
    public var attributes: UInt = 0u,
)

public data class PrinterInfo5a(
    public var pPrinterName: Pstr = null,
    public var pPortName: Pstr = null,
    public var attributes: UInt = 0u,
    public var deviceNotSelectedTimeout: UInt = 0u,
    public var transmissionRetryTimeout: UInt = 0u,
)

public data class PrinterInfo5w(
    public var pPrinterName: Pwstr = null,
    public var pPortName: Pwstr = null,
    public var attributes: UInt = 0u,
    public var deviceNotSelectedTimeout: UInt = 0u,
    public var transmissionRetryTimeout: UInt = 0u,
)

public data class PrinterInfo6(
    public var dwStatus: UInt = 0u,
)

public data class PrinterInfo7a(
    public var pszObjectGUID: Pstr = null,
    public var dwAction: UInt = 0u,
)

public data class PrinterInfo7w(
    public var pszObjectGUID: Pwstr = null,
    public var dwAction: UInt = 0u,
)

public data class PrinterInfo8a(
    public var pDevMode: Devmodea? = null,
)

public data class PrinterInfo8w(
    public var pDevMode: Devmodew? = null,
)

public data class PrinterInfo9a(
    public var pDevMode: Devmodea? = null,
)

public data class PrinterInfo9w(
    public var pDevMode: Devmodew? = null,
)

public data class PrinterNotifyInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<PrinterNotifyInfoData> = List(1) { PrinterNotifyInfoData() },
)

public data class PrinterNotifyInfoData(
    public var type: UShort = 0u,
    public var field: UShort = 0u,
    public var reserved: UInt = 0u,
    public var id: UInt = 0u,
    public var notifyData: PrinterNotifyInfoData0 = PrinterNotifyInfoData0(),
)

public data class PrinterNotifyInfoData0(
    public var adwData: UIntArray = UIntArray(2),
    public var data: PrinterNotifyInfoData00 = PrinterNotifyInfoData00(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterNotifyInfoData0) return false
        if (!this.adwData.contentEquals(other.adwData)) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adwData.contentHashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }
}

public data class PrinterNotifyInfoData00(
    public var cbBuf: UInt = 0u,
    public var pBuf: COpaquePointer? = null,
)

public data class PrinterNotifyInit(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var pollTime: UInt = 0u,
)

public data class PrinterNotifyOptions(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var pTypes: PrinterNotifyOptionsType? = null,
)

public data class PrinterNotifyOptionsType(
    public var type: UShort = 0u,
    public var reserved0: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var count: UInt = 0u,
    public var pFields: COpaquePointer? = null,
)

public data class PrinterOptionsa(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class PrinterOptionsw(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public class Printifi32(
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
    public var ptlBaseline: Pointl = Pointl(),
    public var ptlAspect: Pointl = Pointl(),
    public var ptlCaret: Pointl = Pointl(),
    public var rclFontBox: Rectl = Rectl(),
    public var achVendId: UByteArray = UByteArray(4),
    public var cKerningPairs: UInt = 0u,
    public var ulPanoseCulture: UInt = 0u,
    public var panose: Panose = Panose(),
)

public data class Printprocessoropendata(
    public var pDevMode: Devmodea? = null,
    public var pDatatype: Pwstr = null,
    public var pParameters: Pwstr = null,
    public var pDocumentName: Pwstr = null,
    public var jobId: UInt = 0u,
    public var pOutputFile: Pwstr = null,
    public var pPrinterName: Pwstr = null,
)

public data class PrintprocessorCaps1(
    public var dwLevel: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
)

public data class PrintprocessorCaps2(
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

public data class PrintprocessorInfo1a(
    public var pName: Pstr = null,
)

public data class PrintprocessorInfo1w(
    public var pName: Pwstr = null,
)

public class Printprovidor {
    public var fpOpenPrinter: Int = 0

    public var fpSetJob: Int = 0

    public var fpGetJob: Int = 0

    public var fpEnumJobs: Int = 0

    public var fpAddPrinter: Int = 0

    public var fpDeletePrinter: Int = 0

    public var fpSetPrinter: Int = 0

    public var fpGetPrinter: Int = 0

    public var fpEnumPrinters: Int = 0

    public var fpAddPrinterDriver: Int = 0

    public var fpEnumPrinterDrivers: Int = 0

    public var fpGetPrinterDriver: Int = 0

    public var fpGetPrinterDriverDirectory: Int = 0

    public var fpDeletePrinterDriver: Int = 0

    public var fpAddPrintProcessor: Int = 0

    public var fpEnumPrintProcessors: Int = 0

    public var fpGetPrintProcessorDirectory: Int = 0

    public var fpDeletePrintProcessor: Int = 0

    public var fpEnumPrintProcessorDatatypes: Int = 0

    public var fpStartDocPrinter: Int = 0

    public var fpStartPagePrinter: Int = 0

    public var fpWritePrinter: Int = 0

    public var fpEndPagePrinter: Int = 0

    public var fpAbortPrinter: Int = 0

    public var fpReadPrinter: Int = 0

    public var fpEndDocPrinter: Int = 0

    public var fpAddJob: Int = 0

    public var fpScheduleJob: Int = 0

    public var fpGetPrinterData: Int = 0

    public var fpSetPrinterData: Int = 0

    public var fpWaitForPrinterChange: Int = 0

    public var fpClosePrinter: Int = 0

    public var fpAddForm: Int = 0

    public var fpDeleteForm: Int = 0

    public var fpGetForm: Int = 0

    public var fpSetForm: Int = 0

    public var fpEnumForms: Int = 0

    public var fpEnumMonitors: Int = 0

    public var fpEnumPorts: Int = 0

    public var fpAddPort: Int = 0

    public var fpConfigurePort: Int = 0

    public var fpDeletePort: Int = 0

    public var fpCreatePrinterIC: Int = 0

    public var fpPlayGdiScriptOnPrinterIC: Int = 0

    public var fpDeletePrinterIC: Int = 0

    public var fpAddPrinterConnection: Int = 0

    public var fpDeletePrinterConnection: Int = 0

    public var fpPrinterMessageBox: Int = 0

    public var fpAddMonitor: Int = 0

    public var fpDeleteMonitor: Int = 0

    public var fpResetPrinter: Int = 0

    public var fpGetPrinterDriverEx: Int = 0

    public var fpFindFirstPrinterChangeNotification: Int = 0

    public var fpFindClosePrinterChangeNotification: Int = 0

    public var fpAddPortEx: Int = 0

    public var fpShutDown: Int = 0

    public var fpRefreshPrinterChangeNotification: Int = 0

    public var fpOpenPrinterEx: Int = 0

    public var fpAddPrinterEx: Int = 0

    public var fpSetPort: Int = 0

    public var fpEnumPrinterData: Int = 0

    public var fpDeletePrinterData: Int = 0

    public var fpClusterSplOpen: Int = 0

    public var fpClusterSplClose: Int = 0

    public var fpClusterSplIsAlive: Int = 0

    public var fpSetPrinterDataEx: Int = 0

    public var fpGetPrinterDataEx: Int = 0

    public var fpEnumPrinterDataEx: Int = 0

    public var fpEnumPrinterKey: Int = 0

    public var fpDeletePrinterDataEx: Int = 0

    public var fpDeletePrinterKey: Int = 0

    public var fpSeekPrinter: Int = 0

    public var fpDeletePrinterDriverEx: Int = 0

    public var fpAddPerMachineConnection: Int = 0

    public var fpDeletePerMachineConnection: Int = 0

    public var fpEnumPerMachineConnections: Int = 0

    public var fpXcvData: Int = 0

    public var fpAddPrinterDriverEx: Int = 0

    public var fpSplReadPrinter: Int = 0

    public var fpDriverUnloadComplete: Int = 0

    public var fpGetSpoolFileInfo: Int = 0

    public var fpCommitSpoolData: Int = 0

    public var fpCloseSpoolFileHandle: Int = 0

    public var fpFlushPrinter: Int = 0

    public var fpSendRecvBidiData: Int = 0

    public var fpAddPrinterConnection2: Int = 0

    public var fpGetPrintClassObject: Int = 0

    public var fpReportJobProcessingProgress: Int = 0

    public var fpEnumAndLogProvidorObjects: Int = 0

    public var fpInternalGetPrinterDriver: Int = 0

    public var fpFindCompatibleDriver: Int = 0

    public var fpInstallPrinterDriverPackageFromConnection: Int = 0

    public var fpGetJobNamedPropertyValue: Int = 0

    public var fpSetJobNamedProperty: Int = 0

    public var fpDeleteJobNamedProperty: Int = 0

    public var fpEnumJobNamedProperties: Int = 0

    public var fpPowerEvent: Int = 0

    public var fpGetUserPropertyBag: Int = 0

    public var fpCanShutdown: Int = 0

    public var fpLogJobInfoForBranchOffice: Int = 0

    public var fpRegeneratePrintDeviceCapabilities: Int = 0

    public var fpPrintSupportOperation: Int = 0

    public var fpIppCreateJobOnPrinter: Int = 0

    public var fpIppGetJobAttributes: Int = 0

    public var fpIppSetJobAttributes: Int = 0

    public var fpIppGetPrinterAttributes: Int = 0

    public var fpIppSetPrinterAttributes: Int = 0

    public var fpIppCreateJobOnPrinterWithAttributes: Int = 0
}

public data class PrintExecutionData(
    public var context: PrintExecutionContext = 0,
    public var clientAppPID: UInt = 0u,
)

public data class PrintFeatureOption(
    public var pszFeature: Pcstr = null,
    public var pszOption: Pcstr = null,
)

public data class PropsheetuiGeticonInfo(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var cxIcon: UShort = 0u,
    public var cyIcon: UShort = 0u,
    public var hIcon: Hicon = null,
)

public data class PropsheetuiInfo(
    public var cbSize: UShort = 0u,
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
    public var reason: UShort = 0u,
    public var hComPropSheet: Handle = null,
    public var pfnComPropSheet: Pfncompropsheet = null,
    public var lParamInit: Lparam = 0L,
    public var userData: Int = 0,
    public var result: Int = 0,
)

public data class PropsheetuiInfoHeader(
    public var cbSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var pTitle: COpaquePointer? = null,
    public var hWndParent: Hwnd = null,
    public var hInst: Hinstance = null,
    public var anonymous: PropsheetuiInfoHeader0 = PropsheetuiInfoHeader0(),
)

public data class PropsheetuiInfoHeader0(
    public var hIcon: Hicon = null,
    public var iconID: Int = 0,
)

public data class ProvidorInfo1a(
    public var pName: Pstr = null,
    public var pEnvironment: Pstr = null,
    public var pDLLName: Pstr = null,
)

public data class ProvidorInfo1w(
    public var pName: Pwstr = null,
    public var pEnvironment: Pwstr = null,
    public var pDLLName: Pwstr = null,
)

public data class ProvidorInfo2a(
    public var pOrder: Pstr = null,
)

public data class ProvidorInfo2w(
    public var pOrder: Pwstr = null,
)

public data class Pscript5PrivateDevmode(
    public var wReserved: UShortArray = UShortArray(57),
    public var wSize: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pscript5PrivateDevmode) return false
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

public data class Pspinfo(
    public var cbSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var hComPropSheet: Handle = null,
    public var hCPSUIPage: Handle = null,
    public var pfnComPropSheet: Pfncompropsheet = null,
)

public data class Publisherinfo(
    public var dwMode: UInt = 0u,
    public var wMinoutlinePPEM: UShort = 0u,
    public var wMaxbitmapPPEM: UShort = 0u,
)

public data class PrintNamedProperty(
    public var propertyName: Pwstr = null,
    public var propertyValue: PrintPropertyValue = PrintPropertyValue(),
)

public data class PrintPropertiesCollection(
    public var numberOfProperties: UInt = 0u,
    public var propertiesCollection: PrintNamedProperty? = null,
)

public data class PrintPropertyValue(
    public var ePropertyType: EPrintPropertyType = 0,
    public var value: PrintPropertyValue0 = PrintPropertyValue0(),
)

public data class PrintPropertyValue0(
    public var propertyByte: UByte = 0u,
    public var propertyString: Pwstr = null,
    public var propertyInt32: Int = 0,
    public var propertyInt64: Long = 0L,
    public var propertyBlob: PrintPropertyValue00 = PrintPropertyValue00(),
)

public data class PrintPropertyValue00(
    public var cbBuf: UInt = 0u,
    public var pBuf: COpaquePointer? = null,
)

public data class SetresultInfo(
    public var cbSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var hSetResult: Handle = null,
    public var result: Lresult = 0L,
)

public data class Showuiparams(
    public var uIType: UiType = 0,
    public var messageBoxParams: MessageboxParams = MessageboxParams(),
)

public data class SimulateCaps1(
    public var dwLevel: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
    public var dwCollate: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
)

public data class SplclientInfo1(
    public var dwSize: UInt = 0u,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
)

public data class SplclientInfo2W2k(
    public var hSplPrinter: Int = 0,
)

public data class SplclientInfo2Winxp(
    public var hSplPrinter: ULong = 0uL,
)

public data class SplclientInfo3Vista(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
    public var hSplPrinter: ULong = 0uL,
)

public data class SplclientInfoInternal(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var pMachineName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var dwBuildNum: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var wProcessorArchitecture: UShort = 0u,
    public var hSplPrinter: ULong = 0uL,
    public var dwProcessId: UInt = 0u,
    public var dwSessionId: UInt = 0u,
)

public data class Transdata(
    public var ubCodePageID: UByte = 0u,
    public var ubType: UByte = 0u,
    public var uCode: Transdata0 = Transdata0(),
)

public data class Transdata0(
    public var sCode: Short = 0,
    public var ubCode: UByte = 0u,
    public var ubPairs: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Transdata0) return false
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

public data class UffFileheader(
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
        if (other !is UffFileheader) return false
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

public data class UffFontdirectory(
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

public data class Unidrvinfo(
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
    public var selectFont: Invoc = Invoc(),
    public var unSelectFont: Invoc = Invoc(),
    public var wReserved: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Unidrvinfo) return false
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
        if (this.selectFont != other.selectFont) return false
        if (this.unSelectFont != other.unSelectFont) return false
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
        result = 31 * result + this.selectFont.hashCode()
        result = 31 * result + this.unSelectFont.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        return result
    }
}

public data class UnidrvPrivateDevmode(
    public var wReserved: UShortArray = UShortArray(4),
    public var wSize: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnidrvPrivateDevmode) return false
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

public data class UnifmHdr(
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
        if (other !is UnifmHdr) return false
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

public data class UniCodepageinfo(
    public var dwCodePage: UInt = 0u,
    public var selectSymbolSet: Invoc = Invoc(),
    public var unSelectSymbolSet: Invoc = Invoc(),
)

public data class UniGlyphsetdata(
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
        if (other !is UniGlyphsetdata) return false
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

public data class Userdata(
    public var dwSize: UInt = 0u,
    public var dwItemID: Int = 0,
    public var pKeyWordName: Pstr = null,
    public var dwReserved: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Userdata) return false
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

public data class Widthrun(
    public var wStartGlyph: UShort = 0u,
    public var wGlyphCount: UShort = 0u,
    public var loCharWidthOffset: UInt = 0u,
)

public data class Widthtable(
    public var dwSize: UInt = 0u,
    public var dwRunNum: UInt = 0u,
    public var widthRun: List<Widthrun> = List(1) { Widthrun() },
)

public data class SplclientInfo2V3(
    public var hSplPrinter: ULong = 0uL,
)
