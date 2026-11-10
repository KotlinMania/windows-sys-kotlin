package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias ActctxCompatibilityElementType = Int

public typealias ActctxRequestedRunLevel = Int

public typealias Advertiseflags = Int

public typealias AsmBindFlags = Int

public typealias AsmCmpFlags = Int

public typealias AsmDisplayFlags = Int

public typealias AsmName = Int

public typealias CreateAsmNameObjFlags = Int

public typealias IassemblycacheUninstallDisposition = UInt

public typealias Installfeatureattribute = Int

public typealias Installlevel = Int

public typealias Installlogattributes = Int

public typealias Installlogmode = Int

public typealias Installmessage = Int

public typealias Installmode = Int

public typealias Installstate = Int

public typealias Installtype = Int

public typealias Installuilevel = Int

public fun interface InstalluiHandleraFn {
    public operator fun invoke(pvcontext: COpaquePointer?, imessagetype: UInt, szmessage: Pcstr): Int
}

public typealias InstalluiHandlera = InstalluiHandleraFn?

public fun interface InstalluiHandlerwFn {
    public operator fun invoke(pvcontext: COpaquePointer?, imessagetype: UInt, szmessage: Pcwstr): Int
}

public typealias InstalluiHandlerw = InstalluiHandlerwFn?

public fun interface LpdisplayvalFn {
    public operator fun invoke(pcontext: COpaquePointer?, uitype: Resulttypes, szwval: Pcwstr, szwdescription: Pcwstr, szwlocation: Pcwstr): Bool
}

public typealias Lpdisplayval = LpdisplayvalFn?

public fun interface LpevalcomcallbackFn {
    public operator fun invoke(istatus: Statustypes, szdata: Pcwstr, pcontext: COpaquePointer?): Bool
}

public typealias Lpevalcomcallback = LpevalcomcallbackFn?

public typealias Msiadvertiseoptionflags = Int

public typealias Msiarchitectureflags = Int

public typealias Msiassemblyinfo = UInt

public typealias Msicode = Int

public typealias Msicolinfo = Int

public typealias Msicondition = Int

public typealias Msicosttree = Int

public typealias Msidberror = Int

public typealias Msidbstate = Int

public typealias Msihandle = UInt

public typealias Msiinstallcontext = Int

public typealias Msimodify = Int

public typealias Msiopenpackageflags = Int

public typealias Msipatchdatatype = Int

public typealias Msipatchstate = Int

public typealias Msirunmode = Int

public typealias Msisourcetype = Int

public typealias Msitransaction = Int

public typealias Msitransactionstate = UInt

public typealias MsitransformError = Int

public typealias MsitransformValidate = Int

public typealias PackmanRuntime = Int

public fun interface PinstalluiHandlerRecordFn {
    public operator fun invoke(pvcontext: COpaquePointer?, imessagetype: UInt, hrecord: Msihandle): Int
}

public typealias PinstalluiHandlerRecord = PinstalluiHandlerRecordFn?

public typealias PmActivationPolicy = Int

public typealias PmApplicationHubtype = Int

public typealias PmApplicationInstallType = Int

public typealias PmApplicationState = Int

public typealias PmAppGenre = Int

public typealias PmEnumAppFilter = Int

public typealias PmEnumBsaFilter = Int

public typealias PmEnumBwFilter = Int

public typealias PmEnumExtensionFilter = Int

public typealias PmEnumTaskFilter = Int

public typealias PmEnumTileFilter = Int

public typealias PmLivetileRecurrenceType = Int

public typealias PmLogoSize = Int

public typealias PmStarttileType = Int

public typealias PmTaskTransition = Int

public typealias PmTaskType = Int

public typealias PmTileHubtype = Int

public typealias PmTileSize = Int

public fun interface PpatchProgressCallbackFn {
    public operator fun invoke(callbackcontext: COpaquePointer?, currentposition: UInt, maximumposition: UInt): Bool
}

public typealias PpatchProgressCallback = PpatchProgressCallbackFn?

public fun interface PpatchSymloadCallbackFn {
    public operator fun invoke(whichfile: UInt, symbolfilename: Pcstr, symtype: UInt, symbolfilechecksum: UInt, symbolfiletimedate: UInt, imagefilechecksum: UInt, imagefiletimedate: UInt, callbackcontext: COpaquePointer?): Bool
}

public typealias PpatchSymloadCallback = PpatchSymloadCallbackFn?

public typealias QueryasminfoFlags = UInt

public typealias Reinstallmode = Int

public typealias Resulttypes = Int

public typealias Scriptflags = Int

public typealias Statustypes = Int

public typealias TileTemplateType = Int

public typealias Userinfostate = Int

public typealias MsidbAssemblyAttributes = Int

public typealias MsidbClassAttributes = Int

public typealias MsidbComponentAttributes = Int

public typealias MsidbControlAttributes = Int

public typealias MsidbCustomActionType = Int

public typealias MsidbDialogAttributes = Int

public typealias MsidbEmbeddedUiattributes = Int

public typealias MsidbFeatureAttributes = Int

public typealias MsidbFileAttributes = Int

public typealias MsidbIniFileAction = Int

public typealias MsidbLocatorType = Int

public typealias MsidbMoveFileOptions = Int

public typealias MsidbOdbcdataSourceRegistration = Int

public typealias MsidbPatchAttributes = Int

public typealias MsidbRegistryRoot = Int

public typealias MsidbRemoveFileInstallMode = Int

public typealias MsidbServiceConfigEvent = Int

public typealias MsidbServiceControlEvent = Int

public typealias MsidbServiceInstallErrorControl = Int

public typealias MsidbSumInfoSourceType = Int

public typealias MsidbTextStyleStyleBits = Int

public typealias MsidbUpgradeAttributes = Int

public typealias MsifiFastInstallBits = Int

public typealias MsirbRebootReason = Int

public typealias MsirbRebootType = Int

public typealias MsmErrorType = Int
