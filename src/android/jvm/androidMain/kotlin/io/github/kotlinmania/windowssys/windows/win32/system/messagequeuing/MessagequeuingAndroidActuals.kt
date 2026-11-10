@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32SystemMessagequeuingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQADsPathToFormatName(lpwcsadspath: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQBeginTransaction(pptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQCloseCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQCloseQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQCreateCursor(hqueue: Long, phcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQCreateQueue(psecuritydescriptor: Long, pqueueprops: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQDeleteQueue(lpwcsformatname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQFreeMemory(pvmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQFreeSecurityContext(hsecuritycontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetMachineProperties(lpwcsmachinename: Long, pguidmachineid: Long, pqmprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetPrivateComputerInformation(lpwcscomputername: Long, pprivateprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetQueueSecurity(lpwcsformatname: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: Int, phsecuritycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQHandleToFormatName(hqueue: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQInstanceToFormatName(pguid: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQLocateBegin(lpwcscontext: Long, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQLocateEnd(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQLocateNext(henum: Long, pcprops: Long, apropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQMarkMessageRejected(hqueue: Long, ulllookupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQMgmtAction(pcomputername: Long, pobjectname: Long, paction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQMgmtGetInfo(pcomputername: Long, pobjectname: Long, pmgmtprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQOpenQueue(lpwcsformatname: Long, dwaccess: Int, dwsharemode: Int, phqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQPathNameToFormatName(lpwcspathname: Long, lpwcsformatname: Long, lpdwformatnamelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQPurgeQueue(hqueue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQReceiveMessage(hsource: Long, dwtimeout: Int, dwaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, hcursor: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQReceiveMessageByLookupId(hsource: Long, ulllookupid: Long, dwlookupaction: Int, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQRegisterCertificate(dwflags: Int, lpcertbuffer: Long, dwcertbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQSetQueueProperties(lpwcsformatname: Long, pqueueprops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_messagequeuing_mQSetQueueSecurity(lpwcsformatname: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQADsPathToFormatName((lpwcsadspath?.value ?: 0L), (lpwcsformatname?.value ?: 0L), (lpdwformatnamelength?.value ?: 0L))

public actual fun mQBeginTransaction(pptransaction: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQBeginTransaction((pptransaction?.value ?: 0L))

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQCloseCursor((hcursor?.value ?: 0L))

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQCloseQueue(hqueue)

public actual fun mQCreateCursor(hqueue: Long, phcursor: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQCreateCursor(hqueue, (phcursor?.value ?: 0L))

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQCreateQueue((psecuritydescriptor?.value ?: 0L), (pqueueprops?.value ?: 0L), (lpwcsformatname?.value ?: 0L), (lpdwformatnamelength?.value ?: 0L))

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQDeleteQueue((lpwcsformatname?.value ?: 0L))

public actual fun mQFreeMemory(pvmemory: COpaquePointer?) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQFreeMemory((pvmemory?.value ?: 0L))
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQFreeSecurityContext((hsecuritycontext?.value ?: 0L))
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: COpaquePointer?, pqmprops: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetMachineProperties((lpwcsmachinename?.value ?: 0L), (pguidmachineid?.value ?: 0L), (pqmprops?.value ?: 0L))

public actual fun mQGetOverlappedResult(lpoverlapped: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetOverlappedResult((lpoverlapped?.value ?: 0L))

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetPrivateComputerInformation((lpwcscomputername?.value ?: 0L), (pprivateprops?.value ?: 0L))

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetQueueProperties((lpwcsformatname?.value ?: 0L), (pqueueprops?.value ?: 0L))

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetQueueSecurity((lpwcsformatname?.value ?: 0L), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun mQGetSecurityContext(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContext((lpcertbuffer?.value ?: 0L), dwcertbufferlength.toInt(), (phsecuritycontext?.value ?: 0L))

public actual fun mQGetSecurityContextEx(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContextEx((lpcertbuffer?.value ?: 0L), dwcertbufferlength.toInt(), (phsecuritycontext?.value ?: 0L))

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQHandleToFormatName(hqueue, (lpwcsformatname?.value ?: 0L), (lpdwformatnamelength?.value ?: 0L))

public actual fun mQInstanceToFormatName(pguid: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQInstanceToFormatName((pguid?.value ?: 0L), (lpwcsformatname?.value ?: 0L), (lpdwformatnamelength?.value ?: 0L))

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: COpaquePointer?, pcolumns: COpaquePointer?, psort: COpaquePointer?, phenum: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQLocateBegin((lpwcscontext?.value ?: 0L), (prestriction?.value ?: 0L), (pcolumns?.value ?: 0L), (psort?.value ?: 0L), (phenum?.value ?: 0L))

public actual fun mQLocateEnd(henum: Handle): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQLocateEnd((henum?.value ?: 0L))

public actual fun mQLocateNext(henum: Handle, pcprops: COpaquePointer?, apropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQLocateNext((henum?.value ?: 0L), (pcprops?.value ?: 0L), (apropvar?.value ?: 0L))

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQMarkMessageRejected((hqueue?.value ?: 0L), ulllookupid.toLong())

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQMgmtAction((pcomputername?.value ?: 0L), (pobjectname?.value ?: 0L), (paction?.value ?: 0L))

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQMgmtGetInfo((pcomputername?.value ?: 0L), (pobjectname?.value ?: 0L), (pmgmtprops?.value ?: 0L))

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid.toLong(), (ptransaction?.value ?: 0L))

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQOpenQueue((lpwcsformatname?.value ?: 0L), dwaccess.toInt(), dwsharemode.toInt(), (phqueue?.value ?: 0L))

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQPathNameToFormatName((lpwcspathname?.value ?: 0L), (lpwcsformatname?.value ?: 0L), (lpdwformatnamelength?.value ?: 0L))

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQPurgeQueue(hqueue)

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQReceiveMessage(hsource, dwtimeout.toInt(), dwaction.toInt(), (pmessageprops?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (hcursor?.value ?: 0L), (ptransaction?.value ?: 0L))

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, ptransaction: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQReceiveMessageByLookupId(hsource, ulllookupid.toLong(), dwlookupaction.toInt(), (pmessageprops?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (ptransaction?.value ?: 0L))

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQRegisterCertificate(dwflags.toInt(), (lpcertbuffer?.value ?: 0L), dwcertbufferlength.toInt())

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: COpaquePointer?, ptransaction: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQSendMessage(hdestinationqueue, (pmessageprops?.value ?: 0L), (ptransaction?.value ?: 0L))

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQSetQueueProperties((lpwcsformatname?.value ?: 0L), (pqueueprops?.value ?: 0L))

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    WindowsWin32SystemMessagequeuingJniBridge.windowssys_windows_win32_system_messagequeuing_mQSetQueueSecurity((lpwcsformatname?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))
