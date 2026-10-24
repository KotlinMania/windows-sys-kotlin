# Direct Rust-to-Kotlin candidates

Source: windows-sys 0.61.2, **249 Rust files** in this checkout. The latest complete
run is [pass 04](pass-04/coverage.md). It uses existing proc-macro2-kotlin → Syn AST
recognition and source-span emission. There is no custom lexer/parser or decompiler.
Existing production sources are untouched; these are **not adopted code**.

## Current coverage

All 249 files were attempted. Across the 248 files with item receipts:

| Disposition | Declarations |
|---|---:|
| Mapped constants and aliases | 118,014 |
| Additional Kotlin syntax needing integration | 36,937 |
| Unsupported original items retained with diagnostics | 22,922 |
| Total counted top-level items | 177,873 |

The root `lib.rs` is emission-blocked by file attributes and is outside that item
denominator. Counts include cfg alternatives and containers, not unique APIs or
body coverage. Four files are completely mapped; 23 more have all items emitted as
mapped/syntax candidates; 198 are partial; 23 contain only unsupported items;
one is blocked. This is per-file output coverage, not whole-project compilation,
Windows ABI/runtime validation or production adoption.

The syntax candidates include **20,189 foreign signatures, 12,969 records and
3,779 aliases**. DLL/ABI/export names, attributes, array lengths and unresolved types
remain explicit integration requirements. No fake function bodies are generated.
The Syn array-span repair alone unlocked 2,595 record declarations between
[pass 03](pass-03/coverage.md) and pass 04.

## Open the output

- [Console: signatures, records and constants](pass-04/files/Windows/Win32/System/Console/mod/candidate.kt)
- [OpenGL: all top-level items have Kotlin output](pass-04/files/Windows/Win32/Graphics/OpenGL/mod/candidate.kt), with native integration still required
- [Complete HLSL constants](pass-04/files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt)
- [Beep: record and constants, with pointer-string macros still unsupported](pass-04/files/Windows/Win32/Devices/Beep/mod/candidate.kt)
- [Ceip foreign signature shape](pass-04/files/Windows/Win32/System/Diagnostics/Ceip/mod/candidate.kt)
- [All files and remaining categories](pass-04/coverage.md)

Each candidate has adjacent `input.rs`, `declarations.tsv`, comment-move records
and a receipt. Unsupported items retain original Rust beside a diagnostic.
Comments and declaration order are preserved; required moves within replaced nodes
are recorded. Original source is always available. Ordinary diffs against all 85
common port files are indexed in [comparisons](comparisons-pass-04/index.json).
Diffs are comparison evidence, not automatic correctness or adoption decisions.

## What was verified

**162 translator tests pass**. The existing Syn parser's fixed-array token repair
passes 416 JVM and 414 macOS tests. Its rebuilt translator preserves nested-array
comments, generates identical repeated output and compiles the unchanged fixture.
[Array evidence and Console adjudication](syntax-validation-02-array-spans/adjudication.md)
separate that syntax check from fixed-size/Copy/layout semantics.

Earlier scalar/cast checks match 19 Rust boundary observations, with unchanged Kotlin
compilation. Complete HLSL Rust and generated Kotlin both produce `49152|1`.
[Receipts](validation/) cover those bounded checks, not every declaration.

A separate native-bridge mode was validated for
[Ceip](link-validation-04-raw-imports/validation.json) and
[52 Threading functions](link-validation-05-threading-raw/validation.json):
source-derived raw DLL archives, Kotlin/Native compilation, Windows PE linking and
exact DLL/export imports. No Windows executable was run. Pass 04 syntax output does
not inherit those ABI claims, and whole-project integration does not gate emission.

## What remains

The largest unsupported categories are 12,132 constants involving richer values
and pointer macros, 8,938 impl blocks, and 1,500 unions. There are also 246 module
items, 63 macros, 34 tuple/unit records, 7 uses and 2 functions. Original source is
retained for every one. Next improvements should implement reusable AST rules on
representative cases and rerun the inventory, rather than hand-patch these files.

Cross-file namespace binding, target cfg selection, native storage/layout, ownership,
callbacks and production adoption remain coder integration work. Syntax-shaped
arrays do not enforce Rust lengths or value semantics. Diagnostics keep those limits
visible; unresolved declarations are not counted as fully mapped translations.

## Reproducibility and protection

Pass 04 executable SHA-256:
`811b55371ec95113ec1a44a2ad8703a9de85b8f15a55030717ea9cd4e6d45828`.
[Verification](pass-04/verification.json) checks every source/output hash, item count
and ordered source span. `run.json` records the exact source binding and options.
The observed pass took about 290 seconds under concurrent load, not an isolated
benchmark. Older passes/executables are retained unchanged. A pass is complete only
when its `summary.json` exists; older in-progress manifests are historical partials.

`inventory.json` records original paths/hashes. `baseline-state.json` and preservation
receipts protect the 105 pre-existing dirty paths and staged changes. Output is kept
separate from production/restoration/configuration files. Local commits protect the
sources and evidence; binary build products remain local and ignored. No pushes,
remote CI, PRs, public publication or releases are performed.

See the generator's [canonical design](../../rust-kotlin/docs/design.md) and
[current syntax increment](../../rust-kotlin/docs/windows-syntax-candidates.md).
