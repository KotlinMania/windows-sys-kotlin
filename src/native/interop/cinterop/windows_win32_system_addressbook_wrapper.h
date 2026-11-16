#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemAddressbookBuildDisplayTable(void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpmalloc, void* hinstance, uint32_t cpages, void* lppage, uint32_t ulflags, void* lpptable, void* lpptbldata);
void windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(void* ftg, void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle, uint16_t ircidle);
int32_t windowssysWindowsWin32SystemAddressbookCreateIProp(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, void* lpppropdata);
int32_t windowssysWindowsWin32SystemAddressbookCreateTable(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, uint32_t ultabletype, uint32_t ulproptagindexcolumn, void* lpsproptagarraycolumns, void* lpptabledata);
void windowssysWindowsWin32SystemAddressbookDeinitMapiUtil(void);
void windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(void* ftg);
void windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(void* ftg, int32_t fenable);
int32_t windowssysWindowsWin32SystemAddressbookFEqualNames(void* lpname1, void* lpname2);
int32_t windowssysWindowsWin32SystemAddressbookFPropCompareProp(void* lpspropvalue1, uint32_t ulrelop, void* lpspropvalue2);
int32_t windowssysWindowsWin32SystemAddressbookFPropContainsProp(void* lpspropvaluedst, void* lpspropvaluesrc, uint32_t ulfuzzylevel);
int32_t windowssysWindowsWin32SystemAddressbookFPropExists(void* lpmapiprop, uint32_t ulproptag);
void windowssysWindowsWin32SystemAddressbookFreePadrlist(void* lpadrlist);
void windowssysWindowsWin32SystemAddressbookFreeProws(void* lprows);
void* windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle);
int32_t windowssysWindowsWin32SystemAddressbookHrAddColumns(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer);
int32_t windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer, int64_t lpfnfiltercolumns);
int32_t windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(void* lpfncallback, void* lpvcontext, void* lppadvisesink);
int32_t windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(uint32_t ulflags);
int32_t windowssysWindowsWin32SystemAddressbookHrGetOneProp(void* lpmapiprop, uint32_t ulproptag, void* lppprop);
int32_t windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(void* lpunkin, void* lpinterface, uint32_t ulflags, void* lppstorageout);
int32_t windowssysWindowsWin32SystemAddressbookHrQueryAllRows(void* lptable, void* lpproptags, void* lprestriction, void* lpsortorderset, int32_t crowsmax, void* lpprows);
int32_t windowssysWindowsWin32SystemAddressbookHrSetOneProp(void* lpmapiprop, void* lpprop);
int32_t windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(void* lpadvisesink, void* lppadvisesink);
int32_t windowssysWindowsWin32SystemAddressbookLPropCompareProp(void* lpspropvaluea, void* lpspropvalueb);
void* windowssysWindowsWin32SystemAddressbookLpValFindProp(uint32_t ulproptag, uint32_t cvalues, void* lpproparray);
void windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle(void);
void* windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc(void);
int32_t windowssysWindowsWin32SystemAddressbookMAPIInitIdle(void* lpvreserved);
int32_t windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(void* lpallocatebuffer, void* lpfreebuffer, uint32_t ulflags, void* lpszfilename, void* lpszprefix, void* lppstream);
void* windowssysWindowsWin32SystemAddressbookPpropFindProp(void* lpproparray, uint32_t cvalues, uint32_t ulproptag);
int32_t windowssysWindowsWin32SystemAddressbookPropCopyMore(void* lpspropvaluedest, void* lpspropvaluesrc, void* lpfallocmore, void* lpvobject);
int32_t windowssysWindowsWin32SystemAddressbookRTFSync(void* lpmessage, uint32_t ulflags, void* lpfmessageupdated);
int32_t windowssysWindowsWin32SystemAddressbookScCopyNotifications(int32_t cnotification, void* lpnotifications, void* lpvdst, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScCopyProps(int32_t cvalues, void* lpproparray, void* lpvdst, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScCountNotifications(int32_t cnotifications, void* lpnotifications, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScCountProps(int32_t cvalues, void* lpproparray, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(uint32_t cbparent, void* lpbparent, void* lpcbconvindex, void* lppbconvindex);
int32_t windowssysWindowsWin32SystemAddressbookScDupPropset(int32_t cvalues, void* lpproparray, void* lpallocatebuffer, void* lppproparray);
int32_t windowssysWindowsWin32SystemAddressbookScInitMapiUtil(uint32_t ulflags);
int32_t windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(void* lpszunc, void* lpszlocal, uint32_t cchlocal);
int32_t windowssysWindowsWin32SystemAddressbookScRelocNotifications(int32_t cnotification, void* lpnotifications, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScRelocProps(int32_t cvalues, void* lpproparray, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(void* lpszlocal, void* lpszunc, uint32_t cchunc);
void* windowssysWindowsWin32SystemAddressbookSzFindCh(void* lpsz, uint16_t ch);
void* windowssysWindowsWin32SystemAddressbookSzFindLastCh(void* lpsz, uint16_t ch);
void* windowssysWindowsWin32SystemAddressbookSzFindSz(void* lpsz, void* lpszkey);
uint32_t windowssysWindowsWin32SystemAddressbookUFromSz(void* lpsz);
uint32_t windowssysWindowsWin32SystemAddressbookUlAddRef(void* lpunk);
uint32_t windowssysWindowsWin32SystemAddressbookUlPropSize(void* lpspropvalue);
uint32_t windowssysWindowsWin32SystemAddressbookUlRelease(void* lpunk);
int32_t windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(void* lpcompressedrtfstream, uint32_t ulflags, void* lpuncompressedrtfstream);
int32_t windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(uint32_t ulflags, void* lpszdllname, uint32_t cborigentry, void* lporigentry, void* lpcbwrappedentry, void* lppwrappedentry);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H */
