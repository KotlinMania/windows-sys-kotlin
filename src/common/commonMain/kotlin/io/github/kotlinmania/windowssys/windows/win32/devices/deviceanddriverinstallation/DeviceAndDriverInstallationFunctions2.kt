package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun setupOpenMasterInf(): COpaquePointer?

public expect fun setupPrepareQueueForRestoreA(queuehandle: COpaquePointer?, backuppath: Pcstr, restoreflags: UInt): Bool

public expect fun setupPrepareQueueForRestoreW(queuehandle: COpaquePointer?, backuppath: Pcwstr, restoreflags: UInt): Bool

public expect fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt

public expect fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt

public expect fun setupPromptReboot(filequeue: COpaquePointer?, owner: Hwnd, scanonly: Bool): Int

public expect fun setupQueryDrivesInDiskSpaceListA(diskspace: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryDrivesInDiskSpaceListW(diskspace: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryFileLogA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryFileLogW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryInfFileInformationA(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryInfFileInformationW(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryInfOriginalFileInformationA(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool

public expect fun setupQueryInfOriginalFileInformationW(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool

public expect fun setupQueryInfVersionInformationA(infinformation: COpaquePointer?, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQueryInfVersionInformationW(infinformation: COpaquePointer?, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupQuerySourceListA(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool

public expect fun setupQuerySourceListW(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool

public expect fun setupQuerySpaceRequiredOnDriveA(diskspace: COpaquePointer?, drivespec: Pcstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupQuerySpaceRequiredOnDriveW(diskspace: COpaquePointer?, drivespec: Pcwstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupQueueCopyA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopyIndirectA(copyparams: COpaquePointer?): Bool

public expect fun setupQueueCopyIndirectW(copyparams: COpaquePointer?): Bool

public expect fun setupQueueCopySectionA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopySectionW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueCopyW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDeleteA(queuehandle: COpaquePointer?, pathpart1: Pcstr, pathpart2: Pcstr): Bool

public expect fun setupQueueDeleteSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool

public expect fun setupQueueDeleteSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool

public expect fun setupQueueDeleteW(queuehandle: COpaquePointer?, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool

public expect fun setupQueueRenameA(queuehandle: COpaquePointer?, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupQueueRenameSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool

public expect fun setupQueueRenameSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool

public expect fun setupQueueRenameW(queuehandle: COpaquePointer?, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFileLogEntryA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupRemoveFileLogEntryW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFromDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRemoveFromDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupScanFileQueueA(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool

public expect fun setupScanFileQueueW(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool

public expect fun setupSetDirectoryIdA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr): Bool

public expect fun setupSetDirectoryIdExA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool

public expect fun setupSetDirectoryIdExW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool

public expect fun setupSetDirectoryIdW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr): Bool

public expect fun setupSetFileQueueAlternatePlatformA(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcstr): Bool

public expect fun setupSetFileQueueAlternatePlatformW(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcwstr): Bool

public expect fun setupSetFileQueueFlags(filequeue: COpaquePointer?, flagmask: UInt, flags: UInt): Bool

public expect fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool

public expect fun setupSetPlatformPathOverrideA(override: Pcstr): Bool

public expect fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool

public expect fun setupSetSourceListA(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool

public expect fun setupSetSourceListW(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool

public expect fun setupSetThreadLogToken(logtoken: ULong)

public expect fun setupTermDefaultQueueCallback(context: COpaquePointer?)

public expect fun setupTerminateFileLog(fileloghandle: COpaquePointer?): Bool

public expect fun setupUninstallNewlyCopiedInfs(filequeue: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool

public expect fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: COpaquePointer?): Bool

public expect fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: COpaquePointer?): Bool

public expect fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool

public expect fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool

public expect fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: COpaquePointer?, context: COpaquePointer?)

public expect fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool

public expect fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool
