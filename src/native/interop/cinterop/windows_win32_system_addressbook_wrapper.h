#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_addressbook_BuildDisplayTable(void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpmalloc, void* hinstance, uint32_t cpages, void* lppage, uint32_t ulflags, void* lpptable, void* lpptbldata);
void windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(void* ftg, void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle, uint16_t ircidle);
int32_t windowssys_windows_win32_system_addressbook_CreateIProp(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, void* lpppropdata);
int32_t windowssys_windows_win32_system_addressbook_CreateTable(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, uint32_t ultabletype, uint32_t ulproptagindexcolumn, void* lpsproptagarraycolumns, void* lpptabledata);
void windowssys_windows_win32_system_addressbook_DeinitMapiUtil(void);
void windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(void* ftg);
void windowssys_windows_win32_system_addressbook_EnableIdleRoutine(void* ftg, int32_t fenable);
int32_t windowssys_windows_win32_system_addressbook_FEqualNames(void* lpname1, void* lpname2);
int32_t windowssys_windows_win32_system_addressbook_FPropCompareProp(void* lpspropvalue1, uint32_t ulrelop, void* lpspropvalue2);
int32_t windowssys_windows_win32_system_addressbook_FPropContainsProp(void* lpspropvaluedst, void* lpspropvaluesrc, uint32_t ulfuzzylevel);
int32_t windowssys_windows_win32_system_addressbook_FPropExists(void* lpmapiprop, uint32_t ulproptag);
void windowssys_windows_win32_system_addressbook_FreePadrlist(void* lpadrlist);
void windowssys_windows_win32_system_addressbook_FreeProws(void* lprows);
void* windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle);
int32_t windowssys_windows_win32_system_addressbook_HrAddColumns(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer);
int32_t windowssys_windows_win32_system_addressbook_HrAddColumnsEx(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer, int64_t lpfnfiltercolumns);
int32_t windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(void* lpfncallback, void* lpvcontext, void* lppadvisesink);
int32_t windowssys_windows_win32_system_addressbook_HrDispatchNotifications(uint32_t ulflags);
int32_t windowssys_windows_win32_system_addressbook_HrGetOneProp(void* lpmapiprop, uint32_t ulproptag, void* lppprop);
int32_t windowssys_windows_win32_system_addressbook_HrIStorageFromStream(void* lpunkin, void* lpinterface, uint32_t ulflags, void* lppstorageout);
int32_t windowssys_windows_win32_system_addressbook_HrQueryAllRows(void* lptable, void* lpproptags, void* lprestriction, void* lpsortorderset, int32_t crowsmax, void* lpprows);
int32_t windowssys_windows_win32_system_addressbook_HrSetOneProp(void* lpmapiprop, void* lpprop);
int32_t windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(void* lpadvisesink, void* lppadvisesink);
int32_t windowssys_windows_win32_system_addressbook_LPropCompareProp(void* lpspropvaluea, void* lpspropvalueb);
void* windowssys_windows_win32_system_addressbook_LpValFindProp(uint32_t ulproptag, uint32_t cvalues, void* lpproparray);
void windowssys_windows_win32_system_addressbook_MAPIDeinitIdle(void);
void* windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc(void);
int32_t windowssys_windows_win32_system_addressbook_MAPIInitIdle(void* lpvreserved);
int32_t windowssys_windows_win32_system_addressbook_OpenStreamOnFile(void* lpallocatebuffer, void* lpfreebuffer, uint32_t ulflags, void* lpszfilename, void* lpszprefix, void* lppstream);
void* windowssys_windows_win32_system_addressbook_PpropFindProp(void* lpproparray, uint32_t cvalues, uint32_t ulproptag);
int32_t windowssys_windows_win32_system_addressbook_PropCopyMore(void* lpspropvaluedest, void* lpspropvaluesrc, void* lpfallocmore, void* lpvobject);
int32_t windowssys_windows_win32_system_addressbook_RTFSync(void* lpmessage, uint32_t ulflags, void* lpfmessageupdated);
int32_t windowssys_windows_win32_system_addressbook_ScCopyNotifications(int32_t cnotification, void* lpnotifications, void* lpvdst, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScCopyProps(int32_t cvalues, void* lpproparray, void* lpvdst, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScCountNotifications(int32_t cnotifications, void* lpnotifications, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScCountProps(int32_t cvalues, void* lpproparray, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(uint32_t cbparent, void* lpbparent, void* lpcbconvindex, void* lppbconvindex);
int32_t windowssys_windows_win32_system_addressbook_ScDupPropset(int32_t cvalues, void* lpproparray, void* lpallocatebuffer, void* lppproparray);
int32_t windowssys_windows_win32_system_addressbook_ScInitMapiUtil(uint32_t ulflags);
int32_t windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(void* lpszunc, void* lpszlocal, uint32_t cchlocal);
int32_t windowssys_windows_win32_system_addressbook_ScRelocNotifications(int32_t cnotification, void* lpnotifications, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScRelocProps(int32_t cvalues, void* lpproparray, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(void* lpszlocal, void* lpszunc, uint32_t cchunc);
void* windowssys_windows_win32_system_addressbook_SzFindCh(void* lpsz, uint16_t ch);
void* windowssys_windows_win32_system_addressbook_SzFindLastCh(void* lpsz, uint16_t ch);
void* windowssys_windows_win32_system_addressbook_SzFindSz(void* lpsz, void* lpszkey);
uint32_t windowssys_windows_win32_system_addressbook_UFromSz(void* lpsz);
uint32_t windowssys_windows_win32_system_addressbook_UlAddRef(void* lpunk);
uint32_t windowssys_windows_win32_system_addressbook_UlPropSize(void* lpspropvalue);
uint32_t windowssys_windows_win32_system_addressbook_UlRelease(void* lpunk);
int32_t windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(void* lpcompressedrtfstream, uint32_t ulflags, void* lpuncompressedrtfstream);
int32_t windowssys_windows_win32_system_addressbook_WrapStoreEntryID(uint32_t ulflags, void* lpszdllname, uint32_t cborigentry, void* lporigentry, void* lpcbwrappedentry, void* lppwrappedentry);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H */
