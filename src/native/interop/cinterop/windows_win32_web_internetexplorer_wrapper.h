#ifndef WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_web_internetexplorer_computeInvCMAP(void* prgbcolors, uint32_t ncolors, void* pinvtable, uint32_t cbtable);
int32_t windowssys_windows_win32_web_internetexplorer_createMIMEMap(void* ppmap);
int32_t windowssys_windows_win32_web_internetexplorer_decodeImage(void* pstream, void* pmap, void* peventsink);
int32_t windowssys_windows_win32_web_internetexplorer_decodeImageEx(void* pstream, void* pmap, void* peventsink, void* pszmimetypeparam);
int32_t windowssys_windows_win32_web_internetexplorer_ditherTo8(void* pdestbits, int32_t ndestpitch, void* psrcbits, int32_t nsrcpitch, void* bfidsrc, void* prgbdestcolors, void* prgbsrccolors, void* pbdestinvmap, int32_t x, int32_t y, int32_t cx, int32_t cy, int32_t ldesttrans, int32_t lsrctrans);
int32_t windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(void* pnmaxbytes);
int32_t windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
int32_t windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(void* hstate);
int32_t windowssys_windows_win32_web_internetexplorer_iECreateDirectory(void* lppathname, void* lpsecurityattributes);
void* windowssys_windows_win32_web_internetexplorer_iECreateFile(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile);
int32_t windowssys_windows_win32_web_internetexplorer_iEDeleteFile(void* lpfilename);
int32_t windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
void* windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(void* lpfilename, void* lpfindfiledata);
int32_t windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(void* lpfilename, int32_t finfolevelid, void* lpfileinformation);
int32_t windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* pcchcookiedata, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(void* clsidfolderid, void* lppwstrpath);
int32_t windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(void* phkey);
int32_t windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled(void);
int32_t windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing(void);
int32_t windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(void* pbresult);
int32_t windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(void* lpwstrurl);
int32_t windowssys_windows_win32_web_internetexplorer_iELaunchURL(void* lpwstrurl, void* lpprocinfo, void* lpinfo);
int32_t windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy(void);
int32_t windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
int32_t windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(void* lpsubkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
int32_t windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(void* lppathname);
int32_t windowssys_windows_win32_web_internetexplorer_iESaveFile(void* hstate, void* lpwstrsourcefile);
int32_t windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags);
int32_t windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(void* hwnd, void* lpwstrfilename, uint32_t cchmaxfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* phfile);
int32_t windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(void* hwnd, void* lpwstrinitialfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* lppwstrdestinationfilepath, void* phstate);
int32_t windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled(void);
int32_t windowssys_windows_win32_web_internetexplorer_identifyMIMEType(void* pbbytes, uint32_t nbytes, void* pnformat);
int32_t windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(void* hdlg, uint32_t cbpasswordblob, void* pbpasswordblob, void* lpszurl, int32_t falwaysnever, int32_t fsitepage, int32_t fapprovedsitesenforced);
int32_t windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssys_windows_win32_web_internetexplorer_ratingEnable(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssys_windows_win32_web_internetexplorer_ratingEnableW(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery(void);
int32_t windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(void* pratingdetails);
int32_t windowssys_windows_win32_web_internetexplorer_ratingInit(void);
int32_t windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(void* hratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssys_windows_win32_web_internetexplorer_ratingSetupUI(void* hdlg, void* pszusername);
int32_t windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(void* hdlg, void* pszusername);
int32_t windowssys_windows_win32_web_internetexplorer_sniffStream(void* pinstream, void* pnformat, void* ppoutstream);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H */
