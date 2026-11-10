#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_messagequeuing_mQADsPathToFormatName(void* lpwcsadspath, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_mQBeginTransaction(void* pptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_mQCloseCursor(void* hcursor);
int32_t windowssys_windows_win32_system_messagequeuing_mQCloseQueue(int64_t hqueue);
int32_t windowssys_windows_win32_system_messagequeuing_mQCreateCursor(int64_t hqueue, void* phcursor);
int32_t windowssys_windows_win32_system_messagequeuing_mQCreateQueue(void* psecuritydescriptor, void* pqueueprops, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_mQDeleteQueue(void* lpwcsformatname);
void windowssys_windows_win32_system_messagequeuing_mQFreeMemory(void* pvmemory);
void windowssys_windows_win32_system_messagequeuing_mQFreeSecurityContext(void* hsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetMachineProperties(void* lpwcsmachinename, void* pguidmachineid, void* pqmprops);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetOverlappedResult(void* lpoverlapped);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetPrivateComputerInformation(void* lpwcscomputername, void* pprivateprops);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetQueueSecurity(void* lpwcsformatname, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetSecurityContext(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_mQGetSecurityContextEx(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_mQHandleToFormatName(int64_t hqueue, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_mQInstanceToFormatName(void* pguid, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_mQLocateBegin(void* lpwcscontext, void* prestriction, void* pcolumns, void* psort, void* phenum);
int32_t windowssys_windows_win32_system_messagequeuing_mQLocateEnd(void* henum);
int32_t windowssys_windows_win32_system_messagequeuing_mQLocateNext(void* henum, void* pcprops, void* apropvar);
int32_t windowssys_windows_win32_system_messagequeuing_mQMarkMessageRejected(void* hqueue, uint64_t ulllookupid);
int32_t windowssys_windows_win32_system_messagequeuing_mQMgmtAction(void* pcomputername, void* pobjectname, void* paction);
int32_t windowssys_windows_win32_system_messagequeuing_mQMgmtGetInfo(void* pcomputername, void* pobjectname, void* pmgmtprops);
int32_t windowssys_windows_win32_system_messagequeuing_mQMoveMessage(int64_t hsourcequeue, int64_t hdestinationqueue, uint64_t ulllookupid, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_mQOpenQueue(void* lpwcsformatname, uint32_t dwaccess, uint32_t dwsharemode, void* phqueue);
int32_t windowssys_windows_win32_system_messagequeuing_mQPathNameToFormatName(void* lpwcspathname, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_mQPurgeQueue(int64_t hqueue);
int32_t windowssys_windows_win32_system_messagequeuing_mQReceiveMessage(int64_t hsource, uint32_t dwtimeout, uint32_t dwaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* hcursor, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_mQReceiveMessageByLookupId(int64_t hsource, uint64_t ulllookupid, uint32_t dwlookupaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_mQRegisterCertificate(uint32_t dwflags, void* lpcertbuffer, uint32_t dwcertbufferlength);
int32_t windowssys_windows_win32_system_messagequeuing_mQSendMessage(int64_t hdestinationqueue, void* pmessageprops, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_mQSetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssys_windows_win32_system_messagequeuing_mQSetQueueSecurity(void* lpwcsformatname, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H */
