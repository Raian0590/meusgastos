package br.com.raian.meusgastos.domain.service;

import br.com.raian.meusgastos.dto.usuario.UsuarioRequestDTO;
import br.com.raian.meusgastos.dto.usuario.UsuarioResponseDTO;

import java.util.List;

public class UsuarioService implements ICRUDService<UsuarioRequestDTO, UsuarioResponseDTO>{
    @Override
    public List<UsuarioResponseDTO> obterTodos() {
        return List.of();
    }

    @Override
    public UsuarioResponseDTO obterPorId(Long id) {
        return null;
    }

    @Override
    public UsuarioResponseDTO cadastrar(UsuarioRequestDTO dto) {
        return null;
    }

    @Override
    public UsuarioResponseDTO atualizar(Long id, UsuarioRequestDTO dto) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
