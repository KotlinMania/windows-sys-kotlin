#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray(void* rgpropvar, uint32_t cvars);
int32_t windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, uint32_t grfmode, void* pwszname, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, void* pstg, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream(void* pstm, void* iid, void* ppv);
int32_t windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* pplkbyt);
int32_t windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* ppstm);
int32_t windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName(void* pfmtid, void* oszname);
int32_t windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray(uint32_t cvariants, void* rgvars);
int32_t windowssys_windows_win32_system_com_structuredstorage_GetConvertStg(void* pstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes(void* plkbyt, void* phglobal);
int32_t windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream(void* pstm, void* phglobal);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector(void* prgf, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer(void* pv, uint32_t cb, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID(void* clsid, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime(void* pftin, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector(void* prgft, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString(void* guid, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem(void* propvarin, uint32_t ielem, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource(void* hinst, uint32_t id, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector(void* psz, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector(void* prgsz, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant(void* propvarsingle, void* ppropvarvector);
int32_t windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM(void* pstg, void* lpolestream);
int32_t windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx(void* pstg, uint16_t cfformat, int32_t lwidth, int32_t lheight, uint32_t dwsize, void* pmedium, void* polestm);
int32_t windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage(void* lpolestream, void* pstg, void* ptd);
int32_t windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx(void* polestm, void* pstg, void* pcfformat, void* plwwidth, void* plheight, void* pdwsize, void* pmedium);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId(void* oszname, void* pfmtid);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType(void* ppropvardest, void* propvarsrc, int32_t flags, uint16_t vt);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantClear(void* pvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx(void* propvar1, void* propvar2, int32_t unit, int32_t flags);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy(void* pvardest, void* pvarsrc);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem(void* propvar, uint32_t ielem, void* pfval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem(void* propvar, uint32_t ielem, void* pnval);
uint32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount(void* propvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem(void* propvar, uint32_t ielem, void* pftval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem(void* propvar, uint32_t ielem, void* ppszval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR(void* propvar, void* pbstrout);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean(void* propvarin, void* pfret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector(void* propvar, void* prgf, uint32_t crgf, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc(void* propvar, void* pprgf, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault(void* propvarin, int32_t fdefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer(void* propvar, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble(void* propvarin, void* pdblret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc(void* propvar, void* pprgn, void* pcelem);
double windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault(void* propvarin, double dbldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime(void* propvar, int32_t pstfout, void* pftout);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector(void* propvar, void* prgft, uint32_t crgft, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc(void* propvar, void* pprgft, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID(void* propvar, void* pguid);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16(void* propvarin, void* piret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int16_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault(void* propvarin, int16_t idefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32(void* propvarin, void* plret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault(void* propvarin, int32_t ldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64(void* propvarin, void* pllret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int64_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault(void* propvarin, int64_t lldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToString(void* propvar, void* psz, uint32_t cch);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc(void* propvar, void* ppszout);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector(void* propvar, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc(void* propvar, void* pprgsz, void* pcelem);
void* windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault(void* propvarin, void* pszdefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16(void* propvarin, void* puiret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint16_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault(void* propvarin, uint16_t uidefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32(void* propvarin, void* pulret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault(void* propvarin, uint32_t uldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64(void* propvarin, void* pullret);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint64_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault(void* propvarin, uint64_t ulldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant(void* ppropvar, void* pvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue(void* propvar, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_structuredstorage_ReadClassStg(void* pstg, void* pclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_ReadClassStm(void* pstm, void* pclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg(void* pstg, void* pcf, void* lplpszusertype);
int32_t windowssys_windows_win32_system_com_structuredstorage_SetConvertStg(void* pstg, int32_t fconvert);
bool windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant(void* pprop, uint16_t codepage, void* pvar, void* pma);
void* windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty(void* pvar, uint16_t codepage, void* pprop, void* pcb, uint32_t pid, bool freserved, void* pcindirect);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile(void* pwcsname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes(void* plkbyt, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg(void* pstorage, uint32_t dwreserved, void* pppropsetstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg(void* punk, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant(void* pprop, uint32_t cbmax, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile(void* pwcsname, void* ppflb);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes(void* pilb, void* ppflb);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile(void* pwcsname);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes(void* plkbyt);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes(void* pflb, uint32_t grfmode, uint32_t asyncflags, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile(void* pwcsdfname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg(void* punk, void* fmtid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage(void* pwcsname, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes(void* plkbyt, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
uint32_t windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant(void* pprop, uint32_t cbprop, uint16_t codepage, uint8_t breserved);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant(void* ppropvar, void* ppprop, void* pcb);
int32_t windowssys_windows_win32_system_com_structuredstorage_StgSetTimes(void* lpszname, void* pctime, void* patime, void* pmtime);
int32_t windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant(void* pvar, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant(void* punkpropertyvalue, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_WriteClassStg(void* pstg, void* rclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_WriteClassStm(void* pstm, void* rclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg(void* pstg, uint16_t cf, void* lpszusertype);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H */
