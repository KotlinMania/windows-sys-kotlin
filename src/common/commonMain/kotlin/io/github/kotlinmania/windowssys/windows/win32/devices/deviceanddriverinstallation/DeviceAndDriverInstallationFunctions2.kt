package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun setupOpenMasterInf(): MutPtr

public expect fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr, backuppath: Pcstr, restoreflags: UInt): Bool

public expect fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr, backuppath: Pcwstr, restoreflags: UInt): Bool

public expect fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt

public expect fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt

public expect fun setupPromptReboot(filequeue: ConstPtr, owner: Hwnd, scanonly: Bool): Int

public expect fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryFileLogA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryFileLogW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryInfFileInformationA(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryInfFileInformationW(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool

public expect fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool

public expect fun setupQueryInfVersionInformationA(infinformation: ConstPtr, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQueryInfVersionInformationW(infinformation: ConstPtr, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupQuerySourceListA(flags: UInt, list: MutPtr, count: MutPtr): Bool

public expect fun setupQuerySourceListW(flags: UInt, list: MutPtr, count: MutPtr): Bool

public expect fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr, drivespec: Pcstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr, drivespec: Pcwstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupQueueCopyA(queuehandle: ConstPtr, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopyIndirectA(copyparams: ConstPtr): Bool

public expect fun setupQueueCopyIndirectW(copyparams: ConstPtr): Bool

public expect fun setupQueueCopySectionA(queuehandle: ConstPtr, sourcerootpath: Pcstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopySectionW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueCopyW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyA(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyW(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDeleteA(queuehandle: ConstPtr, pathpart1: Pcstr, pathpart2: Pcstr): Bool

public expect fun setupQueueDeleteSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool

public expect fun setupQueueDeleteSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool

public expect fun setupQueueDeleteW(queuehandle: ConstPtr, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool

public expect fun setupQueueRenameA(queuehandle: ConstPtr, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupQueueRenameSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool

public expect fun setupQueueRenameSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool

public expect fun setupQueueRenameW(queuehandle: ConstPtr, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupScanFileQueueA(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr, result: MutPtr): Bool

public expect fun setupScanFileQueueW(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr, result: MutPtr): Bool

public expect fun setupSetDirectoryIdA(infhandle: ConstPtr, id: UInt, directory: Pcstr): Bool

public expect fun setupSetDirectoryIdExA(infhandle: ConstPtr, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool

public expect fun setupSetDirectoryIdExW(infhandle: ConstPtr, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool

public expect fun setupSetDirectoryIdW(infhandle: ConstPtr, id: UInt, directory: Pcwstr): Bool

public expect fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcstr): Bool

public expect fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcwstr): Bool

public expect fun setupSetFileQueueFlags(filequeue: ConstPtr, flagmask: UInt, flags: UInt): Bool

public expect fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool

public expect fun setupSetPlatformPathOverrideA(override: Pcstr): Bool

public expect fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool

public expect fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool

public expect fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool

public expect fun setupSetThreadLogToken(logtoken: ULong)

public expect fun setupTermDefaultQueueCallback(context: ConstPtr)

public expect fun setupTerminateFileLog(fileloghandle: ConstPtr): Bool

public expect fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr, flags: UInt, reserved: ConstPtr): Bool

public expect fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr): Bool

public expect fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr): Bool

public expect fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool

public expect fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool

public expect fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr, context: ConstPtr)

public expect fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool

public expect fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool
