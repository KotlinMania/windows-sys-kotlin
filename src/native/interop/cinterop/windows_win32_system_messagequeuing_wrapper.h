#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(void* lpwcsadspath, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(void* pptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_MQCloseCursor(void* hcursor);
int32_t windowssys_windows_win32_system_messagequeuing_MQCloseQueue(int64_t hqueue);
int32_t windowssys_windows_win32_system_messagequeuing_MQCreateCursor(int64_t hqueue, void* phcursor);
int32_t windowssys_windows_win32_system_messagequeuing_MQCreateQueue(void* psecuritydescriptor, void* pqueueprops, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(void* lpwcsformatname);
void windowssys_windows_win32_system_messagequeuing_MQFreeMemory(void* pvmemory);
void windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(void* hsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(void* lpwcsmachinename, void* pguidmachineid, void* pqmprops);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(void* lpoverlapped);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(void* lpwcscomputername, void* pprivateprops);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(void* lpwcsformatname, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(int64_t hqueue, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(void* pguid, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_MQLocateBegin(void* lpwcscontext, void* prestriction, void* pcolumns, void* psort, void* phenum);
int32_t windowssys_windows_win32_system_messagequeuing_MQLocateEnd(void* henum);
int32_t windowssys_windows_win32_system_messagequeuing_MQLocateNext(void* henum, void* pcprops, void* apropvar);
int32_t windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(void* hqueue, uint64_t ulllookupid);
int32_t windowssys_windows_win32_system_messagequeuing_MQMgmtAction(void* pcomputername, void* pobjectname, void* paction);
int32_t windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(void* pcomputername, void* pobjectname, void* pmgmtprops);
int32_t windowssys_windows_win32_system_messagequeuing_MQMoveMessage(int64_t hsourcequeue, int64_t hdestinationqueue, uint64_t ulllookupid, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_MQOpenQueue(void* lpwcsformatname, uint32_t dwaccess, uint32_t dwsharemode, void* phqueue);
int32_t windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(void* lpwcspathname, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(int64_t hqueue);
int32_t windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(int64_t hsource, uint32_t dwtimeout, uint32_t dwaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* hcursor, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(int64_t hsource, uint64_t ulllookupid, uint32_t dwlookupaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(uint32_t dwflags, void* lpcertbuffer, uint32_t dwcertbufferlength);
int32_t windowssys_windows_win32_system_messagequeuing_MQSendMessage(int64_t hdestinationqueue, void* pmessageprops, void* ptransaction);
int32_t windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(void* lpwcsformatname, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H */
