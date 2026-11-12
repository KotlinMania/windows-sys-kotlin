package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun setupOpenMasterInf(): MutPtr<CVoid>

public expect fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr<CVoid>, backuppath: Pcstr, restoreflags: UInt): Bool

public expect fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr<CVoid>, backuppath: Pcwstr, restoreflags: UInt): Bool

public expect fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt

public expect fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt

public expect fun setupPromptReboot(filequeue: ConstPtr<CVoid>, owner: Hwnd, scanonly: Bool): Int

public expect fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr<CVoid>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr<CVoid>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryFileLogA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryFileLogW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryInfFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryInfFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoA>): Bool

public expect fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoW>): Bool

public expect fun setupQueryInfVersionInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQueryInfVersionInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupQuerySourceListA(flags: UInt, list: MutPtr<MutPtr<Pcstr>>, count: MutPtr<UInt>): Bool

public expect fun setupQuerySourceListW(flags: UInt, list: MutPtr<MutPtr<Pcwstr>>, count: MutPtr<UInt>): Bool

public expect fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr<CVoid>, drivespec: Pcstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr<CVoid>, drivespec: Pcwstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupQueueCopyA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopyIndirectA(copyparams: ConstPtr<SpFileCopyParamsA>): Bool

public expect fun setupQueueCopyIndirectW(copyparams: ConstPtr<SpFileCopyParamsW>): Bool

public expect fun setupQueueCopySectionA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueCopySectionW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueCopyW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool

public expect fun setupQueueDefaultCopyW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool

public expect fun setupQueueDeleteA(queuehandle: ConstPtr<CVoid>, pathpart1: Pcstr, pathpart2: Pcstr): Bool

public expect fun setupQueueDeleteSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool

public expect fun setupQueueDeleteSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool

public expect fun setupQueueDeleteW(queuehandle: ConstPtr<CVoid>, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool

public expect fun setupQueueRenameA(queuehandle: ConstPtr<CVoid>, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupQueueRenameSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool

public expect fun setupQueueRenameSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool

public expect fun setupQueueRenameW(queuehandle: ConstPtr<CVoid>, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr): Bool

public expect fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool

public expect fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupScanFileQueueA(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool

public expect fun setupScanFileQueueW(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool

public expect fun setupSetDirectoryIdA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr): Bool

public expect fun setupSetDirectoryIdExA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupSetDirectoryIdExW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupSetDirectoryIdW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr): Bool

public expect fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcstr): Bool

public expect fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcwstr): Bool

public expect fun setupSetFileQueueFlags(filequeue: ConstPtr<CVoid>, flagmask: UInt, flags: UInt): Bool

public expect fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool

public expect fun setupSetPlatformPathOverrideA(override: Pcstr): Bool

public expect fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool

public expect fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr<Pcstr>, sourcecount: UInt): Bool

public expect fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr<Pcwstr>, sourcecount: UInt): Bool

public expect fun setupSetThreadLogToken(logtoken: ULong)

public expect fun setupTermDefaultQueueCallback(context: ConstPtr<CVoid>)

public expect fun setupTerminateFileLog(fileloghandle: ConstPtr<CVoid>): Bool

public expect fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr<CVoid>, flags: UInt, reserved: ConstPtr<CVoid>): Bool

public expect fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool

public expect fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool

public expect fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2A>): Bool

public expect fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2W>): Bool

public expect fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long)

public expect fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr<CVoid>, context: ConstPtr<Infcontext>)

public expect fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool

public expect fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool
