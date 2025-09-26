
package iuh.fit.edu.daos;

import iuh.fit.edu.entities.NhaCungCap;

import java.util.List;

public interface NhaCungCapDAO {
    List<NhaCungCap> findAll();

    NhaCungCap findById(Long id);

    List<NhaCungCap> findByKeyword(String keyword);
}
