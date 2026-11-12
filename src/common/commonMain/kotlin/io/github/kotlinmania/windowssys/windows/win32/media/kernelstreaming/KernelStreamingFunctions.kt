package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr<KsallocatorFraming>, allocatorhandle: MutPtr<Handle>): UInt

public expect fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr<KsallocatorFraming>, allocatorhandle: MutPtr<Handle>): Hresult

public expect fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr<KsclockCreate>, clockhandle: MutPtr<Handle>): UInt

public expect fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr<KsclockCreate>, clockhandle: MutPtr<Handle>): Hresult

public expect fun ksCreatePin(filterhandle: Handle, connect: ConstPtr<KspinConnect>, desiredaccess: UInt, connectionhandle: MutPtr<Handle>): UInt

public expect fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr<KspinConnect>, desiredaccess: UInt, connectionhandle: MutPtr<Handle>): Hresult

public expect fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr<KsnodeCreate>, desiredaccess: UInt, nodehandle: MutPtr<Handle>): UInt

public expect fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr<KsnodeCreate>, desiredaccess: UInt, nodehandle: MutPtr<Handle>): Hresult

public expect fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr<UInt>): Hresult

public expect fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ksOpenDefaultDevice(category: ConstPtr<Guid>, access: UInt, devicehandle: MutPtr<Handle>): Hresult

public expect fun ksResolveRequiredAttributes(datarange: ConstPtr<Ksdataformat>, attributes: ConstPtr<KsmultipleItem>): Hresult

public expect fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr<CVoid>, inlength: UInt, outbuffer: MutPtr<CVoid>, outlength: UInt, bytesreturned: MutPtr<UInt>): Hresult
