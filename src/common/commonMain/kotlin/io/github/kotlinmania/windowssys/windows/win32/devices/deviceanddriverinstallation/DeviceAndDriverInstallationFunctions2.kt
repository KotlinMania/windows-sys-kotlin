package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun SetupOpenMasterInf(): Long

public expect fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL

public expect fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL

public expect fun SetupPromptForDiskA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt

public expect fun SetupPromptForDiskW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt

public expect fun SetupPromptReboot(filequeue: Long, owner: HWND, scanonly: BOOL): Int

public expect fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL

public expect fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL

public expect fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL

public expect fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL

public expect fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL

public expect fun SetupQueueCopyIndirectA(copyparams: Long): BOOL

public expect fun SetupQueueCopyIndirectW(copyparams: Long): BOOL

public expect fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL

public expect fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL

public expect fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL

public expect fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL

public expect fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL

public expect fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL

public expect fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL

public expect fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL

public expect fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL

public expect fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL

public expect fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL

public expect fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL

public expect fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL

public expect fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL

public expect fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL

public expect fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL

public expect fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL

public expect fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupRenameErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupRenameErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL

public expect fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL

public expect fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL

public expect fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL

public expect fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL

public expect fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL

public expect fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL

public expect fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL

public expect fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL

public expect fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL

public expect fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL

public expect fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL

public expect fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL

public expect fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL

public expect fun SetupSetThreadLogToken(logtoken: ULong)

public expect fun SetupTermDefaultQueueCallback(context: Long)

public expect fun SetupTerminateFileLog(fileloghandle: Long): BOOL

public expect fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL

public expect fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL

public expect fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL

public expect fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL

public expect fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL

public expect fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR, vararg variadicArgs: Long)

public expect fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR, vararg variadicArgs: Long)

public expect fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long)

public expect fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL

public expect fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL
