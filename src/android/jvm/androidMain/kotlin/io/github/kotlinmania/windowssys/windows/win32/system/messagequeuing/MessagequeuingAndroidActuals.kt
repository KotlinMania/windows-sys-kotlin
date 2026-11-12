@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemMessagequeuingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(lpwcsadspath: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(pptransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(hqueue: Long, phcursor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(psecuritydescriptor: Long, pqueueprops: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(lpwcsformatname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(pvmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(hsecuritycontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(lpwcsmachinename: Long, pguidmachineid: Long, pqmprops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(lpwcscomputername: Long, pprivateprops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(lpwcsformatname: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(hqueue: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(pguid: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(lpwcscontext: Long, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQLocateNext(henum: Long, pcprops: Long, apropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(hqueue: Long, ulllookupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(pcomputername: Long, pobjectname: Long, paction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(pcomputername: Long, pobjectname: Long, pmgmtprops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(lpwcsformatname: Long, dwaccess: Int, dwsharemode: Int, phqueue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(lpwcspathname: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(hsource: Long, dwtimeout: Int, dwaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, hcursor: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(hsource: Long, ulllookupid: Long, dwlookupaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(dwflags: Int, lpcertbuffer: Long, dwcertbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(lpwcsformatname: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(lpwcsadspath.rawAddress, lpwcsformatname.rawAddress, lpdwformatnamelength.rawAddress)

public actual fun mQBeginTransaction(pptransaction: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(pptransaction.rawAddress)

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(hcursor.rawAddress)

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue)

public actual fun mQCreateCursor(hqueue: Long, phcursor: MutPtr<Handle>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(hqueue, phcursor.rawAddress)

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr<Mqqueueprops>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(psecuritydescriptor.rawAddress, pqueueprops.rawAddress, lpwcsformatname.rawAddress, lpdwformatnamelength.rawAddress)

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(lpwcsformatname.rawAddress)

public actual fun mQFreeMemory(pvmemory: ConstPtr<CVoid>) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(pvmemory.rawAddress)
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(hsecuritycontext.rawAddress)
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr<Guid>, pqmprops: MutPtr<Mqqmprops>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(lpwcsmachinename.rawAddress, pguidmachineid.rawAddress, pqmprops.rawAddress)

public actual fun mQGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(lpoverlapped.rawAddress)

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr<Mqprivateprops>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(lpwcscomputername.rawAddress, pprivateprops.rawAddress)

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(lpwcsformatname.rawAddress, pqueueprops.rawAddress)

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(lpwcsformatname.rawAddress, requestedinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun mQGetSecurityContext(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(lpcertbuffer.rawAddress, dwcertbufferlength.toInt(), phsecuritycontext.rawAddress)

public actual fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(lpcertbuffer.rawAddress, dwcertbufferlength.toInt(), phsecuritycontext.rawAddress)

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(hqueue, lpwcsformatname.rawAddress, lpdwformatnamelength.rawAddress)

public actual fun mQInstanceToFormatName(pguid: ConstPtr<Guid>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(pguid.rawAddress, lpwcsformatname.rawAddress, lpdwformatnamelength.rawAddress)

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr<Mqrestriction>, pcolumns: ConstPtr<Mqcolumnset>, psort: ConstPtr<Mqsortset>, phenum: MutPtr<Handle>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(lpwcscontext.rawAddress, prestriction.rawAddress, pcolumns.rawAddress, psort.rawAddress, phenum.rawAddress)

public actual fun mQLocateEnd(henum: Handle): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(henum.rawAddress)

public actual fun mQLocateNext(henum: Handle, pcprops: MutPtr<UInt>, apropvar: MutPtr<Propvariant>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQLocateNext(henum.rawAddress, pcprops.rawAddress, apropvar.rawAddress)

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(hqueue.rawAddress, ulllookupid.toLong())

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(pcomputername.rawAddress, pobjectname.rawAddress, paction.rawAddress)

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr<Mqmgmtprops>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(pcomputername.rawAddress, pobjectname.rawAddress, pmgmtprops.rawAddress)

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid.toLong(), ptransaction.rawAddress)

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr<Long>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(lpwcsformatname.rawAddress, dwaccess.toInt(), dwsharemode.toInt(), phqueue.rawAddress)

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(lpwcspathname.rawAddress, lpwcsformatname.rawAddress, lpdwformatnamelength.rawAddress)

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue)

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(hsource, dwtimeout.toInt(), dwaction.toInt(), pmessageprops.rawAddress, lpoverlapped.rawAddress, 0L, hcursor.rawAddress, ptransaction.rawAddress)

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(hsource, ulllookupid.toLong(), dwlookupaction.toInt(), pmessageprops.rawAddress, lpoverlapped.rawAddress, 0L, ptransaction.rawAddress)

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(dwflags.toInt(), lpcertbuffer.rawAddress, dwcertbufferlength.toInt())

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr<Mqmsgprops>, ptransaction: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQSendMessage(hdestinationqueue, pmessageprops.rawAddress, ptransaction.rawAddress)

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(lpwcsformatname.rawAddress, pqueueprops.rawAddress)

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(lpwcsformatname.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)
