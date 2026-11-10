#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCoerceToCanonicalValue(void* key, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreateAdapterFromPropertyStore(void* pps, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreateDelayedMultiplexPropertyStore(int32_t flags, void* pdpsf, void* rgstoreids, uint32_t cstores, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMemoryPropertyStore(void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMultiplexPropertyStore(void* prgpunkstores, uint32_t cstores, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyChangeArray(void* rgpropkey, void* rgflags, void* rgpropvar, uint32_t cchanges, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromObject(void* punk, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromPropertySetStorage(void* ppss, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSCreateSimplePropertyChange(int32_t flags, void* key, void* propvar, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSEnumeratePropertyDescriptions(int32_t filteron, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplay(void* propkey, void* propvar, int32_t pdfflags, void* pwsztext, uint32_t cchtext);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplayAlloc(void* key, void* propvar, int32_t pdff, void* ppszdisplay);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSFormatPropertyValue(void* pps, void* ppd, int32_t pdff, void* ppszdisplay);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetImageReferenceForValue(void* propkey, void* propvar, void* ppszimageres);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandler(void* punkitem, int32_t freadwrite, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandlerWithCreateObject(void* punkitem, int32_t freadwrite, void* punkcreateobject, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetNameFromPropertyKey(void* propkey, void* ppszcanonicalname);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetNamedPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* pszname, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescription(void* propkey, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionByName(void* pszcanonicalname, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionListFromString(void* pszproplist, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* rpkey, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyKeyFromName(void* pszname, void* ppropkey);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertySystem(void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyValue(void* pps, void* ppd, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSLookupPropertyHandlerCLSID(void* pszfilepath, void* pclsid);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagDelete(void* propbag, void* propname);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBool(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBstr(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadDword(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadGuid(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadInt(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadLong(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPointl(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPoints(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPropertyKey(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadRectl(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadShort(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStr(void* propbag, void* propname, void* value, int32_t charactercount);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStrAlloc(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStream(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadType(void* propbag, void* propname, void* var, uint16_t type);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUlonglong(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUnknown(void* propbag, void* propname, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBool(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBstr(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteDword(void* propbag, void* propname, uint32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteGuid(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteInt(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteLong(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePointl(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePoints(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePropertyKey(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteRectl(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteShort(void* propbag, void* propname, int16_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStr(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStream(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUlonglong(void* propbag, void* propname, uint64_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUnknown(void* propbag, void* propname, void* punk);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSPropertyKeyFromString(void* pszstring, void* pkey);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSRefreshPropertySchema(void);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSRegisterPropertySchema(void* pszpath);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSSetPropertyValue(void* pps, void* ppd, void* propvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSStringFromPropertyKey(void* pkey, void* psz, uint32_t cch);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pSUnregisterPropertySchema(void* pszpath);
void* windowssys_windows_win32_ui_shell_propertiessystem_pifMgrCloseProperties(void* hprops, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pifMgrGetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
void* windowssys_windows_win32_ui_shell_propertiessystem_pifMgrOpenProperties(void* pszapp, void* pszpif, uint32_t hinf, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_pifMgrSetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHAddDefaultPropertiesByExt(void* pszext, void* ppropstore);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreForWindow(void* hwnd, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromIDList(void* pidl, int32_t flags, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromParsingName(void* pszpath, void* pbc, int32_t flags, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgCreate(void* psstg, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t grfmode, uint32_t dwdisposition, void* ppstg, void* pucodepage);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgReadMultiple(void* pps, uint32_t ucodepage, uint32_t cpspec, void* rgpspec, void* rgvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgWriteMultiple(void* pps, void* pucodepage, uint32_t cpspec, void* rgpspec, void* rgvar, uint32_t propidnamefirst);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H */
