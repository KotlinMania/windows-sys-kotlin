@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateClock
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateClock2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreatePin
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreatePin2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr<KsallocatorFraming>, allocatorhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(connectionhandle.rawAddress.toCPointer<ByteVar>(), allocatorframing.rawAddress.toCPointer<ByteVar>(), allocatorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr<KsallocatorFraming>, allocatorhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(connectionhandle.rawAddress.toCPointer<ByteVar>(), allocatorframing.rawAddress.toCPointer<ByteVar>(), allocatorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr<KsclockCreate>, clockhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32MediaKernelstreamingKsCreateClock(connectionhandle.rawAddress.toCPointer<ByteVar>(), clockcreate.rawAddress.toCPointer<ByteVar>(), clockhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr<KsclockCreate>, clockhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(connectionhandle.rawAddress.toCPointer<ByteVar>(), clockcreate.rawAddress.toCPointer<ByteVar>(), clockhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreatePin(filterhandle: Handle, connect: ConstPtr<KspinConnect>, desiredaccess: UInt, connectionhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32MediaKernelstreamingKsCreatePin(filterhandle.rawAddress.toCPointer<ByteVar>(), connect.rawAddress.toCPointer<ByteVar>(), desiredaccess, connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr<KspinConnect>, desiredaccess: UInt, connectionhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(filterhandle.rawAddress.toCPointer<ByteVar>(), connect.rawAddress.toCPointer<ByteVar>(), desiredaccess, connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr<KsnodeCreate>, desiredaccess: UInt, nodehandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(parenthandle.rawAddress.toCPointer<ByteVar>(), nodecreate.rawAddress.toCPointer<ByteVar>(), desiredaccess, nodehandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr<KsnodeCreate>, desiredaccess: UInt, nodehandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(parenthandle.rawAddress.toCPointer<ByteVar>(), nodecreate.rawAddress.toCPointer<ByteVar>(), desiredaccess, nodehandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(filterhandle.rawAddress.toCPointer<ByteVar>(), pinfactoryid, mediatypecount.rawAddress.toCPointer<ByteVar>())

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(filterhandle.rawAddress.toCPointer<ByteVar>(), pinfactoryid, propertyid, items.rawAddress.toCPointer<ByteVar>())

public actual fun ksOpenDefaultDevice(category: ConstPtr<Guid>, access: UInt, devicehandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(category.rawAddress.toCPointer<ByteVar>(), access, devicehandle.rawAddress.toCPointer<ByteVar>())

public actual fun ksResolveRequiredAttributes(datarange: ConstPtr<Ksdataformat>, attributes: ConstPtr<KsmultipleItem>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(datarange.rawAddress.toCPointer<ByteVar>(), attributes.rawAddress.toCPointer<ByteVar>())

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr<CVoid>, inlength: UInt, outbuffer: MutPtr<CVoid>, outlength: UInt, bytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(handle.rawAddress.toCPointer<ByteVar>(), iocontrol, inbuffer.rawAddress.toCPointer<ByteVar>(), inlength, outbuffer.rawAddress.toCPointer<ByteVar>(), outlength, bytesreturned.rawAddress.toCPointer<ByteVar>())
