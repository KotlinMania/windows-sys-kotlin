package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr<CVoid>, completionstatus: Ntstatus): Ntstatus

public expect fun vhfCreate(vhfconfig: ConstPtr<VhfConfig>, vhfhandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun vhfDelete(vhfhandle: ConstPtr<CVoid>, wait: Boolean)

public expect fun vhfReadReportSubmit(vhfhandle: ConstPtr<CVoid>, hidtransferpacket: ConstPtr<HidXferPacket>): Ntstatus

public expect fun vhfStart(vhfhandle: ConstPtr<CVoid>): Ntstatus
