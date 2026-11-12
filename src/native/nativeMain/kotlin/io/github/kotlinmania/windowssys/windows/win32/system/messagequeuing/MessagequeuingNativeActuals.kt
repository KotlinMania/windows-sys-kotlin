@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQCloseCursor
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQCloseQueue
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQCreateCursor
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQCreateQueue
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQLocateBegin
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQLocateEnd
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQLocateNext
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQMgmtAction
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQMoveMessage
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQOpenQueue
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQSendMessage
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties
import io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(lpwcsadspath.rawAddress.toCPointer<ByteVar>(), lpwcsformatname.rawAddress.toCPointer<ByteVar>(), lpdwformatnamelength.rawAddress.toCPointer<ByteVar>())

public actual fun mQBeginTransaction(pptransaction: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(pptransaction.rawAddress.toCPointer<ByteVar>())

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(hcursor.rawAddress.toCPointer<ByteVar>())

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue)

public actual fun mQCreateCursor(hqueue: Long, phcursor: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(hqueue, phcursor.rawAddress.toCPointer<ByteVar>())

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr<Mqqueueprops>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pqueueprops.rawAddress.toCPointer<ByteVar>(), lpwcsformatname.rawAddress.toCPointer<ByteVar>(), lpdwformatnamelength.rawAddress.toCPointer<ByteVar>())

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(lpwcsformatname.rawAddress.toCPointer<ByteVar>())

public actual fun mQFreeMemory(pvmemory: ConstPtr<CVoid>) {
    windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(pvmemory.rawAddress.toCPointer<ByteVar>())
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(hsecuritycontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr<Guid>, pqmprops: MutPtr<Mqqmprops>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(lpwcsmachinename.rawAddress.toCPointer<ByteVar>(), pguidmachineid.rawAddress.toCPointer<ByteVar>(), pqmprops.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr<Mqprivateprops>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(lpwcscomputername.rawAddress.toCPointer<ByteVar>(), pprivateprops.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(lpwcsformatname.rawAddress.toCPointer<ByteVar>(), pqueueprops.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(lpwcsformatname.rawAddress.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetSecurityContext(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(lpcertbuffer.rawAddress.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext.rawAddress.toCPointer<ByteVar>())

public actual fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(lpcertbuffer.rawAddress.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext.rawAddress.toCPointer<ByteVar>())

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(hqueue, lpwcsformatname.rawAddress.toCPointer<ByteVar>(), lpdwformatnamelength.rawAddress.toCPointer<ByteVar>())

public actual fun mQInstanceToFormatName(pguid: ConstPtr<Guid>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(pguid.rawAddress.toCPointer<ByteVar>(), lpwcsformatname.rawAddress.toCPointer<ByteVar>(), lpdwformatnamelength.rawAddress.toCPointer<ByteVar>())

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr<Mqrestriction>, pcolumns: ConstPtr<Mqcolumnset>, psort: ConstPtr<Mqsortset>, phenum: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(lpwcscontext.rawAddress.toCPointer<ByteVar>(), prestriction.rawAddress.toCPointer<ByteVar>(), pcolumns.rawAddress.toCPointer<ByteVar>(), psort.rawAddress.toCPointer<ByteVar>(), phenum.rawAddress.toCPointer<ByteVar>())

public actual fun mQLocateEnd(henum: Handle): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(henum.rawAddress.toCPointer<ByteVar>())

public actual fun mQLocateNext(henum: Handle, pcprops: MutPtr<UInt>, apropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQLocateNext(henum.rawAddress.toCPointer<ByteVar>(), pcprops.rawAddress.toCPointer<ByteVar>(), apropvar.rawAddress.toCPointer<ByteVar>())

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(hqueue.rawAddress.toCPointer<ByteVar>(), ulllookupid)

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(pcomputername.rawAddress.toCPointer<ByteVar>(), pobjectname.rawAddress.toCPointer<ByteVar>(), paction.rawAddress.toCPointer<ByteVar>())

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr<Mqmgmtprops>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(pcomputername.rawAddress.toCPointer<ByteVar>(), pobjectname.rawAddress.toCPointer<ByteVar>(), pmgmtprops.rawAddress.toCPointer<ByteVar>())

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid, ptransaction.rawAddress.toCPointer<ByteVar>())

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr<Long>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(lpwcsformatname.rawAddress.toCPointer<ByteVar>(), dwaccess, dwsharemode, phqueue.rawAddress.toCPointer<ByteVar>())

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(lpwcspathname.rawAddress.toCPointer<ByteVar>(), lpwcsformatname.rawAddress.toCPointer<ByteVar>(), lpdwformatnamelength.rawAddress.toCPointer<ByteVar>())

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue)

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(hsource, dwtimeout, dwaction, pmessageprops.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hcursor.rawAddress.toCPointer<ByteVar>(), ptransaction.rawAddress.toCPointer<ByteVar>())

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(hsource, ulllookupid, dwlookupaction, pmessageprops.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ptransaction.rawAddress.toCPointer<ByteVar>())

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(dwflags, lpcertbuffer.rawAddress.toCPointer<ByteVar>(), dwcertbufferlength)

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr<Mqmsgprops>, ptransaction: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQSendMessage(hdestinationqueue, pmessageprops.rawAddress.toCPointer<ByteVar>(), ptransaction.rawAddress.toCPointer<ByteVar>())

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(lpwcsformatname.rawAddress.toCPointer<ByteVar>(), pqueueprops.rawAddress.toCPointer<ByteVar>())

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(lpwcsformatname.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())
