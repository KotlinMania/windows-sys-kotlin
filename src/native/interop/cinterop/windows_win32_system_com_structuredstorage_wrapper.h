#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray(void* rgpropvar, uint32_t cvars);
int32_t windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, uint32_t grfmode, void* pwszname, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, void* pstg, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream(void* pstm, void* iid, void* ppv);
int32_t windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* pplkbyt);
int32_t windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* ppstm);
int32_t windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName(void* pfmtid, void* oszname);
int32_t windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray(uint32_t cvariants, void* rgvars);
int32_t windowssys_windows_win32_system_com_structuredstorage_getConvertStg(void* pstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes(void* plkbyt, void* phglobal);
int32_t windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream(void* pstm, void* phglobal);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector(void* prgf, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer(void* pv, uint32_t cb, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID(void* clsid, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime(void* pftin, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector(void* prgft, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString(void* guid, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem(void* propvarin, uint32_t ielem, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource(void* hinst, uint32_t id, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector(void* psz, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector(void* prgsz, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant(void* propvarsingle, void* ppropvarvector);
int32_t windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM(void* pstg, void* lpolestream);
int32_t windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx(void* pstg, uint16_t cfformat, int32_t lwidth, int32_t lheight, uint32_t dwsize, void* pmedium, void* polestm);
int32_t windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage(void* lpolestream, void* pstg, void* ptd);
int32_t windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx(void* polestm, void* pstg, void* pcfformat, void* plwwidth, void* plheight, void* pdwsize, void* pmedium);
int32_t windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId(void* oszname, void* pfmtid);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType(void* ppropvardest, void* propvarsrc, int32_t flags, uint16_t vt);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantClear(void* pvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx(void* propvar1, void* propvar2, int32_t unit, int32_t flags);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantCopy(void* pvardest, void* pvarsrc);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem(void* propvar, uint32_t ielem, void* pfval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem(void* propvar, uint32_t ielem, void* pnval);
uint32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount(void* propvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem(void* propvar, uint32_t ielem, void* pftval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem(void* propvar, uint32_t ielem, void* ppszval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR(void* propvar, void* pbstrout);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean(void* propvarin, void* pfret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector(void* propvar, void* prgf, uint32_t crgf, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc(void* propvar, void* pprgf, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault(void* propvarin, int32_t fdefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer(void* propvar, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble(void* propvarin, void* pdblret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc(void* propvar, void* pprgn, void* pcelem);
double windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault(void* propvarin, double dbldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime(void* propvar, int32_t pstfout, void* pftout);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector(void* propvar, void* prgft, uint32_t crgft, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc(void* propvar, void* pprgft, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID(void* propvar, void* pguid);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16(void* propvarin, void* piret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int16_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault(void* propvarin, int16_t idefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32(void* propvarin, void* plret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault(void* propvarin, int32_t ldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64(void* propvarin, void* pllret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int64_t windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault(void* propvarin, int64_t lldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToString(void* propvar, void* psz, uint32_t cch);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc(void* propvar, void* ppszout);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector(void* propvar, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc(void* propvar, void* pprgsz, void* pcelem);
void* windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault(void* propvarin, void* pszdefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16(void* propvarin, void* puiret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint16_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault(void* propvarin, uint16_t uidefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32(void* propvarin, void* pulret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault(void* propvarin, uint32_t uldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64(void* propvarin, void* pullret);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint64_t windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault(void* propvarin, uint64_t ulldefault);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant(void* ppropvar, void* pvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue(void* propvar, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_structuredstorage_readClassStg(void* pstg, void* pclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_readClassStm(void* pstm, void* pclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg(void* pstg, void* pcf, void* lplpszusertype);
int32_t windowssys_windows_win32_system_com_structuredstorage_setConvertStg(void* pstg, int32_t fconvert);
bool windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant(void* pprop, uint16_t codepage, void* pvar, void* pma);
void* windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty(void* pvar, uint16_t codepage, void* pprop, void* pcb, uint32_t pid, bool freserved, void* pcindirect);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile(void* pwcsname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes(void* plkbyt, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg(void* pstorage, uint32_t dwreserved, void* pppropsetstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg(void* punk, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant(void* pprop, uint32_t cbmax, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile(void* pwcsname, void* ppflb);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes(void* pilb, void* ppflb);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile(void* pwcsname);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes(void* plkbyt);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes(void* pflb, uint32_t grfmode, uint32_t asyncflags, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile(void* pwcsdfname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg(void* punk, void* fmtid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage(void* pwcsname, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes(void* plkbyt, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
uint32_t windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant(void* pprop, uint32_t cbprop, uint16_t codepage, uint8_t breserved);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant(void* ppropvar, void* ppprop, void* pcb);
int32_t windowssys_windows_win32_system_com_structuredstorage_stgSetTimes(void* lpszname, void* pctime, void* patime, void* pmtime);
int32_t windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant(void* pvar, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant(void* punkpropertyvalue, void* ppropvar);
int32_t windowssys_windows_win32_system_com_structuredstorage_writeClassStg(void* pstg, void* rclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_writeClassStm(void* pstm, void* rclsid);
int32_t windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg(void* pstg, uint16_t cf, void* lpszusertype);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H */
