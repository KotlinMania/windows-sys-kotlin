package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult

public expect fun mQBeginTransaction(pptransaction: MutPtr): Hresult

public expect fun mQCloseCursor(hcursor: Handle): Hresult

public expect fun mQCloseQueue(hqueue: Long): Hresult

public expect fun mQCreateCursor(hqueue: Long, phcursor: MutPtr): Hresult

public expect fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult

public expect fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult

public expect fun mQFreeMemory(pvmemory: ConstPtr)

public expect fun mQFreeSecurityContext(hsecuritycontext: Handle)

public expect fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr, pqmprops: MutPtr): Hresult

public expect fun mQGetOverlappedResult(lpoverlapped: ConstPtr): Hresult

public expect fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr): Hresult

public expect fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult

public expect fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Hresult

public expect fun mQGetSecurityContext(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult

public expect fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult

public expect fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult

public expect fun mQInstanceToFormatName(pguid: ConstPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult

public expect fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr, pcolumns: ConstPtr, psort: ConstPtr, phenum: MutPtr): Hresult

public expect fun mQLocateEnd(henum: Handle): Hresult

public expect fun mQLocateNext(henum: Handle, pcprops: MutPtr, apropvar: MutPtr): Hresult

public expect fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult

public expect fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult

public expect fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr): Hresult

public expect fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr): Hresult

public expect fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr): Hresult

public expect fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult

public expect fun mQPurgeQueue(hqueue: Long): Hresult

public expect fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr): Hresult

public expect fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr): Hresult

public expect fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr, dwcertbufferlength: UInt): Hresult

public expect fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr, ptransaction: MutPtr): Hresult

public expect fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult

public expect fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult
