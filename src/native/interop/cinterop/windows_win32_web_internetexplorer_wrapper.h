#ifndef WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(void* prgbcolors, uint32_t ncolors, void* pinvtable, uint32_t cbtable);
int32_t windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(void* ppmap);
int32_t windowssysWindowsWin32WebInternetexplorerDecodeImage(void* pstream, void* pmap, void* peventsink);
int32_t windowssysWindowsWin32WebInternetexplorerDecodeImageEx(void* pstream, void* pmap, void* peventsink, void* pszmimetypeparam);
int32_t windowssysWindowsWin32WebInternetexplorerDitherTo8(void* pdestbits, int32_t ndestpitch, void* psrcbits, int32_t nsrcpitch, void* bfidsrc, void* prgbdestcolors, void* prgbsrccolors, void* pbdestinvmap, int32_t x, int32_t y, int32_t cx, int32_t cy, int32_t ldesttrans, int32_t lsrctrans);
int32_t windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(void* pnmaxbytes);
int32_t windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
int32_t windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(void* hstate);
int32_t windowssysWindowsWin32WebInternetexplorerIECreateDirectory(void* lppathname, void* lpsecurityattributes);
void* windowssysWindowsWin32WebInternetexplorerIECreateFile(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile);
int32_t windowssysWindowsWin32WebInternetexplorerIEDeleteFile(void* lpfilename);
int32_t windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid);
void* windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(void* lpfilename, void* lpfindfiledata);
int32_t windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(void* lpfilename, int32_t finfolevelid, void* lpfileinformation);
int32_t windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* pcchcookiedata, uint32_t dwflags);
int32_t windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(void* clsidfolderid, void* lppwstrpath);
int32_t windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(void* phkey);
int32_t windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled(void);
int32_t windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing(void);
int32_t windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(void* pbresult);
int32_t windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(void* lpwstrurl);
int32_t windowssysWindowsWin32WebInternetexplorerIELaunchURL(void* lpwstrurl, void* lpprocinfo, void* lpinfo);
int32_t windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags);
int32_t windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy(void);
int32_t windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
int32_t windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(void* lpsubkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
int32_t windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(void* lppathname);
int32_t windowssysWindowsWin32WebInternetexplorerIESaveFile(void* hstate, void* lpwstrsourcefile);
int32_t windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags);
int32_t windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(void* hwnd, void* lpwstrfilename, uint32_t cchmaxfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* phfile);
int32_t windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(void* hwnd, void* lpwstrinitialfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* lppwstrdestinationfilepath, void* phstate);
int32_t windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled(void);
int32_t windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(void* pbbytes, uint32_t nbytes, void* pnformat);
int32_t windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(void* hdlg, void* pszusername, void* pratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(void* hdlg, uint32_t cbpasswordblob, void* pbpasswordblob, void* lpszurl, int32_t falwaysnever, int32_t fsitepage, int32_t fapprovedsitesenforced);
int32_t windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow);
int32_t windowssysWindowsWin32WebInternetexplorerRatingEnable(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssysWindowsWin32WebInternetexplorerRatingEnableW(void* hwndparent, void* pszusername, int32_t fenable);
int32_t windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery(void);
int32_t windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(void* pratingdetails);
int32_t windowssysWindowsWin32WebInternetexplorerRatingInit(void);
int32_t windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(void* hratingobtainquery);
int32_t windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery);
int32_t windowssysWindowsWin32WebInternetexplorerRatingSetupUI(void* hdlg, void* pszusername);
int32_t windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(void* hdlg, void* pszusername);
int32_t windowssysWindowsWin32WebInternetexplorerSniffStream(void* pinstream, void* pnformat, void* ppoutstream);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WINDOWS_WIN32_WEB_INTERNETEXPLORER_WRAPPER_H */
