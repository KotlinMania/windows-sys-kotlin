#ifndef WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(void* prgbcolors, uint32_t ncolors, void* pinvtable, uint32_t cbtable);
int32_t windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(void* ppmap);
int32_t windowssys_windows_win32_web_internetexplorer_DecodeImage(void* pstream, void* pmap, void* peventsink);
int32_t windowssys_windows_win32_web_internetexplorer_DecodeImageEx(void* pstream, void* pmap, void* peventsink, void* pszmimetypeparam);
int32_t windowssys_windows_win32_web_internetexplorer_DitherTo8(void* pdestbits, int32_t ndestpitch, void* psrcbits, int32_t nsrcpitch, void* bfidsrc, void* prgbdestcolors, void* prgbsrccolors, void* pbdestinvmap, int32_t x, int32_t y, int32_t cx, int32_t cy, int32_t ldesttrans, int32_t lsrctrans);
int32_t windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(void* pnmaxbytes);
int32_t windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
int32_t windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(void* hstate);
int32_t windowssys_windows_win32_web_internetexplorer_IECreateDirectory(void* lppathname, void* lpsecurityattributes);
void* windowssys_windows_win32_web_internetexplorer_IECreateFile(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile);
int32_t windowssys_windows_win32_web_internetexplorer_IEDeleteFile(void* lpfilename);
int32_t windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
void* windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(void* lpfilename, void* lpfindfiledata);
int32_t windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(void* lpfilename, int32_t finfolevelid, void* lpfileinformation);
int32_t windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* pcchcookiedata, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(void* clsidfolderid, void* lppwstrpath);
int32_t windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(void* phkey);
int32_t windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled(void);
int32_t windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing(void);
int32_t windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(void* pbresult);
int32_t windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(void* lpwstrurl);
int32_t windowssys_windows_win32_web_internetexplorer_IELaunchURL(void* lpwstrurl, void* lpprocinfo, void* lpinfo);
int32_t windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy(void);
int32_t windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
int32_t windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(void* lpsubkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
int32_t windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(void* lppathname);
int32_t windowssys_windows_win32_web_internetexplorer_IESaveFile(void* hstate, void* lpwstrsourcefile);
int32_t windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(void* hwnd, void* lpwstrfilename, uint32_t cchmaxfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* phfile);
int32_t windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(void* hwnd, void* lpwstrinitialfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* lppwstrdestinationfilepath, void* phstate);
int32_t windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled(void);
int32_t windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(void* pbbytes, uint32_t nbytes, void* pnformat);
int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(void* hdlg, uint32_t cbpasswordblob, void* pbpasswordblob, void* lpszurl, int32_t falwaysnever, int32_t fsitepage, int32_t fapprovedsitesenforced);
int32_t windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssys_windows_win32_web_internetexplorer_RatingEnable(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssys_windows_win32_web_internetexplorer_RatingEnableW(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery(void);
int32_t windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_RatingInit(void);
int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(void* hratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_RatingSetupUI(void* hdlg, void* pszusername);
int32_t windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(void* hdlg, void* pszusername);
int32_t windowssys_windows_win32_web_internetexplorer_SniffStream(void* pinstream, void* pnformat, void* ppoutstream);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H */
