package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt
}

public fun SetupOpenMasterInf(): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenMasterInf", longArrayOf())
}

public fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupPrepareQueueForRestoreA", longArrayOf(queuehandle, backuppath, restoreflags.toLong())).toInt()
}

public fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupPrepareQueueForRestoreW", longArrayOf(queuehandle, backuppath, restoreflags.toLong())).toInt()
}

public fun SetupPromptForDiskA(hwndparent: Foundation.HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupPromptForDiskA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle.toLong(), pathbuffer, pathbuffersize.toLong(), pathrequiredsize)).toUInt()
}

public fun SetupPromptForDiskW(hwndparent: Foundation.HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupPromptForDiskW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle.toLong(), pathbuffer, pathbuffersize.toLong(), pathrequiredsize)).toUInt()
}

public fun SetupPromptReboot(filequeue: Long, owner: Foundation.HWND, scanonly: BOOL): Int {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupPromptReboot", longArrayOf(filequeue, Win32DynamicFfi.objectSlot(owner), scanonly.toLong())).toInt()
}

public fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryDrivesInDiskSpaceListA", longArrayOf(diskspace, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryDrivesInDiskSpaceListW", longArrayOf(diskspace, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryFileLogA", longArrayOf(fileloghandle, logsectionname, targetfilename, desiredinfo.toLong(), dataout, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryFileLogW", longArrayOf(fileloghandle, logsectionname, targetfilename, desiredinfo.toLong(), dataout, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfFileInformationA", longArrayOf(infinformation, infindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfFileInformationW", longArrayOf(infinformation, infindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfOriginalFileInformationA", longArrayOf(infinformation, infindex.toLong(), alternateplatforminfo, originalfileinfo)).toInt()
}

public fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfOriginalFileInformationW", longArrayOf(infinformation, infindex.toLong(), alternateplatforminfo, originalfileinfo)).toInt()
}

public fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfVersionInformationA", longArrayOf(infinformation, infindex.toLong(), key, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueryInfVersionInformationW", longArrayOf(infinformation, infindex.toLong(), key, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQuerySourceListA", longArrayOf(flags.toLong(), list, count)).toInt()
}

public fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQuerySourceListW", longArrayOf(flags.toLong(), list, count)).toInt()
}

public fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQuerySpaceRequiredOnDriveA", longArrayOf(diskspace, drivespec, spacerequired, reserved1, reserved2.toLong())).toInt()
}

public fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQuerySpaceRequiredOnDriveW", longArrayOf(diskspace, drivespec, spacerequired, reserved1, reserved2.toLong())).toInt()
}

public fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopyA", longArrayOf(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle.toLong())).toInt()
}

public fun SetupQueueCopyIndirectA(copyparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopyIndirectA", longArrayOf(copyparams)).toInt()
}

public fun SetupQueueCopyIndirectW(copyparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopyIndirectW", longArrayOf(copyparams)).toInt()
}

public fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopySectionA", longArrayOf(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle.toLong())).toInt()
}

public fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopySectionW", longArrayOf(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle.toLong())).toInt()
}

public fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueCopyW", longArrayOf(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle.toLong())).toInt()
}

public fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDefaultCopyA", longArrayOf(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle.toLong())).toInt()
}

public fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDefaultCopyW", longArrayOf(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle.toLong())).toInt()
}

public fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDeleteA", longArrayOf(queuehandle, pathpart1, pathpart2)).toInt()
}

public fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDeleteSectionA", longArrayOf(queuehandle, infhandle, listinfhandle, section)).toInt()
}

public fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDeleteSectionW", longArrayOf(queuehandle, infhandle, listinfhandle, section)).toInt()
}

public fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueDeleteW", longArrayOf(queuehandle, pathpart1, pathpart2)).toInt()
}

public fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueRenameA", longArrayOf(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename)).toInt()
}

public fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueRenameSectionA", longArrayOf(queuehandle, infhandle, listinfhandle, section)).toInt()
}

public fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueRenameSectionW", longArrayOf(queuehandle, infhandle, listinfhandle, section)).toInt()
}

public fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupQueueRenameW", longArrayOf(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename)).toInt()
}

public fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFileLogEntryA", longArrayOf(fileloghandle, logsectionname, targetfilename)).toInt()
}

public fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFileLogEntryW", longArrayOf(fileloghandle, logsectionname, targetfilename)).toInt()
}

public fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFromDiskSpaceListA", longArrayOf(diskspace, targetfilespec, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFromDiskSpaceListW", longArrayOf(diskspace, targetfilespec, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFromSourceListA", longArrayOf(flags.toLong(), source)).toInt()
}

public fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveFromSourceListW", longArrayOf(flags.toLong(), source)).toInt()
}

public fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveInstallSectionFromDiskSpaceListA", longArrayOf(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toLong())).toInt()
}

public fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveInstallSectionFromDiskSpaceListW", longArrayOf(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toLong())).toInt()
}

public fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveSectionFromDiskSpaceListA", longArrayOf(diskspace, infhandle, listinfhandle, sectionname, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRemoveSectionFromDiskSpaceListW", longArrayOf(diskspace, infhandle, listinfhandle, sectionname, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupRenameErrorA(hwndparent: Foundation.HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRenameErrorA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, sourcefile, targetfile, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupRenameErrorW(hwndparent: Foundation.HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupRenameErrorW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, sourcefile, targetfile, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: Foundation.HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupScanFileQueueA", longArrayOf(filequeue, flags.toLong(), Win32DynamicFfi.objectSlot(window), Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, result)).toInt()
}

public fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: Foundation.HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupScanFileQueueW", longArrayOf(filequeue, flags.toLong(), Win32DynamicFfi.objectSlot(window), Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, result)).toInt()
}

public fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetDirectoryIdA", longArrayOf(infhandle, id.toLong(), directory)).toInt()
}

public fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetDirectoryIdExA", longArrayOf(infhandle, id.toLong(), directory, flags.toLong(), reserved1.toLong(), reserved2)).toInt()
}

public fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetDirectoryIdExW", longArrayOf(infhandle, id.toLong(), directory, flags.toLong(), reserved1.toLong(), reserved2)).toInt()
}

public fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetDirectoryIdW", longArrayOf(infhandle, id.toLong(), directory)).toInt()
}

public fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetFileQueueAlternatePlatformA", longArrayOf(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile)).toInt()
}

public fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetFileQueueAlternatePlatformW", longArrayOf(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile)).toInt()
}

public fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetFileQueueFlags", longArrayOf(filequeue, flagmask.toLong(), flags.toLong())).toInt()
}

public fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetNonInteractiveMode", longArrayOf(noninteractiveflag.toLong())).toInt()
}

public fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetPlatformPathOverrideA", longArrayOf(override)).toInt()
}

public fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetPlatformPathOverrideW", longArrayOf(override)).toInt()
}

public fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetSourceListA", longArrayOf(flags.toLong(), sourcelist, sourcecount.toLong())).toInt()
}

public fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupSetSourceListW", longArrayOf(flags.toLong(), sourcelist, sourcecount.toLong())).toInt()
}

public fun SetupSetThreadLogToken(logtoken: ULong) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupSetThreadLogToken", longArrayOf(logtoken.toLong()))
}

public fun SetupTermDefaultQueueCallback(context: Long) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupTermDefaultQueueCallback", longArrayOf(context))
}

public fun SetupTerminateFileLog(fileloghandle: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupTerminateFileLog", longArrayOf(fileloghandle)).toInt()
}

public fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupUninstallNewlyCopiedInfs", longArrayOf(filequeue, flags.toLong(), reserved)).toInt()
}

public fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupUninstallOEMInfA", longArrayOf(inffilename, flags.toLong(), reserved)).toInt()
}

public fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupUninstallOEMInfW", longArrayOf(inffilename, flags.toLong(), reserved)).toInt()
}

public fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupVerifyInfFileA", longArrayOf(infname, altplatforminfo, infsignerinfo)).toInt()
}

public fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupVerifyInfFileW", longArrayOf(infname, altplatforminfo, infsignerinfo)).toInt()
}

public fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupWriteTextLog", longArrayOf(logtoken.toLong(), category.toLong(), flags.toLong(), messagestr) + variadicArgs)
}

public fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupWriteTextLogError", longArrayOf(logtoken.toLong(), category.toLong(), logflags.toLong(), error.toLong(), messagestr) + variadicArgs)
}

public fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupWriteTextLogInfLine", longArrayOf(logtoken.toLong(), flags.toLong(), infhandle, context))
}

public fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: Foundation.HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "UpdateDriverForPlugAndPlayDevicesA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), hardwareid, fullinfpath, installflags.toLong(), brebootrequired)).toInt()
}

public fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: Foundation.HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "UpdateDriverForPlugAndPlayDevicesW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), hardwareid, fullinfpath, installflags.toLong(), brebootrequired)).toInt()
}
